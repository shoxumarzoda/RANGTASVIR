package uz.ithelp.rangtasvir;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserAdapterViewHolder> implements Filterable {

    private List<uz.ithelp.rangtasvir.ModelRcycler> userModelList;
    private List<uz.ithelp.rangtasvir.ModelRcycler> userModelListFilter;
    private Context context;
    private SelectedUser selectedUser;

    public UserAdapter(List<uz.ithelp.rangtasvir.ModelRcycler> userModelList, MainActivity2 selectedUser) {
        this.userModelList = userModelList;
        this.userModelListFilter = userModelList;
        this.selectedUser = selectedUser;
    }

    @NonNull
    @Override
    public UserAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        return new UserAdapterViewHolder(LayoutInflater.from(context).inflate(R.layout.item_recycler,null));
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapterViewHolder holder, int position) {
        uz.ithelp.rangtasvir.ModelRcycler modelRcycler = userModelList.get(position);
        String userName = modelRcycler.getLessonName();
        holder.tvUserNAme.setText(userName);

    }

    @Override
    public int getItemCount() {
        return userModelList.size();
    }

    @Override
    public Filter getFilter() {
        Filter filter  = new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                FilterResults filterResults = new FilterResults();

                if (constraint==null || constraint.length()==0){
                    filterResults.count = userModelListFilter.size();
                    filterResults.values = userModelListFilter;
                }
                else {
                    String searchCHr = constraint.toString().toLowerCase();
                    List<uz.ithelp.rangtasvir.ModelRcycler> resultData = new ArrayList<>();
                    for(uz.ithelp.rangtasvir.ModelRcycler userModel: userModelListFilter){
                        if (userModel.getLessonName().toLowerCase().contains(searchCHr)){
                            resultData.add(userModel);
                        }
                    }
                    filterResults.count = resultData.size();
                    filterResults.values = resultData;
                }

                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {
                userModelList  = (List<uz.ithelp.rangtasvir.ModelRcycler>) results.values;
                notifyDataSetChanged();
            }
        };
        return filter;
    }

    public interface SelectedUser{
        void selectedUser(uz.ithelp.rangtasvir.ModelRcycler modelRcycler);
    }

    public class UserAdapterViewHolder extends RecyclerView.ViewHolder {

        TextView tvPerfix;
        TextView tvUserNAme;
        ImageView imIcon;

        public UserAdapterViewHolder(@NonNull View itemView) {
            super(itemView);

            tvUserNAme = itemView.findViewById(R.id.userNAme);
            imIcon = itemView.findViewById(R.id.imageView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    selectedUser.selectedUser(userModelList.get(getAdapterPosition()));

                    Toast.makeText(v.getContext(), "" + userModelList.get(getAdapterPosition()).getLessonName(), Toast.LENGTH_SHORT).show();

                }
            });
        }
    }
}

package uz.ithelp.rangtasvir.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

import uz.ithelp.rangtasvir.ModelViewPager;
import uz.ithelp.rangtasvir.ModelViewPagerAdapter;
import uz.ithelp.rangtasvir.R;
import uz.ithelp.rangtasvir.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment {

    ViewPager viewPager;
    ModelViewPagerAdapter modelViewPagerAdapter;

    List<ModelViewPager> modelViewPagerList2;

    private FragmentGalleryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        modelViewPagerList2 = new ArrayList<>();
        initiali();

        modelViewPagerAdapter = new ModelViewPagerAdapter(modelViewPagerList2,getContext());

        viewPager = binding.viewPager2;
        viewPager.setAdapter(modelViewPagerAdapter);
        viewPager.setPadding(130,0,130,0);

        return root;
    }

    private void initiali() {
        modelViewPagerList2.add(new ModelViewPager(R.drawable.b10,"Rangtasvir #1","video dars ...","rlc1pTgYY2A"));
        modelViewPagerList2.add(new ModelViewPager(R.drawable.b11,"Rangtasvir #2","video dars ...","md-l00R9Iz4"));
        modelViewPagerList2.add(new ModelViewPager(R.drawable.b12,"Rangtasvir #3","video dars ...","MGnIMNBVirU"));
        modelViewPagerList2.add(new ModelViewPager(R.drawable.b5,"Rangtasvir #4","video dars ...","ls5eFDSL06E"));
        modelViewPagerList2.add(new ModelViewPager(R.drawable.b14,"Rangtasvir #5","video dars ...","E9R0Lue1y-8"));
        modelViewPagerList2.add(new ModelViewPager(R.drawable.b15,"Rangtasvir #6","video dars ...",""));
        modelViewPagerList2.add(new ModelViewPager(R.drawable.b6,"Rangtasvir #7","video dars ...","I-7x7wCiyfU"));
        modelViewPagerList2.add(new ModelViewPager(R.drawable.b9,"Rangtasvir #8","video dars ...","lGbSRlk2vNg"));

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
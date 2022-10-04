package uz.ithelp.rangtasvir.ui.home;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.vectordrawable.graphics.drawable.ArgbEvaluator;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

import uz.ithelp.rangtasvir.ModelViewPager;
import uz.ithelp.rangtasvir.ModelViewPagerAdapter;
import uz.ithelp.rangtasvir.R;
import uz.ithelp.rangtasvir.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;


    ViewPager viewPager;
    ModelViewPagerAdapter modelViewPagerAdapter;
    List<ModelViewPager> modelViewPagerList;

//    Integer[] colors = null;
//    @SuppressLint("RestrictedApi")
//    ArgbEvaluator argbEvaluator = new ArgbEvaluator();



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        modelViewPagerList = new ArrayList<>();

        initiali();

        modelViewPagerAdapter = new ModelViewPagerAdapter(modelViewPagerList,getContext());

        viewPager = binding.viewPager1;

        viewPager.setAdapter(modelViewPagerAdapter);
        viewPager.setPadding(130,0,130,0);



//
//
//        Integer[] colors_temp = {
//                getResources().getColor(R.color.color1),
//                getResources().getColor(R.color.color2),
//                getResources().getColor(R.color.color3),
//                getResources().getColor(R.color.color4),
//                getResources().getColor(R.color.color5),
//                getResources().getColor(R.color.color6),
//                getResources().getColor(R.color.color7),
//                getResources().getColor(R.color.color8),
//                getResources().getColor(R.color.color9),
//        };
//
//        colors = colors_temp;
//
//        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
//            @SuppressLint("RestrictedApi")
//            @Override
//            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//
//                if (position < (modelViewPagerAdapter.getCount() -1) && position < (colors.length - 1)) {
//                    viewPager.setBackgroundColor(
//
//                            (Integer) argbEvaluator.evaluate(
//                                    positionOffset,
//                                    colors[position],
//                                    colors[position + 1]
//                            )
//                    );
//                }
//
//                else {
//                    viewPager.setBackgroundColor(colors[colors.length - 1]);
//                }
//            }
//
//            @Override
//            public void onPageSelected(int position) {
//
//            }
//
//            @Override
//            public void onPageScrollStateChanged(int state) {
//
//            }
//        });
        return root;
    }

    private void initiali() {
        modelViewPagerList.add(new ModelViewPager(R.drawable.b1,"KIRISH","BIRINCHI QISM. ETNOLOGIYANING UMUMIY MUAMMOLARI ...","https://github.com/shoxumarzoda/ETNOLOGIYA/raw/master/app/src/main/assets/kirish.pdf"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.b2,"I BOB. TASVIRIY SAN’AT","Fan haqida ...","1"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.b3,"II BOB. RANGTASVIR  JANRLARI","Portret janri ... ","2"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.b4,"III BOB.  RANGTASVIR QOIDA VA QONUNLARI","Ritm ...","3"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.b5,"IV BOB. RANGTASVIR USULLARI VA VOSITALARI","Rangtasvir vositalari ...","4"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.b6,"V BOB. RANGTASVIR ISHLASH BOSQICHLARI","Rangtasvir ishlash metodikasi ...","5"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.b7,"VI BOB.  RANGTASVIRDA ODAM BOSHINI ISHLASH TURLARI","Odam boshini grizayl uslubidagi yechimi ...","6"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.b8,"XULOSA","XULOSA ...","https://github.com/shoxumarzoda/ETNOLOGIYA/raw/master/xulosa.pdf"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.b9,"ATAMALARNING IZOHLI LUG‘ATI","ATAMALARNING IZOHLI LUG‘ATI ...","https://github.com/shoxumarzoda/ETNOLOGIYA/raw/master/izoh.pdf"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.book,"ADABIYOTLAR","Foydalanilgan adabiyotlar ...","https://github.com/shoxumarzoda/ETNOLOGIYA/raw/master/adabiyot.pdf"));

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
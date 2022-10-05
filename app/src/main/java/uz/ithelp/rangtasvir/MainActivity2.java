package uz.ithelp.rangtasvir;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity implements UserAdapter.SelectedUser {


    Toolbar toolbar;
    RecyclerView recyclerView;
    List<ModelRcycler> modelRcyclers = new ArrayList<>();
    TextView textViewSelectedChapterName;

    String getChemgeItemPosition;

    ConstraintLayout constraintLayout;
    UserAdapter userAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Intent intent = getIntent();

        // ruyhatni eloni va sozlanmasi
        recyclerView = findViewById(R.id.recyclerView1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));



        // tool bar sozlanmasi
//        toolbar = findViewById(R.id.toolBAr);
//        this.setSupportActionBar(toolbar);
//        this.getSupportActionBar().setTitle("");

        // tanlangan chapter nomini activity2 da sarlavhaga yozish
        textViewSelectedChapterName = findViewById(R.id.textViewSelectedChapterName);


        getChemgeItemPosition = intent.getStringExtra("swimmers");


        //backround uchun liner layoutni aniqlash
        constraintLayout = findViewById(R.id.constraintLayout1);
        constraintLayout.setBackgroundColor(getResources().getColor(R.color.mycolor));

        switch (getChemgeItemPosition){
            case "1": {

                textViewSelectedChapterName.setText("I BОB. ETNOLOGIYANING IJTIMOIY FANLAR  TIZIMIDA TUTGAN O‘RNI. UNING ASOSIY TUSHUNCHALARI VA O‘ZIGA XOSLIGI");

                modelRcyclers.add(new ModelRcycler("1.1-§. Fan haqida","https://github.com/shoxumarzoda/RANGTASVIR/raw/master/1.1.pdf"));
                modelRcyclers.add(new ModelRcycler("1.2-§. Tasviriy san’at ","https://github.com/shoxumarzoda/RANGTASVIR/raw/master/1.2.pdf"));
                modelRcyclers.add(new ModelRcycler("1.3-§. Realizm","https://github.com/shoxumarzoda/RANGTASVIR/raw/master/1.3.pdf"));
                modelRcyclers.add(new ModelRcycler("1.4-§. Rangtasvir ashyolari","https://github.com/shoxumarzoda/RANGTASVIR/raw/master/1.4.pdf"));
                modelRcyclers.add(new ModelRcycler("1.5-§. Dastgohli rangtasvir","https://github.com/shoxumarzoda/RANGTASVIR/raw/master/1.5.pdf"));
                modelRcyclers.add(new ModelRcycler("1.6-§. Rangtasvir fanining maqsad va vazifalari","https://github.com/shoxumarzoda/RANGTASVIR/raw/master/1.5.pdf"));

            }break;

            case "2": {

                textViewSelectedChapterName.setText("II BОB. ETNOLOGIYANING ASOSIY  YO‘NALISHLARI VA MAKTABLARI");

                modelRcyclers.add(new ModelRcycler("2.1-§. Portret janri","https://github.com/shoxumarzoda/RANGTASVIR/raw/master/2.1.pdf"));
                modelRcyclers.add(new ModelRcycler("2.2-§. Manzara janri","https://github.com/shoxumarzoda/RANGTASVIR/raw/master/2.2.pdf"));
                modelRcyclers.add(new ModelRcycler("2.3-§. Tarixiy janr","https://github.com/shoxumarzoda/RANGTASVIR/raw/master/2.3.pdf"));
                modelRcyclers.add(new ModelRcycler("2.4-§. Jang (batal) janri","https://github.com/shoxumarzoda/RANGTASVIR/raw/master/2.4.pdf"));
                modelRcyclers.add(new ModelRcycler("2.5-§. Maishiy janr","https://github.com/shoxumarzoda/RANGTASVIR/raw/master/2.5.pdf"));
                modelRcyclers.add(new ModelRcycler("2.6-§. Natyurmort janri","https://github.com/shoxumarzoda/RANGTASVIR/raw/master/2.6.pdf"));


            }break;

            case "3": {

                textViewSelectedChapterName.setText("III BOB. ETNOS MUAMMOSI BILAN BOG‘LIQ QARASHLAR VA NAZARIYALAR");

                modelRcyclers.add(new ModelRcycler("3.1-§. Ritm","https://github.com/shoxumarzoda/RANGTASVIR/raw/master/3.1.pdf"));
                modelRcyclers.add(new ModelRcycler("3.2-§. Simmetriya","https://github.com/shoxumarzoda/RANGTASVIR/raw/master/3.2.pdf"));
                modelRcyclers.add(new ModelRcycler("3.3-§. Asimmetriya","https://github.com/shoxumarzoda/RANGTASVIR/raw/master/3.3.pdf"));
                modelRcyclers.add(new ModelRcycler("3.4-§. Kontrast qonuni","https://github.com/shoxumarzoda/RANGTASVIR/raw/master/3.4.pdf"));
                modelRcyclers.add(new ModelRcycler("3.5-§. Yaxlitlik","https://github.com/shoxumarzoda/RANGTASVIR/raw/master/3.5.pdf"));
                modelRcyclers.add(new ModelRcycler("3.6-§. Tipiklshtirish qonuni","https://github.com/shoxumarzoda/RANGTASVIR/raw/master/3.6.pdf"));
                modelRcyclers.add(new ModelRcycler("3.7-§. Rangtasvirda kolorit","https://github.com/shoxumarzoda/RANGTASVIR/raw/master/3.7.pdf"));
                modelRcyclers.add(new ModelRcycler("3.8-§. Rangtasvirda nur-soya va rang","https://github.com/shoxumarzoda/RANGTASVIR/raw/master/3.8.pdf"));

            }break;

            case "4": {

                textViewSelectedChapterName.setText("IV BOB. DUNYONING ETNIK MANZARASI VA ETNOSLAR KLASSIFIKATSIYASI");

                modelRcyclers.add(new ModelRcycler("4.1-§. Rangtasvir vositalari","https://github.com/shoxumarzoda/RANGTASVIR/raw/master/4.1.pdf"));
                modelRcyclers.add(new ModelRcycler("4.2-§. Rangtasvirda perspektiva","https://github.com/shoxumarzoda/RANGTASVIR/raw/master/4.2.pdf"));
                modelRcyclers.add(new ModelRcycler("4.3-§. Rangtasvirda etyud ishlash","https://github.com/shoxumarzoda/RANGTASVIR/raw/master/4.3.pdf"));
                modelRcyclers.add(new ModelRcycler("4.4-§. Qoralamalar ishlash","https://github.com/shoxumarzoda/RANGTASVIR/raw/master/4.4.pdf"));


            }break;

            case "5":{
                textViewSelectedChapterName.setText("V BOB. ETNOS VA MADANIYAT");

                modelRcyclers.add(new ModelRcycler("5.1-§. Rangtasvir ishlash metodikasi","https://github.com/shoxumarzoda/RANGTASVIR/raw/master/5.1.pdf"));
                modelRcyclers.add(new ModelRcycler("5.2-§. Rangtasvirda chizmatasvirning roli","https://github.com/shoxumarzoda/RANGTASVIR/raw/master/5.2.pdf"));
                modelRcyclers.add(new ModelRcycler("5.3-§. Rangtasvir ishlash jarayoni","https://github.com/shoxumarzoda/RANGTASVIR/raw/master/5.3.pdf"));
                modelRcyclers.add(new ModelRcycler("5.4-§. Rangtasvir ishlash bosqichlari","https://github.com/shoxumarzoda/RANGTASVIR/raw/master/5.4.pdf"));
                modelRcyclers.add(new ModelRcycler("5.5-§. Naturadan rangtasvir ishlash","https://github.com/shoxumarzoda/RANGTASVIR/raw/master/5.5.pdf"));
                modelRcyclers.add(new ModelRcycler("5.6-§. Portretda bosh qismini tasvirlash","https://github.com/shoxumarzoda/RANGTASVIR/raw/master/5.6.pdf"));
                modelRcyclers.add(new ModelRcycler("5.7-§. Natura shakllarining amaliy tasviri","https://github.com/shoxumarzoda/RANGTASVIR/raw/master/5.7.pdf"));
                modelRcyclers.add(new ModelRcycler("5.8-§. Rangtasvirda naturadan ishlashga tavsiyalar","https://github.com/shoxumarzoda/RANGTASVIR/raw/master/5.8.pdf"));
            }

            case "6":{
                textViewSelectedChapterName.setText("VI BОB. AVSTRALIYA VA OKEANIYA XALQLARI");

                modelRcyclers.add(new ModelRcycler("6.1-§. Odam boshini grizayl uslubidagi yechimi","https://github.com/shoxumarzoda/RANGTASVIR/raw/master/6.1.pdf"));
                modelRcyclers.add(new ModelRcycler("6.2-§. Odam boshini cheklangan ranglar uslubida ishlash","https://github.com/shoxumarzoda/RANGTASVIR/raw/master/6.2.pdf"));
                modelRcyclers.add(new ModelRcycler("6.3-§. Odam boshining birlamchi qismlariga ishlov berish","https://github.com/shoxumarzoda/RANGTASVIR/raw/master/6.3.pdf"));
                modelRcyclers.add(new ModelRcycler("6.4-§. Xarakterli odam boshini ishlash","https://github.com/shoxumarzoda/RANGTASVIR/raw/master/6.4.pdf"));
                modelRcyclers.add(new ModelRcycler("6.5-§. Psixologik ayol boshini ishlash","https://github.com/shoxumarzoda/RANGTASVIR/raw/master/6.5.pdf"));
                modelRcyclers.add(new ModelRcycler("6.6-§. Odam boshini yelka qismi bilan ishlash","https://github.com/shoxumarzoda/RANGTASVIR/raw/master/6.6.pdf"));
                modelRcyclers.add(new ModelRcycler("6.7-§. Odam boshini ikki ko‘rinishdagi tahlili","https://github.com/shoxumarzoda/RANGTASVIR/raw/master/6.7.pdf"));
                modelRcyclers.add(new ModelRcycler("6.8-§. Tekshiruv vazifasi","https://github.com/shoxumarzoda/RANGTASVIR/raw/master/6.8.pdf"));

            }break;


        }

        userAdapter  = new UserAdapter(modelRcyclers,  this);
        recyclerView.setAdapter(userAdapter);

    }

    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        MenuItem menuItem = menu.findItem(R.id.search_view);

        SearchView searchView = (SearchView)menuItem.getActionView();
        searchView.setMaxWidth(Integer.MAX_VALUE);


        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                userAdapter.getFilter().filter(newText);
                return true;
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id   = item.getItemId();
        if (id == R.id.search_view) return true;
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void selectedUser(ModelRcycler modelRcycler) {
        startActivity(new Intent(MainActivity2.this, MainActivity3.class).putExtra("data",modelRcycler.getLoadUrl()));

    }



}
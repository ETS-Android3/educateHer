package com.example.educateher;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class ClinicsActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {


    private final Clinic[] clinics = new Clinic[32];
    private final String[] clinicNames = new String[32];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clinics);

        initClinics();
        ArrayAdapter adapter = new ArrayAdapter<>(this, R.layout.activity_clinics, R.id.textview, clinicNames);

        ListView listView = findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    public void initClinics() {


        clinics[0] = new Clinic("MTH womens hospital",
                "Mahatma Gandhi Rd, Siyaganj, Indore, Madhya Pradesh",
                "0000000",
                "https://www.google.com/maps/dir/24.5907618,80.8654526/MTH+womens+hospital,+Mahatma+Gandhi+Rd,+Siyaganj,+Indore,+Madhya+Pradesh+452007/@24.0794131,76.1264902,7z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x3962fd0de8eb7cfb:0xe184f2a82045f6c!2m2!1d75.8654495!2d22.7178864");


        clinics[1] = new Clinic("Kibs Hospital ( Hospital for Children and women)",
                " 651, R Sector, Mahalaxmi Nagar Balaji Heights Road, Near Bombay Hospital, Indore, Madhya Pradesh 452007",
                "0000",
                "https://www.google.com/maps/dir//Kibs+Hospital+(+Hospital+for+Children+and+women),+651,+R+Sector,+Mahalaxmi+Nagar+Balaji+Heights+Road,+Near+Bombay+Hospital,+Indore,+Madhya+Pradesh+452007/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x39631d59fbe096f9:0x58c3baae09f12c21?sa=X&ved=0ahUKEwiZm8CizebsAhXaSH0KHfaPDpwQ48ADCFkwAQ");


        clinics[2] = new Clinic("Angel Womens Hospital",
                "363, Goyal Nagar Ring Rd, Brijeshwari Annexe, Indore, Madhya Pradesh 452016",
                "0731 259 1157",
                "https://www.google.com/maps/dir/24.5907618,80.8654526/women+hospital+in+indore/@24.0799063,76.1470364,7z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x3962e2ce6d1b5003:0xa60a094093abc608!2m2!1d75.9065908!2d22.7181483");


        clinics[3] = new Clinic("Mahi Women's Clinic",
                "13 Bombo Road Kampala Kampala",
                "041-4346772/3/4",
                "https://www.google.com/maps/dir//women+hospital+in+indore/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x3962fd7b06a48007:0x585e710f51242541?sa=X&ved=2ahUKEwjThIu66ObsAhVNaCsKHXt6DjEQ9RcwAHoECAgQBQ");


        clinics[4] = new Clinic("Mahek Mother And Child Care Centre",
                "Aishwarya Apartment, GPO Square, Opposite GPO, Parsi Mohalla, Chhawni, Indore, Madhya Pradesh 452001",
                "099260 27770",
                "https://www.google.com/maps/dir/24.5907618,80.8654526/women+hospital+in+indore/@24.0713349,76.1327321,7z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x3962fd6d5c629411:0x53dbe51f2ef3319c!2m2!1d75.8782018!2d22.7071814");


        clinics[5] = new Clinic("Dr Shweta Kaul Jha - Care Womens Centre - IVF, Test Tube baby & Fertility Centre, Indore",
                "203, Vishal Astra, Satya Sai Square, Vijay Nagar, Indore, Madhya Pradesh 452001",
                "088890 16663",
                "https://www.google.com/maps/dir//women+hospital+in+indore/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x396302ab80d58579:0xd6c3cd1de1188077?sa=X&ved=2ahUKEwikre3w5-bsAhXFX30KHSPqBLgQ9RcwAHoECAgQBQ");


        clinics[6] = new Clinic("Mamata Hospital",
                "Rau, Indore, Madhya Pradesh 453331",
                "0731 420 1424",
                "https://www.google.com/maps/dir//women+hospital+in+indore/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x3962f95f30bf718b:0x4d761ddb3c17a16f?sa=X&ved=2ahUKEwjy3rPe5-bsAhXRdCsKHR7hBDEQ9RcwAHoECAUQAw");


        clinics[7] = new Clinic("Dr. Vandana Bansal",
                "107, 1st Floor, Sapphire House, Sapna Sangeeta Main Road, Snehnagar, Indore, Madhya Pradesh 452001",
                "0731 246 2696",
                "https://www.google.com/maps/dir//women+hospital+in+indore/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x3962fd1e0d824c91:0x1075d2b0d57399ca?sa=X&ved=2ahUKEwjKy66U5-bsAhWXWX0KHXhaCPwQ9RcwAHoECAYQBQ");


        clinics[8] = new Clinic("SEWA: Diabetes, Thyroid, Hormone, Endocrinologist & Women Care Centre",
                "Industry House, 109, Onam Plaza, Mumbai - Agra National Hwy, near Indore, Madhya Pradesh 452001",
                "099771 79179",
                "https://www.google.com/maps/dir/24.5907618,80.8654526/women+hospital+in+indore/@23.6964838,76.1377902,7z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x3962fd487f5ee89f:0xb8b6220c44132401!2m2!1d75.8882548!2d22.7288322");


        clinics[9] = new Clinic("Pulse Hospital",
                "Scheme No. 102, Manik Bagh Rd, Near Manikin, Bagh Bridge, Indore, Madhya Pradesh 452001",
                "0731 247 7172",
                "https://www.google.com/maps/dir//women+hospital+in+indore/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x3962fd23bdc3292f:0xa1085a13a4b8b01c?sa=X&ved=2ahUKEwj0_rfe5ubsAhXOF3IKHZmOCTsQ9RcwAHoECAUQAw");


        clinics[10] = new Clinic("Bombay Hospital",
                "No.94, IDA Scheme, 95, Eastern Ring Rd, Tulsi Nagar, Vijay Nagar, Indore, Madhya Pradesh 452010",
                "0731 255 8866",
                "https://www.google.com/maps/dir//women+hospital+in+indore/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x39631d54503f21d3:0xc114629679b13584?sa=X&ved=2ahUKEwj-rrXC5ubsAhXOZCsKHQ8JAXYQ9RcwAHoECAgQBQ");


        clinics[11] = new Clinic("Dr Suneeta Yadav and Dr Bhakti Yadav",
                "342, Rd Number 10, Ambe Nagar, Clerk Colony, Indore, Madhya Pradesh 452001",
                "098262 10324",
                "https://www.google.com/maps/dir//342,+Dr+Suneeta+Yadav+and+Dr+Bhakti+Yadav,+Rd+Number+10,+Ambe+Nagar,+Clerk+Colony,+Indore,+Madhya+Pradesh+452001/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x3963029e33f6730d:0x8cbb38696daadff9?sa=X&ved=0ahUKEwj08LvW5ebsAhWWfn0KHR-eCtsQ48ADCPYBMAw");


        clinics[12] = new Clinic("CHL Hospital Indore",
                "AB Rd, near L.I.G Square, Rss Nagar, Indore, Madhya Pradesh 452008",
                "0731 477 4444",
                "https://www.google.com/maps/dir//women+hospital+in+indore/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x3962fd4f4dca1777:0x62bc8f8b155a8bd8?sa=X&ved=2ahUKEwikptLa5ebsAhXUbCsKHej6BWkQ9RcwAHoECAYQBQ");


        clinics[13] = new Clinic("Indore Women Care Centre/ Dr Priyanka Patgaonkar",
                "126, LIG Link Rd, Anoop Nagar, Indore, Madhya Pradesh 452009",
                "088897 44448",
                "https://www.google.com/maps/dir/24.5907618,80.8654526/Indore+Women+Care+Centre%2F+Dr+Priyanka+Patgaonkar,+126,+LIG+Link+Rd,+Anoop+Nagar,+Indore,+Madhya+Pradesh+452009/@24.0870954,76.1394743,7z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x3962fd4ed518ad4d:0xc1783bae290aeb74!2m2!1d75.8913179!2d22.7325337");


        clinics[14] = new Clinic("ARIHANT HOSPITAL & RESEARCH CENTRE INDORE",
                "126, LIG Link Rd, Anoop Nagar, Indore, Madhya Pradesh 452009",
                "088897 44448",
                "https://www.google.com/maps/dir//women+hospital+in+indore/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x3962fd354a4cda9d:0xaa9f54e6905d5901?sa=X&ved=2ahUKEwia-MfY5ObsAhVbU30KHexIAGIQ9RcwAHoECAUQBQ");


        clinics[15] = new Clinic("Aditya Hospital Indore (Aditya Lifeline Pvt. Ltd.)",
                "318, Usha Nagar, Indore, Madhya Pradesh 452009",
                "0731 248 3311",
                "https://www.google.com/maps/dir/24.5907618,80.8654526/Aditya+Hospital+Indore+(Aditya+Lifeline+Pvt.+Ltd.),+318,+Usha+Nagar,+Indore,+Madhya+Pradesh+452009/@23.6157912,76.1105833,7z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x3962fc4b2d8866eb:0xf9d69065d764ae37!2m2!1d75.833735!2d22.697752");


        clinics[16] = new Clinic("Khandelwal Hospital",
                "plot no. 14, Annapurna Rd, Sector B, Sudama Nagar, Indore, Madhya Pradesh 452009",
                "0731 248 0351",
                "https://www.google.com/maps/dir//Khandelwal+Hospital,+plot+no.+14,+Annapurna+Rd,+Sector+B,+Sudama+Nagar,+Indore,+Madhya+Pradesh+452009/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x3962fdad8d3c3dbf:0xcdb74b3c3cce2486?sa=X&ved=0ahUKEwjB19KA5ObsAhWbWX0KHapmCnsQ48ADCMoCMBI");


        clinics[17] = new Clinic("Life Care Hospital",
                "Plot No.2, Scheme No 78 - II, Scheme Number 78, Part II, Vijay Nagar, Indore, Madhya Pradesh 452010",
                " 094248 25000",
                "https://www.google.com/maps/dir//women+hospital+in+indore/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x396302bb158a4901:0x563ec047e037c3a5?sa=X&ved=2ahUKEwjggZ7L4-bsAhUWA3IKHWuhAQkQ9RcwAHoECAUQBQ");


        for (int i = 0; i < 18; i++) {
            clinicNames[i] = clinics[i].getName();
        }
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
//        Log.i("HelloListView", "You clicked Item: " + id + " at position:" + position);
        Intent intent = new Intent(this, ClinicView.class);
        intent.putExtra("SelectedClinic", clinics[position]);
        startActivity(intent);
    }


}
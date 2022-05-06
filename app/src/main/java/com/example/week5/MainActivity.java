package com.example.week5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //검색 목록에 포함될 단어들
        String[] items={ "Fruit-Apple", "Fruit-Banana", "Fruit-Grape", "Fruit-Pineapple"
                , "City-Seoul", "City-Incheon", "City-Busan", "City-Sejong"};
        //자동완성텍스트뷰를 설정
        AutoCompleteTextView auto = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, items);
        auto.setAdapter(adapter);
        //멀티자동완성텍스트뷰를 설정
        MultiAutoCompleteTextView multi = (MultiAutoCompleteTextView)findViewById(
                R.id.multiAutoCompleteTextView1);
        MultiAutoCompleteTextView.CommaTokenizer token
                = new MultiAutoCompleteTextView.CommaTokenizer();
        multi.setTokenizer(token);
        multi.setAdapter(adapter);
    }
}

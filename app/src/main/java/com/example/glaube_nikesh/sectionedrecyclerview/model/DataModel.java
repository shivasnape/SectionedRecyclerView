package com.example.glaube_nikesh.sectionedrecyclerview.model;

import java.util.ArrayList;

/**
 * Created by Shivichu on 7/11/2017.
 */
public class DataModel {



    private String headerTitle;
    private ArrayList<String> allItemsInSection;


    public DataModel() {

    }
    public DataModel(String headerTitle, ArrayList<String> allItemsInSection) {
        this.headerTitle = headerTitle;
        this.allItemsInSection = allItemsInSection;
    }



    public String getHeaderTitle() {
        return headerTitle;
    }

    public void setHeaderTitle(String headerTitle) {
        this.headerTitle = headerTitle;
    }

    public ArrayList<String> getAllItemsInSection() {
        return allItemsInSection;
    }

    public void setAllItemsInSection(ArrayList<String> allItemsInSection) {
        this.allItemsInSection = allItemsInSection;
    }


}

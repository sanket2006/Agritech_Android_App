package com.appsnipp.profiledesigns.ui.myorders;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class myordersViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public myordersViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
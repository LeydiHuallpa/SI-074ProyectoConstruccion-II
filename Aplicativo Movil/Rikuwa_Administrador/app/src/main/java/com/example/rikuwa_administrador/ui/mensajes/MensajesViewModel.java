package com.example.rikuwa_administrador.ui.mensajes;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MensajesViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public MensajesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("MENSAJE FRAGMENT!!");
    }

    public LiveData<String> getText() {
        return mText;
    }}

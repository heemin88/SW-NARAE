package com.example.narae;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class BackGPS extends Service {
    public BackGPS() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
package com.example.tpo2moviles;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.widget.Toast;

public class UnlockScreen extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (Intent.ACTION_USER_PRESENT.equals(intent.getAction())) {
            Toast.makeText(context, "Pantalla desbloqueada detectada", Toast.LENGTH_LONG).show();
            Log.d("UnlockReceiver", "Evento de desbloqueo detectado");

            try {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:2664553747"));
                context.startActivity(callIntent);
            } catch (Exception e) {
                Toast.makeText(context, "Sin permiso para llamar", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
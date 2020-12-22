package com.nadhotel.alarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.nadhotel.R;

public class ReminderBroadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, channelId:"notifyLemubit")
                .setSmallIcon(R.drawable.ic_dtl_phone_black_24dp)
                .setContent(R.drawable.ic_dtl_phone_black_24dp)

    }
}

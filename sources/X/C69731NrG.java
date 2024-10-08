package X;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.widget.RemoteViews;
import com.instagram.android.R;

/* renamed from: X.NrG  reason: case insensitive filesystem */
public abstract class C69731NrG {
    public static final boolean A00(PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, Context context, AnonymousClass9T8 r21, C71032OZt oZt, String str, String str2) {
        String str3 = str;
        boolean A1Y = DbW.A1Y(str3);
        if (oZt.A03().A0A) {
            String str4 = Build.MANUFACTURER;
            0qQ.A08(str4);
            String A0j = DbY.A0j(str4);
            PendingIntent pendingIntent4 = pendingIntent;
            if (pendingIntent != null) {
                PendingIntent pendingIntent5 = pendingIntent2;
                if (pendingIntent2 != null && 00l.A0d(A0j, "samsung", false) && Build.VERSION.SDK_INT < 31) {
                    C71004OWb.A00.A03("CustomNotificationContentHelper", "Creating custom notification content for Samsung", (Throwable) null);
                    Context context2 = context;
                    RemoteViews remoteViews = new RemoteViews(context2.getPackageName(), R.layout.custom_incoming_notif_content);
                    remoteViews.setTextViewText(R.id.content_title, str3);
                    String str5 = str2;
                    remoteViews.setTextViewText(R.id.content_subtitle, str5);
                    RemoteViews remoteViews2 = new RemoteViews(context2.getPackageName(), R.layout.custom_incoming_notif_content);
                    remoteViews2.setTextViewText(R.id.content_title, str3);
                    remoteViews2.setTextViewText(R.id.content_subtitle, str5);
                    RemoteViews remoteViews3 = new RemoteViews(context2.getPackageName(), R.layout.custom_incoming_notif_buttons);
                    remoteViews3.setTextViewText(R.id.accept_button, context2.getText(2131972452));
                    remoteViews3.setTextViewCompoundDrawablesRelative(R.id.accept_button, R.drawable.call, 0, 0, 0);
                    remoteViews3.setTextViewText(R.id.decline_button, context2.getText(2131972456));
                    RemoteViews remoteViews4 = remoteViews3;
                    remoteViews4.setTextViewCompoundDrawablesRelative(R.id.decline_button, 0, 0, 0, 0);
                    remoteViews3.setOnClickPendingIntent(R.id.decline_button, pendingIntent4);
                    PendingIntent pendingIntent6 = pendingIntent3;
                    if (pendingIntent3 != null) {
                        remoteViews3.setViewVisibility(R.id.accept_video_button, 0);
                        remoteViews3.setTextViewText(R.id.accept_video_button, context2.getText(2131972453));
                        remoteViews4.setTextViewCompoundDrawablesRelative(R.id.accept_video_button, R.drawable.instagram_video_chat_outline_24, 0, 0, 0);
                        remoteViews3.setOnClickPendingIntent(R.id.accept_video_button, pendingIntent5);
                        remoteViews3.setOnClickPendingIntent(R.id.accept_button, pendingIntent6);
                    } else {
                        remoteViews3.setOnClickPendingIntent(R.id.accept_button, pendingIntent5);
                    }
                    remoteViews2.addView(R.id.content_container, remoteViews3);
                    AnonymousClass9T8 r3 = r21;
                    r3.A0H = remoteViews;
                    r3.A0G = remoteViews2;
                    r3.A0I = remoteViews2;
                    r3.A0A(new AA2());
                    return A1Y;
                }
            }
        }
        return false;
    }
}

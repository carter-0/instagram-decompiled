package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import com.facebook.rsys.call.gen.CallModel;
import com.facebook.rtc.notification.NotificationDeletedBroadcastReceiver;
import com.instagram.android.R;

public final class OYh {
    public final Uri A00;
    public final C71032OZt A01;
    public final boolean A02;
    public final long[] A03 = {0, 800, 1838};

    public static final AnonymousClass9T8 A01(PendingIntent pendingIntent, Context context, CallModel callModel, OYh oYh, String str, String str2, String str3, boolean z, boolean z2) {
        Intent A0A = C66580MXl.A0A(context, NotificationDeletedBroadcastReceiver.class);
        A0A.putExtra("notification_type_tag", str3);
        A0A.putExtra("local_call_id", str);
        A0A.putExtra("for_foreground", z2);
        C71032OZt oZt = oYh.A01;
        A0A.putExtra("end_call_on_notification_dismiss", false);
        0Sy A0K = C66582MXn.A0K(context, A0A);
        A0K.A09();
        A0K.A08 = new C12271SqQ(0wb.A01);
        PendingIntent A022 = A0K.A02(context, 7, 134217728);
        AnonymousClass9T8 r3 = new AnonymousClass9T8(context, str2);
        r3.A05 = 2;
        r3.A0E(false);
        r3.A0C(oZt.A05(callModel));
        r3.A0B(oZt.A04(callModel));
        AnonymousClass9T8.A01(r3, 2, true);
        r3.A0C = pendingIntent;
        Notification notification = r3.A0A;
        notification.deleteIntent = A022;
        notification.when = 0;
        int i = R.drawable.call;
        if (z) {
            i = R.drawable.instagram_video_chat_outline_24;
        }
        r3.A04(i);
        if (oZt.A03().A09) {
            r3.A0T = "call";
        }
        return r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0055, code lost:
        if (X.C51971G9r.A1b(r6.A03().A01) == false) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public OYh(android.content.Context r5, X.C71032OZt r6) {
        /*
            r4 = this;
            r4.<init>()
            r4.A01 = r6
            r0 = 3
            long[] r0 = new long[r0]
            r0 = {0, 800, 1838} // fill-array
            r4.A03 = r0
            android.content.res.Resources r3 = X.AnonymousClass7TF.A0A(r5)
            r2 = 2131886139(0x7f12003b, float:1.9406848E38)
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            r0 = 76
            java.lang.String r0 = X.Pxd.A00(r0)
            android.net.Uri$Builder r1 = r1.scheme(r0)
            java.lang.String r0 = r3.getResourcePackageName(r2)
            android.net.Uri$Builder r1 = r1.authority(r0)
            java.lang.String r0 = r3.getResourceTypeName(r2)
            android.net.Uri$Builder r1 = r1.appendPath(r0)
            java.lang.String r0 = r3.getResourceEntryName(r2)
            android.net.Uri$Builder r0 = r1.appendPath(r0)
            android.net.Uri r0 = r0.build()
            X.0qQ.A07(r0)
            r4.A00 = r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r1 < r0) goto L_0x0057
            X.N3t r0 = r6.A03()
            X.0sa r0 = r0.A01
            boolean r1 = X.C51971G9r.A1b(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0058
        L_0x0057:
            r0 = 0
        L_0x0058:
            r4.A02 = r0
            java.lang.String r3 = "incoming_calls_1"
            android.content.Context r0 = r5.getApplicationContext()
            java.lang.Object r2 = X.C66582MXn.A0p(r0)
            android.app.NotificationManager r2 = (android.app.NotificationManager) r2
            java.lang.String r1 = "calling_channel_group"
            r2.deleteNotificationChannel(r3)
            java.lang.String r0 = "ongoing_calls"
            r2.deleteNotificationChannel(r0)
            r2.deleteNotificationChannelGroup(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OYh.<init>(android.content.Context, X.OZt):void");
    }

    public static final SpannableString A00(Context context, int i, int i2) {
        SpannableString A0D = C66580MXl.A0D(context.getString(i2));
        A0D.setSpan(new AbsoluteSizeSpan(14, true), 0, A0D.length(), 0);
        A0D.setSpan(C66580MXl.A0E(context.getColor(i)), 0, A0D.length(), 0);
        return A0D;
    }
}

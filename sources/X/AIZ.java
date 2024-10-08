package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioManager;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.ArrayList;
import org.webrtc.MediaStreamTrack;

public final class AIZ {
    public final Context A00;
    public final long[] A01 = {0, 500, 500};
    public final long[] A02 = {0, 250, 200, 250};
    public final AudioManager A03;

    private final Notification A00(PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, UserSession userSession, String str, String str2, boolean z) {
        Context context = this.A00;
        0qQ.A06(context);
        String A002 = 0lz.A00(context);
        int i = 2131954450;
        if (z) {
            i = 2131954435;
        }
        String string = context.getString(i);
        0qQ.A0A(string);
        int i2 = R.drawable.instagram_video_chat_outline_24;
        if (z) {
            i2 = R.drawable.call;
        }
        Notification.Builder lights = new Notification.Builder(context, AnonymousClass000.A00(3295)).setOngoing(true).setContentText(string).setContentTitle(A002).setTicker(002.A0R(str, "")).setTimeoutAfter(C39620A2k.A00).setAutoCancel(!182.A06(0Tu.A05, userSession, 36323667999665528L)).setWhen(0).setOnlyAlertOnce(true).setCategory("call").setSmallIcon(i2).setDeleteIntent(pendingIntent2).setDefaults(1).setLights(context.getColor(R.color.gdpr_notif_led_color), 300, IgNetworkConsentStorage.MAX_ENTRIES);
        Person.Builder name = new Person.Builder().setName(str2);
        0qQ.A07(name);
        if (!(pendingIntent2 == null || pendingIntent == null)) {
            lights.setStyle(Notification.CallStyle.forIncomingCall(name.build(), pendingIntent2, pendingIntent));
        }
        lights.setFullScreenIntent(pendingIntent3, true).setContentIntent(pendingIntent3);
        int ringerMode = this.A03.getRingerMode();
        if (ringerMode == 1 || ringerMode == 2) {
            lights.setVibrate(this.A01);
        }
        Notification build = lights.build();
        build.flags |= 4;
        return build;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.AA2, androidx.core.app.NotificationCompat$BigTextStyle] */
    public static final AnonymousClass9T8 A02(AIZ aiz, String str, String str2, long[] jArr) {
        Bitmap A0H;
        Context context = aiz.A00;
        0qQ.A06(context);
        String A002 = 0lz.A00(context);
        AnonymousClass9T8 r4 = new AnonymousClass9T8(context, AnonymousClass000.A00(3295));
        r4.A0C(A002);
        r4.A0B(str);
        r4.A0D(str);
        ? aa2 = new AA2();
        aa2.A07(str);
        r4.A0A(aa2);
        Notification notification = r4.A0A;
        notification.when = 0;
        AnonymousClass9T8.A01(r4, 8, true);
        r4.A0T = "call";
        int i = R.drawable.notification_icon;
        int A0H2 = 2Yu.A0H(context, R.attr.defaultNotificationIcon);
        if (A0H2 != 0) {
            i = A0H2;
        }
        r4.A04(i);
        r4.A05(context.getColor(R.color.gdpr_notif_led_color), 300, IgNetworkConsentStorage.MAX_ENTRIES);
        if (!(str2 == null || (A0H = 1NK.A00().A0H(new SimpleImageUrl(str2), (String) null)) == null)) {
            r4.A07(C71141Odp.A02(context, A0H));
        }
        int ringerMode = aiz.A03.getRingerMode();
        if (ringerMode != 1 && ringerMode != 2) {
            return r4;
        }
        notification.vibrate = jArr;
        return r4;
    }

    public final Notification A03() {
        Context context = this.A00;
        String A16 = AnonymousClass7TE.A16(context, 2131954450);
        AnonymousClass9T8 r1 = new AnonymousClass9T8(context, "ig_other");
        r1.A0C(A16);
        r1.A04(R.drawable.instagram_video_chat_outline_24);
        Notification A032 = r1.A03();
        0qQ.A07(A032);
        return A032;
    }

    public final Notification A04(PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, UserSession userSession, Boolean bool, String str, String str2, String str3, boolean z) {
        PendingIntent pendingIntent4 = pendingIntent;
        PendingIntent pendingIntent5 = pendingIntent2;
        PendingIntent pendingIntent6 = pendingIntent3;
        UserSession userSession2 = userSession;
        String str4 = str;
        if (z) {
            String str5 = str3;
            if (!(str3 == null || str5.length() == 0 || bool == null || pendingIntent3 == null)) {
                182.A06(0Tu.A06, userSession2, 36326197734422104L);
                if (Build.VERSION.SDK_INT >= 31) {
                    return A00(pendingIntent4, pendingIntent5, pendingIntent6, userSession2, str4, str5, bool.booleanValue());
                }
            }
        }
        AnonymousClass9T8 A022 = A02(this, 002.A0R(str4, ""), str2, this.A01);
        A022.A05 = 2;
        A022.A09 = C39620A2k.A00;
        AnonymousClass9T8.A01(A022, 2, true);
        A022.A0E(!182.A06(0Tu.A05, userSession2, 36323667999665528L));
        if (pendingIntent3 != null) {
            A022.A0D = pendingIntent6;
            AnonymousClass9T8.A01(A022, 128, true);
            A022.A0C = pendingIntent6;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (pendingIntent != null) {
            Context context = this.A00;
            CharSequence text = context.getText(2131954429);
            0qQ.A07(text);
            SpannableString spannableString = new SpannableString(text);
            spannableString.setSpan(new ForegroundColorSpan(context.getColor(R.color.green_5_pressable)), 0, spannableString.length(), 0);
            A1C.add(new ADG(pendingIntent4, spannableString, 0));
        }
        if (pendingIntent2 != null) {
            Context context2 = this.A00;
            CharSequence text2 = context2.getText(2131954442);
            0qQ.A07(text2);
            SpannableString spannableString2 = new SpannableString(text2);
            spannableString2.setSpan(new ForegroundColorSpan(context2.getColor(R.color.red_5_pressable)), 0, spannableString2.length(), 0);
            A1C.add(new ADG(pendingIntent5, spannableString2, 0));
        }
        A022.A0Y = A1C;
        Notification notification = A022.A0A;
        notification.deleteIntent = pendingIntent5;
        notification.defaults = 1;
        Notification A032 = A022.A03();
        A032.flags |= 4;
        return A032;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.AA2, androidx.core.app.NotificationCompat$BigTextStyle] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
        if (r2 != false) goto L_0x0054;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.Notification A05(android.app.PendingIntent r14, android.app.PendingIntent r15, com.instagram.common.session.UserSession r16, java.lang.String r17, long r18, boolean r20) {
        /*
            r13 = this;
            r9 = r17
            X.0Tu r2 = X.0Tu.A06
            r0 = 36326197734422104(0x810e7c00003658, double:3.036171948881503E-306)
            r4 = r16
            boolean r2 = X.182.A06(r2, r4, r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            r3 = 1
            r6 = r13
            if (r1 < r0) goto L_0x0054
            r0 = 34
            if (r1 < r0) goto L_0x0065
            if (r2 == 0) goto L_0x0032
            r2 = 0
            android.content.Context r1 = r13.A00     // Catch:{ RuntimeException -> 0x0056 }
            java.lang.String r0 = "activity"
            java.lang.Object r1 = r1.getSystemService(r0)     // Catch:{ RuntimeException -> 0x0056 }
            java.lang.String r0 = "null cannot be cast to non-null type android.app.ActivityManager"
            X.0qQ.A0C(r1, r0)     // Catch:{ RuntimeException -> 0x0056 }
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch:{ RuntimeException -> 0x0056 }
            boolean r2 = r1.isBackgroundRestricted()     // Catch:{ RuntimeException -> 0x0056 }
            goto L_0x0056
        L_0x0032:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326197734487641(0x810e7c00013659, double:3.036171948922949E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0065
            r2 = 0
            android.content.Context r1 = r13.A00     // Catch:{ RuntimeException -> 0x0063 }
            java.lang.String r0 = "activity"
            java.lang.Object r1 = r1.getSystemService(r0)     // Catch:{ RuntimeException -> 0x0063 }
            java.lang.String r0 = "null cannot be cast to non-null type android.app.ActivityManager"
            X.0qQ.A0C(r1, r0)     // Catch:{ RuntimeException -> 0x0063 }
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch:{ RuntimeException -> 0x0063 }
            boolean r2 = r1.isBackgroundRestricted()     // Catch:{ RuntimeException -> 0x0063 }
            goto L_0x0063
        L_0x0054:
            r3 = 0
            goto L_0x0065
        L_0x0056:
            if (r2 == 0) goto L_0x0065
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326197734487641(0x810e7c00013659, double:3.036171948922949E-306)
            boolean r2 = X.182.A06(r2, r4, r0)
        L_0x0063:
            if (r2 != 0) goto L_0x0054
        L_0x0065:
            r7 = r14
            r8 = r15
            r10 = r18
            r12 = r20
            if (r3 == 0) goto L_0x0072
            android.app.Notification r1 = r6.A01(r7, r8, r9, r10, r12)
            return r1
        L_0x0072:
            if (r17 != 0) goto L_0x0085
            android.content.Context r1 = r13.A00
            r0 = 2131954450(0x7f130b12, float:1.95454E38)
            if (r20 == 0) goto L_0x007e
            r0 = 2131954435(0x7f130b03, float:1.954537E38)
        L_0x007e:
            java.lang.String r9 = r1.getString(r0)
            X.0qQ.A0A(r9)
        L_0x0085:
            android.content.Context r2 = r13.A00
            r0 = 2131954473(0x7f130b29, float:1.9545446E38)
            java.lang.String r6 = X.AnonymousClass7TE.A16(r2, r0)
            r5 = 2131238979(0x7f082043, float:1.8094252E38)
            if (r20 == 0) goto L_0x0096
            r5 = 2131231255(0x7f080217, float:1.8078586E38)
        L_0x0096:
            java.lang.String r0 = "ig_other"
            X.9T8 r3 = new X.9T8
            r3.<init>((android.content.Context) r2, (java.lang.String) r0)
            r1 = 1
            r0 = 2
            X.AnonymousClass9T8.A01(r3, r0, r1)
            r3.A0C(r9)
            android.app.Notification r4 = r3.A0A
            r4.when = r10
            r3.A04(r5)
            androidx.core.app.NotificationCompat$BigTextStyle r0 = new androidx.core.app.NotificationCompat$BigTextStyle
            r0.<init>()
            r0.A07(r6)
            r3.A0A(r0)
            r3.A0B(r6)
            r0 = 2131099989(0x7f060155, float:1.7812347E38)
            int r0 = r2.getColor(r0)
            r3.A01 = r0
            r3.A0d = r1
            r3.A0e = r1
            if (r15 == 0) goto L_0x00f4
            r0 = 2131954461(0x7f130b1d, float:1.9545422E38)
            java.lang.String r2 = r2.getString(r0)
            r0 = 0
            X.ADG r1 = new X.ADG
            r1.<init>(r15, r2, r0)
            java.util.ArrayList r0 = r3.A0Y
            r0.add(r1)
            r4.deleteIntent = r15
        L_0x00dd:
            if (r14 == 0) goto L_0x00ec
            r3.A0C = r14
        L_0x00e1:
            android.app.Notification r1 = r3.A03()
            int r0 = r1.flags
            r0 = r0 | 32
            r1.flags = r0
            return r1
        L_0x00ec:
            java.lang.String r1 = "RtcCallNotificationFactory"
            java.lang.String r0 = "resumeCallIntent is null"
            X.0KC.A0E(r1, r0)
            goto L_0x00e1
        L_0x00f4:
            java.lang.String r1 = "RtcCallNotificationFactory"
            java.lang.String r0 = "leaveCallIntent is null"
            X.0KC.A0E(r1, r0)
            goto L_0x00dd
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AIZ.A05(android.app.PendingIntent, android.app.PendingIntent, com.instagram.common.session.UserSession, java.lang.String, long, boolean):android.app.Notification");
    }

    public AIZ(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.A00 = applicationContext;
        Object systemService = applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        0qQ.A0C(systemService, AnonymousClass000.A00(4));
        this.A03 = (AudioManager) systemService;
    }

    private final Notification A01(PendingIntent pendingIntent, PendingIntent pendingIntent2, String str, long j, boolean z) {
        int i = R.drawable.instagram_video_chat_outline_24;
        if (z) {
            i = R.drawable.call;
        }
        Context context = this.A00;
        Notification.Builder colorized = new Notification.Builder(context, "ig_other").setOngoing(true).setSmallIcon(i).setWhen(j).setShowWhen(true).setContentText(AnonymousClass7TE.A16(context, 2131954473)).setColor(context.getColor(R.color.default_cta_dominant_color)).setColorized(true);
        0qQ.A07(colorized);
        if (pendingIntent2 != null) {
            if (str == null) {
                int i2 = 2131954450;
                if (z) {
                    i2 = 2131954435;
                }
                str = context.getString(i2);
                0qQ.A0A(str);
            }
            Person.Builder name = new Person.Builder().setName(str);
            0qQ.A07(name);
            0qQ.A0A(name.setIcon(Icon.createWithResource(context, R.drawable.notification_icon)));
            colorized.setStyle(Notification.CallStyle.forOngoingCall(name.build(), pendingIntent2));
        } else {
            0KC.A0E("RtcCallNotificationFactory", "chip leaveCallIntent is null");
        }
        if (pendingIntent == null || colorized.setContentIntent(pendingIntent) == null) {
            0KC.A0E("RtcCallNotificationFactory", "resumeCallIntent is null");
        }
        Notification build = colorized.build();
        build.flags |= 32;
        return build;
    }
}

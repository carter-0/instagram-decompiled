package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat$CallStyle;
import androidx.core.graphics.drawable.IconCompat;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.location.platform.api.Location;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.8wN  reason: invalid class name and case insensitive filesystem */
public final class C370398wN implements C370408wO {
    public int A00;
    public RemoteViews A01;
    public RemoteViews A02;
    public RemoteViews A03;
    public final Notification.Builder A04;
    public final Context A05;
    public final AnonymousClass9T8 A06;
    public final Bundle A07 = new Bundle();
    public final List A08 = new ArrayList();

    public C370398wN(AnonymousClass9T8 r26) {
        Icon A002;
        int i;
        Bundle[] bundleArr;
        int i2;
        ADG A003;
        ADG A004;
        AnonymousClass9T8 r0 = r26;
        this.A06 = r0;
        Context context = r0.A0E;
        this.A05 = context;
        Notification.Builder builder = new Notification.Builder(context, r0.A0U);
        this.A04 = builder;
        Notification notification = r0.A0A;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, (RemoteViews) null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(r0.A0P).setContentText(r0.A0O).setContentInfo(r0.A0N).setContentIntent(r0.A0C).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(r0.A0D, (notification.flags & 128) != 0).setNumber(r0.A04).setProgress(r0.A07, r0.A06, r0.A0h);
        Notification.Builder builder2 = this.A04;
        IconCompat iconCompat = r0.A0M;
        if (iconCompat == null) {
            A002 = null;
        } else {
            A002 = C66773McJ.A00(context, iconCompat);
        }
        builder2.setLargeIcon(A002);
        this.A04.setSubText(r0.A0R).setUsesChronometer(r0.A0k).setPriority(r0.A05);
        AA2 aa2 = r0.A0K;
        if (aa2 instanceof NotificationCompat$CallStyle) {
            NotificationCompat$CallStyle notificationCompat$CallStyle = (NotificationCompat$CallStyle) aa2;
            PendingIntent pendingIntent = notificationCompat$CallStyle.A02;
            if (pendingIntent == null) {
                A003 = NotificationCompat$CallStyle.A00(notificationCompat$CallStyle.A03, notificationCompat$CallStyle, notificationCompat$CallStyle.A06, R.drawable.ic_call_decline, 2131954468, R.color.call_notification_decline_color);
            } else {
                A003 = NotificationCompat$CallStyle.A00(pendingIntent, notificationCompat$CallStyle, notificationCompat$CallStyle.A06, R.drawable.ic_call_decline, 2131954467, R.color.call_notification_decline_color);
            }
            PendingIntent pendingIntent2 = notificationCompat$CallStyle.A01;
            if (pendingIntent2 == null) {
                A004 = null;
            } else {
                boolean z = notificationCompat$CallStyle.A07;
                int i3 = R.drawable.ic_call_answer;
                int i4 = 2131954465;
                if (z) {
                    i3 = R.drawable.ic_call_answer_video;
                    i4 = 2131954466;
                }
                A004 = NotificationCompat$CallStyle.A00(pendingIntent2, notificationCompat$CallStyle, notificationCompat$CallStyle.A05, i3, i4, R.color.call_notification_answer_color);
            }
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(A003);
            char c = 2;
            Iterator it = notificationCompat$CallStyle.A00.A0Y.iterator();
            while (it.hasNext()) {
                ADG adg = (ADG) it.next();
                if (adg.A09) {
                    arrayList.add(adg);
                } else if (!adg.A08.getBoolean("key_action_priority") && c > 1) {
                    arrayList.add(adg);
                    c = 1;
                }
                if (A004 != null && c == 1) {
                    arrayList.add(A004);
                    c = 0;
                }
            }
            if (A004 != null && c >= 1) {
                arrayList.add(A004);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                A00((ADG) it2.next());
            }
        } else {
            Iterator it3 = r0.A0Y.iterator();
            while (it3.hasNext()) {
                A00((ADG) it3.next());
            }
        }
        Bundle bundle = r0.A0F;
        if (bundle != null) {
            this.A07.putAll(bundle);
        }
        this.A02 = r0.A0H;
        this.A01 = r0.A0G;
        this.A04.setShowWhen(r0.A0i);
        int i5 = Build.VERSION.SDK_INT;
        this.A04.setLocalOnly(r0.A0g);
        this.A04.setGroup(r0.A0V);
        this.A04.setSortKey(r0.A0X);
        this.A04.setGroupSummary(r0.A0f);
        this.A00 = r0.A03;
        this.A04.setCategory(r0.A0T);
        this.A04.setColor(r0.A01);
        this.A04.setVisibility(r0.A08);
        this.A04.setPublicVersion(r0.A0B);
        this.A04.setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList2 = r0.A0a;
        if (!arrayList2.isEmpty()) {
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                this.A04.addPerson((String) it4.next());
            }
        }
        this.A03 = r0.A0I;
        ArrayList arrayList3 = r0.A0Z;
        if (arrayList3.size() > 0) {
            Bundle bundle2 = r0.A0F;
            if (bundle2 == null) {
                bundle2 = new Bundle();
                r0.A0F = bundle2;
            }
            Bundle bundle3 = bundle2.getBundle("android.car.EXTENSIONS");
            bundle3 = bundle3 == null ? new Bundle() : bundle3;
            Bundle bundle4 = new Bundle(bundle3);
            Bundle bundle5 = new Bundle();
            for (int i6 = 0; i6 < arrayList3.size(); i6++) {
                String num = Integer.toString(i6);
                ADG adg2 = (ADG) arrayList3.get(i6);
                Bundle bundle6 = new Bundle();
                IconCompat iconCompat2 = adg2.A02;
                if (iconCompat2 == null && (i2 = adg2.A00) != 0) {
                    iconCompat2 = IconCompat.A01((Resources) null, "", i2);
                    adg2.A02 = iconCompat2;
                }
                if (iconCompat2 != null) {
                    i = iconCompat2.A04();
                } else {
                    i = 0;
                }
                bundle6.putInt(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, i);
                bundle6.putCharSequence(DialogModule.KEY_TITLE, adg2.A03);
                bundle6.putParcelable("actionIntent", adg2.A01);
                Bundle bundle7 = new Bundle(adg2.A08);
                bundle7.putBoolean("android.support.allowGeneratedReplies", adg2.A04);
                bundle6.putBundle(Location.EXTRAS, bundle7);
                A7Y[] a7yArr = adg2.A0A;
                if (a7yArr == null) {
                    bundleArr = null;
                } else {
                    int length = a7yArr.length;
                    int i7 = length;
                    bundleArr = new Bundle[length];
                    for (int i8 = 0; i8 < i7; i8++) {
                        A7Y a7y = a7yArr[i8];
                        Bundle bundle8 = new Bundle();
                        bundle8.putString("resultKey", a7y.A03);
                        bundle8.putCharSequence("label", a7y.A02);
                        bundle8.putCharSequenceArray("choices", a7y.A06);
                        bundle8.putBoolean("allowFreeFormInput", a7y.A05);
                        bundle8.putBundle(Location.EXTRAS, a7y.A01);
                        Set set = a7y.A04;
                        Set<Object> set2 = set;
                        if (!set.isEmpty()) {
                            ArrayList arrayList4 = new ArrayList(set2.size());
                            for (Object add : set2) {
                                arrayList4.add(add);
                            }
                            bundle8.putStringArrayList("allowedDataTypes", arrayList4);
                        }
                        bundleArr[i8] = bundle8;
                    }
                }
                bundle6.putParcelableArray("remoteInputs", bundleArr);
                bundle6.putBoolean("showsUserInterface", adg2.A06);
                bundle6.putInt("semanticAction", adg2.A07);
                bundle5.putBundle(num, bundle6);
            }
            bundle3.putBundle("invisible_actions", bundle5);
            bundle4.putBundle("invisible_actions", bundle5);
            Bundle bundle9 = r0.A0F;
            if (bundle9 == null) {
                bundle9 = new Bundle();
                r0.A0F = bundle9;
            }
            String str = "android.car.EXTENSIONS";
            bundle9.putBundle(str, bundle3);
            this.A07.putBundle(str, bundle4);
        }
        Object obj = r0.A0S;
        if (obj != null) {
            this.A04.setSmallIcon((Icon) obj);
        }
        this.A04.setExtras(r0.A0F);
        this.A04.setRemoteInputHistory((CharSequence[]) null);
        RemoteViews remoteViews = r0.A0H;
        if (remoteViews != null) {
            this.A04.setCustomContentView(remoteViews);
        }
        RemoteViews remoteViews2 = r0.A0G;
        if (remoteViews2 != null) {
            this.A04.setCustomBigContentView(remoteViews2);
        }
        RemoteViews remoteViews3 = r0.A0I;
        if (remoteViews3 != null) {
            this.A04.setCustomHeadsUpContentView(remoteViews3);
        }
        this.A04.setBadgeIconType(r0.A00);
        this.A04.setSettingsText(r0.A0Q);
        this.A04.setShortcutId(r0.A0W);
        this.A04.setTimeoutAfter(r0.A09);
        this.A04.setGroupAlertBehavior(r0.A03);
        if (r0.A0e) {
            this.A04.setColorized(r0.A0d);
        }
        if (!TextUtils.isEmpty(r0.A0U)) {
            this.A04.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
        }
        Iterator it5 = r0.A0b.iterator();
        while (it5.hasNext()) {
            this.A04.addPerson(AAA.A00((AH5) it5.next()));
        }
        if (i5 >= 29) {
            C370418wQ.A03(this.A04, r0.A0c);
            C370418wQ.A01(C370428wR.A00(r0.A0J), this.A04);
            SJT sjt = r0.A0L;
            if (sjt != null) {
                C370418wQ.A02(this.A04, sjt.A01());
            }
            if (i5 >= 31 && r0.A02 != 0) {
                AnonymousClass9W7.A01(this.A04);
            }
        }
        if (r0.A0j) {
            if (this.A06.A0f) {
                this.A00 = 2;
            } else {
                this.A00 = 1;
            }
            this.A04.setVibrate((long[]) null);
            this.A04.setSound((Uri) null);
            int i9 = notification.defaults & -2;
            notification.defaults = i9;
            int i10 = i9 & -3;
            notification.defaults = i10;
            this.A04.setDefaults(i10);
            if (TextUtils.isEmpty(this.A06.A0V)) {
                this.A04.setGroup("silent");
            }
            this.A04.setGroupAlertBehavior(this.A00);
        }
    }

    private void A00(ADG adg) {
        Icon icon;
        int i;
        IconCompat iconCompat = adg.A02;
        if (iconCompat == null && (i = adg.A00) != 0) {
            iconCompat = IconCompat.A01((Resources) null, "", i);
            adg.A02 = iconCompat;
        }
        if (iconCompat != null) {
            icon = C66773McJ.A00((Context) null, iconCompat);
        } else {
            icon = null;
        }
        Notification.Action.Builder builder = new Notification.Action.Builder(icon, adg.A03, adg.A01);
        A7Y[] a7yArr = adg.A0A;
        if (a7yArr != null) {
            int length = a7yArr.length;
            RemoteInput[] remoteInputArr = new RemoteInput[length];
            for (int i2 = 0; i2 < length; i2++) {
                remoteInputArr[i2] = AAB.A00(a7yArr[i2]);
            }
            for (int i3 = 0; i3 < length; i3++) {
                builder.addRemoteInput(remoteInputArr[i3]);
            }
        }
        Bundle bundle = new Bundle(adg.A08);
        boolean z = adg.A04;
        bundle.putBoolean("android.support.allowGeneratedReplies", z);
        builder.setAllowGeneratedReplies(z);
        int i4 = adg.A07;
        bundle.putInt("android.support.action.semanticAction", i4);
        builder.setSemanticAction(i4);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            C370418wQ.A00(builder, adg.A09);
            if (i5 >= 31) {
                AnonymousClass9W7.A00(builder, adg.A05);
            }
        }
        bundle.putBoolean("android.support.action.showsUserInterface", adg.A06);
        builder.addExtras(bundle);
        this.A04.addAction(builder.build());
    }
}

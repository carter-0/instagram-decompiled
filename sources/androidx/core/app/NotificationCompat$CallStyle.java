package androidx.core.app;

import X.AA2;
import X.AAA;
import X.ADG;
import X.AH2;
import X.AH5;
import X.AJ4;
import X.C370398wN;
import X.C370408wO;
import X.C66773McJ;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;

public final class NotificationCompat$CallStyle extends AA2 {
    public int A00;
    public PendingIntent A01;
    public PendingIntent A02;
    public PendingIntent A03;
    public AH5 A04;
    public Integer A05;
    public Integer A06;
    public boolean A07;
    public IconCompat A08;
    public CharSequence A09;

    public final String A03() {
        return "androidx.core.app.NotificationCompat$CallStyle";
    }

    public static ADG A00(PendingIntent pendingIntent, NotificationCompat$CallStyle notificationCompat$CallStyle, Integer num, int i, int i2, int i3) {
        if (num == null) {
            num = Integer.valueOf(notificationCompat$CallStyle.A00.A0E.getColor(i3));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(notificationCompat$CallStyle.A00.A0E.getResources().getString(i2));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
        ADG A012 = new AH2(pendingIntent, IconCompat.A00(notificationCompat$CallStyle.A00.A0E, i), (CharSequence) spannableStringBuilder).A01();
        A012.A08.putBoolean("key_action_priority", true);
        return A012;
    }

    public final void A06(C370408wO r4) {
        CharSequence charSequence;
        Resources resources;
        int i;
        Notification.CallStyle callStyle;
        CharSequence charSequence2 = null;
        if (Build.VERSION.SDK_INT >= 31) {
            int i2 = this.A00;
            if (i2 == 1) {
                callStyle = AJ4.A01(AAA.A00(this.A04), this.A02, this.A01);
            } else if (i2 == 2) {
                callStyle = AJ4.A00(AAA.A00(this.A04), this.A03);
            } else if (i2 != 3) {
                Log.isLoggable("NotifCompat", 3);
                return;
            } else {
                callStyle = AJ4.A02(AAA.A00(this.A04), this.A03, this.A01);
            }
            if (callStyle != null) {
                callStyle.setBuilder(((C370398wN) r4).A04);
                Integer num = this.A05;
                if (num != null) {
                    AJ4.A03(callStyle, num.intValue());
                }
                Integer num2 = this.A06;
                if (num2 != null) {
                    AJ4.A04(callStyle, num2.intValue());
                }
                AJ4.A06(callStyle, this.A09);
                IconCompat iconCompat = this.A08;
                if (iconCompat != null) {
                    AJ4.A05(callStyle, C66773McJ.A00(this.A00.A0E, iconCompat));
                }
                AJ4.A07(callStyle, this.A07);
                return;
            }
            return;
        }
        Notification.Builder builder = ((C370398wN) r4).A04;
        AH5 ah5 = this.A04;
        if (ah5 != null) {
            charSequence2 = ah5.A01;
        }
        builder.setContentTitle(charSequence2);
        Bundle bundle = this.A00.A0F;
        if (bundle == null || !bundle.containsKey("android.text") || (charSequence = this.A00.A0F.getCharSequence("android.text")) == null) {
            int i3 = this.A00;
            if (i3 == 1) {
                resources = this.A00.A0E.getResources();
                i = 2131954469;
            } else if (i3 == 2) {
                resources = this.A00.A0E.getResources();
                i = 2131954470;
            } else if (i3 != 3) {
                charSequence = null;
            } else {
                resources = this.A00.A0E.getResources();
                i = 2131954471;
            }
            charSequence = resources.getString(i);
        }
        builder.setContentText(charSequence);
        AH5 ah52 = this.A04;
        if (ah52 != null) {
            IconCompat iconCompat2 = ah52.A00;
            if (iconCompat2 != null) {
                builder.setLargeIcon(C66773McJ.A00(this.A00.A0E, iconCompat2));
            }
            builder.addPerson(AAA.A00(this.A04));
        }
        builder.setCategory("call");
    }

    public final void A04(Bundle bundle) {
        super.A04(bundle);
        bundle.putInt("android.callType", this.A00);
        bundle.putBoolean("android.callIsVideo", this.A07);
        AH5 ah5 = this.A04;
        if (ah5 != null) {
            bundle.putParcelable("android.callPerson", AAA.A00(ah5));
        }
        IconCompat iconCompat = this.A08;
        if (iconCompat != null) {
            bundle.putParcelable("android.verificationIcon", C66773McJ.A00(this.A00.A0E, iconCompat));
        }
        bundle.putCharSequence("android.verificationText", this.A09);
        bundle.putParcelable("android.answerIntent", this.A01);
        bundle.putParcelable("android.declineIntent", this.A02);
        bundle.putParcelable("android.hangUpIntent", this.A03);
        Integer num = this.A05;
        if (num != null) {
            bundle.putInt("android.answerColor", num.intValue());
        }
        Integer num2 = this.A06;
        if (num2 != null) {
            bundle.putInt("android.declineColor", num2.intValue());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(android.os.Bundle r4) {
        /*
            r3 = this;
            super.A05(r4)
            java.lang.String r0 = "android.callType"
            int r0 = r4.getInt(r0)
            r3.A00 = r0
            java.lang.String r0 = "android.callIsVideo"
            boolean r0 = r4.getBoolean(r0)
            r3.A07 = r0
            java.lang.String r1 = "android.callPerson"
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L_0x0098
            android.os.Parcelable r0 = r4.getParcelable(r1)
            android.app.Person r0 = (android.app.Person) r0
            X.AH5 r0 = X.AAA.A01(r0)
        L_0x0025:
            r3.A04 = r0
        L_0x0027:
            java.lang.String r1 = "android.verificationIcon"
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L_0x0087
            android.os.Parcelable r0 = r4.getParcelable(r1)
            androidx.core.graphics.drawable.IconCompat r0 = X.C66773McJ.A01(r0)
        L_0x0037:
            r3.A08 = r0
        L_0x0039:
            java.lang.String r0 = "android.verificationText"
            java.lang.CharSequence r0 = r4.getCharSequence(r0)
            r3.A09 = r0
            java.lang.String r0 = "android.answerIntent"
            android.os.Parcelable r0 = r4.getParcelable(r0)
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0
            r3.A01 = r0
            java.lang.String r0 = "android.declineIntent"
            android.os.Parcelable r0 = r4.getParcelable(r0)
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0
            r3.A02 = r0
            java.lang.String r0 = "android.hangUpIntent"
            android.os.Parcelable r0 = r4.getParcelable(r0)
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0
            r3.A03 = r0
            java.lang.String r1 = "android.answerColor"
            boolean r0 = r4.containsKey(r1)
            r2 = 0
            if (r0 == 0) goto L_0x0085
            int r0 = r4.getInt(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0070:
            r3.A05 = r0
            java.lang.String r1 = "android.declineColor"
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L_0x0082
            int r0 = r4.getInt(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L_0x0082:
            r3.A06 = r2
            return
        L_0x0085:
            r0 = r2
            goto L_0x0070
        L_0x0087:
            java.lang.String r1 = "android.verificationIconCompat"
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L_0x0039
            android.os.Bundle r0 = r4.getBundle(r1)
            androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.A03(r0)
            goto L_0x0037
        L_0x0098:
            java.lang.String r1 = "android.callPersonCompat"
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L_0x0027
            android.os.Bundle r0 = r4.getBundle(r1)
            X.AH5 r0 = X.AH5.A00(r0)
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompat$CallStyle.A05(android.os.Bundle):void");
    }
}

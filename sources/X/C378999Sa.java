package X;

import android.content.Context;
import android.text.format.DateFormat;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Calendar;

/* renamed from: X.9Sa  reason: invalid class name and case insensitive filesystem */
public abstract class C378999Sa {
    public static final ArrayList A00;

    public static final String A01(Context context, long j) {
        int i;
        String valueOf;
        String valueOf2;
        String str;
        0qQ.A0B(context, 1);
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        boolean is24HourFormat = DateFormat.is24HourFormat(context);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        if (is24HourFormat) {
            i = instance.get(11);
            if (i < 10) {
                valueOf = 002.A00('0', i);
            }
            valueOf = String.valueOf(i);
        } else {
            i = instance.get(10);
            if (i == 0) {
                valueOf = "12";
            }
            valueOf = String.valueOf(i);
        }
        A1A.append(valueOf);
        A1A.append(":");
        int i2 = instance.get(12);
        if (i2 < 10) {
            valueOf2 = 002.A00('0', i2);
        } else {
            valueOf2 = String.valueOf(i2);
        }
        A1A.append(valueOf2);
        if (!is24HourFormat) {
            A1A.append(" ");
            if (instance.get(9) == 0) {
                str = "AM";
            } else {
                str = "PM";
            }
            A1A.append(str);
        }
        String obj = A1A.toString();
        0qQ.A07(obj);
        return obj;
    }

    static {
        ArrayList A1C = AnonymousClass7TE.A1C();
        A00 = A1C;
        A1C.add(new Pair(-1, "white"));
        A1C.add(new Pair(-16777216, "black"));
        A1C.add(new Pair(Integer.valueOf(C14276Tsz.A00(C14272Tsv.SOLID_RED)), "red"));
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.9ly] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0052 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C347017w8 A00(android.content.Context r8, com.instagram.common.session.UserSession r9, X.C317876nz r10, long r11) {
        /*
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            android.content.res.Resources r4 = r8.getResources()
            long r5 = java.lang.System.currentTimeMillis()
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r5 = r5 - r0
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x004b
            java.util.ArrayList r0 = A00
            java.util.Iterator r6 = X.AnonymousClass7TE.A1G(r0)
        L_0x001a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00b5
            java.lang.Object r5 = X.AnonymousClass7TF.A0a(r6)
            android.util.Pair r5 = (android.util.Pair) r5
            X.0qQ.A0A(r4)
            X.9Wx r2 = new X.9Wx
            r2.<init>(r8, r4, r11)
            java.lang.String r1 = "date_sticker_"
            java.lang.Object r0 = r5.second
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = X.002.A0R(r1, r0)
            r2.EZP(r0)
            java.lang.Object r0 = r5.first
            X.0qQ.A06(r0)
            int r0 = X.AnonymousClass7TE.A0M(r0)
            X.AnonymousClass7TE.A1R(r2, r0)
            r3.add(r2)
            goto L_0x001a
        L_0x004b:
            java.util.List r0 = r10.A0O
            java.util.Iterator r7 = r0.iterator()
            r1 = 0
        L_0x0052:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00b5
            java.lang.Object r5 = r7.next()
            X.6o8 r5 = (X.C317966o8) r5
            java.lang.String r6 = r5.A0S
            int r2 = r6.hashCode()
            r0 = -1601339484(0xffffffffa08d7fa4, float:-2.3970795E-19)
            if (r2 == r0) goto L_0x00a4
            r0 = -271649308(0xffffffffefcef5e4, float:-1.2810235E29)
            if (r2 == r0) goto L_0x0093
            r0 = 2051669793(0x7a49ff21, float:2.6220657E35)
            if (r2 != r0) goto L_0x0085
            java.lang.String r0 = "time_sticker_text"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0085
            X.0qQ.A0A(r4)
            X.9Wx r1 = new X.9Wx
            r1.<init>(r8, r4, r11)
        L_0x0083:
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
        L_0x0085:
            if (r1 == 0) goto L_0x0052
            r2 = r1
            X.8vU r2 = (X.C369888vU) r2
            java.lang.String r0 = r5.A0S
            r2.EZP(r0)
            r3.add(r1)
            goto L_0x0052
        L_0x0093:
            java.lang.String r0 = "time_sticker_analog"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0085
            X.0qQ.A0A(r4)
            X.9Wy r1 = new X.9Wy
            r1.<init>(r8, r4, r11)
            goto L_0x0083
        L_0x00a4:
            java.lang.String r0 = "time_sticker_digital"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0085
            X.0qQ.A0A(r4)
            X.9Wz r1 = new X.9Wz
            r1.<init>(r8, r4, r11)
            goto L_0x0083
        L_0x00b5:
            X.7w8 r1 = new X.7w8
            r1.<init>(r8, r9, r3)
            X.9ly r0 = new X.9ly
            r0.<init>()
            r0.A00 = r11
            r1.A03 = r0
            X.9lr r0 = new X.9lr
            r0.<init>(r8, r9, r1)
            r1.A0C(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C378999Sa.A00(android.content.Context, com.instagram.common.session.UserSession, X.6nz, long):X.7w8");
    }
}

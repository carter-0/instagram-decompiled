package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.android.R;

/* renamed from: X.FFd  reason: case insensitive filesystem */
public abstract class C49927FFd {
    public static final String A01(Resources resources, int i, boolean z, boolean z2) {
        int i2;
        0qQ.A0B(resources, 0);
        if (z) {
            i2 = R.plurals.rolodex_minute;
            if (i < 60) {
                i2 = R.plurals.rolodex_second;
            }
            i /= 60;
        } else {
            i2 = R.plurals.rolodex_hour;
            if (i < 60) {
                i2 = R.plurals.rolodex_minute;
            }
            i /= 60;
        }
        String A0d = DbY.A0d(resources, i, i2);
        0qQ.A0A(A0d);
        if (!z2) {
            return A0d;
        }
        String A0e = AnonymousClass7TF.A0e(resources, A0d, 2131974995);
        0qQ.A0A(A0e);
        return A0e;
    }

    public static final String A02(Resources resources, long j) {
        0qQ.A0B(resources, 0);
        float f = ((float) j) / 60.0f;
        if (((long) f) == 0 && j > 0) {
            f += 1.0f;
        }
        int i = (int) (f / 60.0f);
        int A01 = AnonymousClass1GB.A01(f % 60.0f);
        String A0d = DbY.A0d(resources, i, R.plurals.average_time_spent_hours);
        0qQ.A07(A0d);
        String A0d2 = DbY.A0d(resources, A01, R.plurals.average_time_spent_minutes);
        0qQ.A07(A0d2);
        if (i <= 0) {
            return A0d2;
        }
        if (A01 <= 0) {
            return A0d;
        }
        String A0w = DbV.A0w(resources, A0d, A0d2, 2131953545);
        0qQ.A0A(A0w);
        return A0w;
    }

    public static final String A00(Context context, Integer num) {
        if (num == null) {
            return "";
        }
        return C14240TsN.A01(context, (AnonymousClass3FV.A01() + ((long) num.intValue())) * 1000);
    }

    public static final String A03(Resources resources, long j) {
        int i;
        long j2;
        if (0sr.A1P(new Long[]{900L, 1800L, 2700L}).contains(Long.valueOf(j))) {
            i = R.plurals.granted_extension_time_minutes;
            j2 = 60;
        } else {
            i = R.plurals.granted_extension_time_hours;
            j2 = 3600;
        }
        long j3 = j / j2;
        String A0v = DbV.A0v(resources, Long.valueOf(j3), i, (int) j3);
        0qQ.A0A(A0v);
        return A0v;
    }
}

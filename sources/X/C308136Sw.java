package X;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import java.util.List;

/* renamed from: X.6Sw  reason: invalid class name and case insensitive filesystem */
public abstract class C308136Sw {
    public static int A00(C307786Rm r3, C276544tV r4) {
        C276544tV A07 = r4.A07(38);
        if (A07 != null) {
            return AnonymousClass6TP.A00(r3, A07, 0);
        }
        try {
            String A0K = r4.A0K(36);
            if (A0K != null) {
                return AnonymousClass6Su.A03(A0K);
            }
            return -16777216;
        } catch (C258053yO e) {
            1Kn.A00(r3, "ColorDrawableUtils", "Error parsing border color in BoxDecoration", e);
            return 0;
        }
    }

    public static C308146Sx A01(C307786Rm r8, C276544tV r9, int i) {
        float f;
        int A00;
        int A002;
        float f2;
        float[] A02;
        float f3;
        C308146Sx r5 = new C308146Sx();
        if (r9 == null) {
            f = 0.0f;
            A00 = 0;
            A002 = 0;
            f2 = 0.0f;
            A02 = null;
            f3 = 0.0f;
        } else {
            String A0K = r9.A0K(46);
            f = 0.0f;
            if (A0K != null) {
                f = AnonymousClass6Su.A01(A0K);
            }
            A00 = C308156Sy.A00(r9.A0N(56), 0);
            A002 = A00(r8, r9);
            String A0K2 = r9.A0K(40);
            f2 = 0.0f;
            if (A0K2 != null) {
                f2 = AnonymousClass6Su.A01(A0K2);
            }
            A02 = A02(r9.A0N(62));
            String A0K3 = r9.A0K(63);
            f3 = 0.0f;
            if (A0K3 != null) {
                f3 = AnonymousClass6Su.A01(A0K3);
            }
        }
        r5.A05.setColor(i);
        Paint paint = r5.A04;
        paint.setColor(A002);
        paint.setStrokeWidth(f2);
        if (f2 > 0.0f && A02 != null) {
            paint.setPathEffect(new DashPathEffect(A02, f3));
        }
        r5.A02 = f;
        r5.A03 = A00;
        float f4 = f2 / 2.0f;
        r5.A00 = f4;
        r5.A01 = f - f4;
        return r5;
    }

    public static float[] A02(List list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        float[] fArr = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            float f = 0.0f;
            if (str != null) {
                f = AnonymousClass6Su.A01(str);
            }
            fArr[i] = f;
        }
        return fArr;
    }
}

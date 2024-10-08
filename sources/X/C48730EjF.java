package X;

import android.os.Build;

/* renamed from: X.EjF  reason: case insensitive filesystem */
public abstract class C48730EjF {
    public static final 0xI A00(Integer num) {
        int i;
        1Q9 A01 = 1Q9.A01("business_signup_flow");
        switch (num.intValue()) {
            case 0:
                i = 2743;
                break;
            case 1:
                i = 2746;
                break;
            case 2:
                i = 2747;
                break;
            case 3:
                i = 2748;
                break;
            case 4:
                i = 2744;
                break;
            default:
                i = 2745;
                break;
        }
        0xI A04 = A01.A04(AnonymousClass000.A00(i));
        A04.A08(Integer.valueOf(Build.VERSION.SDK_INT), "api_level");
        return A04;
    }
}

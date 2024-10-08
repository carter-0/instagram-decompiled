package X;

import java.lang.reflect.Field;

public final class SD8 {
    public static Field A00;
    public static Field A01;
    public static Field A02;
    public static boolean A03;
    public static boolean A04;
    public static boolean A05;

    public static Field A00(String str) {
        try {
            return Pxg.A10(Class.forName("android.view.ViewRootImpl"), str);
        } catch (Exception e) {
            0KC.A08(SD8.class, "Caught exception when initializing ViewRootImplUtil", e, Pxe.A1b());
            return null;
        }
    }
}

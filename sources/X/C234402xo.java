package X;

import android.os.Build;
import java.util.Locale;

/* renamed from: X.2xo  reason: invalid class name and case insensitive filesystem */
public abstract class C234402xo {
    static {
        if (Build.VERSION.SDK_INT >= 30) {
            C234412xp.A00(30);
            C234412xp.A00(31);
            C234412xp.A00(33);
            C234412xp.A00(1000000);
        }
    }

    public static final boolean A00() {
        if (Build.VERSION.SDK_INT >= 34) {
            String str = Build.VERSION.CODENAME;
            0qQ.A08(str);
            if (!"REL".equals(str)) {
                Locale locale = Locale.ROOT;
                String upperCase = str.toUpperCase(locale);
                0qQ.A07(upperCase);
                String upperCase2 = "VanillaIceCream".toUpperCase(locale);
                0qQ.A07(upperCase2);
                if (upperCase.compareTo(upperCase2) < 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}

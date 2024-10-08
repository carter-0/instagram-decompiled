package X;

import android.os.Build;
import java.util.Locale;

/* renamed from: X.86u  reason: invalid class name and case insensitive filesystem */
public abstract class C3508986u {
    public static final boolean A00(boolean z) {
        if (Build.VERSION.SDK_INT == 28 && z) {
            String str = Build.MODEL;
            0qQ.A08(str);
            String upperCase = str.toUpperCase(Locale.ROOT);
            0qQ.A07(upperCase);
            if (upperCase.equals("CPH1923") || upperCase.equals("RMX1941")) {
                return false;
            }
        }
        return true;
    }
}

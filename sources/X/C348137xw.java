package X;

import android.os.Build;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.7xw  reason: invalid class name and case insensitive filesystem */
public abstract class C348137xw {
    public static HashSet A00(Object... objArr) {
        HashSet hashSet = new HashSet();
        for (Object add : objArr) {
            hashSet.add(add);
        }
        return hashSet;
    }

    public static boolean A01(char c, char c2, char c3) {
        if (!"samsung".equals(Build.MANUFACTURER)) {
            return false;
        }
        String str = Build.FINGERPRINT;
        int indexOf = str.indexOf(":user/");
        if (indexOf == -1) {
            indexOf = str.indexOf(":userdebug/");
        }
        if (indexOf == -1) {
            indexOf = str.indexOf(":eng/");
        }
        if (indexOf < 3) {
            return false;
        }
        char charAt = str.charAt(indexOf - 3);
        char charAt2 = str.charAt(indexOf - 2);
        char charAt3 = str.charAt(indexOf - 1);
        if (charAt <= c) {
            if (charAt != c) {
                return false;
            }
            if (charAt2 <= c2) {
                if (charAt2 != c2 || charAt3 < c3) {
                    return false;
                }
                return true;
            }
        }
        return true;
    }

    public static boolean A02(Set set) {
        if (set.contains(C348127xv.A03) || set.contains(C348127xv.A04)) {
            return true;
        }
        return false;
    }
}

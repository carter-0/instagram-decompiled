package X;

import android.os.DVFSHelper;
import java.lang.reflect.Method;

/* renamed from: X.4Ha  reason: invalid class name and case insensitive filesystem */
public final class C263054Ha {
    public static 15F A00;
    public static 15H A01;
    public static 15H A02;

    static {
        15F r2 = new 15F("android.os.DVFSHelper");
        A00 = r2;
        Class cls = Boolean.TYPE;
        A01 = r2.A02("onScrollEvent", new Class[]{cls});
        A02 = A00.A03("onSmoothScrollEvent", new Class[]{cls});
    }

    public static final void A00(boolean z) {
        if (A00.A03) {
            DVFSHelper.onScrollEvent(z);
            return;
        }
        15H r1 = A01;
        Object[] objArr = {Boolean.valueOf(z)};
        Method method = r1.A00;
        if (method != null) {
            try {
                method.invoke((Object) null, objArr);
            } catch (Exception unused) {
            }
        }
    }

    public static final void A01(boolean z) {
        if (A00.A03) {
            DVFSHelper.onSmoothScrollEvent(z);
            return;
        }
        15H r1 = A02;
        Object[] objArr = {Boolean.valueOf(z)};
        Method method = r1.A00;
        if (method != null) {
            try {
                method.invoke((Object) null, objArr);
            } catch (Exception unused) {
            }
        }
    }

    public static boolean A02() {
        if (A02.A00 != null) {
            return true;
        }
        return false;
    }

    public static boolean A03() {
        return A00.A05((ClassLoader) null);
    }
}

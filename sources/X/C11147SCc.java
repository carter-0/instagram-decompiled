package X;

import android.util.SparseArray;
import java.util.Map;

/* renamed from: X.SCc  reason: case insensitive filesystem */
public abstract class C11147SCc {
    public static final SparseArray A00 = new C67670Ms6();
    public static final Map A01 = AnonymousClass7TE.A1E();

    static {
        int i = 0;
        while (true) {
            SparseArray sparseArray = A00;
            if (i < sparseArray.size()) {
                C66580MXl.A1T(sparseArray.valueAt(i), A01, sparseArray.keyAt(i));
                i++;
            } else {
                return;
            }
        }
    }

    public static String A00(String str) {
        if (str.startsWith("/")) {
            return str;
        }
        try {
            return (String) A00.get(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}

package X;

import android.app.Activity;

/* renamed from: X.Nuz  reason: case insensitive filesystem */
public abstract class C69959Nuz {
    public static final boolean A00(Activity activity) {
        if (!(activity instanceof AnonymousClass2ZV)) {
            return false;
        }
        AnonymousClass2ZV r2 = (AnonymousClass2ZV) activity;
        if (!r2.CXf()) {
            return false;
        }
        AnonymousClass4DF BTU = r2.BTU();
        if (BTU != null) {
            BTU.A03();
        }
        return true;
    }
}

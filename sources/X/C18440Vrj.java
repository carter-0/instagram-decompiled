package X;

import android.os.Bundle;

/* renamed from: X.Vrj  reason: case insensitive filesystem */
public final class C18440Vrj {
    public final XB6 A00;
    public final String A01;

    public static final Bundle A00(String str, boolean z) {
        Bundle bundle = new Bundle();
        if (str != null && str.length() > 0) {
            bundle.putString("form_id", str);
        }
        bundle.putBoolean("is_standard_form", z);
        return bundle;
    }

    public C18440Vrj(XB6 xb6, String str) {
        AnonymousClass7TG.A1O(str, xb6);
        this.A01 = str;
        this.A00 = xb6;
    }
}

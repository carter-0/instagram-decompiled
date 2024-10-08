package X;

import android.os.Bundle;

/* renamed from: X.VsC  reason: case insensitive filesystem */
public final class C18463VsC {
    public final XB6 A00;
    public final String A01;
    public final String A02;

    public C18463VsC(XB6 xb6, String str, String str2) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = xb6;
        this.A02 = str2;
    }

    public static final Bundle A00(String str) {
        Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putString("form_id", str);
        }
        return bundle;
    }
}

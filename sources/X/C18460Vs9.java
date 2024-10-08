package X;

import android.os.Bundle;

/* renamed from: X.Vs9  reason: case insensitive filesystem */
public final class C18460Vs9 {
    public final XB6 A00;
    public final String A01;
    public final String A02;

    public C18460Vs9(XB6 xb6, String str, String str2) {
        0qQ.A0B(str, 2);
        this.A00 = xb6;
        this.A01 = str;
        this.A02 = str2;
    }

    public static final Bundle A00(C18460Vs9 vs9, String str) {
        Bundle bundle = new Bundle();
        String str2 = vs9.A02;
        if (str2 != null) {
            bundle.putString("form_id", str2);
        }
        if (str != null) {
            bundle.putString("question_type", str);
        }
        return bundle;
    }
}

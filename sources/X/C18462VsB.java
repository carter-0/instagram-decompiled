package X;

import android.os.Bundle;

/* renamed from: X.VsB  reason: case insensitive filesystem */
public final class C18462VsB {
    public final XB6 A00;
    public final String A01;
    public final String A02;

    public static final Bundle A00(C18462VsB vsB, String str, String str2) {
        Bundle A0B = DbY.A0B("form_id", vsB.A02);
        if (str != null) {
            A0B.putString("question_type", str);
        }
        if (str2 != null) {
            A0B.putString("pii_question_type", str2);
        }
        return A0B;
    }

    public C18462VsB(XB6 xb6, String str, String str2) {
        AnonymousClass7TG.A1Q(str, str2);
        this.A00 = xb6;
        this.A01 = str;
        this.A02 = str2;
    }
}

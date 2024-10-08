package X;

import android.os.Bundle;

/* renamed from: X.QAm  reason: case insensitive filesystem */
public final class C7385QAm extends C10143RnK {
    public final String A00;
    public final String A01;

    public C7385QAm(Bundle bundle, String str, String str2) {
        super(bundle);
        this.A00 = str;
        this.A01 = str2;
        if (str2.length() <= 0) {
            throw AnonymousClass7TE.A0w("password should not be empty");
        }
    }
}

package X;

import android.text.TextUtils;

public final class F3D {
    public String A00;
    public String A01;
    public String A02;

    public final String A00() {
        String str = this.A01;
        if (str == null) {
            throw AnonymousClass7TE.A0y();
        } else if (TextUtils.isDigitsOnly(str)) {
            return this.A01;
        } else {
            throw DbT.A0m();
        }
    }

    public final String A01() {
        String str = this.A02;
        if (str != null) {
            return str;
        }
        throw AnonymousClass7TE.A0y();
    }
}

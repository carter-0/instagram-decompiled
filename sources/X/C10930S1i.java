package X;

import android.text.TextUtils;

/* renamed from: X.S1i  reason: case insensitive filesystem */
public final class C10930S1i {
    public String A00;
    public String A01;
    public String A02;

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.RQX] */
    public final RQX A00() {
        if (TextUtils.isEmpty(this.A02) || TextUtils.isEmpty(this.A01) || TextUtils.isEmpty(this.A00)) {
            throw AnonymousClass7TE.A0w("The title, subtitle and action button text of auth dialog screen should NOT be empty.");
        }
        ? obj = new Object();
        obj.A02 = this.A02;
        obj.A01 = this.A01;
        obj.A00 = this.A00;
        return obj;
    }
}

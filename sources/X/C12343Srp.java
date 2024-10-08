package X;

import android.text.TextUtils;

/* renamed from: X.Srp  reason: case insensitive filesystem */
public final class C12343Srp implements C13591TdJ {
    public int A00;
    public int A01;
    public String A02;

    public final boolean CSl(C13591TdJ tdJ) {
        if (!(tdJ instanceof C12343Srp)) {
            return false;
        }
        C12343Srp srp = (C12343Srp) tdJ;
        if (this.A00 == srp.A00 && this.A01 == srp.A01 && TextUtils.equals(this.A02, srp.A02)) {
            return true;
        }
        return false;
    }
}

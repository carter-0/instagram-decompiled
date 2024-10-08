package X;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: X.Qoo  reason: case insensitive filesystem */
public final class C8338Qoo extends C11335SNp {
    public String A00;
    public String A01;
    public String A02;
    public String A03;

    public final void A03(C8338Qoo qoo) {
        if (!TextUtils.isEmpty(this.A00)) {
            qoo.A00 = this.A00;
        }
        if (!TextUtils.isEmpty(this.A01)) {
            qoo.A01 = this.A01;
        }
        if (!TextUtils.isEmpty(this.A02)) {
            qoo.A02 = this.A02;
        }
        if (!TextUtils.isEmpty(this.A03)) {
            qoo.A03 = this.A03;
        }
    }

    public final String toString() {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("appName", this.A00);
        A1E.put("appVersion", this.A01);
        A1E.put("appId", this.A02);
        return C11335SNp.A01("appInstallerId", this.A03, A1E);
    }
}

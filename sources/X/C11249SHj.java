package X;

import com.facebookpay.logging.FBPayLoggerData;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.SHj  reason: case insensitive filesystem */
public final class C11249SHj {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public Set A06 = AnonymousClass7TE.A1F();

    public static FBPayLoggerData A00() {
        C11249SHj sHj = new C11249SHj();
        sHj.A01(C2818159r.A01());
        sHj.A01 = "fbpay_hub";
        return new FBPayLoggerData(sHj);
    }

    public final void A01(String str) {
        this.A04 = str;
        if (!this.A06.contains("sessionId")) {
            HashSet A12 = C66580MXl.A12(this.A06);
            this.A06 = A12;
            A12.add("sessionId");
        }
    }
}

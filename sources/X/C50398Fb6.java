package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;

/* renamed from: X.Fb6  reason: case insensitive filesystem */
public final class C50398Fb6 implements C51868G5f {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ C307896Rx A01;
    public final /* synthetic */ C277014uI A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ Product A04;

    public final void Dj9(String str) {
        0qQ.A0B(str, 0);
        int length = str.length();
        int i = length - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= i) {
            int i3 = i;
            if (!z) {
                i3 = i2;
            }
            boolean A13 = Dbc.A13(str, i3);
            if (z) {
                if (!A13) {
                    break;
                }
                i--;
            } else if (!A13) {
                z = true;
            } else {
                i2++;
            }
        }
        String A0c = Dba.A0c(str, i, i2);
        if (A0c != null && A0c.length() != 0) {
            1as.A04.A0E(this.A03, this.A04, this.A00.getModuleName(), C66579MXk.A00(36), A0c);
            C277014uI r2 = this.A02;
            C308276Tl A0P = DbS.A0P();
            A0P.A03(Integer.valueOf(length), 0);
            C299275ur.A00(this.A01, A0P.A00(), r2);
        }
    }

    public C50398Fb6(AnonymousClass0iw r1, C307896Rx r2, C277014uI r3, UserSession userSession, Product product) {
        this.A03 = userSession;
        this.A04 = product;
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}

package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Cw2  reason: case insensitive filesystem */
public final class C45422Cw2 {
    public boolean A00;
    public boolean A01;
    public final UserSession A02;
    public final Product A03;
    public final User A04;
    public final String A05;
    public final String A06;
    public final List A07;

    public C45422Cw2(UserSession userSession, CGR cgr, X9L x9l) {
        String str;
        this.A02 = userSession;
        ProductDetailsProductItemDict productDetailsProductItemDict = cgr.A01;
        if (productDetailsProductItemDict != null) {
            this.A03 = C14502TxO.A00(productDetailsProductItemDict);
            this.A04 = cgr.A02;
            this.A06 = cgr.A03;
            ArrayList A1C = AnonymousClass7TE.A1C();
            this.A07 = A1C;
            Ct3 ct3 = cgr.A00;
            if (ct3 != null) {
                str = ct3.A00;
            } else {
                str = null;
            }
            this.A05 = str;
            if (x9l != null) {
                A1C.addAll(x9l.BZ9());
                this.A01 = x9l.CL2();
                this.A00 = x9l.CKq();
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}

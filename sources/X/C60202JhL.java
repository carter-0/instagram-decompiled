package X;

import com.instagram.api.schemas.IGAdProfileProductTabDict;
import com.instagram.common.session.UserSession;
import com.instagram.profile.productsonprofile.producttab.ui.ProductTabRepository;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.List;

/* renamed from: X.JhL  reason: case insensitive filesystem */
public final class C60202JhL extends 2YL {
    public int A00;
    public boolean A01;
    public final UserSession A02;
    public final ProductTabRepository A03;
    public final String A04;
    public final 05G A05 = 106.A01(HDF.A00);
    public final String A06;
    public final List A07 = AnonymousClass7TE.A1C();

    public C60202JhL(UserSession userSession, ProductTabRepository productTabRepository, String str, String str2) {
        boolean z;
        Boolean BUE;
        List<ProductDetailsProductItemDictIntf> Bga;
        AnonymousClass7TF.A1B(userSession, 1, str);
        this.A02 = userSession;
        this.A06 = str;
        this.A04 = str2;
        this.A03 = productTabRepository;
        IGAdProfileProductTabDict A002 = new C324736zo(this.A02).A00(str);
        if (!(A002 == null || (Bga = A002.Bga()) == null)) {
            for (ProductDetailsProductItemDictIntf iov : Bga) {
                this.A07.add(new IOV(iov));
            }
        }
        this.A00 = this.A07.size();
        IGAdProfileProductTabDict A003 = new C324736zo(this.A02).A00(this.A06);
        if (A003 == null || (BUE = A003.BUE()) == null) {
            z = false;
        } else {
            z = BUE.booleanValue();
        }
        this.A01 = z;
        if (!this.A07.isEmpty() || !this.A01) {
            this.A05.Epw(new HDE(this.A07, true));
        } else {
            Dba.A1S(this, C318116oQ.A00(this), 41, true);
        }
    }
}

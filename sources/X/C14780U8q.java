package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductSource;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.U8q  reason: case insensitive filesystem */
public final class C14780U8q extends 2YL {
    public final int A00;
    public final 2Fk A01;
    public final AnonymousClass2Fj A02;
    public final ProductSource A03;
    public final C16230Uqt A04;
    public final String A05;
    public final String A06;
    public final AnonymousClass0eM A07;
    public final 0V2 A08;
    public final C61770pa A09;
    public final C19596WcL A0A;

    public C14780U8q(UserSession userSession, ProductSource productSource, C16581Uxb uxb, String str, String str2, Set set, int i) {
        ProductSource productSource2 = productSource;
        Set set2 = set;
        UserSession userSession2 = userSession;
        DbZ.A0t(1, userSession2, set2, productSource2);
        C16581Uxb uxb2 = uxb;
        0qQ.A0B(uxb2, 5);
        this.A03 = productSource2;
        this.A00 = i;
        this.A05 = str;
        this.A06 = str2;
        this.A07 = C13999To1.A00(userSession2, 26);
        C19596WcL wcL = new C19596WcL(this, 2);
        this.A0A = wcL;
        List list = 0sn.A00;
        2Fk r6 = new 2Fk(new C14087Tpd(productSource2, "", (String) null, list, list, 0sl.A00, set2, true, false, false, false, false, false));
        this.A02 = r6;
        05D A012 = 10D.A01(AnonymousClass05K.A00, 0, 0);
        this.A08 = A012;
        this.A01 = r6;
        this.A09 = new 0V1((C262204Co) null, A012);
        C16230Uqt uqt = new C16230Uqt(userSession2, wcL, uxb2);
        uqt.A02(C13989Tnp.A0c(r6).A00);
        this.A04 = uqt;
    }

    public static final List A00(C14780U8q u8q, String str) {
        String str2;
        List list = C13989Tnp.A0c(u8q.A01).A04;
        ArrayList<C18043VkR> arrayList = new ArrayList<>();
        for (Object next : list) {
            C17382VTj vTj = ((C18043VkR) next).A00().A02;
            if (vTj != null) {
                ProductDetailsProductItemDict productDetailsProductItemDict = vTj.A01;
                if (productDetailsProductItemDict != null) {
                    str2 = C14502TxO.A00(productDetailsProductItemDict).A0H;
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            } else {
                str2 = null;
            }
            if (0qQ.A0K(str, str2)) {
                arrayList.add(next);
            }
        }
        ArrayList A0r = AnonymousClass7TG.A0r(arrayList);
        for (C18043VkR A012 : arrayList) {
            A0r.add(A012.A01());
        }
        return A0r;
    }

    public final void A01(C18043VkR vkR, Product product) {
        C318136oS A002;
        int i;
        AnonymousClass7TG.A1N(product, vkR);
        String str = this.A05;
        if (str == null || 0qQ.A0K(C13989Tnp.A0q(product), str)) {
            int i2 = this.A00;
            if (i2 != -1) {
                2Fk r1 = this.A01;
                if (C13989Tnp.A0c(r1).A06.size() == i2 && !C13989Tnp.A0c(r1).A06.contains(product.A0H)) {
                    A002 = C318116oQ.A00(this);
                    i = 7;
                }
            }
            C59104J6m j6m = new C59104J6m(35, (Object) product, (Object) vkR, (Object) this);
            C13991Tnr.A0y(this.A01, this.A02, j6m);
            return;
        }
        A002 = C318116oQ.A00(this);
        i = 9;
        C13991Tnr.A1K(this, A002, i);
    }
}

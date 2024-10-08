package X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.Product;

public final /* synthetic */ class PEC implements B1V {
    public final /* synthetic */ AnonymousClass7Z6 A00;
    public final /* synthetic */ Product A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ PEC(AnonymousClass7Z6 r1, Product product, String str, boolean z) {
        this.A00 = r1;
        this.A03 = z;
        this.A02 = str;
        this.A01 = product;
    }

    public final 1bp AXP(C70621ODs oDs, DirectThreadKey directThreadKey, Boolean bool, Long l) {
        AnonymousClass7Z6 r0 = this.A00;
        boolean z = this.A03;
        String str = this.A02;
        Product product = this.A01;
        1bp r3 = new 1bp(C66669Mac.A05(r0.A00, oDs, AnonymousClass1f3.class, str, z), directThreadKey, l, AnonymousClass7TG.A0H());
        r3.A00 = new C61078JwG(product.A01);
        return r3;
    }
}

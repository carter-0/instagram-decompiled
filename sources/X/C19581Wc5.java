package X;

import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.user.model.Product;

/* renamed from: X.Wc5  reason: case insensitive filesystem */
public final class C19581Wc5 implements C20926X4r {
    public final /* synthetic */ C17882VhZ A00;
    public final /* synthetic */ C19676Wde A01;
    public final /* synthetic */ C18562VuE A02;
    public final /* synthetic */ String A03;

    public C19581Wc5(C17882VhZ vhZ, C19676Wde wde, C18562VuE vuE, String str) {
        this.A02 = vuE;
        this.A00 = vhZ;
        this.A03 = str;
        this.A01 = wde;
    }

    public final void Dx4(ProductVariantDimension productVariantDimension, String str) {
        AnonymousClass7TG.A1N(productVariantDimension, str);
        C18562VuE vuE = this.A02;
        vuE.A01(productVariantDimension, str);
        C17882VhZ vhZ = this.A00;
        String str2 = this.A03;
        Product A002 = C18562VuE.A00(vuE);
        0qQ.A06(A002);
        vhZ.A00(A002, str2);
        this.A01.A03((C20932X4x) null);
    }
}

package X;

import com.instagram.user.model.Product;

/* renamed from: X.Wcs  reason: case insensitive filesystem */
public final class C19629Wcs implements X52 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C18661VwI A02;

    public C19629Wcs(C18661VwI vwI, int i, int i2) {
        this.A02 = vwI;
        this.A01 = i;
        this.A00 = i2;
    }

    public final void Dbi(Product product) {
        C18661VwI vwI = this.A02;
        C231112qt r3 = vwI.A07;
        0qQ.A0A(product);
        r3.A04(product, vwI.A05.toString(), this.A01, this.A00);
        X52 x52 = vwI.A08;
        if (x52 != null) {
            x52.Dbi(product);
        }
    }
}

package X;

import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.user.model.Product;

/* renamed from: X.Wct  reason: case insensitive filesystem */
public final class C19630Wct implements X52 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C268374dH A02;
    public final /* synthetic */ C17931ViM A03;
    public final /* synthetic */ X52 A04;

    public C19630Wct(C268374dH r1, C17931ViM viM, X52 x52, int i, int i2) {
        this.A03 = viM;
        this.A02 = r1;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = x52;
    }

    public final void Dbi(Product product) {
        String A002 = ((MultiProductComponent) this.A02).A00();
        17k.A07(A002, "Action from should be specified for an hscroll with a clickable remove button");
        this.A03.A03.A04(product, A002, this.A01, this.A00);
        this.A04.Dbi(product);
    }
}

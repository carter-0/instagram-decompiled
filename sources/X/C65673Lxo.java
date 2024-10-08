package X;

import com.instagram.model.shopping.ProductVariantDimension;

/* renamed from: X.Lxo  reason: case insensitive filesystem */
public final class C65673Lxo implements C20926X4r {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C65673Lxo(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public final void Dx4(ProductVariantDimension productVariantDimension, String str) {
        U90 u90;
        int i = this.A00;
        AnonymousClass7TG.A1N(productVariantDimension, str);
        if (i != 0) {
            u90 = (U90) ((C15329Uae) this.A02).A0B.getValue();
        } else {
            u90 = ((C19231WQm) this.A02).A06;
        }
        u90.A04(productVariantDimension, ((C62074KZe) ((C62861Knb) this.A01)).A01, str);
    }
}

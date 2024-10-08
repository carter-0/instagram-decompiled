package X;

import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;

/* renamed from: X.BHn  reason: case insensitive filesystem */
public final class C42109BHn extends AnonymousClass0T0 implements XA3 {
    public final ProductImageContainer A00;
    public final long A01;
    public final long A02;
    public final long A03;

    public C42109BHn(ProductImageContainer productImageContainer, long j, long j2, long j3) {
        0qQ.A0B(productImageContainer, 2);
        this.A01 = j;
        this.A00 = productImageContainer;
        this.A02 = j2;
        this.A03 = j3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42109BHn) {
                C42109BHn bHn = (C42109BHn) obj;
                if (!(this.A01 == bHn.A01 && 0qQ.A0K(this.A00, bHn.A00) && this.A02 == bHn.A02 && this.A03 == bHn.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A01;
        int A012 = AnonymousClass7TF.A01(this.A02, AnonymousClass7TF.A07(this.A00, ((int) (j ^ (j >>> 32))) * 31));
        long j2 = this.A03;
        return A012 + ((int) (j2 ^ (j2 >>> 32)));
    }
}

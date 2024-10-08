package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

public final class J9E extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J9E(Object obj, Object obj2, Object obj3, int i, int i2, int i3, boolean z) {
        super(2);
        this.A00 = i3;
        this.A05 = obj;
        this.A04 = obj2;
        this.A06 = z;
        this.A03 = obj3;
        this.A01 = i;
        this.A02 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        switch (i) {
            case 0:
                C54740HQx.A00(A0R, (Alignment) this.A04, (Modifier) this.A05, (0sK) this.A03, C51966G9m.A01(this.A01), this.A02, this.A06);
                break;
            case 1:
                HUI.A00(A0R, (Modifier) this.A04, (ImageUrl) this.A03, (0sP) this.A05, C51966G9m.A01(this.A01), this.A02, this.A06);
                break;
            case 2:
                C56436HyU.A00(A0R, (Modifier) this.A03, (C53309Glv) this.A05, (0sP) this.A04, C51966G9m.A01(this.A01), this.A02, this.A06);
                break;
            case 3:
                boolean z = this.A06;
                C54840HUw.A00(A0R, (Modifier) this.A03, (C62320sa) this.A04, (C62320sa) this.A05, C51966G9m.A01(this.A01), this.A02, z);
                break;
            case 4:
                boolean z2 = this.A06;
                C62320sa r3 = (C62320sa) this.A04;
                C56237Hv4.A01(A0R, (Modifier) this.A03, r3, (AnonymousClass62P) this.A05, C51966G9m.A01(this.A01), this.A02, z2);
                break;
            case 5:
                C56578I2i.A02(A0R, (C46539Dgg) this.A05, (0sL) this.A04, (0sL) this.A03, this.A02, C51966G9m.A01(this.A01), this.A06);
                break;
            default:
                C304036Bx.A01(A0R, (AnonymousClass5vX) this.A05, (C62320sa) this.A04, (C62320sa) this.A03, C51966G9m.A01(this.A01), this.A02, this.A06);
                break;
        }
        return C60340gF.A00;
    }
}

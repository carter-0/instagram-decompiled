package X;

import com.instagram.common.typedurl.ImageUrl;

public final class J9O extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J9O(Object obj, Object obj2, Object obj3, String str, int i, int i2, boolean z) {
        super(2);
        this.A00 = i2;
        this.A05 = str;
        this.A04 = obj;
        this.A03 = obj2;
        this.A06 = z;
        this.A02 = obj3;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        switch (i) {
            case 0:
                C54780HSn.A00(A0R, (Integer) this.A02, this.A05, (C62320sa) this.A03, (0sP) this.A04, C51966G9m.A01(this.A01), this.A06);
                break;
            case 1:
                C56667I6w.A04(A0R, this.A05, (C62320sa) this.A02, (C62320sa) this.A04, (0sP) this.A03, C51966G9m.A01(this.A01), this.A06);
                break;
            case 2:
                boolean z = this.A06;
                C55132Hcg.A00(A0R, this.A05, (C62320sa) this.A02, (C62320sa) this.A04, (C62320sa) this.A03, C51966G9m.A01(this.A01), z);
                break;
            default:
                String str = this.A05;
                boolean z2 = this.A06;
                I3K.A02(A0R, (C74302Psc) this.A02, (C56078HsR) this.A04, (ImageUrl) this.A03, str, C51966G9m.A01(this.A01), z2);
                break;
        }
        return C60340gF.A00;
    }
}

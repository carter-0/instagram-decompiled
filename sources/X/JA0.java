package X;

import com.instagram.common.typedurl.ImageUrl;
import java.io.File;
import java.util.List;

public final class JA0 extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JA0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2, boolean z) {
        super(2);
        this.A00 = i2;
        this.A06 = obj;
        this.A02 = obj2;
        this.A04 = obj3;
        this.A03 = obj4;
        this.A07 = z;
        this.A05 = obj5;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        switch (i) {
            case 2:
                C56615I4q.A00(A0R, (C335377cr) this.A05, (C335397ct) this.A06, (C62320sa) this.A03, (0sP) this.A04, (AnonymousClass62P) this.A02, C51966G9m.A01(this.A01), this.A07);
                break;
            case 3:
                C53032GhN ghN = (C53032GhN) this.A06;
                C56579I2j.A02(A0R, (C56496HzS) this.A02, ghN, (C55618Hkd) this.A03, (C55473HiH) this.A04, (C62320sa) this.A05, C51966G9m.A01(this.A01), this.A07);
                break;
            case 4:
                boolean z = this.A07;
                C56668I6x.A03(A0R, (ImageUrl) this.A06, (C55952HqG) this.A04, (OJf) this.A02, (File) this.A03, (List) this.A05, C51966G9m.A01(this.A01), z);
                break;
            case 5:
                C71144Ody ody = (C71144Ody) this.A03;
                I5Q.A03(A0R, (C69486NmU) this.A02, ody, (HBM) this.A06, (C62320sa) this.A04, (C62320sa) this.A05, C51966G9m.A01(this.A01), this.A07);
                break;
            case 6:
                C62320sa r5 = (C62320sa) this.A03;
                boolean z2 = this.A07;
                I3L.A00(A0R, (C61046Jvk) this.A06, (JRL) this.A05, (C62320sa) this.A02, r5, (0sP) this.A04, C51966G9m.A01(this.A01), z2);
                break;
            default:
                C54876HWj.A00(A0R, (C337197fs) this.A03, (C333777a7) this.A04, (C335847dd) this.A06, (AnonymousClass571) this.A02, (C62320sa) this.A05, C51966G9m.A01(this.A01), this.A07);
                break;
        }
        return C60340gF.A00;
    }
}

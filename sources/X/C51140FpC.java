package X;

import java.util.List;

/* renamed from: X.FpC  reason: case insensitive filesystem */
public final class C51140FpC implements 1aV {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;

    public C51140FpC(Object obj, Object obj2, Object obj3, String str, String str2, int i) {
        this.A00 = i;
        this.A04 = str;
        this.A03 = obj2;
        this.A02 = obj;
        this.A01 = obj3;
        this.A05 = str2;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        1a8 r4;
        1aU r1;
        1aV r0;
        List list;
        List list2;
        switch (this.A00) {
            case 0:
                String str = this.A04;
                if (str.length() != 0) {
                    r4 = ((PEN) this.A03).A00;
                    r1 = ((C304566Ea) this.A02).A09((AnonymousClass9HR) this.A01, str, this.A05);
                    r0 = C51145FpH.A00;
                    break;
                } else {
                    return;
                }
            case 1:
                String str2 = this.A04;
                if (str2.length() != 0) {
                    r4 = ((PEN) this.A03).A00;
                    r1 = ((C304566Ea) this.A02).A09((AnonymousClass9HR) this.A01, str2, this.A05);
                    r0 = C51146FpI.A00;
                    break;
                } else {
                    return;
                }
            default:
                if (((C8918RFl) obj).A01) {
                    ((AnonymousClass4D7) this.A01).resumeWith(C47858EKe.A00);
                    return;
                }
                FEX fex = (FEX) this.A03;
                boolean A06 = 182.A06(0Tu.A05, fex.A02, 36325961511417238L);
                List list3 = null;
                T7R t7r = (T7R) fex.A05.getValue();
                Object obj2 = this.A02;
                Integer num = AnonymousClass05K.A01;
                if (A06) {
                    if (obj2 == num) {
                        list2 = AnonymousClass7TE.A1I(this.A04);
                    } else {
                        list2 = null;
                    }
                    if (obj2 == AnonymousClass05K.A00) {
                        list3 = AnonymousClass7TE.A1I(this.A04);
                    }
                    t7r.A03(new C50177FSj(this.A04, (1IX) this.A01), this.A05, list2, list3);
                    return;
                }
                if (obj2 == num) {
                    list = AnonymousClass7TE.A1I(this.A04);
                } else {
                    list = null;
                }
                if (obj2 == AnonymousClass05K.A00) {
                    list3 = AnonymousClass7TE.A1I(this.A04);
                }
                t7r.A04(new C50178FSk(this.A04, (1IX) this.A01), list, list3);
                return;
        }
        r4.A02(r1, r0);
    }
}

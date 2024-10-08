package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.J7m  reason: case insensitive filesystem */
public final class C59130J7m extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59130J7m(Object obj, int i, int i2, int i3, int i4) {
        super(2);
        this.A00 = i4;
        this.A02 = i;
        this.A03 = i2;
        this.A04 = obj;
        this.A01 = i3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i;
        switch (this.A00) {
            case 0:
                I2G.A02(C51966G9m.A0R(obj, obj2), (AnonymousClass62P) this.A04, this.A03, C51966G9m.A01(this.A01), this.A02);
                break;
            case 1:
                C286575Wy A0R = C51966G9m.A0R(obj, obj2);
                int i2 = this.A03;
                Modifier modifier = (Modifier) this.A04;
                int A012 = C51966G9m.A01(this.A01);
                int i3 = this.A02;
                A0R.ExV(255748072);
                if ((i3 & 1) != 0) {
                    i = A012 | 6;
                } else if ((A012 & 6) == 0) {
                    i = G9t.A05(A0R, i2) | A012;
                } else {
                    i = A012;
                }
                int i4 = i3 & 2;
                if (i4 != 0) {
                    i |= 48;
                } else if ((A012 & 48) == 0) {
                    i |= G9t.A0P(A0R, modifier);
                }
                if ((i & 19) != 18 || !A0R.Bwn()) {
                    if (i4 != 0) {
                        modifier = Modifier.A00;
                    }
                    if (0fL.A02()) {
                        0fL.A01(-393163822, "com.instagram.barcelona.common.ui.toast.BdsToastIgIcon (BdsToastMessage.kt:150)");
                    }
                    C288165bT.A05(A0R, C287205Zk.A03(C287205Zk.A02(C287215Zl.A09, C287205Zk.A04(modifier))), C51966G9m.A0Y(A0R, i, i2), ((AnonymousClass5RW) A0R.AJO(C304856Fm.A00)).A00);
                    if (0fL.A02()) {
                        0fL.A00(120500206);
                    }
                } else {
                    A0R.Evl();
                }
                C286625Xd ASQ = A0R.ASQ();
                if (ASQ != null) {
                    ASQ.A06 = new C59130J7m(modifier, i3, i2, A012, 1);
                    break;
                }
                break;
            case 2:
                C286575Wy A0R2 = C51966G9m.A0R(obj, obj2);
                I7P.A00(this.A02, (Modifier) this.A04, A0R2, this.A03, C51966G9m.A01(this.A01));
                break;
            default:
                C286575Wy A0R3 = C51966G9m.A0R(obj, obj2);
                HXZ.A00(this.A03, (Modifier) this.A04, A0R3, C51966G9m.A01(this.A01), this.A02);
                break;
        }
        return C60340gF.A00;
    }
}

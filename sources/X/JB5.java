package X;

import androidx.compose.ui.Modifier;

public final class JB5 extends 0Yg implements 0sL {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C287605aT A01;
    public final /* synthetic */ C270284gU A02;
    public final /* synthetic */ C270284gU A03;
    public final /* synthetic */ C270284gU A04;
    public final /* synthetic */ Modifier A05;
    public final /* synthetic */ C62320sa A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JB5(C287605aT r2, C270284gU r3, C270284gU r4, C270284gU r5, Modifier modifier, C62320sa r7, long j, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A05 = modifier;
        this.A01 = r2;
        this.A07 = z;
        this.A06 = r7;
        this.A09 = z2;
        this.A02 = r3;
        this.A04 = r4;
        this.A00 = j;
        this.A03 = r5;
        this.A08 = z3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy r12 = (C286575Wy) obj;
        if (C51968G9o.A0B(obj2) != 2 || !r12.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1014042291, "com.instagram.compose.igds.components.radiobutton.IgdsRadioButton.<anonymous> (IgdsRadioButton.kt:76)");
            }
            Modifier A0Y = C51969G9p.A0Y(this.A05, "IgdsRadioButton");
            Modifier A0B = C287205Zk.A0B(C287195Zj.A07(C287205Zk.A02(C287215Zl.A09, C287635aW.A00((C287095Yz) null, this.A01, A0Y, C51965G9l.A0R(3), (String) null, this.A06, this.A07)), 2.0f), 24.0f);
            r12.ExS(774577468);
            boolean z = this.A09;
            boolean AGv = r12.AGv(z);
            C270284gU r6 = this.A02;
            boolean A1Z = C51965G9l.A1Z(r12, r6, AGv);
            C270284gU r4 = this.A04;
            boolean A1Z2 = C51965G9l.A1Z(r12, r4, A1Z);
            long j = this.A00;
            boolean A1T = C51966G9m.A1T(r12, j, A1Z2);
            C270284gU r5 = this.A03;
            boolean A1Z3 = C51965G9l.A1Z(r12, r5, A1T);
            boolean z2 = this.A08;
            Object ECw = r12.ECw();
            if (A1Z3 || ECw == AnonymousClass5XT.A00) {
                ECw = new C58777IxO(r4, r5, r6, j, z2, z);
                r12.FLL(ECw);
            }
            C51965G9l.A1X(r12, false);
            C289565do.A00(r12, A0B, (0sP) ECw, 0);
            if (0fL.A02()) {
                0fL.A00(527099356);
            }
        } else {
            r12.Evl();
        }
        return C60340gF.A00;
    }
}

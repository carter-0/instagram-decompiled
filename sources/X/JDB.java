package X;

import androidx.compose.foundation.relocation.BringIntoViewRequesterElement;
import androidx.compose.ui.Modifier;

public final class JDB extends 0Yg implements 0sL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ MRL A02;
    public final /* synthetic */ C52754Gc7 A03;
    public final /* synthetic */ I4L A04;
    public final /* synthetic */ C52693Gb5 A05;
    public final /* synthetic */ Modifier A06;
    public final /* synthetic */ Modifier A07;
    public final /* synthetic */ Modifier A08;
    public final /* synthetic */ Modifier A09;
    public final /* synthetic */ AnonymousClass5Z4 A0A;
    public final /* synthetic */ JS3 A0B;
    public final /* synthetic */ C285975Tl A0C;
    public final /* synthetic */ C59648JRq A0D;
    public final /* synthetic */ C268024cd A0E;
    public final /* synthetic */ 0sP A0F;
    public final /* synthetic */ boolean A0G;
    public final /* synthetic */ boolean A0H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JDB(MRL mrl, C52754Gc7 gc7, I4L i4l, C52693Gb5 gb5, Modifier modifier, Modifier modifier2, Modifier modifier3, Modifier modifier4, AnonymousClass5Z4 r10, JS3 js3, C285975Tl r12, C59648JRq jRq, C268024cd r14, 0sP r15, int i, int i2, boolean z, boolean z2) {
        super(2);
        this.A03 = gc7;
        this.A0A = r10;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = i4l;
        this.A0C = r12;
        this.A0D = jRq;
        this.A06 = modifier;
        this.A07 = modifier2;
        this.A09 = modifier3;
        this.A08 = modifier4;
        this.A02 = mrl;
        this.A05 = gb5;
        this.A0H = z;
        this.A0G = z2;
        this.A0F = r15;
        this.A0B = js3;
        this.A0E = r14;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Modifier igd;
        C286575Wy r10 = (C286575Wy) obj;
        if (C51968G9o.A0B(obj2) != 2 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1808783433, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:698)");
            }
            C285245Qk r1 = Modifier.A00;
            C52754Gc7 gc7 = this.A03;
            Modifier A092 = C287205Zk.A09(r1, ((C289095d0) gc7.A0D.getValue()).A00);
            AnonymousClass5Z4 r19 = this.A0A;
            int i = this.A01;
            int i2 = this.A00;
            int i3 = i2;
            0sP r14 = C287655aY.A00;
            Modifier A022 = C287435a8.A02(A092, r14, new JGY(r19, i, i2));
            I4L i4l = this.A04;
            C285975Tl r13 = this.A0C;
            C59648JRq jRq = this.A0D;
            boolean AGw = r10.AGw(gc7);
            Object ECw = r10.ECw();
            if (AGw || ECw == AnonymousClass5XT.A00) {
                ECw = new C58682Ivr(gc7, 25);
                r10.FLL(ECw);
            }
            C62320sa r7 = (C62320sa) ECw;
            AnonymousClass6Gj r12 = (AnonymousClass6Gj) i4l.A04.getValue();
            long j = r13.A00;
            int i4 = (int) (j >> 32);
            long j2 = i4l.A00;
            if (i4 == ((int) (j2 >> 32)) && (i4 = (int) (j & 4294967295L)) == ((int) (j2 & 4294967295L))) {
                i4 = C285965Tk.A01(j);
            }
            i4l.A00 = j;
            C56072HsL A002 = I5K.A00(r13.A01, jRq);
            int ordinal = r12.ordinal();
            if (ordinal == 0) {
                igd = new IGD(i4l, A002, r7, i4);
            } else if (ordinal == 1) {
                igd = new IGC(i4l, A002, r7, i4);
            } else {
                throw AnonymousClass7TE.A1K();
            }
            Modifier Ezh = C287435a8.A02(AnonymousClass6FZ.A00(A022).Ezh(igd).Ezh(this.A06).Ezh(this.A07), r14, JJQ.A00(r19, 9)).Ezh(this.A09).Ezh(this.A08).Ezh(new BringIntoViewRequesterElement(this.A02));
            C52693Gb5 gb5 = this.A05;
            boolean z = this.A0H;
            boolean z2 = this.A0G;
            0sP r3 = this.A0F;
            HRD.A00(r10, Ezh, AnonymousClass5PI.A01(r10, new JAH(gc7, gb5, this.A0B, r13, this.A0E, r3, i3, z, z2), -363167407), 48, 0);
            if (0fL.A02()) {
                0fL.A00(-162830004);
            }
        } else {
            r10.Evl();
        }
        return C60340gF.A00;
    }
}

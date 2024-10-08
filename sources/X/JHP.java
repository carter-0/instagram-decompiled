package X;

import android.view.View;
import androidx.compose.ui.Modifier;

public final class JHP extends 0Yg implements 0sK {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ View A03;
    public final /* synthetic */ C284945Oz A04;
    public final /* synthetic */ C284945Oz A05;
    public final /* synthetic */ Y43 A06;
    public final /* synthetic */ C49890FBq A07;
    public final /* synthetic */ boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JHP(View view, C284945Oz r3, C284945Oz r4, Y43 y43, C49890FBq fBq, int i, int i2, long j, boolean z) {
        super(3);
        this.A07 = fBq;
        this.A05 = r3;
        this.A04 = r4;
        this.A06 = y43;
        this.A03 = view;
        this.A08 = z;
        this.A02 = j;
        this.A01 = i;
        this.A00 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C286575Wy r0 = (C286575Wy) obj2;
        boolean A1b = C51972G9s.A1b(obj3, obj);
        if (0fL.A02()) {
            0fL.A01(-818634847, "com.instagram.direct.fragment.sharesheet.view.ExternalShareRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ExternalShareRow.kt:89)");
        }
        C285245Qk r15 = Modifier.A00;
        C286565Wx A0H = C51965G9l.A0H(r0, A1b);
        AnonymousClass5aR r2 = new AnonymousClass5aR(1500.0f, 1500.0f);
        C287625aV A0R = C51965G9l.A0R(A1b ? 1 : 0);
        C49890FBq fBq = this.A07;
        Modifier A002 = C287635aW.A00(r2, (C287605aT) C51974G9v.A0V(r0, -1605345530), r15, A0R, (String) null, new C58218IoM(18, this.A04, this.A05, this.A06, this.A03, fBq), true);
        C287265Zr r10 = C287215Zl.A00;
        boolean z = this.A08;
        long j = this.A02;
        int i = this.A01;
        int i2 = this.A00;
        AnonymousClass5RD A003 = C291495hO.A00(C287275Zs.A07, r0, r10);
        int A004 = C287425a7.A00(r0);
        AnonymousClass5RM A042 = C286565Wx.A04(A0H);
        Modifier A012 = C287435a8.A01(r0, A002);
        C62320sa r11 = C287485aD.A00;
        C51973G9u.A0z(r0, A0H, r11);
        0sL r102 = C287485aD.A03;
        0sL A0w = C51969G9p.A0w(r0, A003, A042, r102);
        0sL r7 = C287485aD.A02;
        if (A0H.A0K || !C51972G9s.A1Q(r0, A004)) {
            C51971G9r.A13(r0, r7, A004);
        }
        0sL A1K = C51966G9m.A1K(r0, A012);
        int i3 = 56;
        if (z) {
            i3 = 64;
        }
        Modifier A013 = C304766Fd.A01(C287205Zk.A0C(r15, (float) i3), AnonymousClass5ZN.A00, j);
        AnonymousClass5RD A0Z = C51966G9m.A0Z(A1b);
        int A005 = C287425a7.A00(r0);
        AnonymousClass5RM A043 = C286565Wx.A04(A0H);
        Modifier A014 = C287435a8.A01(r0, A013);
        C51973G9u.A0z(r0, A0H, r11);
        C287595aO.A00(r0, A0Z, r102);
        if (C51965G9l.A1Y(r0, A0H, A043, A0w) || !C51972G9s.A1Q(r0, A005)) {
            C51971G9r.A13(r0, r7, A005);
        }
        C287595aO.A00(r0, A014, A1K);
        C288165bT.A04(r0, C287205Zk.A04(r15), C287975bA.A00(r0, i2, A1b), C51966G9m.A0H(r0));
        r0.ASN();
        String A006 = C304346Dc.A00(r0, i);
        float f = 12.0f;
        if (z) {
            f = 8.0f;
        }
        AnonymousClass5ZZ.A0K(r0, C287195Zj.A0B(r15, 0.0f, f, 0.0f, 0.0f), (AnonymousClass5Z4) null, A006, 3072, 32752, C51966G9m.A0H(r0), AnonymousClass5Z7.A01(12));
        if (C51967G9n.A1R(r0)) {
            0fL.A00(-1261734396);
        }
        return C60340gF.A00;
    }
}

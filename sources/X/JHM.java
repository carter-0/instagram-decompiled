package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.key.KeyInputElement;

public final class JHM extends 0Yg implements 0sK {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C52754Gc7 A01;
    public final /* synthetic */ C55978Hqj A02;
    public final /* synthetic */ C52693Gb5 A03;
    public final /* synthetic */ JS3 A04;
    public final /* synthetic */ C285975Tl A05;
    public final /* synthetic */ 0sP A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JHM(C52754Gc7 gc7, C55978Hqj hqj, C52693Gb5 gb5, JS3 js3, C285975Tl r6, 0sP r7, int i, boolean z, boolean z2) {
        super(3);
        this.A01 = gc7;
        this.A03 = gb5;
        this.A05 = r6;
        this.A07 = z;
        this.A08 = z2;
        this.A04 = js3;
        this.A02 = hqj;
        this.A06 = r7;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C286575Wy A0R = C51966G9m.A0R(obj2, obj3);
        if (C51967G9n.A1U(A0R, 851809892)) {
            0fL.A01(364308721, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:245)");
        }
        Object ECw = A0R.ECw();
        Object obj4 = AnonymousClass5XT.A00;
        if (ECw == obj4) {
            ECw = new Object();
            A0R.FLL(ECw);
        }
        C55428HhY hhY = (C55428HhY) ECw;
        Object ECw2 = A0R.ECw();
        if (ECw2 == obj4) {
            ECw2 = new Object();
            A0R.FLL(ECw2);
        }
        C52754Gc7 gc7 = this.A01;
        C52693Gb5 gb5 = this.A03;
        C285975Tl r13 = this.A05;
        boolean z = this.A07;
        boolean z2 = this.A08;
        JS3 js3 = this.A04;
        I0C i0c = new I0C((C55426HhW) ECw2, XY4.A00, gc7, this.A02, gb5, hhY, js3, r13, this.A06, this.A00, z, z2);
        C285245Qk r4 = Modifier.A00;
        boolean AGw = A0R.AGw(i0c);
        Object ECw3 = A0R.ECw();
        if (AGw || ECw3 == obj4) {
            ECw3 = C51970G9q.A0s(A0R, i0c, 0);
        }
        Modifier Ezh = r4.Ezh(new KeyInputElement((C59520Ya) ECw3, (0sP) null));
        if (0fL.A02()) {
            0fL.A00(2147310479);
        }
        C51965G9l.A1V(A0R);
        return Ezh;
    }
}

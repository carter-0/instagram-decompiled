package X;

import androidx.compose.ui.Modifier;

public final class JAR extends 0Yg implements 0sL {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C52882GeI A01;
    public final /* synthetic */ Modifier A02;
    public final /* synthetic */ HMB A03;
    public final /* synthetic */ IH8 A04;
    public final /* synthetic */ HLY A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ C62320sa A07;
    public final /* synthetic */ boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JAR(C52882GeI geI, Modifier modifier, HMB hmb, IH8 ih8, HLY hly, String str, C62320sa r8, long j, boolean z) {
        super(2);
        this.A06 = str;
        this.A03 = hmb;
        this.A05 = hly;
        this.A02 = modifier;
        this.A04 = ih8;
        this.A01 = geI;
        this.A08 = z;
        this.A00 = j;
        this.A07 = r8;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy r2 = (C286575Wy) obj;
        if (C51968G9o.A0B(obj2) != 2 || !r2.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(6759525, "com.instagram.compose.igds.components.tooltip.IgdsTooltip.<anonymous> (IgdsTooltip.kt:89)");
            }
            String str = this.A06;
            HMB hmb = this.A03;
            HLY hly = this.A05;
            C56617I4s.A00(this.A01, r2, this.A02, hmb, this.A04, hly, str, 0, 0);
            if (this.A08) {
                C60340gF r1 = C60340gF.A00;
                r2.ExS(-1678942869);
                long j = this.A00;
                boolean AGt = r2.AGt(j);
                C62320sa r4 = this.A07;
                boolean A1Z = C51965G9l.A1Z(r2, r4, AGt);
                Object ECw = r2.ECw();
                if (A1Z || ECw == AnonymousClass5XT.A00) {
                    ECw = new MGA((Object) r4, (AnonymousClass4D7) null, 14, j);
                    r2.FLL(ECw);
                }
                C51972G9s.A0z(r2, ECw, r1);
            }
            if (0fL.A02()) {
                0fL.A00(1990968275);
            }
        } else {
            r2.Evl();
        }
        return C60340gF.A00;
    }
}

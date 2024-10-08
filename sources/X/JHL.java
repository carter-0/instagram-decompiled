package X;

import com.instagram.wonderwall.model.WallText;

public final class JHL extends 0Yg implements 0sK {
    public final /* synthetic */ WallText A00;
    public final /* synthetic */ C62320sa A01;
    public final /* synthetic */ C62320sa A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JHL(WallText wallText, C62320sa r3, C62320sa r4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(3);
        this.A06 = z;
        this.A07 = z2;
        this.A05 = z3;
        this.A03 = z4;
        this.A04 = z5;
        this.A00 = wallText;
        this.A01 = r3;
        this.A02 = r4;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        0sL r8 = (0sL) obj;
        C286575Wy r4 = (C286575Wy) obj2;
        int A0j = G9t.A0j(obj3, r8);
        if ((A0j & 6) == 0) {
            A0j |= C41848B3p.A01(r4, r8);
        }
        if ((A0j & 19) != 18 || !r4.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1655126806, "com.instagram.wonderwall.ui.compose.screens.WallPostReplyEditor.<anonymous> (WallPostPreviewScreen.kt:186)");
            }
            I5D.A02(r4, this.A00, this.A01, this.A02, r8, 3670016 & (A0j << 18), this.A06, this.A07, this.A05, this.A03, this.A04);
            if (0fL.A02()) {
                0fL.A00(1964755160);
            }
        } else {
            r4.Evl();
        }
        return C60340gF.A00;
    }
}

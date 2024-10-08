package X;

import androidx.compose.ui.Modifier;

public final class GS9 extends 0Yg implements 0sK {
    public final /* synthetic */ C288195bW A00;
    public final /* synthetic */ AnonymousClass2DO A01;
    public final /* synthetic */ C288095bM A02;
    public final /* synthetic */ GS7 A03;
    public final /* synthetic */ 0sP A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GS9(C288195bW r2, AnonymousClass2DO r3, C288095bM r4, GS7 gs7, 0sP r6, boolean z, boolean z2) {
        super(3);
        this.A01 = r3;
        this.A03 = gs7;
        this.A00 = r2;
        this.A06 = z;
        this.A05 = z2;
        this.A02 = r4;
        this.A04 = r6;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C286575Wy r3 = (C286575Wy) obj2;
        int A0M = AnonymousClass7TE.A0M(obj3);
        0qQ.A0B(obj, 0);
        if ((A0M & 17) != 16 || !r3.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1123073700, "com.instagram.compose.igds.components.peoplecell.IgdsPeopleCell.<anonymous> (IgdsPeopleCell.kt:150)");
            }
            AnonymousClass2DO r6 = this.A01;
            JSI jsi = this.A03.A02;
            GRY.A00(r3, (Modifier) null, this.A00, r6, this.A02, jsi, this.A04, 0, 0, 308, 0, 0, this.A06, this.A05, false);
            if (0fL.A02()) {
                0fL.A00(-391743834);
            }
        } else {
            r3.Evl();
        }
        return C60340gF.A00;
    }
}

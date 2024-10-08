package X;

public final class JHA extends 0Yg implements 0sK {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C284945Oz A01;
    public final /* synthetic */ C66709MbG A02;
    public final /* synthetic */ 0sP A03;
    public final /* synthetic */ 0sP A04;
    public final /* synthetic */ 0sL A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JHA(C284945Oz r2, C66709MbG mbG, 0sP r4, 0sP r5, 0sL r6, float f, boolean z) {
        super(3);
        this.A02 = mbG;
        this.A00 = f;
        this.A06 = z;
        this.A04 = r4;
        this.A05 = r6;
        this.A03 = r5;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C286575Wy r2 = (C286575Wy) obj2;
        if (C51968G9o.A0E(obj3) != 16 || !r2.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(192273583, "com.instagram.archive.ui.ArchiveStoryGrid.<anonymous>.<anonymous>.<anonymous> (ArchiveReelComposeFragment.kt:667)");
            }
            C66709MbG mbG = this.A02;
            if (mbG != null) {
                float f = this.A00;
                float f2 = ((C289095d0) this.A01.getValue()).A00;
                boolean z = this.A06;
                I7C.A08(r2, mbG, this.A04, this.A03, this.A05, f, f2, 48, z);
                if (0fL.A02()) {
                    0fL.A00(1444775601);
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        } else {
            r2.Evl();
        }
        return C60340gF.A00;
    }
}

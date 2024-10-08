package X;

public final class JHY extends 0Yg implements 0sK {
    public final /* synthetic */ C284945Oz A00;
    public final /* synthetic */ C285975Tl A01;
    public final /* synthetic */ C266444Yx A02;
    public final /* synthetic */ HM2 A03;
    public final /* synthetic */ C62320sa A04;
    public final /* synthetic */ 0sP A05;
    public final /* synthetic */ C262224Cq A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JHY(C284945Oz r2, C285975Tl r3, C266444Yx r4, HM2 hm2, C62320sa r6, 0sP r7, C262224Cq r8, boolean z, boolean z2, boolean z3, boolean z4) {
        super(3);
        this.A09 = z;
        this.A01 = r3;
        this.A02 = r4;
        this.A0A = z2;
        this.A05 = r7;
        this.A04 = r6;
        this.A07 = z3;
        this.A08 = z4;
        this.A03 = hm2;
        this.A06 = r8;
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        0sL r14 = (0sL) obj;
        C286575Wy r8 = (C286575Wy) obj2;
        int A0M = AnonymousClass7TE.A0M(obj3);
        0qQ.A0B(r14, 0);
        if ((A0M & 6) == 0) {
            A0M |= C41848B3p.A01(r8, r14);
        }
        if ((A0M & 19) != 18 || !r8.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1295061152, "com.instagram.creation.genai.common.ui.CreationGenAIPromptBar.<anonymous>.<anonymous>.<anonymous> (CreationGenAIPromptBar.kt:195)");
            }
            boolean A1W = C51971G9r.A1W(this.A00);
            boolean z = this.A09;
            C285975Tl r9 = this.A01;
            C266444Yx r10 = this.A02;
            boolean z2 = this.A0A;
            r8.ExS(673076017);
            0sP r1 = this.A05;
            boolean AGu = r8.AGu(r1);
            Object ECw = r8.ECw();
            if (AGu || ECw == AnonymousClass5XT.A00) {
                ECw = C51975G9x.A0x(r8, r1, 38);
            }
            C51965G9l.A1X(r8, false);
            C62320sa r13 = this.A04;
            boolean z3 = this.A07;
            boolean z4 = this.A08;
            C56635I5q.A01(r8, r9, r10, this.A03, (C62320sa) ECw, r13, r14, this.A06, 458752 & (A0M << 15), 0, 0, z, z2, A1W, z3, z4);
            if (0fL.A02()) {
                0fL.A00(-1554409870);
            }
        } else {
            r8.Evl();
        }
        return C60340gF.A00;
    }
}

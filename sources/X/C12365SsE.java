package X;

/* renamed from: X.SsE  reason: case insensitive filesystem */
public final class C12365SsE implements C13597TdP {
    public final /* synthetic */ STU A00;

    public C12365SsE(STU stu) {
        this.A00 = stu;
    }

    public final void DXi(C390949s6 r3, C390949s6 r4) {
        AnonymousClass7TG.A1N(r3, r4);
        C390949s6 r0 = C390949s6.ERROR;
        if (r4 != r0 || r3 != r0) {
            STU stu = this.A00;
            C13753TgP tgP = stu.A06;
            if (tgP != null) {
                tgP.DXi(r3, r4);
            }
            if (r4 == C390949s6.RELEASED) {
                stu.A04 = null;
            }
        }
    }
}

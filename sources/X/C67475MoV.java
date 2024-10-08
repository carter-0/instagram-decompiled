package X;

/* renamed from: X.MoV  reason: case insensitive filesystem */
public abstract class C67475MoV {
    public long A00;
    public C262204Co A01;
    public final C262224Cq A02 = DbY.A0r(AnonymousClass12T.A00, 637518912);

    public void A01(C262224Cq r2) {
        ((AnonymousClass43G) ((C67474MoU) this).A04.getValue()).A02();
    }

    public final void A00() {
        C262204Co r0 = this.A01;
        if ((r0 == null || !r0.isActive()) && A02()) {
            this.A01 = C51966G9m.A1L(new C73568Pfp(this, (AnonymousClass4D7) null, 8), this.A02);
        }
    }

    public boolean A02() {
        return false;
    }

    public C67475MoV(long j) {
        this.A00 = j;
    }
}

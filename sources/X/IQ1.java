package X;

public final class IQ1 implements C51898G6o {
    public final /* synthetic */ C247003fc A00;
    public final /* synthetic */ GKH A01;
    public final /* synthetic */ 0sP A02;

    public IQ1(C247003fc r1, GKH gkh, 0sP r3) {
        this.A01 = gkh;
        this.A00 = r1;
        this.A02 = r3;
    }

    public final void DZJ() {
        C247003fc r2 = this.A00;
        0sP r1 = this.A02;
        if (r2 == C247003fc.SHARE_BUTTON || r2 == C247003fc.SHARE_BUTTON_NUDGE) {
            r1.invoke("content_notes_nux_primary");
        }
    }

    public final void Di1() {
        C247003fc r2 = this.A00;
        0sP r1 = this.A02;
        if (r2 == C247003fc.SHARE_BUTTON) {
            r1.invoke("content_notes_nux_secondary");
        }
    }
}

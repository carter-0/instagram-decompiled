package X;

/* renamed from: X.LlU  reason: case insensitive filesystem */
public final class C64991LlU implements C66504MUi {
    public final /* synthetic */ C59962JcV A00;
    public final /* synthetic */ JVX A01;

    public C64991LlU(C59962JcV jcV, JVX jvx) {
        this.A00 = jcV;
        this.A01 = jvx;
    }

    public final void DXO() {
        C234502xy r0 = this.A00.A0R;
        if (r0 != null) {
            r0.E2p();
        }
    }

    public final boolean isPlaying() {
        C234502xy r3 = this.A00.A0R;
        if (r3 == null || r3.C9D(this.A01.BUq()) == AnonymousClass05K.A00 || !r3.isPlaying()) {
            return false;
        }
        return true;
    }

    public final void onPause() {
        C234502xy r0 = this.A00.A0R;
        if (r0 != null) {
            r0.pause();
        }
    }
}

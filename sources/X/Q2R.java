package X;

public final class Q2R {
    public Q2S A00;
    public AnonymousClass5AD A01 = new Object();
    public Object A02;
    public boolean A03;

    public final void A00(Object obj) {
        this.A03 = true;
        Q2S q2s = this.A00;
        if (q2s != null && q2s.A00.A06(obj)) {
            this.A02 = null;
            this.A00 = null;
            this.A01 = null;
        }
    }

    public final void A01(Throwable th) {
        this.A03 = true;
        Q2S q2s = this.A00;
        if (q2s != null && q2s.A00.A07(th)) {
            this.A02 = null;
            this.A00 = null;
            this.A01 = null;
        }
    }

    public final void finalize() {
        AnonymousClass5AD r1;
        Q2S q2s = this.A00;
        if (q2s != null && !q2s.isDone()) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("The completer object was garbage collected - this future would otherwise never complete. The tag was: ");
            q2s.A00.A07(new Throwable(AnonymousClass7TF.A0i(this.A02, A1A)));
        }
        if (!this.A03 && (r1 = this.A01) != null) {
            r1.A06((Object) null);
        }
    }
}

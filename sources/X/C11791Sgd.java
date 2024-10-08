package X;

/* renamed from: X.Sgd  reason: case insensitive filesystem */
public final /* synthetic */ class C11791Sgd implements C13518Tbn {
    public final /* synthetic */ C11796Sgi A00;

    public /* synthetic */ C11791Sgd(C11796Sgi sgi) {
        this.A00 = sgi;
    }

    public final void Dwx() {
        C11796Sgi sgi = this.A00;
        boolean A1Q = AnonymousClass7TF.A1Q((sgi.A02.A0B() > 1.0f ? 1 : (sgi.A02.A0B() == 1.0f ? 0 : -1)));
        if (A1Q != sgi.A06) {
            sgi.A06 = A1Q;
            sgi.A0J.invalidateSelf();
        }
    }
}

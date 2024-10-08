package X;

/* renamed from: X.LaT  reason: case insensitive filesystem */
public final class C64351LaT implements MTK {
    public final /* synthetic */ 1IX A00;

    public C64351LaT(1IX r1) {
        this.A00 = r1;
    }

    public final void DoC(C39672A4m a4m) {
        1IX r1 = this.A00;
        if (r1.isActive()) {
            r1.resumeWith(AnonymousClass7TE.A0v());
        }
    }

    public final void onFailure(Exception exc) {
        1IX r1 = this.A00;
        if (r1.isActive()) {
            r1.resumeWith(AnonymousClass7TE.A0u());
        }
    }
}

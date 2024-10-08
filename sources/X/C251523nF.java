package X;

/* renamed from: X.3nF  reason: invalid class name and case insensitive filesystem */
public final class C251523nF implements C251513nE {
    public final C251513nE A00;
    public final C270404gg A01;

    public final void Dzt(boolean z) {
        this.A00.Dzt(z);
    }

    public final void onExit() {
        this.A00.onExit();
        C270404gg r0 = this.A01;
        if (r0 != null) {
            r0.A01.stopSelf(r0.A00);
        }
    }

    public C251523nF(C251513nE r1, C270404gg r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}

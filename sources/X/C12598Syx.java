package X;

/* renamed from: X.Syx  reason: case insensitive filesystem */
public final /* synthetic */ class C12598Syx implements C365558nJ {
    public final /* synthetic */ C365498nD A00;
    public final /* synthetic */ SOS A01;

    public /* synthetic */ C12598Syx(C365498nD r1, SOS sos) {
        this.A01 = sos;
        this.A00 = r1;
    }

    public final void D59(AnonymousClass9GD r4) {
        SOS sos = this.A01;
        C365498nD r2 = this.A00;
        synchronized (sos.A07) {
            sos.A0A.remove(r2);
        }
    }
}

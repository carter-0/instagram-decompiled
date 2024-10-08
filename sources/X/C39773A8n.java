package X;

/* renamed from: X.A8n  reason: case insensitive filesystem */
public final class C39773A8n {
    public final Object A00;
    public final C270284gU A01;
    public final C39773A8n A02;

    public final boolean A00() {
        if (this.A01.getValue() != this.A00) {
            return true;
        }
        C39773A8n a8n = this.A02;
        if (a8n == null || !a8n.A00()) {
            return false;
        }
        return true;
    }

    public C39773A8n(C270284gU r2, C39773A8n a8n) {
        this.A01 = r2;
        this.A02 = a8n;
        this.A00 = r2.getValue();
    }
}

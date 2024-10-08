package X;

/* renamed from: X.5O4  reason: invalid class name */
public final class AnonymousClass5O4 implements C242803Vz, C266944ab, AnonymousClass3W0 {
    public int A00 = -1;
    public int A01;
    public String A02;
    public C266954ac A03 = C266954ac.NONE;

    public final void EZ9(C266954ac r2) {
        0qQ.A0B(r2, 0);
        this.A03 = r2;
    }

    public final C266954ac BDD() {
        return this.A03;
    }

    public final /* synthetic */ int BKg() {
        return -1;
    }

    public final /* synthetic */ int BL7() {
        return -1;
    }

    public final boolean CdP() {
        if (this.A03 != C266954ac.NONE) {
            return true;
        }
        return false;
    }

    public final int getPosition() {
        int i = this.A00;
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException("Position is not set.");
    }

    public final void A00(int i) {
        this.A00 = i;
    }
}

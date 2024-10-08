package X;

/* renamed from: X.4aa  reason: invalid class name and case insensitive filesystem */
public final class C266934aa implements C242803Vz, C266944ab, AnonymousClass3W0 {
    public int A00 = -1;
    public int A01 = -1;
    public int A02 = -1;
    public int A03;
    public int A04;
    public OFS A05;
    public boolean A06 = true;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A = true;
    public boolean A0B;
    public C266954ac A0C = C266954ac.NONE;

    public final void EZ9(C266954ac r2) {
        0qQ.A0B(r2, 0);
        this.A0C = r2;
    }

    public final void A00(int i) {
        11Z.A06("This operation must be run on UI thread.");
        this.A02 = i;
    }

    public final C266954ac BDD() {
        return this.A0C;
    }

    public final int BKg() {
        return this.A00;
    }

    public final int BL7() {
        return this.A01;
    }

    public final boolean CdP() {
        if (this.A0C != C266954ac.NONE) {
            return true;
        }
        return false;
    }

    public final int getPosition() {
        int i = this.A02;
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException(C273654mx.A00(1339));
    }
}

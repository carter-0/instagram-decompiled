package X;

/* renamed from: X.IUk  reason: case insensitive filesystem */
public final class C57249IUk implements C242803Vz, C266944ab, AnonymousClass3W0 {
    public C266954ac A00 = C266954ac.NONE;
    public int A01 = -1;
    public int A02 = -1;
    public int A03 = -1;
    public final String A04;

    public final void EZ9(C266954ac r2) {
        0qQ.A0B(r2, 0);
        this.A00 = r2;
    }

    public final C266954ac BDD() {
        return this.A00;
    }

    public final int BKg() {
        return this.A01;
    }

    public final int BL7() {
        return this.A02;
    }

    public final boolean CdP() {
        return C51969G9p.A1a(this.A00, C266954ac.NONE);
    }

    public final int getPosition() {
        int i = this.A03;
        if (i >= 0) {
            return i;
        }
        throw AnonymousClass7TE.A0z("Position is not set.");
    }

    public C57249IUk(String str) {
        this.A04 = str;
    }

    public final void A00(int i) {
        C51965G9l.A13();
        this.A01 = i;
    }

    public final void A01(int i) {
        C51965G9l.A13();
        this.A02 = i;
    }

    public final void A02(int i) {
        C51965G9l.A13();
        this.A03 = i;
    }
}

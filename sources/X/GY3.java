package X;

public final class GY3 implements C242803Vz {
    public int A00 = -1;
    public int A01 = -1;
    public int A02 = -1;

    public final int BKg() {
        return this.A00;
    }

    public final int BL7() {
        return this.A01;
    }

    public final int getPosition() {
        int i = this.A02;
        if (i >= 0) {
            return i;
        }
        throw AnonymousClass7TE.A0z("Position is not set.");
    }

    public final void A00(int i) {
        C51965G9l.A13();
        this.A00 = i;
    }

    public final void A01(int i) {
        C51965G9l.A13();
        this.A01 = i;
    }

    public final void A02(int i) {
        C51965G9l.A13();
        this.A02 = i;
    }
}

package X;

/* renamed from: X.IUl  reason: case insensitive filesystem */
public final class C57250IUl implements C242803Vz, AnonymousClass3W0 {
    public Integer A00 = AnonymousClass05K.A01;
    public int A01 = -1;

    public final /* synthetic */ int BKg() {
        return -1;
    }

    public final /* synthetic */ int BL7() {
        return -1;
    }

    public final boolean CdP() {
        return C51969G9p.A1a(this.A00, AnonymousClass05K.A01);
    }

    public final int getPosition() {
        int i = this.A01;
        if (i >= 0) {
            return i;
        }
        throw AnonymousClass7TE.A0z("Position is not set.");
    }

    public final void A00(int i) {
        C51965G9l.A13();
        this.A01 = i;
    }
}

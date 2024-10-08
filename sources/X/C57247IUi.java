package X;

/* renamed from: X.IUi  reason: case insensitive filesystem */
public final class C57247IUi implements C242803Vz, C266944ab, AnonymousClass3W0 {
    public int A00 = -1;
    public C266954ac A01 = C266954ac.NONE;

    public final void EZ9(C266954ac r2) {
        0qQ.A0B(r2, 0);
        this.A01 = r2;
    }

    public final C266954ac BDD() {
        return this.A01;
    }

    public final /* synthetic */ int BKg() {
        return -1;
    }

    public final /* synthetic */ int BL7() {
        return -1;
    }

    public final boolean CdP() {
        return C51969G9p.A1a(this.A01, C266954ac.NONE);
    }

    public final int getPosition() {
        if (this.A00 < 0) {
            0wb.A01.Ew0("NotesNetegoTrayState", "Position is not set");
        }
        return this.A00;
    }

    public final void A00(int i) {
        C51965G9l.A13();
        this.A00 = i;
    }
}

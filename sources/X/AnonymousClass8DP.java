package X;

/* renamed from: X.8DP  reason: invalid class name */
public final class AnonymousClass8DP implements AnonymousClass871 {
    public final /* synthetic */ AnonymousClass8DL A00;

    public AnonymousClass8DP(AnonymousClass8DL r1) {
        this.A00 = r1;
    }

    public final void Ciw() {
        this.A00.A02.A01();
    }

    public final void DBh(AnonymousClass87G r3) {
        AnonymousClass87I r1 = r3.A04;
        if (r1 != AnonymousClass87I.EMPTY && r1 != AnonymousClass87I.DISCOVERY_SURFACE) {
            this.A00.A03.DBh(r3);
        }
    }

    public final boolean EtO(AnonymousClass87G r4) {
        if (r4.A00() == null || r4.A04 == AnonymousClass87I.DISCOVERY_SURFACE) {
            return false;
        }
        return true;
    }
}

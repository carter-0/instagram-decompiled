package X;

public final class F2T {
    public 0sL A00;
    public final C47537E7a A01;
    public final C230012om A02;
    public final AnonymousClass0eM A03 = AnonymousClass1YB.A00(G21.A00);

    public F2T(C47537E7a e7a, C230012om r3) {
        0qQ.A0B(r3, 2);
        this.A01 = e7a;
        this.A02 = r3;
    }

    public final void A00(AnonymousClass3UM r6, int i) {
        0qQ.A0B(r6, 0);
        String id = r6.getId();
        C230012om r2 = this.A02;
        AnonymousClass6KM A0Y = DbZ.A0Y(r6, "fullscreen", id, r2.A02, i);
        DbW.A1M(r6, A0Y);
        DbY.A1Q(r6, A0Y);
        r2.A07(new AnonymousClass6KN(A0Y));
        C47537E7a e7a = this.A01;
        1ES.A03(F88.A01(e7a.A00, DbU.A0q(r6), r6.CDC(), r6.getAlgorithm()));
        AnonymousClass7TE.A1Z(new MGW(e7a, r6, (AnonymousClass4D7) null, 39), e7a.A03());
    }
}

package X;

/* renamed from: X.81F  reason: invalid class name */
public final class AnonymousClass81F implements AnonymousClass81G {
    public final /* synthetic */ AnonymousClass81C A00;

    public AnonymousClass81F(AnonymousClass81C r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void FHt(Object obj) {
        AnonymousClass80Y r7 = (AnonymousClass80Y) obj;
        0qQ.A0B(r7, 0);
        AnonymousClass81C r5 = this.A00;
        if (2CC.A00(r5.A01)) {
            AnonymousClass80Y r4 = r5.A00;
            AnonymousClass81E r3 = (AnonymousClass81E) r5.A03.getValue();
            AnonymousClass81E r2 = (AnonymousClass81E) r5.A02.getValue();
            AnonymousClass80Y r1 = AnonymousClass80Y.CURATION;
            if (r7 == r1 && r4 == AnonymousClass80Y.EDITING) {
                r3.A7M(r2.ANX());
            } else if (r7 == AnonymousClass80Y.EDITING && r4 == r1) {
                r2.A7M(r3.ANX());
            }
        }
        r5.A00 = r7;
    }
}

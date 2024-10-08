package X;

/* renamed from: X.IYl  reason: case insensitive filesystem */
public final class C57354IYl implements C230422pb {
    public final /* synthetic */ AnonymousClass4DU A00;
    public final /* synthetic */ C249763kK A01;

    public final /* bridge */ /* synthetic */ AnonymousClass9JO AUM(Object obj, Object obj2) {
        return new AnonymousClass9JO(2);
    }

    public C57354IYl(AnonymousClass4DU r1, C249763kK r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ C253533qw AUN(C230472pg r26, Object obj, Object obj2, float f, long j, long j2) {
        AnonymousClass1Xn r3 = (AnonymousClass1Xn) obj;
        C242803Vz r2 = (C242803Vz) obj2;
        C230472pg r5 = r26;
        AnonymousClass7TG.A1T(r3, r2, r5);
        String id = r3.getId();
        if (id != null) {
            String sessionId = this.A01.getSessionId();
            String id2 = r3.getId();
            if (id2 != null) {
                String moduleName = this.A00.getModuleName();
                String A06 = C254373sN.A06("media_or_ad");
                int i = -1;
                if (!(r2.getPosition() == -1 || r2.BKg() == -1)) {
                    i = (r2.getPosition() - r2.BKg()) - 1;
                }
                int i2 = -1;
                if (!(r2.getPosition() == -1 || r2.BL7() == -1)) {
                    i2 = (r2.getPosition() - r2.BL7()) - 1;
                }
                return new C253533qw(r5, id, sessionId, id2, moduleName, A06, "", f, 0, i, i2, r2.getPosition(), -1, -1, -1, -1, j, j2);
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}

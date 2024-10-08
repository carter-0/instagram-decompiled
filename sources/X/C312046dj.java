package X;

/* renamed from: X.6dj  reason: invalid class name and case insensitive filesystem */
public final class C312046dj extends 2NZ {
    public final /* synthetic */ C311976dc A00;

    public final String createQuery() {
        return "UPDATE OR ABORT `effects` SET `effectId` = ?,`badgeState` = ? WHERE `effectId` = ?";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C312046dj(C251983oI r1, C311976dc r2) {
        super(r1);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void A01(AnonymousClass1WV r3, Object obj) {
        throw new NullPointerException("getEffectId");
    }
}

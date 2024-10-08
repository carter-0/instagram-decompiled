package X;

/* renamed from: X.6di  reason: invalid class name and case insensitive filesystem */
public final class C312036di extends 2NZ {
    public final /* synthetic */ C311976dc A00;

    public final String createQuery() {
        return "UPDATE OR ABORT `effects` SET `effectId` = ?,`saveStatus` = ? WHERE `effectId` = ?";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C312036di(C251983oI r1, C311976dc r2) {
        super(r1);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void A01(AnonymousClass1WV r5, Object obj) {
        C39679A4v a4v = (C39679A4v) obj;
        String str = a4v.A01;
        r5.ADh(1, str);
        r5.ADa(2, (long) a4v.A00);
        r5.ADh(3, str);
    }
}

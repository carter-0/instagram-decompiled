package X;

/* renamed from: X.6df  reason: invalid class name and case insensitive filesystem */
public final class C312006df extends 1Vf {
    public final /* synthetic */ C311976dc A00;

    public final String createQuery() {
        return "INSERT OR IGNORE INTO `effect_collections` (`productId`,`collectionName`,`syncedAt`,`lastSyncedNextCursor`,`hasMore`,`collectionId`) VALUES (?,?,?,?,?,?)";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C312006df(C251983oI r1, C311976dc r2) {
        super(r1);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void bind(AnonymousClass1WV r4, Object obj) {
        C346117ud r5 = (C346117ud) obj;
        r4.ADh(1, r5.A04);
        r4.ADh(2, r5.A02);
        r4.ADa(3, r5.A00);
        String str = r5.A03;
        if (str == null) {
            r4.ADb(4);
        } else {
            r4.ADh(4, str);
        }
        r4.ADa(5, r5.A05 ? 1 : 0);
        r4.ADh(6, r5.A01);
    }
}

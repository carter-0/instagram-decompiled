package X;

/* renamed from: X.86P  reason: invalid class name */
public final class AnonymousClass86P extends 1Vf {
    public final /* synthetic */ AnonymousClass86O A00;

    public final String createQuery() {
        return "INSERT OR REPLACE INTO `mini_gallery_categories` (`miniGallerySurface`,`categoryId`,`displayName`,`syncedAt`,`id`,`isDefaultCategory`) VALUES (?,?,?,?,?,?)";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass86P(C251983oI r1, AnonymousClass86O r2) {
        super(r1);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void bind(AnonymousClass1WV r4, Object obj) {
        C338797iY r5 = (C338797iY) obj;
        r4.ADh(1, r5.A04);
        r4.ADh(2, r5.A01);
        r4.ADh(3, r5.A02);
        r4.ADa(4, r5.A00);
        r4.ADh(5, r5.A03);
        r4.ADa(6, r5.A05 ? 1 : 0);
    }
}

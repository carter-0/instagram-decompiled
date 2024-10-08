package X;

/* renamed from: X.6de  reason: invalid class name and case insensitive filesystem */
public final class C311996de extends 1Vf {
    public final /* synthetic */ C311976dc A00;

    public final String createQuery() {
        return "INSERT OR IGNORE INTO `effect_collections_effects` (`collectionId`,`effectId`,`order`) VALUES (?,?,?)";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C311996de(C251983oI r1, C311976dc r2) {
        super(r1);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void bind(AnonymousClass1WV r4, Object obj) {
        C348847z7 r5 = (C348847z7) obj;
        r4.ADh(1, r5.A01);
        r4.ADh(2, r5.A02);
        r4.ADa(3, r5.A00);
    }
}

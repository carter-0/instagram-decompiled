package X;

/* renamed from: X.Pgx  reason: case insensitive filesystem */
public final /* synthetic */ class C73622Pgx extends 03J implements 0sL {
    public static final C73622Pgx A00 = new C73622Pgx();

    public C73622Pgx() {
        super(2, C71043OaL.class, "generateShopsCollectionShareUrl", "generateShopsCollectionShareUrl(Lcom/instagram/direct/model/DirectShopsCollectionShare;Lcom/instagram/direct/deeplinking/Environment;)Ljava/lang/String;", 1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        QP5 qp5 = (QP5) obj;
        AnonymousClass7TG.A1N(qp5, obj2);
        return 002.A16("https://www.instagram.com/_n/product_collection?title=", qp5.A03, "&merchant_id=", qp5.A00, "&collection_id=", qp5.A01, "&collection_type=", qp5.A02);
    }
}

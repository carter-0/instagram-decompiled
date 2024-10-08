package X;

/* renamed from: X.Pgy  reason: case insensitive filesystem */
public final /* synthetic */ class C73623Pgy extends 03J implements 0sL {
    public static final C73623Pgy A00 = new C73623Pgy();

    public C73623Pgy() {
        super(2, C71043OaL.class, "generateShopShareUrl", "generateShopShareUrl(Lcom/instagram/direct/model/DirectShopShare;Lcom/instagram/direct/deeplinking/Environment;)Ljava/lang/String;", 1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C61037Jvb jvb = (C61037Jvb) obj;
        AnonymousClass7TG.A1N(jvb, obj2);
        return 002.A13("https://www.instagram.com/_n/profile_shop?merchant_id=", jvb.A01, "&merchant_username=", jvb.A02, "&link_id=", jvb.A00);
    }
}

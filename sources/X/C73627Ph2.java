package X;

/* renamed from: X.Ph2  reason: case insensitive filesystem */
public final /* synthetic */ class C73627Ph2 extends 03J implements 0sL {
    public static final C73627Ph2 A00 = new C73627Ph2();

    public C73627Ph2() {
        super(2, C71043OaL.class, "generateFundraiserUrl", "generateFundraiserUrl(Ljava/lang/String;Lcom/instagram/direct/deeplinking/Environment;)Ljava/lang/String;", 1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        AnonymousClass7TG.A1N(str, obj2);
        return 002.A0R("https://www.instagram.com/linking/fundraiser?fundraiser_id=", str);
    }
}

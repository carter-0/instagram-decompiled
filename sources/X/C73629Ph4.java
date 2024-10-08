package X;

/* renamed from: X.Ph4  reason: case insensitive filesystem */
public final /* synthetic */ class C73629Ph4 extends 03J implements 0sL {
    public static final C73629Ph4 A00 = new C73629Ph4();

    public C73629Ph4() {
        super(2, C71043OaL.class, "generateLocationShareUrl", "generateLocationShareUrl(Ljava/lang/String;Lcom/instagram/direct/deeplinking/Environment;)Ljava/lang/String;", 1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        AnonymousClass7TG.A1N(str, obj2);
        return 002.A0R("https://www.instagram.com/explore/locations/", str);
    }
}

package X;

/* renamed from: X.Ph1  reason: case insensitive filesystem */
public final /* synthetic */ class C73626Ph1 extends 03J implements 0sL {
    public static final C73626Ph1 A00 = new C73626Ph1();

    public C73626Ph1() {
        super(2, C71043OaL.class, "generateDestinationShareUrl", "generateDestinationShareUrl(Ljava/lang/String;Lcom/instagram/direct/deeplinking/Environment;)Ljava/lang/String;", 1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        boolean A1Z = AnonymousClass7TG.A1Z(str, obj2);
        if (C66580MXl.A1a("#", A1Z ? 1 : 0, str)) {
            str = C66580MXl.A0z(str, A1Z);
        }
        return 002.A0R("https://www.instagram.com/explore/tags/", str);
    }
}

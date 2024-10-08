package X;

/* renamed from: X.Pgr  reason: case insensitive filesystem */
public final /* synthetic */ class C73616Pgr extends 03J implements 0sL {
    public static final C73616Pgr A00 = new C73616Pgr();

    public C73616Pgr() {
        super(2, C71043OaL.class, "generateFelixShareUrl", "generateFelixShareUrl(Ljava/lang/Object;Lcom/instagram/direct/deeplinking/Environment;)Ljava/lang/String;", 1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String A2Z;
        AnonymousClass7TG.A1N(obj, obj2);
        if (obj instanceof String) {
            A2Z = (String) obj;
        } else {
            if (C376649Iu.A00(6, obj)) {
                obj = ((C376649Iu) obj).A00;
            } else if (!(obj instanceof 1Xj)) {
                throw C66582MXn.A0k(obj, "Expected either DirectIGTVShare or Media, found: ", AnonymousClass7TE.A1A());
            }
            A2Z = ((1Xj) obj).A2Z();
        }
        return 002.A0R("https://www.instagram.com/tv/", A2Z);
    }
}

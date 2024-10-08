package X;

/* renamed from: X.Ph9  reason: case insensitive filesystem */
public final /* synthetic */ class C73634Ph9 extends 03J implements 0sL {
    public static final C73634Ph9 A00 = new C73634Ph9();

    public C73634Ph9() {
        super(2, C71043OaL.class, "generateMediaViewerUrl", "generateMediaViewerUrl(Lcom/instagram/feed/media/Media;Lcom/instagram/direct/deeplinking/Environment;)Ljava/lang/String;", 1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        1Xj r3 = (1Xj) obj;
        AnonymousClass7TG.A1N(r3, obj2);
        return 002.A0R("instagram://media_viewer?media_fbid=", r3.getId());
    }
}

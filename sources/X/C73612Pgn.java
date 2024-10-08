package X;

/* renamed from: X.Pgn  reason: case insensitive filesystem */
public final /* synthetic */ class C73612Pgn extends 03J implements 0sL {
    public static final C73612Pgn A00 = new C73612Pgn();

    public C73612Pgn() {
        super(2, C71043OaL.class, "generateLiveVideoShareUrl", "generateLiveVideoShareUrl(Lcom/instagram/model/iglive/broadcast/BroadcastItem;Lcom/instagram/direct/deeplinking/Environment;)Ljava/lang/String;", 1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C270194gL r5 = (C270194gL) obj;
        AnonymousClass7TG.A1N(r5, obj2);
        String username = r5.A03().getUsername();
        String str = r5.A0X;
        str.getClass();
        return 002.A0u("https://www.instagram.com/", username, "/live/", str);
    }
}

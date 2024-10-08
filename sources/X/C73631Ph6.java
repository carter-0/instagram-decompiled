package X;

import com.instagram.user.model.User;

/* renamed from: X.Ph6  reason: case insensitive filesystem */
public final /* synthetic */ class C73631Ph6 extends 03J implements 0sL {
    public static final C73631Ph6 A00 = new C73631Ph6();

    public C73631Ph6() {
        super(2, C71043OaL.class, "generatorProfileUrl", "generatorProfileUrl(Lcom/instagram/user/model/User;Lcom/instagram/direct/deeplinking/Environment;)Ljava/lang/String;", 1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        User user = (User) obj;
        AnonymousClass7TG.A1N(user, obj2);
        return 002.A0R("https://www.instagram.com/", user.getUsername());
    }
}

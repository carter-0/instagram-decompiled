package X;

import com.instagram.user.model.User;

/* renamed from: X.Ph5  reason: case insensitive filesystem */
public final /* synthetic */ class C73630Ph5 extends 03J implements 0sL {
    public static final C73630Ph5 A00 = new C73630Ph5();

    public C73630Ph5() {
        super(2, C71043OaL.class, "generatorProfileUrl", "generatorProfileUrl(Lcom/instagram/user/model/User;Lcom/instagram/direct/deeplinking/Environment;)Ljava/lang/String;", 1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        User user = (User) obj;
        AnonymousClass7TG.A1N(user, obj2);
        return 002.A0R("https://www.instagram.com/", user.getUsername());
    }
}

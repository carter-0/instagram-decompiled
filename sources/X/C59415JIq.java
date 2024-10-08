package X;

import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.JIq  reason: case insensitive filesystem */
public final class C59415JIq extends 0Yg implements 0sK {
    public static final C59415JIq A00 = new C59415JIq();

    public C59415JIq() {
        super(3);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        User user = (User) obj2;
        AnonymousClass3FZ r8 = (AnonymousClass3FZ) obj3;
        AnonymousClass7TG.A1T(obj, user, r8);
        return new C61078JwG(AnonymousClass7TE.A1I(C71152OeO.A08(new ExtendedImageUrl(user.Bh3()), (ExtendedImageUrl) null, user.getUsername(), user.getFullName(), r8.A05("target_url"))), 9);
    }
}

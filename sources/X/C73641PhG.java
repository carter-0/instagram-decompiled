package X;

import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.PhG  reason: case insensitive filesystem */
public final /* synthetic */ class C73641PhG extends 03J implements 0sL {
    public static final C73641PhG A00 = new C73641PhG();

    public C73641PhG() {
        super(2, C69613Nov.class, "generateProfile", "generateProfile(Lcom/instagram/direct/pending/pendinggenericxma/Environment;Lcom/instagram/user/model/User;)Lcom/instagram/direct/model/GenericFBAttachment;", 1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        OTC otc = (OTC) obj;
        User user = (User) obj2;
        AnonymousClass7TG.A1N(otc, user);
        return C71152OeO.A09(C66581MXm.A0f(user), (ExtendedImageUrl) null, user.getUsername(), user.getFullName(), (String) null, (String) null, OTC.A00(otc));
    }
}

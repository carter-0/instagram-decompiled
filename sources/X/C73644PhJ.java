package X;

import android.content.Context;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.PhJ  reason: case insensitive filesystem */
public final /* synthetic */ class C73644PhJ extends 03J implements 0sL {
    public static final C73644PhJ A00 = new C73644PhJ();

    public C73644PhJ() {
        super(2, C69613Nov.class, "generateStoryShare", "generateStoryShare(Lcom/instagram/direct/pending/pendinggenericxma/Environment;Lcom/instagram/direct/model/DirectStoryShareMedia;)Lcom/instagram/direct/model/GenericFBAttachment;", 1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        User user;
        ExtendedImageUrl extendedImageUrl;
        String str;
        OTC otc = (OTC) obj;
        AnonymousClass7FJ r14 = (AnonymousClass7FJ) obj2;
        AnonymousClass7TG.A1N(otc, r14);
        Context context = (Context) otc.A00.invoke();
        1Xj r1 = r14.A01;
        ExtendedImageUrl extendedImageUrl2 = null;
        if (r1 != null) {
            user = C51966G9m.A11(r1);
        } else {
            user = null;
        }
        if (user != null) {
            extendedImageUrl = C66581MXm.A0f(user);
            str = user.getUsername();
        } else {
            extendedImageUrl = null;
            str = null;
        }
        if (r1 != null) {
            extendedImageUrl2 = r1.A1n(context);
        }
        return C71152OeO.A05(extendedImageUrl, extendedImageUrl2, (ExtendedImageUrl) null, str, (String) null, (String) null, OTC.A00(otc), 4, 0);
    }
}

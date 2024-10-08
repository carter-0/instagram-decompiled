package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.PhK  reason: case insensitive filesystem */
public final /* synthetic */ class C73645PhK extends 03J implements 0sL {
    public static final C73645PhK A00 = new C73645PhK();

    public C73645PhK() {
        super(2, C69613Nov.class, "generateLiveViewerInvite", "generateLiveViewerInvite(Lcom/instagram/direct/pending/pendinggenericxma/Environment;Lcom/instagram/direct/model/DirectLiveViewerInvite;)Lcom/instagram/direct/model/GenericFBAttachment;", 1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        User user;
        ExtendedImageUrl extendedImageUrl;
        String str;
        ImageUrl A02;
        OTC otc = (OTC) obj;
        C45425Cw5 cw5 = (C45425Cw5) obj2;
        AnonymousClass7TG.A1N(otc, cw5);
        C270194gL r0 = cw5.A01;
        if (r0 != null) {
            user = r0.A03();
        } else {
            user = cw5.A02;
        }
        ExtendedImageUrl extendedImageUrl2 = null;
        if (user != null) {
            extendedImageUrl = C66581MXm.A0f(user);
            str = user.getUsername();
        } else {
            extendedImageUrl = null;
            str = null;
        }
        C270194gL r02 = cw5.A01;
        if (!(r02 == null || (A02 = r02.A02()) == null)) {
            extendedImageUrl2 = new ExtendedImageUrl(A02);
        }
        return C71152OeO.A05(extendedImageUrl, extendedImageUrl2, (ExtendedImageUrl) null, str, (String) null, (String) null, OTC.A00(otc), 4, 7);
    }
}

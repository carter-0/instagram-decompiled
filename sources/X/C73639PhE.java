package X;

import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.List;

/* renamed from: X.PhE  reason: case insensitive filesystem */
public final /* synthetic */ class C73639PhE extends 03J implements 0sL {
    public static final C73639PhE A00 = new C73639PhE();

    public C73639PhE() {
        super(2, C69613Nov.class, "generateMedia", "generateMedia(Lcom/instagram/direct/pending/pendinggenericxma/Environment;Lcom/instagram/model/direct/DirectPendingMedia;)Lcom/instagram/direct/model/GenericFBAttachment;", 1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ExtendedImageUrl extendedImageUrl;
        OTC otc = (OTC) obj;
        C300925yB r12 = (C300925yB) obj2;
        AnonymousClass7TG.A1N(otc, r12);
        String str = r12.A08;
        if (str != null) {
            extendedImageUrl = new ExtendedImageUrl((ExtendedImageUrl) null, (Integer) null, (Integer) null, (Long) null, str, (String) null, (String) null, (List) null);
        } else {
            extendedImageUrl = null;
        }
        return C71152OeO.A05((ExtendedImageUrl) null, extendedImageUrl, (ExtendedImageUrl) null, (String) null, (String) null, (String) null, OTC.A00(otc), 4, 8);
    }
}

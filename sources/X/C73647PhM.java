package X;

import android.content.Context;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.PhM  reason: case insensitive filesystem */
public final /* synthetic */ class C73647PhM extends 03J implements 0sL {
    public static final C73647PhM A00 = new C73647PhM();

    public C73647PhM() {
        super(2, C69613Nov.class, "generateFelixShare", "generateFelixShare(Lcom/instagram/direct/pending/pendinggenericxma/Environment;Lcom/instagram/direct/model/DirectIGTVShare;)Lcom/instagram/direct/model/GenericFBAttachment;", 1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ExtendedImageUrl extendedImageUrl;
        OTC otc = (OTC) obj;
        C376649Iu r1 = (C376649Iu) obj2;
        AnonymousClass7TG.A1N(otc, r1);
        Context context = (Context) otc.A00.invoke();
        1Xj r12 = (1Xj) r1.A00;
        User A11 = C51966G9m.A11(r12);
        String str = null;
        if (A11 != null) {
            extendedImageUrl = C66581MXm.A0f(A11);
            str = A11.getUsername();
        } else {
            extendedImageUrl = null;
        }
        return C71152OeO.A04(extendedImageUrl, r12.A1n(context), (ExtendedImageUrl) null, C66580MXl.A0q(), str, r12.A0C.getTitle(), (String) null, OTC.A00(otc), (List) null, 4, 0);
    }
}

package X;

import android.content.Context;
import android.text.TextUtils;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.PhN  reason: case insensitive filesystem */
public final /* synthetic */ class C73648PhN extends 03J implements 0sL {
    public static final C73648PhN A00 = new C73648PhN();

    public C73648PhN() {
        super(2, C69613Nov.class, "generateClipsShare", "generateClipsShare(Lcom/instagram/direct/pending/pendinggenericxma/Environment;Lcom/instagram/direct/model/DirectClipsShare;)Lcom/instagram/direct/model/GenericFBAttachment;", 1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ExtendedImageUrl extendedImageUrl;
        OTC otc = (OTC) obj;
        AnonymousClass77X r3 = (AnonymousClass77X) obj2;
        AnonymousClass7TG.A1N(otc, r3);
        Context context = (Context) otc.A00.invoke();
        1Xj r1 = r3.A01;
        0qQ.A07(r1);
        User A11 = C51966G9m.A11(r1);
        String str = null;
        if (A11 != null) {
            extendedImageUrl = C66581MXm.A0f(A11);
            str = A11.getUsername();
        } else {
            extendedImageUrl = null;
        }
        return C71152OeO.A06(extendedImageUrl, r1.A1n(context), (Boolean) null, (Long) null, (String) null, str, (String) null, (String) null, (String) null, (String) null, OTC.A00(otc), (List) null, 4, 8, !TextUtils.isEmpty(r3.A03));
    }
}

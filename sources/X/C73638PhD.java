package X;

import android.content.Context;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.DirectAREffectShare;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.List;

/* renamed from: X.PhD  reason: case insensitive filesystem */
public final /* synthetic */ class C73638PhD extends 03J implements 0sL {
    public static final C73638PhD A00 = new C73638PhD();

    public C73638PhD() {
        super(2, C69613Nov.class, "generateArEffect", "generateArEffect(Lcom/instagram/direct/pending/pendinggenericxma/Environment;Lcom/instagram/direct/model/DirectAREffectShare;)Lcom/instagram/direct/model/GenericFBAttachment;", 1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ExtendedImageUrl extendedImageUrl;
        ImageUrl A0V;
        List list;
        1Xj r0;
        OTC otc = (OTC) obj;
        DirectAREffectShare directAREffectShare = (DirectAREffectShare) obj2;
        AnonymousClass7TF.A1H(otc, directAREffectShare);
        Context context = (Context) otc.A00.invoke();
        ImageUrl A002 = directAREffectShare.A00();
        if (A002 != null) {
            extendedImageUrl = new ExtendedImageUrl(A002);
        } else {
            extendedImageUrl = null;
        }
        AnonymousClass3HX r02 = directAREffectShare.A03;
        if (r02 == null || (list = r02.A1j) == null || (r0 = (1Xj) 00k.A0J(list)) == null || (A0V = r0.A1Q()) == null) {
            A0V = DbS.A0V("");
        }
        return C71152OeO.A0A(new ExtendedImageUrl(A0V), extendedImageUrl, (String) null, (String) null, directAREffectShare.A03(), DbW.A0h(context, directAREffectShare.A01(), 2131969333), OTC.A00(otc), 4, 0);
    }
}

package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.User;

/* renamed from: X.PhL  reason: case insensitive filesystem */
public final /* synthetic */ class C73646PhL extends 03J implements 0sL {
    public static final C73646PhL A00 = new C73646PhL();

    public C73646PhL() {
        super(2, C69613Nov.class, "generateShoppingProduct", "generateShoppingProduct(Lcom/instagram/direct/pending/pendinggenericxma/Environment;Lcom/instagram/user/model/ProductDetailsProductItemDict;)Lcom/instagram/direct/model/GenericFBAttachment;", 1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ExtendedImageUrl extendedImageUrl;
        String str;
        String str2;
        String A10;
        ExtendedImageUrl A03;
        OTC otc = (OTC) obj;
        ProductDetailsProductItemDict productDetailsProductItemDict = (ProductDetailsProductItemDict) obj2;
        boolean A1U = AnonymousClass7TF.A1U(0, otc, productDetailsProductItemDict);
        User user = productDetailsProductItemDict.A0G;
        ExtendedImageUrl extendedImageUrl2 = null;
        if (user != null) {
            extendedImageUrl = C66581MXm.A0f(user);
            str = user.getUsername();
        } else {
            extendedImageUrl = null;
            str = null;
        }
        ImageInfo imageInfo = C14502TxO.A00(productDetailsProductItemDict).A08;
        if (!(imageInfo == null || (A03 = 1iI.A03(imageInfo)) == null)) {
            extendedImageUrl2 = new ExtendedImageUrl(A03);
        }
        String str3 = productDetailsProductItemDict.A0e;
        Integer valueOf = Integer.valueOf(A1U ? 1 : 0);
        Context context = (Context) otc.A00.invoke();
        Product A002 = C14502TxO.A00(productDetailsProductItemDict);
        0qQ.A0B(context, 0);
        String str4 = A002.A0G;
        if (str4 == null) {
            A10 = " ";
        } else {
            SpannableStringBuilder A0E = C51965G9l.A0E();
            if (A002.A05()) {
                str2 = DbV.A0u(context, A002.A0L, str4, 2131963053);
            } else {
                str2 = A002.A0L;
            }
            A0E.append(str2);
            A10 = DbT.A10(A0E);
        }
        return C71152OeO.A03(extendedImageUrl, extendedImageUrl2, (ExtendedImageUrl) null, valueOf, valueOf, str, str3, A10, OTC.A00(otc), 0);
    }
}

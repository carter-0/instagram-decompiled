package X;

import android.content.Context;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.VHq  reason: case insensitive filesystem */
public abstract class C17094VHq {
    public static final WSC A00(Context context, AnonymousClass0iw r19, C16671Uz7 uz7, X54 x54, String str, String str2, String str3, String str4, String str5, List list, int i, int i2) {
        ImageUrl imageUrl;
        0sn r8;
        ImageInfo BGO;
        ExtendedImageUrl A01;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            imageUrl = null;
            if (!it.hasNext()) {
                break;
            }
            ProductImageContainer productImageContainer = (ProductImageContainer) it.next();
            if (!(productImageContainer == null || (BGO = productImageContainer.BGO()) == null || (A01 = 1iI.A01(context, BGO)) == null)) {
                arrayList.add(A01);
            }
        }
        0sn A0d = 00k.A0d(arrayList, 4);
        C16671Uz7 uz72 = uz7;
        if (uz72 == C16671Uz7.SLIDESHOW) {
            r8 = 0sn.A00;
        } else if (uz72 == C16671Uz7.GRID_WITH_SINGLE_IMAGE_FALLBACK && A0d.size() == 1) {
            imageUrl = (ImageUrl) 00k.A0O(A0d, 0);
            r8 = 0sn.A00;
            A0d = r8;
        } else {
            r8 = A0d;
            A0d = 0sn.A00;
        }
        X54 x542 = x54;
        return new WSC(r19, imageUrl, str, str2, r8, A0d, new C20615Wvw(x542, str3, str4, str5, i, i2), new C20785Wyw(x542, 26));
    }
}

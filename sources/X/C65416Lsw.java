package X;

import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.model.shopping.productintfs.TaggingFeedSessionInformation;
import com.instagram.user.model.ImmutablePandoProductDetailsProductItemDict;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Lsw  reason: case insensitive filesystem */
public final class C65416Lsw implements C46212DQp {
    public final /* synthetic */ C60167Jgm A00;

    public final void DoD(N4R n4r) {
        ArrayList arrayList;
        Object value;
        String str;
        ArrayList A1C;
        Boolean bool;
        ArrayList A0T;
        Boolean bool2;
        User user;
        ImageInfo BGO;
        List Al9;
        ExtendedImageUrl extendedImageUrl;
        String str2;
        User user2;
        C61052Jvq jvq = (C61052Jvq) n4r.A02;
        if (jvq != null) {
            List list = (List) jvq.A01;
            if (list != null) {
                C60167Jgm jgm = this.A00;
                arrayList = AnonymousClass7TG.A0r(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Product((TaggingFeedSessionInformation) null, ((ImmutablePandoProductDetailsProductItemDict) C41845B3m.A0V(it).getRequiredTreeField(0, "node", C4I.class, -548658410).reinterpretRequired(0, C4D.class, -861521069).reinterpret(ImmutablePandoProductDetailsProductItemDict.class)).FGq(new 1E9(1E4.A00(jgm.A00), AnonymousClass7TE.A1F(), false))));
                }
            } else {
                arrayList = null;
            }
            Boolean valueOf = Boolean.valueOf(jvq.A02);
            Integer valueOf2 = Integer.valueOf(jvq.A00);
            if (arrayList != null && !arrayList.isEmpty()) {
                05G r3 = this.A00.A04;
                do {
                    value = r3.getValue();
                    C61033JvX jvX = (C61033JvX) value;
                    Product product = (Product) 00k.A0O(arrayList, 0);
                    if (product == null || (user2 = product.A0B) == null) {
                        str = null;
                    } else {
                        str = user2.getUsername();
                    }
                    A1C = AnonymousClass7TE.A1C();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ProductImageContainer productImageContainer = ((Product) it2.next()).A09;
                        if (!(productImageContainer == null || (BGO = productImageContainer.BGO()) == null || (Al9 = BGO.Al9()) == null || (extendedImageUrl = (ExtendedImageUrl) 00k.A0O(Al9, 0)) == null || (str2 = extendedImageUrl.A0A) == null)) {
                            A1C.add(DbS.A0V(str2));
                        }
                    }
                    Product product2 = (Product) 00k.A0O(arrayList, 0);
                    if (product2 == null || (user = product2.A0B) == null) {
                        bool = null;
                    } else {
                        bool = Boolean.valueOf(user.isVerified());
                    }
                    A0T = 00k.A0T(C65419Lsz.A00, jvX.A08);
                    bool2 = jvX.A02;
                    0qQ.A0B(A0T, 6);
                } while (!r3.AIY(value, new C61033JvX((SimpleImageUrl) null, bool, valueOf, bool2, 2131954075, (Integer) null, valueOf2, str, A1C, A0T, arrayList)));
            }
        }
    }

    public C65416Lsw(C60167Jgm jgm) {
        this.A00 = jgm;
    }

    public final void onFailure() {
        Object value;
        C61033JvX jvX;
        05G r4 = this.A00.A04;
        do {
            value = r4.getValue();
            jvX = (C61033JvX) value;
        } while (!C61033JvX.A00(jvX, C65420Lt0.A00, value, jvX.A08, r4));
    }
}

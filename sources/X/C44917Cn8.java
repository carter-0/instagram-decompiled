package X;

import com.instagram.model.shopping.clips.ClipsShoppingCTABar;
import com.instagram.model.shopping.clips.IGTVShoppingInfo;
import com.instagram.user.model.ProductCollectionImpl;
import com.instagram.user.model.ProductWrapper;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cn8  reason: case insensitive filesystem */
public abstract class C44917Cn8 {
    public static IGTVShoppingInfo parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            ClipsShoppingCTABar clipsShoppingCTABar = null;
            ProductCollectionImpl productCollectionImpl = null;
            User user = null;
            ArrayList arrayList = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("clips_shopping_cta_bar".equals(A17)) {
                    clipsShoppingCTABar = C45682D1h.parseFromJson(r8);
                } else if ("collection_metadata".equals(A17)) {
                    productCollectionImpl = C45710D2j.parseFromJson(r8);
                } else if ("merchant".equals(A17)) {
                    user = C41845B3m.A0a(r8, false);
                } else if ("products".equals(A17)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r8.A1J() != 16L.A08) {
                            ProductWrapper parseFromJson = C45711D2k.parseFromJson(r8);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r8.A0z();
            }
            return new IGTVShoppingInfo(clipsShoppingCTABar, productCollectionImpl, user, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

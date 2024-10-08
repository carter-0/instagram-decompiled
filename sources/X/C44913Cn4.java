package X;

import com.instagram.model.shopping.ShoppingHomeDestination;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cn4  reason: case insensitive filesystem */
public abstract class C44913Cn4 {
    public static ShoppingHomeDestination parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ShoppingHomeDestination shoppingHomeDestination = new ShoppingHomeDestination();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("destination_type".equals(A17)) {
                    C16594Uxo uxo = (C16594Uxo) C16594Uxo.A01.get(AnonymousClass7TG.A0l(r4));
                    if (uxo == null) {
                        uxo = C16594Uxo.UNKNOWN;
                    }
                    shoppingHomeDestination.A00 = uxo;
                } else if ("pinned_content_token".equals(A17)) {
                    shoppingHomeDestination.A02 = AnonymousClass7TG.A0l(r4);
                } else if ("referral_id".equals(A17)) {
                    shoppingHomeDestination.A03 = AnonymousClass7TG.A0l(r4);
                } else if ("referral_sender_id".equals(A17)) {
                    shoppingHomeDestination.A04 = AnonymousClass7TG.A0l(r4);
                } else if ("hoisted_discount_ids".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r4, arrayList);
                        }
                    }
                    shoppingHomeDestination.A07 = arrayList;
                } else if ("override_discount_id".equals(A17)) {
                    shoppingHomeDestination.A01 = AnonymousClass7TG.A0l(r4);
                } else if (C41845B3m.A1E(A17)) {
                    shoppingHomeDestination.A05 = AnonymousClass7TG.A0l(r4);
                } else if (C41845B3m.A18(A17)) {
                    shoppingHomeDestination.A06 = AnonymousClass7TG.A0l(r4);
                }
                r4.A0z();
            }
            return shoppingHomeDestination;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

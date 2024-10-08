package X;

import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;

/* renamed from: X.6xW  reason: invalid class name and case insensitive filesystem */
public final class C323456xW implements 1wn {
    public final /* synthetic */ C323426xT A00;

    public C323456xW(C323426xT r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        String A002;
        C16675UzB uzB;
        int A03 = AnonymousClass0fD.A03(998854932);
        int A032 = AnonymousClass0fD.A03(-188572189);
        AnonymousClass3ZL r6 = ((AnonymousClass3DT) obj).A00;
        if (r6 instanceof Product) {
            C323486xZ r5 = this.A00.A07;
            Product product = (Product) r6;
            0qQ.A0B(product, 0);
            User user = product.A0B;
            if (user == null || (A002 = AnonymousClass3ZA.A00(user)) == null) {
                throw new IllegalArgumentException("Required value was null.");
            } else if (r5.A06(A002) != null && product.A04() && product.A0P) {
                if (r5.A09.A03(product)) {
                    r5.A0G(product, A002);
                } else {
                    C18071Vky A06 = r5.A06(A002);
                    if (A06 != null) {
                        MultiProductComponent multiProductComponent = A06.A02;
                        if (multiProductComponent != null) {
                            uzB = multiProductComponent.A04;
                        } else {
                            uzB = null;
                        }
                        if (uzB == C16675UzB.SAVED) {
                            r5.A0H(product, A002);
                        }
                    }
                }
            }
        }
        AnonymousClass0fD.A0A(-1640915069, A032);
        AnonymousClass0fD.A0A(-520936447, A03);
    }
}

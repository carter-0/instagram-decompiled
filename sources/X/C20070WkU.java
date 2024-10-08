package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.WkU  reason: case insensitive filesystem */
public final class C20070WkU implements Runnable {
    public final /* synthetic */ C15690Ugv A00;

    public C20070WkU(C15690Ugv ugv) {
        this.A00 = ugv;
    }

    public final void run() {
        C15690Ugv ugv = this.A00;
        List list = C15690Ugv.A0U;
        C17641VbX vbX = (C17641VbX) ugv.A0R.getValue();
        ProductTile productTile = ugv.A07;
        if (productTile != null) {
            Product product = productTile.A07;
            if (product != null) {
                User user = product.A0B;
                if (user != null) {
                    C249713kF r3 = C249713kF.A00;
                    FragmentActivity fragmentActivity = vbX.A00;
                    DbS.A1X(fragmentActivity);
                    UserSession userSession = vbX.A02;
                    AnonymousClass4DU r7 = vbX.A03;
                    String str = vbX.A06;
                    String str2 = vbX.A05;
                    String A002 = AnonymousClass3ZA.A00(user);
                    0qQ.A0A(A002);
                    String A0b = C13988Tno.A0b(user);
                    0qQ.A0A(A0b);
                    W2P A0N = r3.A0N(fragmentActivity, user.A03.BsB(), userSession, r7, str, str2, "peek", A002, A0b);
                    A0N.A0H = 0sr.A1L(new String[]{product.A0H});
                    A0N.A05();
                    return;
                }
                throw new IllegalStateException("productTile product merchant id must not be null");
            }
            throw new IllegalStateException("productTile product must not be null");
        }
        throw new IllegalStateException("No productTile supplied");
    }
}

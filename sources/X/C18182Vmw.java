package X;

import com.instagram.common.session.UserSession;
import com.instagram.shopping.intf.ProductDetailsPageArguments;
import com.instagram.shopping.model.analytics.ShoppingSearchLoggingInfo;

/* renamed from: X.Vmw  reason: case insensitive filesystem */
public abstract class C18182Vmw {
    public static final UserSession A00(C307786Rm r3, String str) {
        0qQ.A0B(r3, 0);
        0lg A0A = C308206Td.A0A(r3);
        if (!(A0A instanceof UserSession)) {
            A0A = null;
        }
        String A0R = 002.A0R("Unable to get User Session for RenderUnit ", str);
        0qQ.A0B(A0R, 1);
        if (A0A == null) {
            1Kn.A02("CPDP_MVP", A0R);
        }
        return (UserSession) A0A;
    }

    public static final W1W A01(VZO vzo, UserSession userSession, AnonymousClass4DU r15, X9C x9c, String str) {
        String str2 = str;
        0qQ.A0B(str2, 3);
        ProductDetailsPageArguments productDetailsPageArguments = vzo.A00;
        String str3 = productDetailsPageArguments.A0Q;
        String str4 = productDetailsPageArguments.A0H;
        String str5 = vzo.A01;
        String str6 = vzo.A02;
        ShoppingSearchLoggingInfo shoppingSearchLoggingInfo = productDetailsPageArguments.A05;
        return new W1W(productDetailsPageArguments.A02, userSession, r15, productDetailsPageArguments.A04, shoppingSearchLoggingInfo, x9c, str2, str3, str4, str5, str6, "v0.1", productDetailsPageArguments.A0G);
    }
}

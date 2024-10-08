package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.payments.checkout.CheckoutLaunchParams;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.HashMap;

/* renamed from: X.WcS  reason: case insensitive filesystem */
public final class C19603WcS implements C20987X8d {
    public final AnonymousClass4DH A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;

    public C19603WcS(AnonymousClass4DH r2, UserSession userSession, AnonymousClass4DU r4) {
        0qQ.A0B(userSession, 3);
        this.A00 = r2;
        this.A02 = r4;
        this.A01 = userSession;
    }

    public final void Cq1(User user, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        User user2 = user;
        0qQ.A0B(user2, 0);
        String str10 = str;
        String str11 = str2;
        String str12 = str3;
        AnonymousClass7TG.A1U(str10, str11, str12);
        C249713kF r4 = C249713kF.A00;
        FragmentActivity requireActivity = this.A00.requireActivity();
        String A002 = AnonymousClass3ZA.A00(user2);
        0qQ.A0A(A002);
        String str13 = str6;
        r4.A0m(requireActivity, V1Z.UNKNOWN, V1W.UNKNOWN, V1Y.UNKNOWN, V1X.UNKNOWN, this.A01, l, A002, str10, str11, str12, (String) null, str13, str5, str4, (String) null, str7, str8, str9, (String) null, (HashMap) null, false);
    }

    public final void CqI(Product product, String str, String str2, String str3) {
        AnonymousClass7TG.A1O(str, str2);
        WNN A0L = C249713kF.A00.A0L(this.A00.requireActivity(), this.A01, this.A02, product, "shopping_bag_product_collection", str);
        A0L.A0N = str2;
        WNN.A01(A0L);
    }

    public final void CqQ(User user, String str, String str2, String str3, String str4) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        User user2 = user;
        C51974G9v.A1O(user2, str5, str6, str7);
        C249713kF r3 = C249713kF.A00;
        FragmentActivity requireActivity = this.A00.requireActivity();
        UserSession userSession = this.A01;
        AnonymousClass4DU r7 = this.A02;
        String A002 = AnonymousClass3ZA.A00(user2);
        0qQ.A0A(A002);
        String A0b = C13988Tno.A0b(user2);
        0qQ.A0A(A0b);
        W2P A0N = r3.A0N(requireActivity, user2.A03.BsB(), userSession, r7, str5, str6, "unavailable_product_card", A002, A0b);
        A0N.A06((String) null, str7, str6, (String) null, (String) null);
        A0N.A05();
    }

    public final void CpP(CheckoutLaunchParams checkoutLaunchParams) {
        VFA.A00().A04(this.A00.requireActivity(), this.A01, checkoutLaunchParams, "index_cart");
    }
}

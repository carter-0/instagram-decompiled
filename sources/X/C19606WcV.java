package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.payments.checkout.CheckoutLaunchParams;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.WcV  reason: case insensitive filesystem */
public final class C19606WcV implements C20999X8w {
    public final AnonymousClass4DH A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final C262944Gp A03;
    public final C13680Tep A04;

    public C19606WcV(AnonymousClass4DH r2, UserSession userSession, AnonymousClass4DU r4, C262944Gp r5, C13680Tep tep) {
        0qQ.A0B(userSession, 3);
        this.A00 = r2;
        this.A02 = r4;
        this.A01 = userSession;
        this.A04 = tep;
        this.A03 = r5;
    }

    public final void CqJ(Product product, String str, String str2, String str3, String str4) {
        AnonymousClass7TG.A1O(str, str2);
        WNN A0L = C249713kF.A00.A0L(this.A00.requireActivity(), this.A01, this.A02, product, str3, str);
        A0L.A0N = str2;
        A0L.A0R = str4;
        WNN.A01(A0L);
    }

    public final void CqT(List list, int i, String str) {
        0qQ.A0B(str, 0);
        UserSession userSession = this.A01;
        FragmentActivity requireActivity = this.A00.requireActivity();
        C13680Tep tep = this.A04;
        C9858RiX.A00(requireActivity, userSession, this.A03, tep, str, list, i);
    }

    public final void CqN(User user, String str, String str2) {
        String A002 = AnonymousClass000.A00(171);
        0qQ.A0B(str, 1);
        FragmentActivity requireActivity = this.A00.requireActivity();
        UserSession userSession = this.A01;
        C309516Yo A0Q = DbU.A0Q(requireActivity, userSession);
        1a1 A022 = C46447Df9.A02();
        String A003 = AnonymousClass3ZA.A00(user);
        0qQ.A0A(A003);
        C46474Dfc A012 = C46548Dgp.A01(userSession, A003, A002, this.A02.getModuleName());
        A012.A0L = str;
        C46474Dfc.A03(A0Q, userSession, A022, A012);
    }

    public final void CqR(User user, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        User user2 = user;
        String str8 = str;
        String str9 = str2;
        String str10 = str3;
        C51974G9v.A1O(user2, str8, str9, str10);
        String str11 = str6;
        0qQ.A0B(str11, 6);
        C249713kF r4 = C249713kF.A00;
        FragmentActivity requireActivity = this.A00.requireActivity();
        UserSession userSession = this.A01;
        AnonymousClass4DU r8 = this.A02;
        String A002 = AnonymousClass3ZA.A00(user2);
        0qQ.A0A(A002);
        String A0b = C13988Tno.A0b(user2);
        if (A0b == null) {
            A0b = "";
        }
        W2P A0N = r4.A0N(requireActivity, user2.A03.BsB(), userSession, r8, str8, str10, str7, A002, A0b);
        A0N.A06(str9, str4, str5, str11, str10);
        A0N.A05();
    }

    public final void CpP(CheckoutLaunchParams checkoutLaunchParams) {
        VFA.A00().A04(this.A00.requireActivity(), this.A01, checkoutLaunchParams, "cart");
    }
}

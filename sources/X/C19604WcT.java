package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.model.payments.checkout.CheckoutLaunchParams;
import com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;

/* renamed from: X.WcT  reason: case insensitive filesystem */
public final class C19604WcT implements C20987X8d {
    public final AnonymousClass4DH A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final BottomSheetFragment A03;

    /* JADX WARNING: type inference failed for: r2v0, types: [boolean] */
    public final void Cq1(User user, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        User user2 = user;
        String str10 = str;
        ? A1U = AnonymousClass7TF.A1U(0, user2, str10);
        String str11 = str2;
        0qQ.A0B(str11, 2);
        String str12 = str3;
        0qQ.A0B(str12, 3);
        C331157Pu r4 = this.A03.A02;
        if (r4 != null) {
            String str13 = str6;
            MerchantShoppingCartFragment A0D = C249713kF.A00.A0T().A0D(l, AnonymousClass3ZA.A00(user2), str10, str11, str12, (String) null, str13, str5, str4, (String) null, str7, str8, str9, false, false);
            C331127Pr r6 = new C331127Pr(this.A01);
            DbZ.A0z(this.A00.requireContext(), r6, 2131973759);
            DbS.A1S(r6, A1U);
            r6.A0x = A1U;
            r6.A03 = 0.66f;
            r6.A1O = false;
            0qQ.A0C(A0D, AnonymousClass000.A00(7));
            r6.A0T = A0D;
            int[] iArr = C331127Pr.A1X;
            r6.A04(iArr[0], iArr[A1U], iArr[2], iArr[3]);
            r4.A0F(A0D, r6);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void CqI(Product product, String str, String str2, String str3) {
        AnonymousClass7TF.A1B(str, 1, str2);
        WNN A0L = C249713kF.A00.A0L(this.A00.requireActivity(), this.A01, this.A02, product, "shopping_bag_product_collection", str);
        A0L.A0N = str2;
        A0L.A0Z = true;
        WNN.A01(A0L);
    }

    public final void CqQ(User user, String str, String str2, String str3, String str4) {
        User user2 = user;
        0qQ.A0B(user2, 0);
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        DbZ.A0t(1, str5, str6, str7);
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
        W2P A0N = r4.A0N(requireActivity, user2.A03.BsB(), userSession, r8, str5, str6, "unavailable_product_card", A002, A0b);
        A0N.A06((String) null, str7, str6, (String) null, (String) null);
        A0N.A0L = true;
        A0N.A05();
    }

    public C19604WcT(AnonymousClass4DH r1, UserSession userSession, AnonymousClass4DU r3, BottomSheetFragment bottomSheetFragment) {
        C51972G9s.A1C(bottomSheetFragment, userSession);
        this.A00 = r1;
        this.A03 = bottomSheetFragment;
        this.A02 = r3;
        this.A01 = userSession;
    }

    public final void CpP(CheckoutLaunchParams checkoutLaunchParams) {
        VFA.A00().A04(this.A00.requireActivity(), this.A01, checkoutLaunchParams, "bottom_sheet_index_cart");
    }
}

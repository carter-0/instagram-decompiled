package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.payments.checkout.CheckoutLaunchParams;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.WcU  reason: case insensitive filesystem */
public final class C19605WcU implements C20999X8w {
    public final AnonymousClass4DH A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final BottomSheetFragment A03;

    public final void CqJ(Product product, String str, String str2, String str3, String str4) {
        AnonymousClass7TF.A1B(str, 1, str2);
        WNN A0L = C249713kF.A00.A0L(this.A00.requireActivity(), this.A01, this.A02, product, str3, str);
        A0L.A0N = str2;
        A0L.A0R = str4;
        A0L.A0Z = true;
        WNN.A01(A0L);
    }

    public final void CqR(User user, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        User user2 = user;
        0qQ.A0B(user2, 0);
        String str8 = str;
        String str9 = str2;
        String str10 = str3;
        DbZ.A0t(1, str8, str9, str10);
        String str11 = str6;
        0qQ.A0B(str11, 6);
        C249713kF r5 = C249713kF.A00;
        FragmentActivity requireActivity = this.A00.requireActivity();
        UserSession userSession = this.A01;
        AnonymousClass4DU r9 = this.A02;
        String A002 = AnonymousClass3ZA.A00(user2);
        0qQ.A0A(A002);
        String A0b = C13988Tno.A0b(user2);
        0qQ.A0A(A0b);
        W2P A0N = r5.A0N(requireActivity, user2.A03.BsB(), userSession, r9, str8, str10, str7, A002, A0b);
        A0N.A06(str9, str4, str5, str11, str10);
        A0N.A0L = true;
        A0N.A05();
    }

    public final void CqT(List list, int i, String str) {
        0qQ.A0B(str, 0);
        FragmentActivity requireActivity = this.A00.requireActivity();
        UserSession userSession = this.A01;
        Bundle bundle = new Bundle();
        bundle.putString(AnonymousClass000.A00(2715), str);
        bundle.putString(C66579MXk.A00(4), AnonymousClass000.A00(4184));
        bundle.putBoolean(C66579MXk.A00(14), true);
        Bundle bundle2 = new Bundle();
        bundle2.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.getToken());
        bundle2.putStringArrayList("arg_values", new ArrayList(list));
        bundle2.putInt(Pxd.A00(641), i);
        bundle2.putBoolean(Pxd.A00(640), true);
        bundle.putBundle(AnonymousClass000.A00(610), bundle2);
        AnonymousClass6W8.A06(requireActivity, bundle, TransparentModalActivity.class, "bottom_sheet");
    }

    public final void CqN(User user, String str, String str2) {
        String A002 = AnonymousClass000.A00(171);
        0qQ.A0B(str, 1);
        UserSession userSession = this.A01;
        1a1 A022 = C46447Df9.A02();
        String A003 = AnonymousClass3ZA.A00(user);
        0qQ.A0A(A003);
        C46474Dfc A012 = C46548Dgp.A01(userSession, A003, A002, this.A02.getModuleName());
        A012.A0L = str;
        Bundle A013 = A022.A01(userSession, A012.A04());
        AnonymousClass4DH r0 = this.A00;
        new AnonymousClass6W8(r0.requireActivity(), A013, userSession, ModalActivity.class, "profile").A0C(r0.requireContext());
    }

    public C19605WcU(AnonymousClass4DH r1, UserSession userSession, AnonymousClass4DU r3, BottomSheetFragment bottomSheetFragment) {
        C51972G9s.A1C(bottomSheetFragment, userSession);
        this.A00 = r1;
        this.A03 = bottomSheetFragment;
        this.A02 = r3;
        this.A01 = userSession;
    }

    public final void CpP(CheckoutLaunchParams checkoutLaunchParams) {
        VFA.A00().A04(this.A00.requireActivity(), this.A01, checkoutLaunchParams, "bottom_sheet");
    }
}

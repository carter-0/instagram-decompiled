package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

public final class ESB extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "ShoppingOptionsFragment";
    public UserSession A00;
    public C49642Ezz A01;
    public C49399Ev1 A02;

    public final String getModuleName() {
        return "shopping_business_settings";
    }

    public static void A06(C49642Ezz ezz, AbstractCollection abstractCollection, int i, int i2) {
        abstractCollection.add(new C70966OTn((View.OnClickListener) new FP9(ezz, i), i2));
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public static void A07(ESB esb) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        C49642Ezz ezz = esb.A01;
        UserSession userSession = esb.A00;
        0eE r8 = AnonymousClass0t1.A01;
        User A012 = r8.A01(userSession);
        UserSession userSession2 = ezz.A02;
        List A002 = C47518E6c.A00(userSession2, r8);
        if (A002 != null && A002.contains("POLICY_MIGRATION_SHOPPING_SETTINGS")) {
            A06(ezz, A1C, 35, 2131973805);
        }
        List A003 = C47518E6c.A00(userSession2, r8);
        if (A003 != null && A003.contains("DOMAIN_CHANGE_SHOPPING_SETTINGS")) {
            A06(ezz, A1C, 36, 2131973809);
        }
        Fragment fragment = ezz.A00;
        FragmentActivity fragmentActivity = ezz.A01;
        if (C367088qA.A04(userSession2)) {
            C249713kF.A00.A0E(userSession2).A00(fragment, fragmentActivity);
        }
        List A004 = C47518E6c.A00(userSession2, r8);
        if (A004 != null && A004.contains("SHOP_INVENTORY_SHOPPING_SETTINGS")) {
            A06(ezz, A1C, 34, 2131973802);
            FGF.A01(A1C, 2131973803);
        }
        if (182.A06(0Tu.A05, userSession2, 36314648567810802L)) {
            A06(ezz, A1C, 40, 2131973806);
        }
        A06(ezz, A1C, 41, 2131973804);
        if (C254413sR.A00(userSession2)) {
            A1C.add(new C70966OTn((View.OnClickListener) new FPG(65, (Object) ezz, (Object) A012), 2131962258));
            String string = fragment.getString(2131964884);
            A1C.add(new FGF(AnonymousClass7AV.A00(0cp.A03(AnonymousClass000.A00(298)), string, DbV.A0z(fragment, string, 2131962253))));
        }
        List A005 = C47518E6c.A00(userSession2, r8);
        if (A005 != null && A005.contains("CHECKOUT_SETUP_SHOPPING_SETTINGS")) {
            C49862FAc fAc = new C49862FAc((View.OnClickListener) new FP9(ezz, 37), 2131973807);
            fAc.A03 = DbU.A01(fragmentActivity);
            fAc.A06 = fragment.getString(2131973808);
            A1C.add(fAc);
        }
        List A006 = C47518E6c.A00(userSession2, r8);
        if (A006 != null && A006.contains("CHECKOUT_DEFERRED_PAYOUT_SHOPPING_SETTINGS")) {
            C49862FAc fAc2 = new C49862FAc((View.OnClickListener) new FP9(ezz, 38), 2131973800);
            fAc2.A03 = DbU.A01(fragmentActivity);
            fAc2.A06 = fragment.getString(2131973801);
            A1C.add(fAc2);
        }
        List A007 = C47518E6c.A00(userSession2, r8);
        if (A007 != null && A007.contains("CHECKOUT_UPSELL_SHOPPING_SETTINGS")) {
            C49862FAc fAc3 = new C49862FAc((View.OnClickListener) new FP9(ezz, 39), 2131973807);
            fAc3.A03 = DbU.A01(fragmentActivity);
            fAc3.A06 = fragment.getString(2131973808);
            A1C.add(fAc3);
        }
        esb.setItems(A1C);
    }

    public final void configureActionBar(2da r2) {
        C47518E6c.A04(this, r2, 2131973750);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-226012055);
        super.onCreate(bundle);
        UserSession A0U = DbX.A0U(this);
        this.A00 = A0U;
        C49399Ev1 ev1 = new C49399Ev1(this, A0U);
        this.A02 = ev1;
        this.A01 = new C49642Ezz(this, this.A00, this, ev1);
        AnonymousClass0fD.A09(-604336376, A022);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.ESB, X.07Z, X.2jx, androidx.fragment.app.Fragment, java.lang.Object] */
    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-2129169730);
        super.onResume();
        A07(this);
        Dba.A1I(this.A02.A00, "shopping_business_settings_opened");
        Context requireContext = requireContext();
        0gy A002 = AnonymousClass07i.A00(this);
        UserSession userSession = this.A00;
        C50932FlL flL = new C50932FlL(this, 1);
        0qQ.A0B(userSession, 2);
        1ES.A00(requireContext, A002, C49060Eoe.A00(userSession, new C49396Euy(flL)));
        AnonymousClass0fD.A09(-1302382251, A022);
    }
}

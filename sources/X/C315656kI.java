package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;

/* renamed from: X.6kI  reason: invalid class name and case insensitive filesystem */
public final class C315656kI extends C317766nn {
    public boolean A00;
    public final UserSession A01;
    public final C273414mX A02 = new AnonymousClass6WG(this);

    public static C331127Pr A00(Fragment fragment, C315656kI r2) {
        17k.A0G(fragment instanceof G9c, "Fragment must be an instance of ReelContextSheetHost");
        C331127Pr r1 = new C331127Pr(r2.A01);
        r1.A0U = r2.A02;
        return r1;
    }

    public static void A02(FragmentActivity fragmentActivity, C250973mM r9, C315656kI r10) {
        C255773uh Au5;
        1Xj r4;
        C310216ac r0 = r10.A00;
        if (r0 != null && (Au5 = r0.A04.Au5()) != null && (r4 = Au5.A0b) != null) {
            FragmentActivity fragmentActivity2 = fragmentActivity;
            C249713kF.A00.A0u(fragmentActivity2, r10.A01, r4, r10.A00.A02, r9, r10.A02);
            r10.A00 = true;
            AnonymousClass6a7 r02 = r10.A01;
            if (r02 != null) {
                r02.A01();
            }
        }
    }

    public static void A03(1Xj r29, C250973mM r30, C255783ui r31, Product product, C315656kI r33, String str) {
        String str2;
        2EG r1 = 2EG.A2u;
        1Xj r12 = r29;
        if (C297785sK.A0S(r12)) {
            r1 = 2EG.A3Y;
        } else if (C297785sK.A0Q(r12)) {
            r1 = 2EG.A3e;
        }
        C315656kI r5 = r33;
        C310216ac r0 = r5.A00;
        if (r0 != null) {
            AnonymousClass4DU r13 = r0.A02;
            String obj = r1.toString();
            String str3 = null;
            Product product2 = product;
            if (product != null) {
                str2 = product2.A0F;
                str3 = product2.A0H;
            } else {
                str2 = null;
            }
            UserSession userSession = r5.A01;
            C250973mM r02 = r30;
            C255783ui r3 = r31;
            C233822wX.A04((C257603xf) null, (IntentAwareAdsInfoIntf) null, (0jB) null, (0jB) null, userSession, new C296215pf(userSession, r02.A0H, (String) null, (String) null, r02.A01, r02.A0E), r12, r13, (Boolean) null, (Boolean) null, Float.valueOf(r3.A03), Float.valueOf(r3.A04), (Float) null, Float.valueOf(r3.A02), Float.valueOf(r3.A00), (Float) null, (Integer) null, (Integer) null, (Integer) null, obj, str, str2, str3, (String) null, r5.A00.A02.getModuleName(), (String) null, r12.A15(userSession));
        }
    }

    public C315656kI(UserSession userSession) {
        this.A01 = userSession;
    }

    public static void A01(Context context, Fragment fragment, C315656kI r3) {
        A00(fragment, r3).A00().A03(context, fragment);
        r3.A00 = true;
        AnonymousClass6a7 r0 = r3.A01;
        if (r0 != null) {
            r0.A01();
        }
    }
}

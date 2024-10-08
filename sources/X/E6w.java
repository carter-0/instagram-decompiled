package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;

public final class E6w extends C273374mT implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "QuickPromotionDebugPreviewMegaphoneFragment";
    public View A00;
    public AnonymousClass4UE A01;
    public QuickPromotionSlot A02;

    public final String getModuleName() {
        return "qp_debug_megaphone_preview";
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.setTitle(getString(2131958424));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A1P;
        int A022 = AnonymousClass0fD.A02(541886921);
        0qQ.A0B(layoutInflater, 0);
        E6w.super.onCreateView(layoutInflater, viewGroup, bundle);
        ViewGroup viewGroup2 = (ViewGroup) DbW.A09(layoutInflater, viewGroup, R.layout.quick_promotion_preview_megaphone_fragment, false);
        1YN A002 = AnonymousClass2bO.A00();
        requireContext();
        UserSession session = getSession();
        UserSession session2 = getSession();
        QuickPromotionSlot quickPromotionSlot = this.A02;
        if (quickPromotionSlot != null) {
            C231982sj A03 = A002.A03(this, session, new C47976EPi(session2, this, quickPromotionSlot));
            AnonymousClass4UE r3 = this.A01;
            if (r3 != null) {
                AnonymousClass4UC r32 = (AnonymousClass4UC) r3;
                String str = r32.A09.A00;
                0qQ.A0A(r32);
                if (r32.A08.A00() != null) {
                    A1P = 3;
                } else {
                    A1P = AnonymousClass7TF.A1P(C66579MXk.A00(114).equals(str) ? 1 : 0);
                }
                View view = A03.getView(A1P, (View) null, viewGroup2, this.A01, (Object) null);
                this.A00 = view;
                if (view == null) {
                    0qQ.A0F("megaphoneView");
                    throw AnonymousClass00P.createAndThrow();
                }
                viewGroup2.addView(view);
                AnonymousClass0fD.A09(1539221199, A022);
                return viewGroup2;
            }
            illegalStateException = AnonymousClass7TE.A0z("quickPromotion not set");
            i = 1352689425;
        } else {
            illegalStateException = AnonymousClass7TE.A0z("quickPromotionSlot not set");
            i = 331952951;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }
}

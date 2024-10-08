package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;

public final class E2K extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "QuickPromotionDebugPreviewFloatingBannerFragment";
    public AnonymousClass4UC A00;
    public C322106vG A01;
    public QuickPromotionSlot A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);

    public final String getModuleName() {
        return "qp_debug_floating_banner_preview";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.setTitle(getString(2131958423));
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A022 = AnonymousClass0fD.A02(-774048738);
        E2K.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            i = bundle2.getInt("QP_SLOT");
        } else {
            i = 0;
        }
        this.A02 = QuickPromotionSlot.values()[i];
        AnonymousClass0fD.A09(-1167936093, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        String str;
        int A022 = AnonymousClass0fD.A02(708382353);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.quick_promotion_preview_floating_banner_fragment, viewGroup, false);
        0qQ.A0C(inflate, C273654mx.A00(2));
        ViewGroup viewGroup2 = (ViewGroup) inflate;
        AnonymousClass4UC r3 = this.A00;
        if (r3 == null) {
            i = -585075455;
        } else {
            AnonymousClass2bO.A00();
            this.A01 = new C322106vG();
            UserSession A0l = AnonymousClass7TE.A0l(this.A03);
            QuickPromotionSlot quickPromotionSlot = this.A02;
            if (quickPromotionSlot == null) {
                str = "slot";
            } else {
                C47975EPh ePh = new C47975EPh(A0l, this, quickPromotionSlot);
                C322106vG r0 = this.A01;
                if (r0 == null) {
                    str = "controller";
                } else {
                    r0.A01(viewGroup2, r3, ePh);
                    i = -1417166429;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass0fD.A09(i, A022);
        return viewGroup2;
    }
}

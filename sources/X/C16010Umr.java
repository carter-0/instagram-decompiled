package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* renamed from: X.Umr  reason: case insensitive filesystem */
public final class C16010Umr extends C15996Umd implements AnonymousClass4DU {
    public static final String __redex_internal_original_name = "LeadAdsThankYouScreenFragment";
    public final AnonymousClass0eM A00;

    public final String getModuleName() {
        return "lead_ad_question_page";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return true;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        0qQ.A0B(view, 0);
        W1T.A00(this);
        super.onViewCreated(view, bundle);
        AnonymousClass0eM r6 = this.A00;
        UserSession userSession = ((C16038UnR) r6.getValue()).A04;
        2el r0 = this.A03;
        if (r0 != null) {
            C55943Hq7 hq7 = new C55943Hq7(userSession, r0, this);
            Bundle bundle2 = this.mArguments;
            if (bundle2 != null) {
                i = bundle2.getInt("thank_you_page_index");
            } else {
                i = 0;
            }
            hq7.A00(view, C18490Vsl.A05.A00(this.mArguments, C16610Uy6.A0C, ((C16038UnR) r6.getValue()).A04.A05, i + getParentFragmentManager().A0M()));
            IgTextView igTextView = this.A01;
            if (igTextView != null) {
                C244083ac.A05(igTextView, C244063aa.TITLE);
            }
            IgTextView igTextView2 = this.A00;
            if (igTextView2 != null) {
                C244083ac.A05(igTextView2, C244063aa.CAPTION);
            }
            IgdsBottomButtonLayout igdsBottomButtonLayout = this.A04;
            if (igdsBottomButtonLayout != null) {
                C244083ac.A05(igdsBottomButtonLayout, C244063aa.CTA);
                return;
            }
            return;
        }
        0qQ.A0F("viewpointManager");
        throw AnonymousClass00P.createAndThrow();
    }

    public C16010Umr() {
        C20696WxS wxS = new C20696WxS(this, 24);
        AnonymousClass0eM A002 = C20696WxS.A00(new C20696WxS(this, 21), 0eO.A02, 22);
        this.A00 = new C227862kA(new C20696WxS(A002, 23), wxS, new C73666Phf(43, (Object) null, A002), new 0Yh(C16038UnR.class));
    }
}

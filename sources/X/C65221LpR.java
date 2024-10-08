package X;

import android.view.View;
import com.facebook.common.dextricks.DexOptimization;
import com.facebook.systrace.Systrace;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.sharesheet.update.trial.TrialUseCase;

/* renamed from: X.LpR  reason: case insensitive filesystem */
public final class C65221LpR implements MVS {
    public KHY A00;
    public final AnonymousClass80P A01 = AnonymousClass80P.TRIAL;
    public final AnonymousClass4DH A02;
    public final UserSession A03;
    public final C66576MXh A04;
    public final TrialUseCase A05;
    public final LSk A06;

    public final /* synthetic */ void ADm() {
    }

    public final void CsQ() {
        AnonymousClass4DH r2 = this.A02;
        07U r5 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r2.getViewLifecycleOwner();
        AnonymousClass0xx A002 = AnonymousClass07a.A00(viewLifecycleOwner);
        C66171MGi mGi = new C66171MGi(viewLifecycleOwner, r5, this, (AnonymousClass4D7) null, 8);
        19B r1 = 19B.A00;
        AnonymousClass07Z A0I = JTP.A0I(r2, r1, mGi, A002);
        1Eo.A05(r1, new C66171MGi(A0I, r5, this, (AnonymousClass4D7) null, 9), AnonymousClass07a.A00(A0I));
    }

    public static final void A00(C65221LpR lpR, boolean z) {
        C63212KtJ.A00(lpR.A02.requireActivity(), lpR.A03, lpR.A05.A06().A0N, new MP9(lpR, 13), z);
    }

    public final View ANH() {
        if (Systrace.A0E(1)) {
            0fS.A01("TrialsRowItem.createView", 470860339);
        }
        try {
            LSk.A03(this.A06, DexOptimization.OPT_KEY_CLIENT, "share_sheet", "impression");
            KHY A012 = C64004LIk.A01(this.A02.requireContext(), (Boolean) null, (CharSequence) null, Integer.valueOf(R.drawable.instagram_trial_reel_pano_outline_24), 2131956019);
            this.A00 = A012;
            LYD.A02(A012, 37, this);
            KHY khy = this.A00;
            if (khy == null) {
                0qQ.A0F("trialRow");
                throw AnonymousClass00P.createAndThrow();
            }
            KHY.A02(khy, this, 26);
            return khy;
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(527179188);
            }
        }
    }

    public final C62674Kka B1s() {
        return null;
    }

    public final AnonymousClass80P BHl() {
        return this.A01;
    }

    public C65221LpR(AnonymousClass4DH r2, UserSession userSession, C66576MXh mXh, TrialUseCase trialUseCase) {
        C51974G9v.A1L(r2, userSession, mXh);
        this.A02 = r2;
        this.A03 = userSession;
        this.A05 = trialUseCase;
        this.A04 = mXh;
        this.A06 = LK1.A01(r2, userSession, trialUseCase.A06().A0N);
    }
}

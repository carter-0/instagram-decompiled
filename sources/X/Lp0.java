package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.instagram.android.R;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;

public final class Lp0 implements MVS {
    public KHY A00;
    public final AnonymousClass80P A01 = AnonymousClass80P.LABEL_AS_MADE_WITH_AI;
    public final AnonymousClass4DH A02;
    public final UserSession A03;
    public final C66576MXh A04;
    public final KOM A05;
    public final LMT A06;

    public final /* synthetic */ void ADm() {
    }

    public final View ANH() {
        String str;
        AnonymousClass9OT r4;
        AnonymousClass4DH r5 = this.A02;
        String A16 = AnonymousClass7TE.A16(r5.requireContext(), 2131965659);
        String A162 = AnonymousClass7TE.A16(r5.requireContext(), 2131965660);
        C62146Kaz kaz = new C62146Kaz(this, DbZ.A01(r5));
        SpannableStringBuilder A0C = DbS.A0C(A162);
        AnonymousClass7AV.A05(A0C, kaz, A16);
        Context requireContext = r5.requireContext();
        int i = 2131965661;
        if (JUL.A01(this.A03)) {
            i = 2131965662;
        }
        KHY A012 = C64004LIk.A01(requireContext, AnonymousClass7TE.A0v(), A0C, Integer.valueOf(R.drawable.instagram_third_party_gen_ai_pano_outline_24), i);
        this.A00 = A012;
        KHY.A02(A012, this, 14);
        LYD.A02(A012, 20, this);
        KOM kom = this.A05;
        UserSession userSession = kom.A01;
        String str2 = kom.A03;
        AnonymousClass3Q2 r0 = kom.A00;
        if (r0 != null) {
            str = r0.A3t;
        } else {
            str = null;
        }
        if (kom.A02.A03() == C62462KgC.CLIPS) {
            r4 = AnonymousClass9OT.REEL;
        } else {
            r4 = AnonymousClass9OT.POST;
        }
        C250563lf.A0e(r4, (MediaGenAIDetectionMethod) ((C61080JwI) kom.A05.getValue()).A00, userSession, (Boolean) null, str2, "ig_gen_ai_self_disclosure_sharesheet_impression", str);
        KHY khy = this.A00;
        if (khy != null) {
            return khy;
        }
        0qQ.A0F("labelGenAIOption");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C62674Kka B1s() {
        return null;
    }

    public final AnonymousClass80P BHl() {
        return this.A01;
    }

    public final void CsQ() {
        LMT lmt = this.A06;
        KHY khy = this.A00;
        if (khy == null) {
            0qQ.A0F("labelGenAIOption");
            throw AnonymousClass00P.createAndThrow();
        }
        IgSimpleImageView igSimpleImageView = khy.A0M;
        UserSession userSession = lmt.A01;
        if (igSimpleImageView != null && !lmt.A00) {
            1Av A002 = 1Au.A00(userSession);
            0s0 r0 = A002.A4X;
            AnonymousClass0YZ[] r3 = 1Av.A8a;
            if (!AnonymousClass7TG.A1a(A002, r0, r3, 221)) {
                lmt.A00 = true;
                1Av A003 = 1Au.A00(userSession);
                AnonymousClass7TF.A1J(A003, A003.A4X, r3, 221, true);
                LMT.A00(igSimpleImageView, lmt, (C234222xL) null, C226262fy.ABOVE_ANCHOR, AnonymousClass7TF.A0d(igSimpleImageView.getResources(), 2131971787));
            }
        }
        AnonymousClass4DH r02 = this.A02;
        07U r32 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r02.getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(MHO.A03(viewLifecycleOwner, r32, this, (AnonymousClass4D7) null, 33), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public Lp0(AnonymousClass4DH r2, UserSession userSession, C66576MXh mXh, LMT lmt, KOM kom) {
        C51974G9v.A1L(r2, userSession, lmt);
        0qQ.A0B(mXh, 5);
        this.A02 = r2;
        this.A03 = userSession;
        this.A05 = kom;
        this.A06 = lmt;
        this.A04 = mXh;
    }
}

package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class Lp5 implements MVS {
    public KHY A00;
    public final C62674Kka A01 = C62674Kka.A06;
    public final AnonymousClass80P A02 = AnonymousClass80P.ALLOW_TEMPLATE_ON;
    public final UserSession A03;
    public final KOB A04;
    public final AnonymousClass4DH A05;
    public final boolean A06;

    public final /* synthetic */ void ADm() {
    }

    public final void CsQ() {
        AnonymousClass4DH r0 = this.A05;
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r0.getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C66171MGi(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 5), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final View ANH() {
        AnonymousClass4DH r5 = this.A05;
        SpannableStringBuilder A012 = C64191LSy.A01(r5, this.A03, r5.getModuleName(), DbU.A0m(r5, 2131955890), "https://help.instagram.com/610485296790527/?helpref=search&query=template&search_session_id=258850ea2a3975246b12d955c183932b&sr=3");
        Context requireContext = r5.requireContext();
        Integer num = null;
        if (this.A06) {
            num = Integer.valueOf(R.drawable.instagram_templates_pano_outline_24);
        }
        KHY A013 = C64004LIk.A01(requireContext, AnonymousClass7TE.A0v(), A012, num, 2131955891);
        this.A00 = A013;
        KHY.A02(A013, this, 22);
        return A013;
    }

    public final C62674Kka B1s() {
        return this.A01;
    }

    public final AnonymousClass80P BHl() {
        return this.A02;
    }

    public Lp5(AnonymousClass4DH r2, UserSession userSession, KOB kob, boolean z) {
        C51974G9v.A1L(r2, userSession, kob);
        this.A05 = r2;
        this.A03 = userSession;
        this.A06 = z;
        this.A04 = kob;
    }
}

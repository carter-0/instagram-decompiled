package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lp6  reason: case insensitive filesystem */
public final class C65201Lp6 implements MVS {
    public KHY A00;
    public final AnonymousClass80P A01 = AnonymousClass80P.ALLOW_THIRD_PARTY_DOWNLOADS;
    public final AnonymousClass4DH A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final KOV A05;
    public final boolean A06;

    public final /* synthetic */ void ADm() {
    }

    public final void CsQ() {
        AnonymousClass4DH r0 = this.A02;
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r0.getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C66171MGi(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 6), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final View ANH() {
        AnonymousClass4DH r5 = this.A02;
        SpannableStringBuilder A012 = C64191LSy.A01(r5, this.A04, r5.getModuleName(), DbU.A0m(r5, 2131955386), AnonymousClass000.A00(633));
        Context requireContext = r5.requireContext();
        Integer num = null;
        if (this.A06) {
            num = Integer.valueOf(R.drawable.instagram_download_pano_outline_24);
        }
        KHY A013 = C64004LIk.A01(requireContext, AnonymousClass7TE.A0v(), A012, num, 2131955199);
        this.A00 = A013;
        KHY.A02(A013, this, 23);
        return A013;
    }

    public final C62674Kka B1s() {
        return null;
    }

    public final AnonymousClass80P BHl() {
        return this.A01;
    }

    public C65201Lp6(AnonymousClass4DH r2, AnonymousClass0iw r3, UserSession userSession, KOV kov, boolean z) {
        C51974G9v.A1L(r2, userSession, r3);
        0qQ.A0B(kov, 5);
        this.A02 = r2;
        this.A04 = userSession;
        this.A06 = z;
        this.A03 = r3;
        this.A05 = kov;
    }
}

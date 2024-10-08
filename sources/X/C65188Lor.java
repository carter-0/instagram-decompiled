package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lor  reason: case insensitive filesystem */
public final class C65188Lor implements MVS {
    public final C62674Kka A00 = C62674Kka.A0J;
    public final AnonymousClass80P A01 = AnonymousClass80P.SHOW_CAPTIONS;
    public final UserSession A02;
    public final KOH A03;
    public final AnonymousClass4DH A04;
    public final boolean A05;
    public final boolean A06;

    public final /* synthetic */ void ADm() {
    }

    public final void CsQ() {
    }

    public final View ANH() {
        Integer num;
        AnonymousClass4DH r3 = this.A04;
        UserSession userSession = this.A02;
        String moduleName = r3.getModuleName();
        int i = 2131955307;
        if (this.A06) {
            i = 2131976463;
        }
        SpannableStringBuilder A012 = C64191LSy.A01(r3, userSession, moduleName, DbU.A0m(r3, i), AnonymousClass000.A00(1417));
        Context requireContext = r3.requireContext();
        if (this.A05) {
            num = Integer.valueOf(R.drawable.instagram_text_bg_pano_outline_24);
        } else {
            num = null;
        }
        KHY A013 = C64004LIk.A01(requireContext, AnonymousClass7TE.A0v(), A012, num, 2131954772);
        A013.setChecked(AnonymousClass3WP.A06(userSession));
        KHY.A02(A013, this, 6);
        return A013;
    }

    public final C62674Kka B1s() {
        return this.A00;
    }

    public final AnonymousClass80P BHl() {
        return this.A01;
    }

    public C65188Lor(AnonymousClass4DH r2, UserSession userSession, KOH koh, boolean z, boolean z2) {
        AnonymousClass7TG.A1O(r2, userSession);
        0qQ.A0B(koh, 5);
        this.A04 = r2;
        this.A02 = userSession;
        this.A05 = z;
        this.A06 = z2;
        this.A03 = koh;
    }
}

package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.LpC  reason: case insensitive filesystem */
public final class C65206LpC implements MVS {
    public final C62674Kka A00 = C62674Kka.A0N;
    public final AnonymousClass80P A01 = AnonymousClass80P.TURN_OFF_COMMENTS;
    public final UserSession A02;
    public final 0sP A03;
    public final AnonymousClass4DH A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;

    public final /* synthetic */ void ADm() {
    }

    public final void CsQ() {
    }

    public final View ANH() {
        Integer num;
        Context requireContext = this.A04.requireContext();
        if (this.A07) {
            num = Integer.valueOf(R.drawable.instagram_comments_off_pano_outline_24);
        } else {
            num = null;
        }
        KHY A012 = C64004LIk.A01(requireContext, AnonymousClass7TE.A0v(), this.A05, num, 2131956030);
        A012.setChecked(this.A06);
        KHY.A02(A012, this, 12);
        return A012;
    }

    public final C62674Kka B1s() {
        return this.A00;
    }

    public final AnonymousClass80P BHl() {
        return this.A01;
    }

    public C65206LpC(AnonymousClass4DH r2, UserSession userSession, String str, 0sP r5, boolean z, boolean z2) {
        AnonymousClass7TG.A1O(r2, userSession);
        this.A04 = r2;
        this.A02 = userSession;
        this.A07 = z;
        this.A06 = z2;
        this.A05 = str;
        this.A03 = r5;
    }
}

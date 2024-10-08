package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lok  reason: case insensitive filesystem */
public final class C65181Lok implements MVS {
    public final AnonymousClass80P A00 = AnonymousClass80P.ALLOW_AUDIO_FILTERS;
    public final UserSession A01;
    public final 0sP A02;
    public final AnonymousClass4DH A03;
    public final boolean A04;
    public final boolean A05;

    public final /* synthetic */ void ADm() {
    }

    public final void CsQ() {
    }

    public final View ANH() {
        Integer num;
        AnonymousClass4DH r5 = this.A03;
        SpannableStringBuilder A012 = C64191LSy.A01(r5, this.A01, "share_reels_advanced_settings", DbU.A0m(r5, 2131955240), AnonymousClass000.A00(3249));
        Context requireContext = r5.requireContext();
        if (this.A05) {
            num = Integer.valueOf(R.drawable.instagram_music_effects_pano_outline_24);
        } else {
            num = null;
        }
        KHY A013 = C64004LIk.A01(requireContext, AnonymousClass7TE.A0v(), A012, num, 2131955241);
        A013.setChecked(this.A04);
        KHY.A02(A013, this, 8);
        return A013;
    }

    public final C62674Kka B1s() {
        return null;
    }

    public final AnonymousClass80P BHl() {
        return this.A00;
    }

    public C65181Lok(AnonymousClass4DH r2, UserSession userSession, 0sP r4, boolean z, boolean z2) {
        AnonymousClass7TG.A1O(r2, userSession);
        this.A03 = r2;
        this.A01 = userSession;
        this.A05 = z;
        this.A04 = z2;
        this.A02 = r4;
    }
}

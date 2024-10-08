package X;

import com.instagram.android.R;
import com.instagram.business.instantexperiences.ui.InstantExperiencesAutofillBar;

/* renamed from: X.Fpx  reason: case insensitive filesystem */
public final class C51187Fpx implements Runnable {
    public final /* synthetic */ R8a A00;

    public C51187Fpx(R8a r8a) {
        this.A00 = r8a;
    }

    public final void run() {
        R8a r8a = this.A00;
        InstantExperiencesAutofillBar instantExperiencesAutofillBar = r8a.A00.A00;
        if (instantExperiencesAutofillBar != null) {
            AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(r8a.requireActivity(), DbV.A05(r8a).getString(2131964402));
            A0f.A02();
            A0f.A04(instantExperiencesAutofillBar, 0, DbV.A05(r8a).getDimensionPixelSize(R.dimen.igtv_feed_preview_sound_tooltip_above_anchor_point_y), true);
            A0f.A07(C283255Gu.A07);
            A0f.A0A = true;
            A0f.A00().A07(r8a.getSession());
            r8a.A02 = true;
        }
    }
}

package X;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.74k  reason: invalid class name and case insensitive filesystem */
public final class C3258474k implements C332977Xe {
    public final AnonymousClass7VM A00;
    public final Fragment A01;
    public final UserSession A02;

    public C3258474k(Fragment fragment, UserSession userSession, AnonymousClass7VM r4) {
        0qQ.A0B(fragment, 2);
        0qQ.A0B(r4, 3);
        this.A02 = userSession;
        this.A01 = fragment;
        this.A00 = r4;
    }

    public final SpannableString Cfz(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        C253003q3 r3 = new C253003q3(spannableStringBuilder, this.A02);
        r3.A08 = new C70441O6s(this);
        r3.A0U = true;
        Fragment fragment = this.A01;
        r3.A04 = fragment.requireContext().getColor(2Yu.A0H(fragment.requireContext(), R.attr.igds_color_link));
        r3.A00();
        return SpannableString.valueOf(spannableStringBuilder);
    }
}

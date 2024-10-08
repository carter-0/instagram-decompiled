package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.6Mw  reason: invalid class name and case insensitive filesystem */
public final class C306626Mw implements C2365734g {
    public final /* synthetic */ C306616Mv A00;

    public C306626Mw(C306616Mv r1) {
        this.A00 = r1;
    }

    public final void DKS(View view) {
        0qQ.A0B(view, 0);
        C306616Mv r1 = this.A00;
        View requireViewById = view.requireViewById(R.id.feature_icon);
        0qQ.A0B(requireViewById, 0);
        r1.A00 = requireViewById;
        IgTextView requireViewById2 = view.requireViewById(R.id.title_text);
        0qQ.A0B(requireViewById2, 0);
        r1.A05 = requireViewById2;
        IgTextView requireViewById3 = view.requireViewById(R.id.subtitle_text);
        0qQ.A0B(requireViewById3, 0);
        r1.A04 = requireViewById3;
        IgTextView requireViewById4 = view.requireViewById(R.id.start_survey_button);
        0qQ.A0B(requireViewById4, 0);
        r1.A03 = requireViewById4;
        IgTextView requireViewById5 = view.requireViewById(R.id.skip_survey_text);
        0qQ.A0B(requireViewById5, 0);
        r1.A02 = requireViewById5;
        View requireViewById6 = view.requireViewById(R.id.thank_you_check_icon);
        0qQ.A0B(requireViewById6, 0);
        r1.A01 = requireViewById6;
    }
}

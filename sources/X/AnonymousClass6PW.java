package X;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.6PW  reason: invalid class name */
public final class AnonymousClass6PW implements C2365734g {
    public final /* synthetic */ AnonymousClass6PV A00;

    public AnonymousClass6PW(AnonymousClass6PV r1) {
        this.A00 = r1;
    }

    public final void DKS(View view) {
        0qQ.A0B(view, 0);
        AnonymousClass6PV r1 = this.A00;
        View requireViewById = view.requireViewById(R.id.faqs_in_stories_card_container);
        0qQ.A0B(requireViewById, 0);
        r1.A01 = requireViewById;
        View requireViewById2 = view.requireViewById(R.id.faqs_in_stories_card);
        0qQ.A0B(requireViewById2, 0);
        r1.A00 = requireViewById2;
        IgLinearLayout igLinearLayout = (IgLinearLayout) view.requireViewById(R.id.faqs_in_stories_option_list);
        0qQ.A0B(igLinearLayout, 0);
        r1.A09 = igLinearLayout;
        CircularImageView circularImageView = (CircularImageView) view.requireViewById(R.id.faqs_in_stories_card_avatar_image);
        0qQ.A0B(circularImageView, 0);
        r1.A0A = circularImageView;
        TextView textView = (TextView) view.requireViewById(R.id.faqs_in_stories_card_username);
        0qQ.A0B(textView, 0);
        r1.A06 = textView;
        ConstraintLayout constraintLayout = (ConstraintLayout) view.requireViewById(R.id.faqs_in_stories_card_cta_layout);
        0qQ.A0B(constraintLayout, 0);
        r1.A08 = constraintLayout;
        TextView textView2 = (TextView) view.requireViewById(R.id.faqs_in_stories_card_cta_button);
        0qQ.A0B(textView2, 0);
        r1.A03 = textView2;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) view.requireViewById(R.id.faqs_in_stories_card_without_cta);
        0qQ.A0B(constraintLayout2, 0);
        r1.A07 = constraintLayout2;
        View requireViewById3 = view.requireViewById(R.id.faqs_in_stories_card_dimmer_overlay);
        0qQ.A0B(requireViewById3, 0);
        r1.A02 = requireViewById3;
        TextView textView3 = (TextView) view.requireViewById(R.id.faqs_in_stories_card_disclaimer);
        0qQ.A0B(textView3, 0);
        r1.A04 = textView3;
        TextView textView4 = (TextView) view.requireViewById(R.id.faqs_in_stories_card_disclosure);
        0qQ.A0B(textView4, 0);
        r1.A05 = textView4;
    }
}

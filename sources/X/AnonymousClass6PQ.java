package X;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgButton;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.6PQ  reason: invalid class name */
public final class AnonymousClass6PQ implements C2365734g {
    public final /* synthetic */ AnonymousClass6PP A00;

    public AnonymousClass6PQ(AnonymousClass6PP r1) {
        this.A00 = r1;
    }

    public final void DKS(View view) {
        0qQ.A0B(view, 0);
        AnonymousClass6PP r1 = this.A00;
        View requireViewById = view.requireViewById(R.id.lead_gen_card_container_with_saq);
        0qQ.A0B(requireViewById, 0);
        r1.A00 = requireViewById;
        ConstraintLayout constraintLayout = (ConstraintLayout) view.requireViewById(R.id.lead_gen_card_with_saq_without_cta);
        0qQ.A0B(constraintLayout, 0);
        r1.A05 = constraintLayout;
        CircularImageView circularImageView = (CircularImageView) view.requireViewById(R.id.lead_gen_card_with_saq_avatar_image);
        0qQ.A0B(circularImageView, 0);
        r1.A09 = circularImageView;
        View requireViewById2 = view.requireViewById(R.id.lead_gen_card_with_saq_dimmer_overlay);
        0qQ.A0B(requireViewById2, 0);
        r1.A01 = requireViewById2;
        TextView textView = (TextView) view.requireViewById(R.id.lead_gen_card_with_saq_subtitle);
        0qQ.A0B(textView, 0);
        r1.A04 = textView;
        TextView textView2 = (TextView) view.requireViewById(R.id.lead_gen_card_with_saq_subtitle_cta);
        0qQ.A0B(textView2, 0);
        r1.A03 = textView2;
        IgEditText igEditText = (IgEditText) view.requireViewById(R.id.lead_gen_card_with_saq_question_sticker_answer);
        0qQ.A0B(igEditText, 0);
        r1.A08 = igEditText;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) view.requireViewById(R.id.lead_gen_card_with_saq_cta_layout);
        0qQ.A0B(constraintLayout2, 0);
        r1.A06 = constraintLayout2;
        IgButton igButton = (IgButton) view.requireViewById(R.id.lead_gen_card_with_saq_cta_button);
        0qQ.A0B(igButton, 0);
        r1.A07 = igButton;
        TextView textView3 = (TextView) view.requireViewById(R.id.lead_gen_card_with_saq_disclaimer);
        0qQ.A0B(textView3, 0);
        r1.A02 = textView3;
    }
}

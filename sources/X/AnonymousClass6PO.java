package X;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgButton;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.6PO  reason: invalid class name */
public final class AnonymousClass6PO implements C2365734g {
    public final /* synthetic */ AnonymousClass6PN A00;

    public AnonymousClass6PO(AnonymousClass6PN r1) {
        this.A00 = r1;
    }

    public final void DKS(View view) {
        0qQ.A0B(view, 0);
        AnonymousClass6PN r1 = this.A00;
        View requireViewById = view.requireViewById(R.id.lead_gen_card_container);
        0qQ.A0B(requireViewById, 0);
        r1.A01 = requireViewById;
        View requireViewById2 = view.requireViewById(R.id.lead_gen_card);
        0qQ.A0B(requireViewById2, 0);
        r1.A00 = requireViewById2;
        ConstraintLayout constraintLayout = (ConstraintLayout) view.requireViewById(R.id.lead_gen_card_without_cta);
        0qQ.A0B(constraintLayout, 0);
        r1.A05 = constraintLayout;
        IgImageView requireViewById3 = view.requireViewById(R.id.lead_gen_card_image_background);
        0qQ.A0B(requireViewById3, 0);
        r1.A0A = requireViewById3;
        CircularImageView circularImageView = (CircularImageView) view.requireViewById(R.id.lead_gen_card_avatar_image);
        0qQ.A0B(circularImageView, 0);
        r1.A09 = circularImageView;
        View requireViewById4 = view.requireViewById(R.id.lead_gen_card_dimmer_overlay);
        0qQ.A0B(requireViewById4, 0);
        r1.A02 = requireViewById4;
        TextView textView = (TextView) view.requireViewById(R.id.lead_gen_card_subtitle);
        0qQ.A0B(textView, 0);
        r1.A04 = textView;
        TextView textView2 = (TextView) view.requireViewById(R.id.lead_gen_card_subtitle_cta);
        0qQ.A0B(textView2, 0);
        r1.A03 = textView2;
        IgLinearLayout igLinearLayout = (IgLinearLayout) view.requireViewById(R.id.lead_gen_first_question_option_list);
        0qQ.A0B(igLinearLayout, 0);
        r1.A08 = igLinearLayout;
        IgButton igButton = (IgButton) view.requireViewById(R.id.lead_gen_card_cta_button);
        0qQ.A0B(igButton, 0);
        r1.A07 = igButton;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) view.requireViewById(R.id.lead_gen_card_cta_layout);
        0qQ.A0B(constraintLayout2, 0);
        r1.A06 = constraintLayout2;
    }
}

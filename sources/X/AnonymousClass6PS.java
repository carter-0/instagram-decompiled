package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.form.IgFormField;

/* renamed from: X.6PS  reason: invalid class name */
public final class AnonymousClass6PS implements C2365734g {
    public final /* synthetic */ AnonymousClass6PR A00;

    public AnonymousClass6PS(AnonymousClass6PR r1) {
        this.A00 = r1;
    }

    public final void DKS(View view) {
        0qQ.A0B(view, 0);
        AnonymousClass6PR r1 = this.A00;
        View requireViewById = view.requireViewById(R.id.lead_gen_card_container_with_contact_info_question);
        0qQ.A0B(requireViewById, 0);
        r1.A00 = requireViewById;
        r1.A02 = (ConstraintLayout) view.requireViewById(R.id.lead_gen_card_with_contact_info_question_without_cta);
        View requireViewById2 = view.requireViewById(R.id.lead_gen_card_with_contact_info_question_dimmer_overlay);
        0qQ.A0B(requireViewById2, 0);
        r1.A01 = requireViewById2;
        CircularImageView circularImageView = (CircularImageView) view.requireViewById(R.id.lead_gen_card_with_contact_info_question_avatar_image);
        0qQ.A0B(circularImageView, 0);
        r1.A05 = circularImageView;
        IgFormField igFormField = (IgFormField) view.requireViewById(R.id.lead_gen_card_with_contact_info_question_name);
        0qQ.A0B(igFormField, 0);
        r1.A07 = igFormField;
        IgFormField igFormField2 = (IgFormField) view.requireViewById(R.id.lead_gen_card_with_contact_info_question_email);
        0qQ.A0B(igFormField2, 0);
        r1.A06 = igFormField2;
        ConstraintLayout constraintLayout = (ConstraintLayout) view.requireViewById(R.id.lead_gen_card_with_contact_info_question_cta_layout);
        0qQ.A0B(constraintLayout, 0);
        r1.A03 = constraintLayout;
        IgTextView requireViewById3 = view.requireViewById(R.id.lead_gen_card_with_contact_info_question_cta_button);
        0qQ.A0B(requireViewById3, 0);
        r1.A04 = requireViewById3;
    }
}

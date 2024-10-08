package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.leadgen.core.ui.LeadGenFormSingleMultipleChoiceQuestionView;

/* renamed from: X.UnJ  reason: case insensitive filesystem */
public final class C16030UnJ extends C14898UEa {
    public C15045UKy A00;
    public final CircularImageView A01;
    public final LeadGenFormSingleMultipleChoiceQuestionView A02;

    public C16030UnJ(View view, UserSession userSession) {
        super(view, userSession);
        this.A02 = (LeadGenFormSingleMultipleChoiceQuestionView) AnonymousClass7TF.A0F(view, R.id.multiple_choice_view);
        this.A01 = DbX.A0a(view, R.id.profile_image);
    }
}

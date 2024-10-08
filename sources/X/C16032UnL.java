package X;

import android.text.TextWatcher;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.leadgen.core.ui.LeadGenFormShortAnswerQuestionView;

/* renamed from: X.UnL  reason: case insensitive filesystem */
public final class C16032UnL extends C14898UEa {
    public C15045UKy A00;
    public boolean A01;
    public final CircularImageView A02;
    public final LeadGenFormShortAnswerQuestionView A03;

    public C16032UnL(View view, UserSession userSession) {
        super(view, userSession);
        this.A03 = (LeadGenFormShortAnswerQuestionView) AnonymousClass7TF.A0F(view, R.id.short_answer_view);
        this.A02 = DbX.A0a(view, R.id.profile_image);
    }

    public final void A02() {
        super.A02();
        LeadGenFormShortAnswerQuestionView leadGenFormShortAnswerQuestionView = this.A03;
        TextWatcher textWatcher = leadGenFormShortAnswerQuestionView.A00;
        if (textWatcher != null) {
            DbU.A1E(textWatcher, leadGenFormShortAnswerQuestionView.A01);
            leadGenFormShortAnswerQuestionView.A00 = null;
        }
    }
}

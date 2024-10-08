package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.leadgen.core.ui.LeadGenFormDateTimeQuestionView;

/* renamed from: X.UnM  reason: case insensitive filesystem */
public final class C16033UnM extends C14898UEa {
    public final CircularImageView A00;
    public final LeadGenFormDateTimeQuestionView A01;

    public static final void A01(C15045UKy uKy, C16033UnM unM, String str) {
        boolean z = false;
        LeadGenFormBaseQuestion leadGenFormBaseQuestion = (LeadGenFormBaseQuestion) uKy.A08.get(0);
        if (str == null) {
            str = leadGenFormBaseQuestion.A00;
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout = unM.A09;
        if (igdsBottomButtonLayout != null) {
            0qQ.A0B(leadGenFormBaseQuestion, 0);
            if (str == null) {
                str = leadGenFormBaseQuestion.A00;
            }
            if (!00l.A0W(str) || (uKy.A0A && leadGenFormBaseQuestion.A0I)) {
                z = true;
            }
            igdsBottomButtonLayout.setPrimaryButtonEnabled(z);
        }
    }

    public C16033UnM(View view, UserSession userSession) {
        super(view, userSession);
        this.A01 = (LeadGenFormDateTimeQuestionView) AnonymousClass7TF.A0F(view, R.id.date_time_view);
        this.A00 = DbX.A0a(view, R.id.profile_image);
    }
}

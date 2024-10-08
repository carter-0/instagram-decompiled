package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsButton;

public final class NIY extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "RtcCallSurveyFreeFormFeedbackFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final 0sP A01;
    public final C68299N9m A02;

    public NIY(C68299N9m n9m, 0sP r3) {
        0qQ.A0B(n9m, 1);
        this.A02 = n9m;
        this.A01 = r3;
    }

    public final String getModuleName() {
        return "rtc_call_survey_freeform_feedback_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0d = AnonymousClass7TE.A0d(view, R.id.survey_question);
        View findViewById = view.findViewById(R.id.survey_freeform_edit_text);
        IgdsButton igdsButton = (IgdsButton) view.findViewById(R.id.bottom_button);
        A0d.setText(this.A02.A00);
        findViewById.requestFocus();
        0nA.A0Q(findViewById);
        igdsButton.setText(view.getResources().getString(2131954519));
        C71409Ok8.A01(igdsButton, 28, this, findViewById);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(520382606);
        NIY.super.onCreate(bundle);
        requireArguments();
        AnonymousClass0fD.A09(-248705383, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(756410360);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_call_survey_freeform_feedback_fragment, false);
        AnonymousClass0fD.A09(79514240, A022);
        return A0D;
    }
}

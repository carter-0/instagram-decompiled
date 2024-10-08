package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsButton;

public final class E0b extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "RtcCallSurveyThanksFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final C62320sa A01;

    public final String getModuleName() {
        return "rtc_call_survey_thanks_fragment";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public E0b(C62320sa r2) {
        this.A01 = r2;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1087269138);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_call_survey_thanks_fragment, viewGroup, false);
        TextView A0d = AnonymousClass7TE.A0d(inflate, R.id.survey_thanks_feedback_text);
        IgdsButton igdsButton = (IgdsButton) inflate.findViewById(R.id.bottom_button);
        ImageView A0G = DbS.A0G(inflate, R.id.survey_thanks_image);
        A0d.setText(2131954520);
        igdsButton.setText(inflate.getResources().getString(2131960992));
        FP2.A00(igdsButton, 43, this);
        DbU.A14(inflate.getContext(), A0G, R.color.green_5);
        AnonymousClass0fD.A09(625826234, A02);
        return inflate;
    }
}

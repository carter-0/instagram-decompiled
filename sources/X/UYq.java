package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.io.IOException;

public final class UYq extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "SurveyThanksFragment";
    public UserSession A00;
    public C15257UXr A01;

    public final String getModuleName() {
        String str = this.A01.A05;
        str.getClass();
        return str;
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1811068186);
        UYq.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = DbX.A0U(this);
        String string = requireArguments.getString("ARG_SERIALIZED_SURVEY_DATA");
        try {
            string.getClass();
            this.A01 = DDj.parseFromJson(16P.A00(string));
            AnonymousClass0fD.A09(-808268457, A02);
        } catch (IOException e) {
            RuntimeException runtimeException = new RuntimeException(e);
            AnonymousClass0fD.A09(-2079739854, A02);
            throw runtimeException;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1511996589);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.survey_thanks_bottom_sheet_fragment);
        AnonymousClass0fD.A09(1605130934, A02);
        return A0C;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TextView A0G = DbU.A0G(view, R.id.survey_thanks_title);
        TextView A0G2 = DbU.A0G(view, R.id.survey_thanks_message);
        C45286Ctp ctp = this.A01.A01;
        ctp.getClass();
        AnonymousClass3IJ r0 = ctp.A00;
        if (r0 != null) {
            C270054g7 r1 = new C270054g7(r0);
            A0G.setText(r1.A03());
            A0G2.setText(r1.A02());
            return;
        }
        0qQ.A0F("simpleActionDict");
        throw AnonymousClass00P.createAndThrow();
    }
}

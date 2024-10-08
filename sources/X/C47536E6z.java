package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.Map;

/* renamed from: X.E6z  reason: case insensitive filesystem */
public final class C47536E6z extends C273374mT implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "QuickPromotionDebugSurveyFragment";
    public EditText A00;
    public TextView A01;
    public final Map A02 = AnonymousClass7TE.A1E();

    public static final void A00(C47536E6z e6z) {
        Map map = e6z.A02;
        boolean isEmpty = map.isEmpty();
        TextView textView = e6z.A01;
        if (isEmpty) {
            if (textView != null) {
                textView.setText(2131958434);
                return;
            }
        } else if (textView != null) {
            textView.setText(map.toString());
            return;
        }
        0qQ.A0F("triggerContextDescription");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return "quick_promotion_survey_internal";
    }

    public final void configureActionBar(2da r3) {
        Dbb.A1I(r3);
        r3.setTitle(getString(2131958420));
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A02(AnonymousClass05K.A1F);
        A0K.A0G = FPC.A00(this, 61);
        A0K.A02 = DbU.A01(requireContext());
        r3.AA3(new AnonymousClass3Jb(A0K));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(536722849);
        C47536E6z.super.onCreate(bundle);
        AnonymousClass0fD.A09(-2077658973, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1429096726);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.quick_promotion_launch_survey_fragment, viewGroup, false);
        this.A00 = DbU.A0E(inflate, R.id.integration_point_field);
        this.A01 = DbU.A0G(inflate, R.id.trigger_context_content);
        FPC.A01(AnonymousClass7TF.A0G(inflate, R.id.add_attribute_button), 62, this);
        FPC.A01(AnonymousClass7TF.A0G(inflate, R.id.clear_attributes_button), 63, this);
        AnonymousClass0fD.A09(735035053, A022);
        return inflate;
    }
}

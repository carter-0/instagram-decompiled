package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsRadioButton;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import java.util.Iterator;

/* renamed from: X.Umz  reason: case insensitive filesystem */
public final class C16016Umz extends C14746U6n {
    public final IgTextView A00 = DbT.A0a(this, R.id.multiple_choice_error_text_view);
    public final RadioGroup A01 = ((RadioGroup) requireViewById(R.id.multiple_choice_options));
    public final IgTextView A02 = DbT.A0a(this, R.id.label_text_view);

    public C16016Umz(Context context) {
        super(context, (AttributeSet) null, 0);
        View.inflate(context, R.layout.lead_gen_view_form_multiple_choice, this);
    }

    public final void A0G(LeadGenFormBaseQuestion leadGenFormBaseQuestion, boolean z, boolean z2, boolean z3) {
        CompoundButton compoundButton;
        0qQ.A0B(leadGenFormBaseQuestion, 0);
        this.A02.setText(leadGenFormBaseQuestion.A0A);
        this.A04 = z3;
        RadioGroup radioGroup = this.A01;
        radioGroup.removeAllViews();
        Iterator it = leadGenFormBaseQuestion.A0D.iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            View inflate = DbV.A0D(this).inflate(R.layout.lead_gen_view_form_multiple_choice_option, radioGroup, false);
            if ((inflate instanceof IgdsRadioButton) && (compoundButton = (CompoundButton) inflate) != null) {
                compoundButton.setText(A18);
                if (0qQ.A0K(A18, leadGenFormBaseQuestion.A00)) {
                    compoundButton.setChecked(true);
                }
                compoundButton.setOnCheckedChangeListener(new C18920WCx(leadGenFormBaseQuestion, this, A18, 0));
                radioGroup.addView(compoundButton);
            }
        }
    }
}

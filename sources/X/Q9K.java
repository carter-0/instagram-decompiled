package X;

import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import com.instagram.android.R;

public final class Q9K extends FrameLayout {
    public RadioButton A00;

    public Q9K(Context context) {
        super(context, (AttributeSet) null, 0);
        addView(LayoutInflater.from(context).inflate(R.layout.fbpay_ui_list_cell_right_add_on_radio_button, this, false));
        RadioButton radioButton = (RadioButton) findViewById(R.id.list_cell_right_add_on_radio_button);
        this.A00 = radioButton;
        if (radioButton != null) {
            RH3 rh3 = RH3.A0U;
            RH3 rh32 = RH3.A0T;
            StateListDrawable stateListDrawable = new StateListDrawable();
            SPB A0A = AnonymousClass2E0.A0A();
            int i = rh3.A00;
            int i2 = rh3.A01;
            Context A0S = AnonymousClass7TE.A0S(radioButton);
            stateListDrawable.addState(new int[]{16842912}, A0A.A05(A0S, i, i2));
            stateListDrawable.addState(new int[]{16842908}, AnonymousClass2E0.A0A().A05(A0S, i, i2));
            stateListDrawable.addState(new int[0], AnonymousClass2E0.A0A().A05(A0S, rh32.A00, rh32.A01));
            radioButton.setButtonDrawable(stateListDrawable);
            RadioButton radioButton2 = this.A00;
            if (radioButton2 != null) {
                radioButton2.setEnabled(false);
                RadioButton radioButton3 = this.A00;
                if (radioButton3 != null) {
                    radioButton3.setClickable(false);
                    RadioButton radioButton4 = this.A00;
                    if (radioButton4 != null) {
                        radioButton4.setImportantForAccessibility(2);
                        return;
                    }
                }
            }
        }
        0qQ.A0F("radioButton");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A00() {
        RadioButton radioButton = this.A00;
        if (radioButton == null) {
            0qQ.A0F("radioButton");
            throw AnonymousClass00P.createAndThrow();
        } else {
            radioButton.toggle();
        }
    }

    public final void setChecked(boolean z) {
        RadioButton radioButton = this.A00;
        if (radioButton == null) {
            0qQ.A0F("radioButton");
            throw AnonymousClass00P.createAndThrow();
        } else {
            radioButton.setChecked(z);
        }
    }
}

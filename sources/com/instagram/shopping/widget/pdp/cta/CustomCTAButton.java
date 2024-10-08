package com.instagram.shopping.widget.pdp.cta;

import X.0qQ;
import X.C273014lo;
import X.C273044lr;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.instagram.igds.components.button.IgdsButton;

public final class CustomCTAButton extends IgdsButton {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomCTAButton(Context context) {
        super(context);
        0qQ.A0B(context, 1);
    }

    public final void setCustomRenderer(C273044lr r2) {
        0qQ.A0B(r2, 0);
        this.A01 = r2;
        setStyle(C273014lo.UNKNOWN);
        A01();
    }

    public final int getCalculatedTextWidth() {
        TextView textView = this.A0A;
        CharSequence text = textView.getText();
        if (text == null) {
            return 0;
        }
        return (int) textView.getPaint().measureText(text.toString());
    }

    public final void setTextScale(float f) {
        TextView textView = this.A0A;
        textView.setScaleX(f);
        textView.setScaleY(f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomCTAButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        0qQ.A0B(attributeSet, 2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomCTAButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        0qQ.A0B(attributeSet, 2);
    }
}

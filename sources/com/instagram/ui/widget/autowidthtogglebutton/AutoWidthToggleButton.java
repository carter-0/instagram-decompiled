package com.instagram.ui.widget.autowidthtogglebutton;

import X.0qQ;
import X.C273014lo;
import X.C273084lx;
import X.C71382cm;
import X.C71622eP;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import com.instagram.igds.components.button.IgdsButton;

public final class AutoWidthToggleButton extends IgdsButton {
    public int A00;
    public int A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AutoWidthToggleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    private final void A00(String str) {
        if (str != null) {
            if (this.A04 != null) {
                TextView textView = this.A0A;
                if (Float.compare(textView.getPaint().measureText(str), textView.getPaint().measureText(this.A04)) <= 0) {
                    return;
                }
            }
            this.A04 = str;
        }
    }

    public final String getContentDescriptionOff() {
        return this.A02;
    }

    public final String getContentDescriptionOn() {
        return this.A03;
    }

    public final int getIconOffResId() {
        return this.A00;
    }

    public final int getIconOnResId() {
        return this.A01;
    }

    public final int getMaxWidth() {
        return this.A0A.getMaxWidth();
    }

    public final String getTextOff() {
        return this.A05;
    }

    public final String getTextOn() {
        return this.A06;
    }

    public final void onMeasure(int i, int i2) {
        String str;
        setText(this.A04);
        super.onMeasure(i, i2);
        if (this.A07) {
            str = this.A06;
        } else {
            str = this.A05;
        }
        setText(str);
    }

    public final void setContentDescriptionOff(String str) {
        this.A02 = str;
        if (!this.A07) {
            setContentDescription(str);
        }
    }

    public final void setContentDescriptionOn(String str) {
        this.A03 = str;
        if (this.A07) {
            setContentDescription(str);
        }
    }

    public final void setIconOffResId(int i) {
        this.A00 = i;
        if (!this.A07) {
            A02(C273084lx.END, i);
        }
        invalidate();
    }

    public final void setIconOnResId(int i) {
        this.A01 = i;
        if (this.A07) {
            A02(C273084lx.END, i);
        }
        invalidate();
    }

    public final void setMaxWidth(int i) {
        this.A0A.setMaxWidth(i);
    }

    public final void setTextOff(String str) {
        this.A05 = str;
        if (!this.A07) {
            setText(str);
        }
        A00(str);
        invalidate();
    }

    public final void setTextOn(String str) {
        this.A06 = str;
        if (this.A07) {
            setText(str);
        }
        A00(str);
        invalidate();
    }

    public final void setToggled(boolean z) {
        C273014lo r0;
        String str;
        String str2;
        this.A07 = z;
        if (z) {
            r0 = C273014lo.SECONDARY;
        } else {
            r0 = C273014lo.PRIMARY;
        }
        setStyle(r0);
        if (z) {
            str = this.A06;
        } else {
            str = this.A05;
        }
        setText(str);
        if (z) {
            str2 = this.A03;
        } else {
            str2 = this.A02;
        }
        setContentDescription(str2);
        invalidate();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoWidthToggleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.getTheme().obtainStyledAttributes(attributeSet, C71382cm.A02, i, 0);
        try {
            setToggled(obtainStyledAttributes.getBoolean(2, false));
            setTextOn(C71622eP.A00(context2, obtainStyledAttributes, 4));
            setTextOff(C71622eP.A00(context2, obtainStyledAttributes, 3));
            setContentDescriptionOn(C71622eP.A00(context2, obtainStyledAttributes, 1));
            setContentDescriptionOff(C71622eP.A00(context2, obtainStyledAttributes, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AutoWidthToggleButton(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }
}

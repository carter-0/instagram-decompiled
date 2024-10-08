package com.instagram.common.ui.text;

import X.0mq;
import X.0oh;
import X.0qm;
import X.2eN;
import X.AnonymousClass0fD;
import X.AnonymousClass0qo;
import X.AnonymousClass11c;
import X.AnonymousClass3Tj;
import X.AnonymousClass3UA;
import X.AnonymousClass3UB;
import X.C2364433t;
import X.C70572Rz;
import X.C71382cm;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import java.util.Locale;

@Deprecated
public class TitleTextView extends AnonymousClass3Tj implements 2eN {
    public float A00 = 0.0f;
    public float A01 = 0.0f;
    public int A02 = 0;
    public int A03 = 0;
    public Context A04;
    public boolean A05 = true;
    public boolean A06 = true;
    public final Paint A07 = getPaint();

    public TitleTextView(Context context) {
        super(context, (AttributeSet) null);
        A00(context, (AttributeSet) null, 0);
    }

    private void setTextColorOnDraw(int i) {
        this.A05 = false;
        setTextColor(i);
        this.A05 = true;
    }

    private void A00(Context context, AttributeSet attributeSet, int i) {
        boolean z;
        Typeface A022;
        this.A04 = context;
        boolean z2 = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A2I, i, 0);
        boolean z3 = true;
        if (obtainStyledAttributes.hasValue(6)) {
            z = !obtainStyledAttributes.getBoolean(6, true);
        } else {
            z = true;
        }
        if (obtainStyledAttributes.hasValue(4)) {
            z3 = obtainStyledAttributes.getBoolean(4, true);
        }
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        if (resourceId != 0) {
            setContentDescription(context.getText(resourceId));
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId2 != 0) {
            setHint(context.getText(resourceId2));
        }
        int resourceId3 = obtainStyledAttributes.getResourceId(2, 0);
        if (resourceId3 != 0) {
            setImeActionLabel(context.getText(resourceId3), getImeActionId());
        }
        int resourceId4 = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId4 != 0) {
            setText(context.getText(resourceId4));
        }
        if (C70572Rz.A01) {
            if (obtainStyledAttributes.hasValue(7)) {
                z2 = obtainStyledAttributes.getBoolean(7, false);
            }
            this.A06 = z2;
        }
        obtainStyledAttributes.recycle();
        if (0oh.A08()) {
            if (z) {
                A022 = 0oh.A01(context);
            } else {
                A022 = 0oh.A02(context);
            }
            setTypeface(A022);
        } else {
            setIsBold(z);
        }
        setIsCapitalized(z3);
    }

    public void onDraw(Canvas canvas) {
        try {
            float f = this.A00;
            if (f > 0.0f) {
                this.A07.setShadowLayer(f, 0.0f, 0.0f, this.A02);
                super.onDraw(canvas);
            }
            if (this.A01 > 0.0f) {
                int currentTextColor = getCurrentTextColor();
                Paint paint = this.A07;
                paint.setStyle(Paint.Style.STROKE);
                setTextColorOnDraw(this.A03);
                paint.setStrokeWidth(this.A01);
                paint.setStrokeJoin(Paint.Join.ROUND);
                super.onDraw(canvas);
                paint.setStyle(Paint.Style.FILL);
                setTextColorOnDraw(currentTextColor);
            }
            super.onDraw(canvas);
        } catch (IndexOutOfBoundsException e) {
            if (!0mq.A06(this, getText())) {
                throw e;
            }
        }
    }

    public void setIsCapitalized(boolean z) {
        AnonymousClass3UB r0;
        if (z) {
            Locale locale = getResources().getConfiguration().locale;
            AnonymousClass3UB r02 = AnonymousClass3UB.A01;
            if (r02 == null || !r02.A00.equals(locale)) {
                AnonymousClass3UB.A01 = new AnonymousClass3UB(locale);
            }
            r0 = AnonymousClass3UB.A01;
        } else {
            r0 = null;
        }
        setTransformationMethod(r0);
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (this.A06) {
            charSequence = C2364433t.A00(this, charSequence);
        }
        super.setText(charSequence, bufferType);
    }

    public final void invalidate() {
        int A032 = AnonymousClass0fD.A03(1648149097);
        if (this.A05) {
            super.invalidate();
            this.A05 = true;
        }
        AnonymousClass0fD.A0A(707252735, A032);
    }

    public void setIsBold(boolean z) {
        Typeface typeface;
        if (0oh.A08()) {
            Context context = this.A04;
            if (z) {
                typeface = 0oh.A01(context);
            } else {
                typeface = 0oh.A02(context);
            }
        } else if (!(!AnonymousClass3UA.A00.contains(AnonymousClass11c.A00().A01().A00.getConfiguration().locale.getLanguage()))) {
            getPaint().setFakeBoldText(z);
            return;
        } else if (z) {
            typeface = AnonymousClass0qo.A00(this.A04).A02(0qm.A13);
        } else {
            typeface = null;
        }
        setTypeface(typeface);
    }

    public void setShadowColor(int i) {
        this.A02 = i;
    }

    public void setShadowRadius(float f) {
        this.A00 = f;
    }

    public void setStrokeColor(int i) {
        this.A03 = i;
    }

    public void setStrokeWidth(float f) {
        this.A01 = f;
    }

    public void setTransformText(boolean z) {
        this.A06 = z;
    }

    public TitleTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet, i);
    }

    public TitleTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet, 0);
    }
}

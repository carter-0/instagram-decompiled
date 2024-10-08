package com.instagram.canvas.view.widget;

import X.012;
import X.0nA;
import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C16566UxJ;
import X.C17138VJn;
import X.C19192WOy;
import X.C19193WOz;
import X.VVT;
import X.X1F;
import X.X1G;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import java.util.Map;

public final class RichTextView extends TextView {
    public final void setText(X1F x1f) {
        C16566UxJ uxJ;
        Object styleSpan;
        0qQ.A0B(x1f, 0);
        C19192WOy wOy = (C19192WOy) x1f;
        SpannableString spannableString = new SpannableString(wOy.A00);
        for (VVT vvt : wOy.A01) {
            if (!(vvt == null || (uxJ = vvt.A02) == null)) {
                int ordinal = uxJ.ordinal();
                if (ordinal == 2) {
                    styleSpan = new StyleSpan(1);
                } else if (ordinal == 3) {
                    styleSpan = new StyleSpan(2);
                } else if (ordinal == 4) {
                    styleSpan = new UnderlineSpan();
                } else if (ordinal == 5) {
                    styleSpan = new StrikethroughSpan();
                }
                int i = vvt.A01;
                spannableString.setSpan(styleSpan, i, vvt.A00 + i, 0);
            }
        }
        setText(spannableString);
    }

    public final void setTextDescriptor(X1G x1g) {
        float lineHeight;
        Float A0q;
        Typeface typeface;
        0qQ.A0B(x1g, 0);
        C19193WOz wOz = (C19193WOz) x1g;
        setTextColor(wOz.A01);
        String str = wOz.A02;
        if (str != null) {
            Map map = C17138VJn.A00;
            if (!map.containsKey(str) || (typeface = (Typeface) map.get(str)) == null) {
                typeface = Typeface.DEFAULT;
            }
            0qQ.A0A(typeface);
            setTypeface(typeface);
        }
        String str2 = wOz.A03;
        if (!(str2 == null || (A0q = 012.A0q(str2)) == null)) {
            setTextSize(2, A0q.floatValue());
        }
        int i = wOz.A00;
        if (i <= 0) {
            setMaxLines(Integer.MAX_VALUE);
            setSingleLine(false);
        } else {
            if (i == 1) {
                setSingleLine(true);
            } else {
                setMaxLines(i);
            }
            setEllipsize(TextUtils.TruncateAt.END);
        }
        String str3 = wOz.A04;
        if (str3 != null) {
            Context A0S = AnonymousClass7TE.A0S(this);
            int parseInt = Integer.parseInt(str3);
            RectF rectF = 0nA.A01;
            int i2 = (int) ((((float) parseInt) * AnonymousClass7TF.A0E(A0S).scaledDensity) + 0.5f);
            if (i2 <= 0) {
                lineHeight = 0.0f;
            } else {
                lineHeight = (float) (i2 - (getLineHeight() - ((int) getLineSpacingExtra())));
            }
            setLineSpacing(lineHeight, 1.0f);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RichTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass7TG.A1O(context, attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RichTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass7TG.A1O(context, attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RichTextView(Context context) {
        super(context);
        0qQ.A0B(context, 1);
    }
}

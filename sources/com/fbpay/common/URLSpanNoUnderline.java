package com.fbpay.common;

import X.0qQ;
import android.text.TextPaint;
import android.text.style.URLSpan;

public abstract class URLSpanNoUnderline extends URLSpan {
    public final void updateDrawState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}

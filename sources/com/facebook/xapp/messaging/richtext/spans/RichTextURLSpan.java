package com.facebook.xapp.messaging.richtext.spans;

import X.0qQ;
import android.text.TextPaint;
import android.text.style.URLSpan;

public final class RichTextURLSpan extends URLSpan {
    public final Integer A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RichTextURLSpan(String str, Integer num) {
        super(str);
        0qQ.A0B(str, 1);
        this.A00 = num;
    }

    public final void updateDrawState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        super.updateDrawState(textPaint);
        Integer num = this.A00;
        if (num != null) {
            textPaint.setColor(num.intValue());
            textPaint.setFakeBoldText(true);
            textPaint.setUnderlineText(false);
        }
    }
}

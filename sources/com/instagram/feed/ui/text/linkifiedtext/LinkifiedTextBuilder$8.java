package com.instagram.feed.ui.text.linkifiedtext;

import X.C253003q3;
import X.MSP;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

public class LinkifiedTextBuilder$8 extends URLSpan {
    public final /* synthetic */ C253003q3 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LinkifiedTextBuilder$8(C253003q3 r1, String str) {
        super(str);
        this.A00 = r1;
    }

    public final void onClick(View view) {
        MSP msp;
        String url = getURL();
        if (url == null || (msp = this.A00.A0B) == null) {
            super.onClick(view);
        } else {
            msp.D3J(url);
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        int i = this.A00.A04;
        if (i != 0) {
            textPaint.setColor(i);
        }
    }
}

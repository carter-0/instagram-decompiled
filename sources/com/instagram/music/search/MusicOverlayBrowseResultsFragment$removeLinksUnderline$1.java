package com.instagram.music.search;

import X.0qQ;
import android.text.TextPaint;
import android.text.style.URLSpan;

public final class MusicOverlayBrowseResultsFragment$removeLinksUnderline$1 extends URLSpan {
    public final void updateDrawState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }

    public MusicOverlayBrowseResultsFragment$removeLinksUnderline$1(String str) {
        super(str);
    }
}

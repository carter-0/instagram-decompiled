package com.instagram.reels.chat.view;

import X.0qQ;
import X.C59988Jcx;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgEditText;

public final class SpeechBubbleEditText extends IgEditText {
    public final C59988Jcx A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpeechBubbleEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, R.style.EditTextStyle);
        0qQ.A0B(context, 1);
        C59988Jcx jcx = new C59988Jcx(context, context.getResources().getDimensionPixelSize(R.dimen.chat_sticker_width), 0, "");
        this.A00 = jcx;
        setBackground(jcx);
    }

    public final boolean onPreDraw() {
        this.A00.setBounds(new Rect(0, 0, getWidth(), getHeight()));
        return super.onPreDraw();
    }
}

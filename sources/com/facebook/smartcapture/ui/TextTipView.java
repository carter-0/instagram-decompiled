package com.facebook.smartcapture.ui;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C11408SSf;
import X.SKW;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.smartcapture.logging.IdCaptureLogger;
import com.instagram.android.R;
import java.util.Map;

public final class TextTipView extends FrameLayout {
    public IdCaptureLogger A00;
    public final ImageView A01 = SKW.A01(this, R.id.iv_tip_icon);
    public final ProgressBar A02;
    public final TextView A03 = SKW.A02(this, R.id.tv_tip_description);
    public final TextView A04 = SKW.A02(this, R.id.tv_tip_title);
    public final Map A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextTipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        View.inflate(context, R.layout.text_tip_view, this);
        SKW.A00(this, R.id.rl_text_tip_container).setBackgroundTintList(ColorStateList.valueOf(C11408SSf.A01(AnonymousClass7TE.A0S(this), R.attr.sc_always_white)));
        ProgressBar progressBar = (ProgressBar) SKW.A00(this, R.id.pb_text_tip);
        this.A02 = progressBar;
        C11408SSf.A03(context, progressBar, R.attr.sc_accent);
        this.A05 = AnonymousClass7TE.A1E();
    }
}

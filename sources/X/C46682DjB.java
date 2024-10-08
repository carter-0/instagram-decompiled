package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.DjB  reason: case insensitive filesystem */
public final class C46682DjB extends ClickableSpan {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;

    public final void updateDrawState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        super.updateDrawState(textPaint);
        int color = this.A00.getColor(R.color.design_dark_default_color_on_background);
        textPaint.setUnderlineText(false);
        textPaint.setFakeBoldText(true);
        textPaint.setColor(color);
    }

    public C46682DjB(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }

    public final void onClick(View view) {
        C49906FEe fEe = SimpleWebViewActivity.A02;
        Context context = this.A00;
        fEe.A02(context, this.A01, new SimpleWebViewConfig((String) null, (String) null, true, false, false, false, false, true, false, false, true, false, false, false, context.getString(2131964888), SQU.A01(context, "https://help.instagram.com/227486307449481")));
    }
}

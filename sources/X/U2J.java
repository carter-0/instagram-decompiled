package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class U2J extends ClickableSpan {
    public final Context A00;
    public final Uri A01;
    public final UserSession A02;
    public final boolean A03;

    public final void onClick(View view) {
        0qQ.A0B(view, 0);
        if (this.A03) {
            0kR.A0F(this.A00, this.A01);
            return;
        }
        Context context = view.getContext();
        0qQ.A0C(context, "null cannot be cast to non-null type android.app.Activity");
        new SUL(context, this.A02, 2EG.A2C, this.A01.toString(), false).A0A();
    }

    public final void updateDrawState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        textPaint.setUnderlineText(false);
        textPaint.setFakeBoldText(false);
        textPaint.setColor(textPaint.linkColor);
    }

    public U2J(Context context, Uri uri, UserSession userSession, boolean z) {
        AnonymousClass7TG.A1U(uri, userSession, context);
        this.A01 = uri;
        this.A02 = userSession;
        this.A00 = context;
        this.A03 = z;
    }
}

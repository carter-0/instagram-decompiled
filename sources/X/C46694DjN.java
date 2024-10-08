package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.DjN  reason: case insensitive filesystem */
public final class C46694DjN extends ClickableSpan {
    public final Context A00;
    public final UserSession A01;
    public final 2EG A02;
    public final String A03;

    public final void updateDrawState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        Context context = this.A00;
        AnonymousClass7TE.A1N(context, textPaint, 2Yu.A06(context));
    }

    public final void onClick(View view) {
        Dbb.A0k(this.A00, this.A01, this.A02, this.A03);
    }

    public C46694DjN(Context context, UserSession userSession, 2EG r3, String str) {
        this.A00 = context;
        this.A01 = userSession;
        this.A03 = str;
        this.A02 = r3;
    }
}

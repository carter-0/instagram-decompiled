package X;

import android.app.Activity;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.DjM  reason: case insensitive filesystem */
public final class C46693DjM extends ClickableSpan {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 1pw A02;
    public final /* synthetic */ C62320sa A03;

    public final void onClick(View view) {
        0qQ.A0B(view, 0);
        0nA.A0N(view);
        Activity activity = this.A00;
        C331127Pr A0W = DbS.A0W(this.A01);
        A0W.A1C = false;
        A0W.A00().A02(activity, new C54158H1c());
        this.A03.invoke();
    }

    public final void updateDrawState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.setColor(textPaint.linkColor);
        textPaint.setFakeBoldText(true);
        textPaint.setUnderlineText(false);
    }

    public C46693DjM(Activity activity, UserSession userSession, 1pw r3, C62320sa r4) {
        this.A02 = r3;
        this.A00 = activity;
        this.A01 = userSession;
        this.A03 = r4;
    }
}

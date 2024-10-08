package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.DjV  reason: case insensitive filesystem */
public final class C46702DjV extends ClickableSpan {
    public final /* synthetic */ int A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C255773uh A02;
    public final /* synthetic */ C250973mM A03;
    public final /* synthetic */ C309426Yf A04;
    public final /* synthetic */ C309786Zp A05;

    public final void onClick(View view) {
        0qQ.A0B(view, 0);
        C238833Dp.A00(this.A01).A0B(view, new String[0]);
        this.A05.DWG(this.A02, this.A03, this.A04);
    }

    public C46702DjV(UserSession userSession, C255773uh r2, C250973mM r3, C309426Yf r4, C309786Zp r5, int i) {
        this.A01 = userSession;
        this.A05 = r5;
        this.A03 = r3;
        this.A02 = r2;
        this.A04 = r4;
        this.A00 = i;
    }

    public final void updateDrawState(TextPaint textPaint) {
        DbW.A0u(textPaint);
        textPaint.setColor(this.A00);
    }
}

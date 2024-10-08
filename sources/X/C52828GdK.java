package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.GdK  reason: case insensitive filesystem */
public final class C52828GdK extends ClickableSpan {
    public final /* synthetic */ int A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C242813Wa A02;
    public final /* synthetic */ AnonymousClass3W1 A03;
    public final /* synthetic */ String A04;

    public final void onClick(View view) {
        0qQ.A0B(view, 0);
        UserSession userSession = this.A01;
        C238833Dp.A00(userSession).A0B(view, new String[0]);
        1Xj A012 = 1E8.A03.A01(userSession, "MediaHeaderHelper", this.A04);
        if (A012 != null) {
            this.A02.D2J(A012, this.A03, this.A00);
        }
    }

    public C52828GdK(UserSession userSession, C242813Wa r2, AnonymousClass3W1 r3, String str, int i) {
        this.A01 = userSession;
        this.A04 = str;
        this.A02 = r2;
        this.A03 = r3;
        this.A00 = i;
    }

    public final void updateDrawState(TextPaint textPaint) {
        DbW.A0u(textPaint);
        textPaint.setFakeBoldText(true);
    }
}

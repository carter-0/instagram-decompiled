package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.DjW  reason: case insensitive filesystem */
public final class C46703DjW extends ClickableSpan {
    public final /* synthetic */ int A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C255773uh A02;
    public final /* synthetic */ C250973mM A03;
    public final /* synthetic */ AnonymousClass3BQ A04;
    public final /* synthetic */ C309426Yf A05;
    public final /* synthetic */ C309406Yd A06;
    public final /* synthetic */ C309786Zp A07;
    public final /* synthetic */ AnonymousClass6PC A08;

    public C46703DjW(UserSession userSession, C255773uh r2, C250973mM r3, AnonymousClass3BQ r4, C309426Yf r5, C309406Yd r6, C309786Zp r7, AnonymousClass6PC r8, int i) {
        this.A01 = userSession;
        this.A08 = r8;
        this.A07 = r7;
        this.A03 = r3;
        this.A05 = r5;
        this.A02 = r2;
        this.A04 = r4;
        this.A06 = r6;
        this.A00 = i;
    }

    public final void onClick(View view) {
        UserSession userSession = this.A01;
        AnonymousClass6PC r7 = this.A08;
        C309786Zp r6 = this.A07;
        C307366Pv.A02(userSession, this.A02, this.A03, this.A04, this.A05, this.A06, r6, r7);
    }

    public final void updateDrawState(TextPaint textPaint) {
        DbW.A0u(textPaint);
        textPaint.setColor(this.A00);
    }
}

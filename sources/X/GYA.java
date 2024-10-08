package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class GYA extends ClickableSpan {
    public final /* synthetic */ C244023aW A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C2803551k A02;
    public final /* synthetic */ C2803451j A03;
    public final /* synthetic */ AnonymousClass3W1 A04;

    public final void onClick(View view) {
        0qQ.A0B(view, 0);
        if (182.A06(0Tu.A05, this.A01, 36320579917259405L)) {
            this.A00.onClick(view);
        } else {
            this.A02.A00(this.A03, this.A04);
        }
    }

    public GYA(C244023aW r1, UserSession userSession, C2803551k r3, C2803451j r4, AnonymousClass3W1 r5) {
        this.A01 = userSession;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
    }

    public final void updateDrawState(TextPaint textPaint) {
        DbW.A0u(textPaint);
    }
}

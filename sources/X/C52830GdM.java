package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.GdM  reason: case insensitive filesystem */
public final class C52830GdM extends ClickableSpan {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C381829cQ A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C243683Zu A03;
    public final /* synthetic */ C242813Wa A04;
    public final /* synthetic */ AnonymousClass3W1 A05;

    public final void updateDrawState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        textPaint.setUnderlineText(false);
        textPaint.setFakeBoldText(false);
        textPaint.setColor(this.A03.A04);
    }

    public C52830GdM(C381829cQ r1, UserSession userSession, C243683Zu r3, C242813Wa r4, AnonymousClass3W1 r5, int i) {
        this.A01 = r1;
        this.A04 = r4;
        this.A05 = r5;
        this.A02 = userSession;
        this.A00 = i;
        this.A03 = r3;
    }

    public final void onClick(View view) {
        1Xj A002 = ((AnonymousClass3ZT) this.A01.A03).A00();
        C242813Wa r1 = this.A04;
        AnonymousClass3W1 r3 = this.A05;
        UserSession userSession = this.A02;
        int i = this.A00;
        User A2A = A002.A2A(userSession);
        if (A2A != null) {
            r1.D3K(A002, r3, A2A.getId(), i, false);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}

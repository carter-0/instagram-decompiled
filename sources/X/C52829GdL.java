package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.user.model.User;

/* renamed from: X.GdL  reason: case insensitive filesystem */
public final class C52829GdL extends ClickableSpan {
    public final /* synthetic */ 1Xj A00;
    public final /* synthetic */ C243683Zu A01;
    public final /* synthetic */ C242813Wa A02;
    public final /* synthetic */ AnonymousClass3W1 A03;
    public final /* synthetic */ User A04;

    public C52829GdL(1Xj r1, C243683Zu r2, C242813Wa r3, AnonymousClass3W1 r4, User user) {
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
        this.A04 = user;
        this.A01 = r2;
    }

    public final void onClick(View view) {
        C242813Wa r1 = this.A02;
        1Xj r2 = this.A00;
        AnonymousClass3W1 r3 = this.A03;
        r1.D3K(r2, r3, this.A04.getId(), r3.getPosition(), false);
    }

    public final void updateDrawState(TextPaint textPaint) {
        DbW.A0u(textPaint);
        textPaint.setColor(this.A01.A09);
    }
}

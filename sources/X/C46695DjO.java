package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.DjO  reason: case insensitive filesystem */
public final class C46695DjO extends ClickableSpan {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ User A03;

    public final void updateDrawState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        Context context = this.A00;
        AnonymousClass7TE.A1N(context, textPaint, 2Yu.A08(context));
    }

    public C46695DjO(Context context, AnonymousClass0iw r2, UserSession userSession, User user) {
        this.A02 = userSession;
        this.A01 = r2;
        this.A03 = user;
        this.A00 = context;
    }

    public final void onClick(View view) {
        UserSession userSession = this.A02;
        AnonymousClass0iw r1 = this.A01;
        User user = this.A03;
        C319976rX.A06(r1, userSession, Dbb.A0O(userSession, user), "tap_business_social_proof_badge", userSession.A06, "user_profile_header");
        C48752Ejb.A00(this.A00, user.A20());
    }
}

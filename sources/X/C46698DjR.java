package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.DjR  reason: case insensitive filesystem */
public final class C46698DjR extends ClickableSpan {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ AnonymousClass70J A03;
    public final /* synthetic */ User A04;

    public final void updateDrawState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        Context context = this.A00;
        AnonymousClass7TE.A1N(context, textPaint, 2Yu.A06(context));
    }

    public C46698DjR(Context context, AnonymousClass0iw r2, UserSession userSession, AnonymousClass70J r4, User user) {
        this.A03 = r4;
        this.A04 = user;
        this.A02 = userSession;
        this.A01 = r2;
        this.A00 = context;
    }

    public final void onClick(View view) {
        Long l;
        AnonymousClass70J r0 = this.A03;
        if (r0 != null) {
            C50672FgX A022 = r0.A02();
            User user = this.A04;
            A022.A0E(user, false);
            UserSession userSession = this.A02;
            AnonymousClass0iw r1 = this.A01;
            String str = userSession.A06;
            String pkId = user.A03.getPkId();
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r1, userSession), "instagram_open_to_collab_surface_profile_badge_tap");
            if (A0e.isSampled()) {
                A0e.A9F(C273654mx.A00(116), 00y.A0n(10, str));
                if (pkId != null) {
                    l = 00y.A0n(10, pkId);
                } else {
                    l = null;
                }
                A0e.A9F(C273654mx.A00(410), l);
                A0e.Cgf();
            }
        }
    }
}

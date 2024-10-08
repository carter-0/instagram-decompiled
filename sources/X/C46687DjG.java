package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.common.dextricks.DexOptimization;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.DjG  reason: case insensitive filesystem */
public final class C46687DjG extends ClickableSpan {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass70J A01;
    public final /* synthetic */ User A02;

    public final void updateDrawState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        Context context = this.A00;
        AnonymousClass7TE.A1N(context, textPaint, 2Yu.A08(context));
    }

    public C46687DjG(Context context, AnonymousClass70J r2, User user) {
        this.A01 = r2;
        this.A02 = user;
        this.A00 = context;
    }

    public final void onClick(View view) {
        C50672FgX A022;
        AnonymousClass70J r0 = this.A01;
        if (r0 != null && (A022 = r0.A02()) != null) {
            User user = this.A02;
            DbY.A0t();
            1pi A002 = C66631pj.A00();
            UserSession userSession = A022.A02;
            A002.EuR(A022.A04, userSession, user, "label_view", false);
            C66631pj.A00();
            long parseLong = Long.parseLong(userSession.A06);
            0Aj A0e = AnonymousClass7TE.A0e(((LCQ) userSession.A01(LCQ.class, new MMF(userSession, 43))).A00, AnonymousClass000.A00(304));
            A0e.A9F("ig_userid", Long.valueOf(parseLong));
            A0e.AAJ("product", "profile");
            Dba.A1B(A0e, "step", "diversity_info_label");
            A0e.AAJ("event_source", DexOptimization.OPT_KEY_CLIENT);
            A0e.Cgf();
        }
    }
}

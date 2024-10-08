package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fsh  reason: case insensitive filesystem */
public final class C51349Fsh implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C46831Dm7 A01;

    public C51349Fsh(View view, C46831Dm7 dm7) {
        this.A01 = dm7;
        this.A00 = view;
    }

    public final void run() {
        C46831Dm7 dm7 = this.A01;
        Context context = dm7.A01;
        0qQ.A0C(context, "null cannot be cast to non-null type android.app.Activity");
        AnonymousClass5Gt A0e = AnonymousClass7TG.A0e((Activity) context, 2131956637);
        A0e.A03(this.A00);
        A0e.A02();
        A0e.A00 = 5000;
        A0e.A0A = true;
        DbU.A1T(A0e);
        UserSession userSession = dm7.A02;
        0xY A0N = AnonymousClass7TF.A0N(userSession);
        A0N.E5T("has_seen_content_note_create_tooltip", true);
        A0N.apply();
        C247323g9.A00(userSession).A02();
    }
}

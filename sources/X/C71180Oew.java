package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.Oew  reason: case insensitive filesystem */
public final class C71180Oew implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass921 A00;

    public C71180Oew(AnonymousClass921 r1) {
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass921 r1 = this.A00;
        UserSession userSession = r1.A05;
        AnonymousClass924 r3 = r1.A06;
        boolean A1Y = C51970G9q.A1Y(r3);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("users/set_limited_interactions_settings/");
        A0a.A9m("is_enabled", String.valueOf(A1Y));
        1OC A0S = DbU.A0S(A0a, NHQ.class, ORP.class);
        A0S.A00 = r3;
        1ES.A03(A0S);
    }
}

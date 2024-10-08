package X;

import android.content.DialogInterface;
import com.instagram.api.schemas.LimitedInteractionsVersions;
import com.instagram.common.session.UserSession;

/* renamed from: X.Oeu  reason: case insensitive filesystem */
public final class C71178Oeu implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass921 A00;

    public C71178Oeu(AnonymousClass921 r1) {
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        I4R i4r = I4R.A00;
        AnonymousClass921 r4 = this.A00;
        UserSession userSession = r4.A05;
        i4r.A01(r4.A00, AnonymousClass0kN.A02(userSession), r4.A09, "reminder_turnoff");
        LimitedInteractionsVersions limitedInteractionsVersions = r4.A00;
        AnonymousClass925 r42 = r4.A07;
        AnonymousClass7TG.A1O(limitedInteractionsVersions, r42);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("users/set_limited_interactions_settings/");
        A0a.A9m("is_enabled", "false");
        A0a.A9m("version", limitedInteractionsVersions.toString());
        1OC A0S = DbU.A0S(A0a, NHQ.class, ORP.class);
        A0S.A00 = r42;
        1ES.A03(A0S);
    }
}

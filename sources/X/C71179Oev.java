package X;

import android.content.DialogInterface;
import com.instagram.api.schemas.LimitedInteractionsVersions;
import com.instagram.common.session.UserSession;
import java.util.TimeZone;

/* renamed from: X.Oev  reason: case insensitive filesystem */
public final class C71179Oev implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass921 A00;

    public C71179Oev(AnonymousClass921 r1) {
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        I4R i4r = I4R.A00;
        AnonymousClass921 r6 = this.A00;
        UserSession userSession = r6.A05;
        i4r.A01(r6.A00, AnonymousClass0kN.A02(userSession), r6.A09, "reminder_extend");
        long currentTimeMillis = System.currentTimeMillis();
        LimitedInteractionsVersions limitedInteractionsVersions = r6.A00;
        AnonymousClass926 r62 = r6.A08;
        AnonymousClass7TG.A1Q(limitedInteractionsVersions, r62);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("users/set_limited_interactions_settings/");
        A0a.A0C("reminder_date", (int) (AnonymousClass7TE.A0P(currentTimeMillis - ((((long) TimeZone.getDefault().getOffset(currentTimeMillis)) + currentTimeMillis) % 86400000)) + 604800));
        A0a.A9m("version", limitedInteractionsVersions.toString());
        1OC A0S = DbU.A0S(A0a, NHQ.class, ORP.class);
        A0S.A00 = r62;
        1ES.A03(A0S);
    }
}

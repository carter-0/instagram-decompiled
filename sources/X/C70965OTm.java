package X;

import android.content.Context;
import android.content.Intent;
import com.instagram.common.session.UserSession;

/* renamed from: X.OTm  reason: case insensitive filesystem */
public final class C70965OTm {
    public C255273tr A00;
    public C331157Pu A01;
    public Integer A02;
    public String A03;
    public final Context A04;
    public final UserSession A05;
    public final C70475O8a A06;
    public final OWQ A07;

    public static final void A00(C70965OTm oTm) {
        AnonymousClass14B A002 = AnonymousClass14B.A03.A00();
        Context context = oTm.A04;
        Intent flags = A002.A04(context, DbT.A09("instagram://suggested_reply")).setFlags(268435456);
        0qQ.A07(flags);
        0kR.A0B(context, flags);
    }

    public C70965OTm(Context context, UserSession userSession, C70475O8a o8a, OWQ owq) {
        this.A05 = userSession;
        this.A04 = context;
        this.A07 = owq;
        this.A06 = o8a;
    }
}

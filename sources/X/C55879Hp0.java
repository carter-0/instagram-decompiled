package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Hp0  reason: case insensitive filesystem */
public final class C55879Hp0 {
    public final C54190H2k A00;
    public final H34 A01;
    public final UserSession A02;
    public final String A03;
    public final 05G A04 = C51970G9q.A10(false);
    public final 05G A05 = C51967G9n.A0u();
    public final 05G A06 = C51970G9q.A10(true);
    public final Context A07;
    public final AnonymousClass07i A08;
    public final AnonymousClass0iw A09;

    public C55879Hp0(Context context, AnonymousClass07i r10, C54190H2k h2k, AnonymousClass0iw r12, UserSession userSession, String str) {
        DbW.A1N(str, 1, r10);
        this.A07 = context;
        this.A02 = userSession;
        this.A09 = r12;
        this.A08 = r10;
        this.A00 = h2k;
        this.A03 = AnonymousClass7TE.A16(context, 2131973123);
        IM3 im3 = new IM3(str);
        H34 h34 = new H34(context, r10, im3, r12, userSession, 2);
        this.A01 = h34;
        h34.A03(new IMW(this, 2));
    }
}

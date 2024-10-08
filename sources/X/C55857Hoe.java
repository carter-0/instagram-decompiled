package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Hoe  reason: case insensitive filesystem */
public final class C55857Hoe {
    public final C54082Gz6 A00;
    public final 05G A01 = C51967G9n.A0u();
    public final 05G A02 = C51970G9q.A10(false);
    public final Context A03;
    public final AnonymousClass07i A04;
    public final AnonymousClass0iw A05;
    public final UserSession A06;

    public C55857Hoe(Context context, AnonymousClass07i r5, AnonymousClass0iw r6, UserSession userSession) {
        0qQ.A0B(r5, 4);
        this.A03 = context;
        this.A06 = userSession;
        this.A05 = r6;
        this.A04 = r5;
        C54082Gz6 gz6 = new C54082Gz6(context, r5, r6, userSession);
        this.A00 = gz6;
        gz6.A03(new IMW(this, 0));
    }
}

package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.LqG  reason: case insensitive filesystem */
public abstract class C65261LqG implements C41840B2v {
    public final Context A00;
    public final UserSession A01;
    public final 2Er A02;
    public final C262224Cq A03;
    public final C249513ju A04;
    public final AnonymousClass0r6 A05;
    public final 05G A06 = DbS.A10(C62463KgD.IDLE);

    public final int A01() {
        2Er r0 = this.A02;
        if (r0 != null) {
            return r0.AdN();
        }
        return 0;
    }

    public final String A02() {
        2Er r0 = this.A02;
        if (r0 != null) {
            return r0.C6C();
        }
        return null;
    }

    public final String A03() {
        2Er r0 = this.A02;
        if (r0 != null) {
            return r0.C6k();
        }
        return null;
    }

    public final void A04(C62463KgD kgD) {
        AnonymousClass7TE.A1Z(new MGY(this, kgD, (AnonymousClass4D7) null, 32), this.A03);
    }

    public final void A05(C62801Kmd kmd) {
        AnonymousClass7TE.A1Z(new C58104ImQ(kmd, this, (AnonymousClass4D7) null, 45), this.A03);
    }

    public C65261LqG(Context context, UserSession userSession, 2Er r4) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = r4;
        1HR A0w = G9w.A0w();
        this.A04 = A0w;
        this.A05 = 0u9.A04(A0w);
        this.A03 = 19E.A02(AnonymousClass12T.A00.A04);
    }

    public void A06(C74401PuH puH) {
        puH.onFailure();
    }
}

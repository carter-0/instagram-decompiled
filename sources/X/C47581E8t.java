package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.E8t  reason: case insensitive filesystem */
public final class C47581E8t extends C331047Ph {
    public final List A00 = AnonymousClass7TE.A1C();
    public final UserSession A01;
    public final EA4 A02;
    public final EA5 A03;

    public C47581E8t(Context context, AnonymousClass0iw r8, UserSession userSession) {
        int A1Z = DbW.A1Z(userSession);
        EA5 ea5 = new EA5(context, r8);
        this.A03 = ea5;
        EA4 ea4 = new EA4(context, r8);
        this.A02 = ea4;
        this.A01 = userSession;
        C231642s0[] r0 = new C231642s0[A1Z];
        if (182.A06(0Tu.A05, userSession, 2342163928433435601L)) {
            r0[0] = ea4;
        } else {
            r0[0] = ea5;
        }
        A0B(r0);
    }

    public static final void A00(C47581E8t e8t) {
        C231642s0 r0;
        e8t.A06();
        for (Object next : e8t.A00) {
            if (182.A06(0Tu.A05, e8t.A01, 2342163928433435601L)) {
                r0 = e8t.A02;
            } else {
                r0 = e8t.A03;
            }
            e8t.A08(r0, next);
        }
        e8t.A07();
    }

    public final void notifyDataSetChanged() {
        A00(this);
    }
}

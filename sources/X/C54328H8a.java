package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.H8a  reason: case insensitive filesystem */
public final class C54328H8a extends C230372pW {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public C54328H8a(Context context, AnonymousClass0iw r5, UserSession userSession) {
        super(1Bk.A03.A01(new AnonymousClass2z0(userSession, "ig_threads_in_stories_unit")));
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = r5;
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        C255773uh r9 = (C255773uh) obj;
        0qQ.A0B(r9, 0);
        UserSession userSession = this.A02;
        C56336Hwn.A01(this.A01, userSession, r9, false);
        C270114gD r6 = r9.A0D;
        String A002 = C273654mx.A00(21);
        17k.A07(r6, A002);
        boolean z = true;
        if (r6 != null) {
            String C80 = r6.A00.C80();
            if (C80 == null) {
                C80 = "";
            }
            if (C80.length() != 0) {
                z = false;
            }
        }
        0xa A0n = C51969G9p.A0n(1Al.A01(userSession), 1An.A3L, this);
        if (!z && !A0n.getBoolean("has_seen_threads_in_stories_toast", false)) {
            17k.A07(r6, A002);
            if (r6 != null) {
                String C802 = r6.A00.C80();
                if (C802 == null) {
                    C802 = "";
                }
                C59689JTv.A00(this.A00, C802, (String) null, 1);
                DbX.A1V(A0n, "has_seen_threads_in_stories_toast", true);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        C255773uh r4 = (C255773uh) obj;
        0qQ.A0B(r4, 0);
        C56336Hwn.A01(this.A01, this.A02, r4, true);
    }
}

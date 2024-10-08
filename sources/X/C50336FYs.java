package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.FYs  reason: case insensitive filesystem */
public final class C50336FYs implements AnonymousClass0lh {
    public String A00;
    public final long A01;
    public final 0wc A02;
    public final UserSession A03;

    public static void A00(0Aj r2, C50336FYs fYs, String str) {
        r2.AAJ("event", str);
        r2.AAJ("actor_id", fYs.A03.A06);
        r2.A9F("profile_user_igid", Long.valueOf(fYs.A01));
        r2.AAJ(AnonymousClass000.A00(568), "");
    }

    public final void A01(String str, String str2, String str3, String str4, String str5) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A02, AnonymousClass000.A00(28));
        if (A0e.isSampled()) {
            HashMap A1E = AnonymousClass7TE.A1E();
            if (str2 != null) {
                A1E.put("error_message", str2);
            }
            if (str3 != null) {
                A1E.put(TraceFieldType.ErrorCode, str3);
            }
            if (str4 != null) {
                A1E.put(Pxd.A00(212), str4);
            }
            if (str5 != null) {
                A1E.put(Pxd.A00(715), str5);
            }
            A0e.AAJ("parent_surface", "instagram");
            DbS.A1M(A0e, "edit_profile_channels");
            Dba.A1B(A0e, "source", "done_button");
            A00(A0e, this, "edit_pinned_channels_error");
            Dba.A18(A0e);
            A0e.AAJ(Dbm.A00(), str);
            A0e.A9H("extra", A1E);
            A0e.Cgf();
        }
    }

    public final void onSessionWillEnd() {
        this.A03.A03(C50336FYs.class);
    }

    public C50336FYs(UserSession userSession) {
        long j;
        this.A03 = userSession;
        Long A10 = AnonymousClass7TE.A10(userSession.A06);
        if (A10 != null) {
            j = A10.longValue();
        } else {
            j = -1;
        }
        this.A01 = j;
        AnonymousClass0kM r1 = new AnonymousClass0kM(userSession);
        r1.A01 = AnonymousClass000.A00(28);
        this.A02 = r1.A00();
    }
}

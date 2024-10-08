package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.HqP  reason: case insensitive filesystem */
public final class C55958HqP {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;

    public final void A00(1Xj r14, AnonymousClass3W1 r15, Integer num) {
        long j;
        Long A10;
        1Xj r10 = r14;
        AnonymousClass7TG.A1N(r14, r15);
        AnonymousClass4DU r8 = this.A02;
        UserSession userSession = this.A01;
        String A2n = r14.A2n();
        String A0k = C51973G9u.A0k(r14);
        String A0x = DbT.A0x(r14);
        int position = r15.getPosition();
        1Ln A0U = C51965G9l.A0U(C51972G9s.A0O(r8, userSession), 286);
        if (DbT.A1Y(A0U)) {
            A0U.A0R("containermodule", r8.getModuleName());
            if (A2n == null || (A10 = AnonymousClass7TE.A10(A2n)) == null) {
                j = 0;
            } else {
                j = A10.longValue();
            }
            A0U.A0Q("media_id", Long.valueOf(j));
            A0U.A00.A8k("media_index", Integer.valueOf(position));
            A0U.A0R("viewer_session_id", "");
            A0U.A0Q("media_author_id", DbZ.A0d(A0k));
            A0U.A0R("chaining_session_id", "");
            A0U.A0M(C52236GKd.A0Y, "action");
            A0U.A0M(AnonymousClass5OC.ATTRIBUTE_PILLS, "action_source");
            A0U.A0R("chaining_session_id", "");
            A0U.A0R("ranking_info_token", A0x);
            A0U.Cgf();
        }
        ((LBW) AnonymousClass2BF.A00().A00.getValue()).A00(this.A00, new ILF(r15), r8, userSession, r10, num, (String) null);
    }

    public C55958HqP(FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass4DU r3) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A02 = r3;
    }
}

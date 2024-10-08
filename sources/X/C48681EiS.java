package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.EiS  reason: case insensitive filesystem */
public abstract class C48681EiS {
    public static final Object A00(C307896Rx r8, AnonymousClass6Tm r9) {
        String A0h = DbY.A0h(r9, 0);
        boolean A01 = Q0A.A01(r9.A02());
        UserSession A0W = DbX.A0W(r8);
        User A0j = DbT.A0j(A0W);
        int hashCode = A0h.hashCode();
        if (hashCode != -1804233150) {
            if (hashCode != -957868191) {
                if (hashCode == -868192944 && A0h.equals("muted_words_global_list")) {
                    new AnonymousClass631(A0W).A00((G70) null, A01);
                    if (A01 && 182.A06(DbS.A0J(A0W, 0), A0W, 36311925559984957L)) {
                        F5l.A00(A0W);
                    }
                    A0j.A0d(A0W);
                    return null;
                }
            } else if (A0h.equals("hide_more_comments")) {
                A0j.A03.EZ8(Boolean.valueOf(A01));
                A0j.A0d(A0W);
                return null;
            }
        } else if (A0h.equals("muted_words_custom_list")) {
            new AnonymousClass631(A0W).A02(A01);
            return null;
        }
        1Kn.A02("IgBloksExtensions", 002.A0R("Unknown Content Filter setting: ", A0h));
        return null;
    }
}

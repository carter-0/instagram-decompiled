package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3au  reason: invalid class name and case insensitive filesystem */
public abstract class C244263au {
    public static final 2WX A00(2WX r5, UserSession userSession, AnonymousClass3WV r7, C231592rv r8, AnonymousClass3ZH r9, AnonymousClass3W1 r10, boolean z) {
        0qQ.A0B(r5, 0);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r7, 2);
        0qQ.A0B(r9, 3);
        0qQ.A0B(r10, 4);
        0qQ.A0B(r8, 5);
        C231502rm A00 = C231492rl.A00(userSession);
        if (!z && !A00.A0V) {
            return r5;
        }
        AnonymousClass9JS r1 = new AnonymousClass9JS(AnonymousClass05K.A00, new C244233ar(C292685jM.A00, new C376509Ig(r7, r8, r9, r10)), 2);
        if (r5 == 2WX.A02) {
            r5 = null;
        }
        return new 2WX(r5, r1);
    }
}

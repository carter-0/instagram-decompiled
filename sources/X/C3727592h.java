package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.92h  reason: invalid class name and case insensitive filesystem */
public final class C3727592h implements 27S {
    public final /* synthetic */ AnonymousClass92f A00;

    public C3727592h(AnonymousClass92f r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        C3727792j r0;
        C2370936h r6 = (C2370936h) obj;
        0qQ.A0B(r6, 0);
        1Xj r02 = r6.A00.A1C;
        if (r02 != null) {
            AnonymousClass92f r3 = this.A00;
            UserSession userSession = r3.A01;
            User A2A = r02.A2A(userSession);
            if (A2A != null) {
                String id = A2A.getId();
                if (r3.A05) {
                    r0 = C3727792j.GRAPHQL_PROFILE_FEED;
                } else {
                    r0 = C3727792j.PROFILE_FEED;
                }
                String A01 = C3727392e.A01(r0, id);
                1P2 A002 = 1P1.A00(userSession);
                0qQ.A0B(A01, 0);
                return A002.A00.containsKey(A01);
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        IllegalStateException illegalStateException;
        int i;
        int A03 = AnonymousClass0fD.A03(-1542496114);
        C2370936h r7 = (C2370936h) obj;
        int A032 = AnonymousClass0fD.A03(684647060);
        0qQ.A0B(r7, 0);
        1Xj r3 = r7.A00.A1C;
        if (r3 != null) {
            AnonymousClass92f r1 = this.A00;
            User A2A = r3.A2A(r1.A01);
            if (A2A != null) {
                r1.A09(A2A.getId());
                AnonymousClass0fD.A0A(1632552961, A032);
                AnonymousClass0fD.A0A(144021562, A03);
                return;
            }
            illegalStateException = new IllegalStateException("Required value was null.");
            i = -1635528709;
        } else {
            illegalStateException = new IllegalStateException("Required value was null.");
            i = -949137455;
        }
        AnonymousClass0fD.A0A(i, A032);
        throw illegalStateException;
    }
}

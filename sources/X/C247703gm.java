package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3gm  reason: invalid class name and case insensitive filesystem */
public final class C247703gm {
    public final UserSession A00;
    public final AnonymousClass2oE A01;

    public C247703gm(UserSession userSession, AnonymousClass2oE r3) {
        0qQ.A0B(r3, 2);
        this.A00 = userSession;
        this.A01 = r3;
    }

    public final AnonymousClass9J0 A00(1Xj r8, AnonymousClass3W1 r9) {
        0qQ.A0B(r8, 0);
        0qQ.A0B(r9, 1);
        String id = r8.getId();
        if (id != null) {
            return new AnonymousClass9J0(new C376509Ig((C62320sa) new AnonymousClass9ME(3, r8, this, r9), (0sP) new AnonymousClass9MC(21, this, r8, r9), (0sP) new C377259Ld(r9, 20), (0sP) C247713gn.A00), r9, id, r9.A3D);
        }
        throw new IllegalStateException("Required value was null.");
    }
}

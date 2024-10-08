package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.8Zb  reason: invalid class name and case insensitive filesystem */
public final class C357658Zb {
    public C312716f1 A00;
    public boolean A01;
    public final UserSession A02;
    public final C357668Zc A03 = new C357668Zc(this);

    public final boolean A00() {
        C312716f1 r2 = this.A00;
        if (r2 == null) {
            0qQ.A0F("sparkARFLMConsentManager");
            throw AnonymousClass00P.createAndThrow();
        }
        C312746f6 r1 = r2.A04;
        if (r1 == null) {
            r1 = C312746f6.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
        }
        if (r1 != C312746f6.CONSENTED) {
            C312746f6 r22 = r2.A04;
            if (r22 == null) {
                r22 = C312746f6.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
            }
            if (r22 == C312746f6.NOT_APPLICABLE) {
                return true;
            }
            return false;
        }
        return true;
    }

    public C357658Zb(UserSession userSession) {
        this.A02 = userSession;
        C312716f1 r0 = ((C312686ex) userSession.A01(C312686ex.class, new C13347TVu((Object) userSession, 48))).A00;
        this.A00 = r0;
        C312746f6 r02 = r0.A04;
        int ordinal = (r02 == null ? C312746f6.UNSET_OR_UNRECOGNIZED_ENUM_VALUE : r02).ordinal();
        boolean z = true;
        this.A01 = (ordinal == 1 || ordinal == 3 || ordinal == 5) ? false : z;
        C312716f1 r03 = this.A00;
        if (r03 == null) {
            0qQ.A0F("sparkARFLMConsentManager");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r03.A01.add(new AnonymousClass8Zd(this));
        }
    }
}

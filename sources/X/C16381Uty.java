package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Uty  reason: case insensitive filesystem */
public final class C16381Uty extends C252313ou {
    public final UserSession A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16381Uty(UserSession userSession, AnonymousClass4DU r4) {
        super(userSession, r4, (String) null, false);
        0qQ.A0B(r4, 2);
        this.A00 = userSession;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.4OC] */
    public final void A0A(0xI r4, C263934Nx r5) {
        0qQ.A0B(r4, 0);
        ? obj = new Object();
        obj.A0Z = "clips_midcard";
        r4.A0C("subtype", "clips_midcard");
        if (r5 != null) {
            r5.A07 = obj;
        }
    }

    public final AnonymousClass4OR A0C(1Xj r4) {
        0qQ.A0B(r4, 0);
        AnonymousClass4OR A01 = A01(this.A00, r4);
        A01.A06("subtype", "clips_midcard");
        return A01;
    }

    public final Integer A08() {
        return AnonymousClass05K.A1F;
    }
}

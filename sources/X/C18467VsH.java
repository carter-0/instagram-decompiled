package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.VsH  reason: case insensitive filesystem */
public final class C18467VsH {
    public static volatile C18467VsH A03;
    public boolean A00;
    public final 1QP A01;
    public final UserSession A02;

    public static final long A00(C18467VsH vsH, String str, String str2) {
        1QP r2 = vsH.A01;
        if (str2 == null) {
            str2 = "";
        }
        return r2.generateFlowId(17302829, 002.A0R(str, str2).hashCode());
    }

    public C18467VsH(UserSession userSession) {
        this.A02 = userSession;
        this.A01 = AnonymousClass1QO.A00(userSession);
    }
}

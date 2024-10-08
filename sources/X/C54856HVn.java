package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.HVn  reason: case insensitive filesystem */
public abstract class C54856HVn {
    /* JADX WARNING: type inference failed for: r0v9, types: [X.1qK, java.lang.Object] */
    public static final Object A00(C307896Rx r3) {
        UserSession A0B = C308206Td.A0B(r3);
        AnonymousClass93C r1 = AnonymousClass93C.A04;
        AnonymousClass93D.A00(A0B, r1).EDG(r1);
        0xG A0O = DbS.A0O("digital_reset_clear_client_caches_action");
        0qQ.A0B(A0B, 0);
        C270754hF A01 = C243473Yx.A01(AnonymousClass5M0.A00(A0O), A0B, A0O.getModuleName());
        if (A01 instanceof C270744hE) {
            ((C270744hE) A01).AHo(A0B);
        }
        1FV.A02(A0B).A07();
        1P1.A00(C226382gi.A00(A0B).A01).A09("explore_prefetch");
        AnonymousClass1Nd.A00(A0B).A00(new Object());
        return null;
    }
}

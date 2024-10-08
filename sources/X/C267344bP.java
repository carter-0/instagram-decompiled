package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4bP  reason: invalid class name and case insensitive filesystem */
public final class C267344bP extends 0ng {
    public final /* synthetic */ AnonymousClass13V A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C267344bP(AnonymousClass13V r4) {
        super(337004259, 1, false, true);
        this.A00 = r4;
    }

    public final void run() {
        UserSession A08 = this.A00.A01.A00().A08();
        0qQ.A0C(A08, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
        1wS A01 = 1wS.A01(A08);
        0qQ.A07(A01);
        274 r0 = A01.A00;
        if (r0 != null) {
            r0.A08();
        }
    }
}

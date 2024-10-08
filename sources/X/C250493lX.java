package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3lX  reason: invalid class name and case insensitive filesystem */
public final class C250493lX extends 0ng {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ 1AV A01;
    public final /* synthetic */ 1AV A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C250493lX(UserSession userSession, 1AV r5, 1AV r6, boolean z) {
        super(64142938, 3, false, false);
        this.A01 = r5;
        this.A00 = userSession;
        this.A03 = z;
        this.A02 = r6;
    }

    public final void run() {
        1AV r0 = this.A01;
        UserSession userSession = this.A00;
        boolean z = this.A03;
        r0.A02(userSession, z);
        1AV r02 = this.A02;
        if (r02 != null) {
            r02.A02(userSession, z);
        }
    }
}

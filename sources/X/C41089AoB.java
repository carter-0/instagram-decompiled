package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.AoB  reason: case insensitive filesystem */
public final class C41089AoB implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass4X0 A01;

    public C41089AoB(UserSession userSession, AnonymousClass4X0 r2) {
        this.A01 = r2;
        this.A00 = userSession;
    }

    public final void run() {
        AnonymousClass5Gv r1 = this.A01.A08;
        if (r1 != null) {
            r1.A07(this.A00);
        }
    }
}

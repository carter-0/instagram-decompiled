package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.94V  reason: invalid class name */
public final class AnonymousClass94V {
    public final AnonymousClass0JP A00;
    public final AnonymousClass94Y A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(new C377179Kv(this, 31));
    public final Context A03;
    public final 1vo A04;
    public final AnonymousClass94W A05;
    public final AnonymousClass94X A06;
    public final UserSession A07;

    public AnonymousClass94V(UserSession userSession, Context context) {
        this.A07 = userSession;
        this.A03 = context;
        AnonymousClass0Gt r3 = AnonymousClass0Gt.A00;
        0qQ.A07(r3);
        this.A00 = r3;
        1vn A012 = 1vm.A01(userSession);
        this.A04 = A012;
        AnonymousClass94W r0 = new AnonymousClass94W(A012);
        this.A05 = r0;
        AnonymousClass94X r2 = new AnonymousClass94X(r0);
        this.A06 = r2;
        this.A01 = new AnonymousClass94Y(r3, (C258913zq) this.A02.getValue(), r2);
    }
}

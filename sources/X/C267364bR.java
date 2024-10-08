package X;

import android.content.Context;

/* renamed from: X.4bR  reason: invalid class name and case insensitive filesystem */
public final class C267364bR extends 0vM {
    public final /* synthetic */ AnonymousClass149 A00;
    public final /* synthetic */ 0lg A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C267364bR(AnonymousClass149 r7, 0lg r8) {
        super("battery_logging", 266, 5, false, false);
        this.A00 = r7;
        this.A01 = r8;
    }

    public final void loggedRun() {
        0lg r2 = this.A01;
        AnonymousClass0xN A002 = C60510iO.A00(r2);
        Context context = this.A00.A00;
        0wc A003 = 1x2.A00(r2);
        0Tu r3 = 0Tu.A05;
        boolean A06 = 182.A06(r3, r2, 36318947829685001L);
        boolean A062 = 182.A06(r3, r2, 36318947829750538L);
        boolean A063 = 182.A06(r3, r2, 36318947829816075L);
        synchronized (1x2.class) {
            0dV.A0C("liger");
            1x2.A06 = new 1x2(context, A002, A003, A06, A063, A062);
            14i.A08.A0A(new T76());
        }
        1x2.A02(A002);
        1x2.A03(1x2.A00(r2));
    }
}

package X;

import java.util.EnumSet;

/* renamed from: X.Wo0  reason: case insensitive filesystem */
public final class C20261Wo0 implements Runnable {
    public final /* synthetic */ C15622Ufo A00;
    public final /* synthetic */ AnonymousClass3WR A01;

    public C20261Wo0(C15622Ufo ufo, AnonymousClass3WR r2) {
        this.A00 = ufo;
        this.A01 = r2;
    }

    public final void run() {
        AnonymousClass4M1 r2 = (AnonymousClass4M1) this.A00.A01;
        EnumSet enumSet = AnonymousClass4M1.A1M;
        C263814Nl r1 = r2.A0O;
        if (r1 != null) {
            AnonymousClass3WR r6 = this.A01;
            C242423Ua r4 = r2.A0J;
            C263754Nf r7 = r1.A0B;
            float f = r2.A02;
            boolean z = r1.A0E;
            String str = r2.A0Q;
            DbW.A1O(r7, 3, str);
            String str2 = r1.A0C;
            int i = r2.A0A;
            int currentPositionMs = r2.getCurrentPositionMs();
            C263414Lx r5 = r1.A03;
            0qQ.A0B(r5, 0);
            r2.E4H(new C263794Nj(r4, r5, r6, r7, str2, str, f, i, currentPositionMs, z));
        }
    }
}

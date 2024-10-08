package X;

import java.util.EnumSet;

/* renamed from: X.Wnz  reason: case insensitive filesystem */
public final /* synthetic */ class C20260Wnz implements Runnable {
    public final /* synthetic */ AnonymousClass3WR A00;
    public final /* synthetic */ Runnable A01;

    public /* synthetic */ C20260Wnz(AnonymousClass3WR r1, Runnable runnable) {
        this.A00 = r1;
        this.A01 = runnable;
    }

    public final void run() {
        AnonymousClass3WR r2 = this.A00;
        Runnable runnable = this.A01;
        EnumSet enumSet = AnonymousClass4M1.A1M;
        if (1yG.A00().A01(r2) > 0) {
            runnable.run();
        }
    }
}

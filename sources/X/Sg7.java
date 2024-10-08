package X;

import android.content.Context;
import android.os.PowerManager;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

public final class Sg7 implements C2377639c, TZn {
    public int A00 = 0;
    public PowerManager.WakeLock A01;
    public boolean A02 = false;
    public final int A03;
    public final Context A04;
    public final C2805352f A05;
    public final Sg6 A06;
    public final C2377939g A07;
    public final C255373u1 A08;
    public final Executor A09;
    public final Executor A0A;
    public final AnonymousClass4CZ A0B;
    public final Object A0C = Pxe.A0p();
    public volatile C262204Co A0D;

    static {
        AnonymousClass389.A01("DelayMetCommandHandler");
    }

    public static void A00(Sg7 sg7) {
        synchronized (sg7.A0C) {
            if (sg7.A0D != null) {
                sg7.A0D.AG7((CancellationException) null);
            }
            sg7.A06.A08.A00(sg7.A08);
            PowerManager.WakeLock wakeLock = sg7.A01;
            if (wakeLock != null && wakeLock.isHeld()) {
                AnonymousClass389.A00();
                C60270fk.A01(sg7.A01);
            }
        }
    }

    public final void D5t(C2805152d r3, AnonymousClass3DG r4) {
        Runnable tAl;
        boolean z = r3 instanceof C2805252e;
        Executor executor = this.A0A;
        if (z) {
            tAl = new C12847TAm(this);
        } else {
            tAl = new C12846TAl(this);
        }
        executor.execute(tAl);
    }

    public Sg7(Context context, C2805352f r5, Sg6 sg6, int i) {
        this.A04 = context;
        this.A03 = i;
        this.A06 = sg6;
        this.A08 = r5.A00;
        this.A05 = r5;
        AnonymousClass397 r2 = sg6.A06.A09;
        AnonymousClass38M r1 = (AnonymousClass38M) sg6.A09;
        this.A0A = r1.A01;
        this.A09 = r1.A02;
        this.A0B = r1.A03;
        this.A07 = new C2377939g(r2);
    }
}

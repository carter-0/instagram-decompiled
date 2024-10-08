package X;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1RY  reason: invalid class name */
public final class AnonymousClass1RY {
    public static AnonymousClass1RY A07;
    public final AnonymousClass0yE A00;
    public final 0g3 A01;
    public final AnonymousClass0gL A02;
    public final 0gM A03;
    public final AtomicInteger A04 = new AtomicInteger(0);
    public final boolean A05;
    public final 1Ri A06;

    public static synchronized AnonymousClass1RY A00(Context context) {
        AnonymousClass1RY r1;
        synchronized (AnonymousClass1RY.class) {
            r1 = A07;
            if (r1 == null) {
                r1 = new AnonymousClass1RY(context.getApplicationContext());
                A07 = r1;
            }
        }
        return r1;
    }

    public AnonymousClass1RY(Context context) {
        AnonymousClass0yE A002 = AnonymousClass0yE.A00(context);
        this.A00 = A002;
        0g3 r2 = new 0g3(context);
        this.A01 = r2;
        1Ri r1 = new 1Ri(context, new AnonymousClass1Rg(context));
        this.A06 = r1;
        this.A02 = new AnonymousClass0gL(context, r2, r1);
        this.A03 = new 0gM(context, A002, r2);
        this.A05 = C64601Rl.A00(context);
    }
}

package X;

/* renamed from: X.R9s  reason: case insensitive filesystem */
public final class C8791R9s extends 0ng {
    public final /* synthetic */ T76 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8791R9s(T76 t76) {
        super(266, 4, false, false);
        this.A00 = t76;
    }

    public final void run() {
        1x2 r1;
        float f;
        float f2;
        long j;
        long j2;
        synchronized (this.A00) {
            synchronized (1x2.class) {
                try {
                    r1 = 1x2.A06;
                } catch (Throwable th) {
                    while (true) {
                        th = th;
                    }
                    throw th;
                }
            }
            if (r1 != null) {
                1x2.A01(r1, "foreground");
                SFG sfg = r1.A03;
                if (sfg != null) {
                    C59560Zm r0 = (C59560Zm) r1.A01.A03;
                    synchronized (sfg) {
                        try {
                            0Zt r3 = sfg.A02;
                            r0.A04(r3);
                            0Zt r02 = sfg.A01;
                            0Zt r2 = sfg.A00;
                            r3.A06(r02, r2);
                            Class<0Yl> cls = 0Yl.class;
                            f = r02.A04(cls).A00;
                            f2 = r3.A04(cls).A00;
                            Class<0Sg> cls2 = 0Sg.class;
                            j = r2.A04(cls2).A00;
                            j2 = r2.A04(cls2).A01;
                        } catch (Throwable th2) {
                            while (true) {
                                th = th2;
                                break;
                            }
                        }
                    }
                    0Aj A0e = AnonymousClass7TE.A0e(sfg.A03, "android_battery_duration");
                    if (A0e.isSampled()) {
                        A0e.A8D("enter_battery_level_percent", Double.valueOf((double) f));
                        A0e.A8D("exit_battery_level_percent", Double.valueOf((double) f2));
                        A0e.A9F("realtime_ms", Long.valueOf(j));
                        A0e.A9F("uptime_ms", Long.valueOf(j2));
                        A0e.Cgf();
                    }
                }
            }
        }
        return;
        throw th;
    }
}

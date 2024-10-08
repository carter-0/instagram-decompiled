package X;

import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4CK  reason: invalid class name */
public final class AnonymousClass4CK implements AnonymousClass4CJ, AnonymousClass4CI {
    public AnonymousClass4CL A00;
    public final AnonymousClass4CI A01;
    public final ScheduledExecutorService A02;

    public AnonymousClass4CK(AnonymousClass4CI r2, ScheduledExecutorService scheduledExecutorService) {
        0qQ.A0B(scheduledExecutorService, 1);
        this.A02 = scheduledExecutorService;
        this.A01 = r2;
    }

    public final void DHs(String str, int i, Map map) {
        AnonymousClass4CL r0;
        0qQ.A0B(str, 0);
        AnonymousClass4CI r1 = this.A01;
        if (r1.Cb6(str)) {
            if (i == 0 && (r0 = this.A00) != null) {
                i = 1;
                if (r0.A00.hasKey(str)) {
                    i = 2;
                }
            }
            r1.DHs(str, i, (Map) null);
        }
    }

    public final void DKq(String str, int i, Map map) {
        0qQ.A0B(str, 0);
        this.A01.DKq(str, i, (Map) null);
        AnonymousClass4CL r0 = this.A00;
        if (r0 != null) {
            this.A02.schedule(new C271354ii(r0, this, str), 30, TimeUnit.SECONDS);
        }
    }

    public final void DdH(int i, int i2, String str, Map map) {
        0qQ.A0B(str, 0);
        this.A01.DdH(i, i2, str, (Map) null);
    }

    public final void D7U(String str, String str2, String str3) {
        this.A01.D7U(str, "__key_size", str3);
    }

    public final boolean Cb6(String str) {
        throw AnonymousClass00P.createAndThrow();
    }
}

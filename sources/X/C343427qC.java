package X;

import android.os.Handler;

/* renamed from: X.7qC  reason: invalid class name and case insensitive filesystem */
public final class C343427qC implements C345537tg {
    public long A00 = 0;
    public final /* synthetic */ C345247tB A01;

    public C343427qC(C345247tB r3) {
        this.A01 = r3;
    }

    public final void DQO(Long l) {
        C341427mr r1;
        long j = this.A00 + 1;
        this.A00 = j;
        if (j == 10 && (r1 = this.A01.A02) != null) {
            r1.A06((C341687nM) null, (Handler) null);
        }
    }
}

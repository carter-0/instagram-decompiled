package X;

import java.util.TimerTask;

/* renamed from: X.TSa  reason: case insensitive filesystem */
public final class C13260TSa extends TimerTask {
    public final /* synthetic */ S1Z A00;
    public final /* synthetic */ C62320sa A01;

    public C13260TSa(S1Z s1z, C62320sa r2) {
        this.A01 = r2;
        this.A00 = s1z;
    }

    public final void run() {
        this.A01.invoke();
        S1Z s1z = this.A00;
        Pxi.A1J(s1z, s1z.A02, 17);
    }
}

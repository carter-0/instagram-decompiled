package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.6oi  reason: invalid class name and case insensitive filesystem */
public final class C318296oi {
    public long A00;
    public final int A01;
    public final C318266of[] A02;

    public C318296oi(int i, ThreadFactory threadFactory) {
        this.A01 = i;
        this.A02 = new C318266of[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.A02[i2] = new C318276og(threadFactory);
        }
    }
}

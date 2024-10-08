package X;

import java.util.Iterator;

/* renamed from: X.5F5  reason: invalid class name */
public abstract class AnonymousClass5F5 implements Iterable, C62650uo {
    public final long A00;
    public final long A01;
    public final long A02;

    public AnonymousClass5F5(long j, long j2) {
        this.A00 = j;
        if (j < j2) {
            long j3 = j2 % 1;
            long j4 = j % 1;
            long j5 = ((j3 < 0 ? j3 + 1 : j3) - (j4 < 0 ? j4 + 1 : j4)) % 1;
            j2 -= j5 < 0 ? j5 + 1 : j5;
        }
        this.A01 = j2;
        this.A02 = 1;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.TSt, java.util.Iterator] */
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new C13278TSt(this.A00, this.A01);
    }
}

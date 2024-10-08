package X;

import java.util.concurrent.TimeUnit;

public final class S5G {
    public final long A00;

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof S5G) || j != ((S5G) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C51968G9o.A03(this.A00);
    }

    public final String toString() {
        StringBuilder A1A;
        String str;
        long j = this.A00;
        if (j < 1000) {
            A1A = AnonymousClass7TE.A1A();
            A1A.append(j);
            str = " ns";
        } else {
            int i = (j > 10000000 ? 1 : (j == 10000000 ? 0 : -1));
            A1A = AnonymousClass7TE.A1A();
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (i < 0) {
                A1A.append(timeUnit.toMicros(j));
                str = " µs";
            } else {
                A1A.append(timeUnit.toMillis(j));
                str = " ms";
            }
        }
        return AnonymousClass7TF.A0l(str, A1A);
    }

    public /* synthetic */ S5G(long j) {
        this.A00 = j;
    }
}

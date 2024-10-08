package X;

/* renamed from: X.If2  reason: case insensitive filesystem */
public final class C57699If2 implements Comparable {
    public final long A00;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long A002;
        long j;
        C57699If2 if2 = (C57699If2) obj;
        0qQ.A0B(if2, 1);
        long j2 = this.A00;
        long j3 = if2.A00;
        AnonymousClass30J r11 = AnonymousClass30J.NANOSECONDS;
        if (((j3 - 1) | 1) == Long.MAX_VALUE) {
            if (j2 == j3) {
                A002 = 0;
            } else {
                if (j3 < 0) {
                    j = AnonymousClass30M.A02;
                } else {
                    j = AnonymousClass30M.A01;
                }
                A002 = ((-(j >> 1)) << 1) + ((long) (((int) j) & 1));
            }
        } else if ((1 | (j2 - 1)) != Long.MAX_VALUE) {
            A002 = AnonymousClass49E.A00(r11, j2, j3);
        } else if (j2 < 0) {
            A002 = AnonymousClass30M.A02;
        } else {
            A002 = AnonymousClass30M.A01;
        }
        return AnonymousClass30M.A02(A002, 0);
    }

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C57699If2) || j != ((C57699If2) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C51968G9o.A03(this.A00);
    }

    public final String toString() {
        return 002.A0K("ValueTimeMark(reading=", ')', this.A00);
    }

    public /* synthetic */ C57699If2(long j) {
        this.A00 = j;
    }
}

package X;

import java.util.HashMap;
import java.util.Iterator;

public final class S1H {
    public final long A00;
    public final HashMap A01 = AnonymousClass7TE.A1E();

    public S1H(Iterable iterable, long j) {
        this.A00 = j;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            long A0H = Pxg.A0H(it);
            HashMap hashMap = this.A01;
            long j2 = A0H / this.A00;
            if (A0H < 0) {
                j2--;
            }
            hashMap.put(Long.valueOf(j2), 1L);
        }
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("BucketizedHashMap(bucketSize=");
        A1A.append(this.A00);
        A1A.append(", bucketIndices=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}

package X;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.43V  reason: invalid class name */
public final class AnonymousClass43V {
    public final AnonymousClass0eM A00;

    public final boolean A00(AnonymousClass655 r13, List list, long j) {
        long j2;
        long j3;
        0qQ.A0B(list, 0);
        0qQ.A0B(r13, 2);
        boolean z = false;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                long j4 = ((AnonymousClass651) it.next()).A00;
                loop0:
                while (true) {
                    j2 = j4;
                    while (true) {
                        if (!it.hasNext()) {
                            break loop0;
                        }
                        j4 = ((AnonymousClass651) it.next()).A00;
                        if (j2 > j4) {
                        }
                    }
                }
                Iterator it2 = list.iterator();
                if (it2.hasNext()) {
                    long j5 = ((AnonymousClass651) it2.next()).A00;
                    loop2:
                    while (true) {
                        j3 = j5;
                        while (true) {
                            if (!it2.hasNext()) {
                                break loop2;
                            }
                            j5 = ((AnonymousClass651) it2.next()).A00;
                            if (j3 < j5) {
                            }
                        }
                    }
                    long j6 = j2 - j;
                    long j7 = j3 - j;
                    long size = (j3 - j2) - ((long) (list.size() - 1));
                    if (size > 0) {
                        1Zp A002 = ((1Zn) this.A00.getValue()).A00(AnonymousClass05K.A02, 817891655, 0, false);
                        A002.A05(new RuntimeException("Unexpected hole in batch"));
                        A002.A02("messages.hole.size", size);
                        A002.A00();
                    }
                    if (j7 < 0) {
                        1Zp A003 = ((1Zn) this.A00.getValue()).A00(AnonymousClass05K.A02, 817891655, 0, false);
                        A003.A05(new RuntimeException("Unexpected older seqId"));
                        A003.A02("max.seq_id.delta", j7);
                        A003.A00();
                        z = r13.A01;
                    } else if (j6 < 1) {
                        1Zp A004 = ((1Zn) this.A00.getValue()).A00(AnonymousClass05K.A02, 817891655, 0, false);
                        A004.A05(new RuntimeException("Unexpected seqId overlap"));
                        A004.A02("min.seq_id.delta", j6);
                        A004.A00();
                        z = r13.A02;
                    } else if (j6 > 1) {
                        1Zp A005 = ((1Zn) this.A00.getValue()).A00(AnonymousClass05K.A02, 817891655, 0, false);
                        A005.A05(new RuntimeException("Unexpected hole between highestIrisSeqId and batch"));
                        A005.A02("min.seq_id.delta", j6);
                        A005.A00();
                        z = r13.A00;
                    }
                } else {
                    throw new NoSuchElementException();
                }
            } else {
                throw new NoSuchElementException();
            }
        }
        return !z;
    }

    public AnonymousClass43V(C62320sa r4) {
        this.A00 = AnonymousClass0eN.A00(0eO.A02, new AnonymousClass9LX(r4, 32));
    }
}

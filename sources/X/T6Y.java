package X;

import android.os.SystemClock;
import java.util.ArrayList;

public final class T6Y implements C13885Tj8 {
    public long A00;
    public final C9141RQs A01;

    public final void onBytesTransferred(long j, long j2) {
        S49 s49;
        long max = Math.max(j - this.A00, 0);
        this.A00 = j;
        C9141RQs rQs = this.A01;
        int i = (int) max;
        if (rQs instanceof QN9) {
            QN9 qn9 = (QN9) rQs;
            STJ stj = (STJ) qn9.A02.get();
            if (stj != null) {
                C10393RrU rrU = qn9.A01;
                long j3 = (long) i;
                long j4 = rrU.A00;
                long uptimeMillis = SystemClock.uptimeMillis();
                rrU.A00 = uptimeMillis;
                long j5 = uptimeMillis - j4;
                ArrayList arrayList = rrU.A01;
                if (DbT.A1b(arrayList)) {
                    S49 s492 = (S49) arrayList.get(Pxe.A0A(arrayList));
                    s492.A00 += j3;
                    s492.A01 += j5;
                }
                if (arrayList.isEmpty()) {
                    s49 = null;
                } else {
                    s49 = (S49) AnonymousClass7TE.A12(arrayList);
                }
                long j6 = stj.A00 + j3;
                stj.A00 = j6;
                C13924TlS tlS = stj.A02;
                tlS.Czl(j6);
                tlS.DaE(((float) stj.A00) / ((float) stj.A05.A00));
                if (s49 != null) {
                    tlS.Dtg(s49);
                }
            }
        }
    }

    public T6Y(C9141RQs rQs) {
        this.A01 = rQs;
    }
}

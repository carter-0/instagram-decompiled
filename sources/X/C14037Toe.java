package X;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;

/* renamed from: X.Toe  reason: case insensitive filesystem */
public final class C14037Toe implements Choreographer.FrameCallback {
    public final /* synthetic */ AnonymousClass6WF A00;

    public C14037Toe(AnonymousClass6WF r1) {
        this.A00 = r1;
    }

    public final void doFrame(long j) {
        ArrayList arrayList;
        AnonymousClass6WD r4 = this.A00.A02.A00;
        long uptimeMillis = SystemClock.uptimeMillis();
        long uptimeMillis2 = SystemClock.uptimeMillis();
        int i = 0;
        while (true) {
            arrayList = r4.A04;
            if (i >= arrayList.size()) {
                break;
            }
            X00 x00 = (X00) arrayList.get(i);
            if (x00 != null) {
                01r r1 = r4.A02;
                Number number = (Number) r1.get(x00);
                if (number != null) {
                    if (number.longValue() < uptimeMillis2) {
                        r1.remove(x00);
                    }
                }
                C14001To3 to3 = (C14001To3) x00;
                long j2 = to3.A05;
                if (j2 == 0) {
                    to3.A05 = uptimeMillis;
                    to3.A04(to3.A03);
                } else {
                    to3.A05 = uptimeMillis;
                    boolean A07 = to3.A07(uptimeMillis - j2);
                    float min = Math.min(to3.A03, to3.A00);
                    to3.A03 = min;
                    float max = Math.max(min, to3.A01);
                    to3.A03 = max;
                    to3.A04(max);
                    if (A07) {
                        C14001To3.A00(to3, false);
                    }
                }
            }
            i++;
        }
        if (r4.A01) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else if (arrayList.get(size) == null) {
                    arrayList.remove(size);
                }
            }
            r4.A01 = false;
        }
        if (arrayList.size() > 0) {
            AnonymousClass6WF r2 = r4.A00;
            if (r2 == null) {
                r2 = new AnonymousClass6WF(r4.A03);
                r4.A00 = r2;
            }
            r2.A01.postFrameCallback(r2.A00);
        }
    }
}

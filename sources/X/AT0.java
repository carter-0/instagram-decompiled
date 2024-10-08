package X;

import android.view.View;
import java.util.List;

public final class AT0 implements C337997hF {
    public final /* synthetic */ C295015nP A00;
    public final /* synthetic */ 2We A01;

    public AT0(C295015nP r1, 2We r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void DjX(int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        int i6;
        int i7;
        C295015nP r2 = this.A00;
        synchronized (r2) {
            i4 = r2.A00;
        }
        if (i4 != i3) {
            synchronized (r2) {
                r2.A00 = i3;
            }
            2We r3 = this.A01;
            if (r3.A16 != null) {
                int Bq5 = r3.A0T.Bq5();
                AnonymousClass2T3 r0 = r3.A16;
                if (Bq5 == 0) {
                    i6 = r0.A00;
                } else {
                    i6 = r0.A01;
                }
                if (i6 != -1) {
                    synchronized (r2) {
                        i7 = r2.A00;
                    }
                    if (i7 <= i6) {
                        return;
                    }
                }
            }
            synchronized (r3) {
                if (r3.A16 != null && !r3.A0n) {
                    List list = r3.A0i;
                    int size = list.size();
                    int i8 = 0;
                    for (int i9 = 0; i9 < size; i9++) {
                        C295015nP r1 = (C295015nP) list.get(i9);
                        synchronized (r1) {
                            i5 = r1.A00;
                        }
                        if (i5 > i8) {
                            i8 = i5;
                        }
                    }
                    if (i8 != r3.A16.A00) {
                        int max = Math.max(r3.A0T.ACF(View.MeasureSpec.getSize(r3.A06), View.MeasureSpec.getSize(r3.A05), i2, i8), 1);
                        r3.A16.A00 = i8;
                        r3.A04 = max;
                    }
                }
                2We.A0M(r3);
            }
        }
    }
}

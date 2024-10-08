package X;

import android.graphics.drawable.Drawable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.869  reason: invalid class name */
public final class AnonymousClass869 {
    public int A00;
    public int A01 = 5000;
    public long A02 = -1;
    public boolean A03;

    public final int A00() {
        if (this.A03) {
            return (int) ((((long) this.A00) + (System.currentTimeMillis() - this.A02)) % ((long) this.A01));
        }
        return -1;
    }

    public final void A01(C306386Ly r3) {
        int i;
        AnonymousClass91c r32;
        if (!(r3 instanceof AnonymousClass91c) || (r32 = (AnonymousClass91c) r3) == null) {
            i = 5000;
        } else {
            i = r32.getDurationInMs();
        }
        if (i > this.A01) {
            this.A01 = i;
        }
        if (!this.A03) {
            this.A03 = true;
            this.A02 = System.currentTimeMillis();
        }
    }

    public final void A02(List list) {
        if (list.isEmpty()) {
            this.A00 = 0;
            this.A02 = -1;
            this.A03 = false;
            this.A01 = 5000;
            return;
        }
        this.A01 = 5000;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Drawable drawable = (Drawable) it.next();
            if (drawable instanceof AnonymousClass91c) {
                AnonymousClass91c r2 = (AnonymousClass91c) drawable;
                if (r2.getDurationInMs() > this.A01) {
                    this.A01 = r2.getDurationInMs();
                }
            }
        }
        if (!this.A03) {
            this.A03 = true;
            this.A02 = System.currentTimeMillis();
        }
    }
}

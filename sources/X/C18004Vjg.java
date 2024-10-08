package X;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Vjg  reason: case insensitive filesystem */
public final class C18004Vjg {
    public long A00 = -1;
    public Interpolator A01;
    public AnonymousClass04L A02;
    public boolean A03;
    public final ArrayList A04 = new ArrayList();
    public final AnonymousClass0uU A05 = new U7T(this);

    public final void A00() {
        if (this.A03) {
            Iterator it = this.A04.iterator();
            while (it.hasNext()) {
                ((04K) it.next()).A00();
            }
            this.A03 = false;
        }
    }

    public final void A01() {
        if (!this.A03) {
            Iterator it = this.A04.iterator();
            while (it.hasNext()) {
                04K r5 = (04K) it.next();
                long j = this.A00;
                if (j >= 0) {
                    r5.A04(j);
                }
                Interpolator interpolator = this.A01;
                if (interpolator != null) {
                    r5.A06(interpolator);
                }
                if (this.A02 != null) {
                    r5.A07(this.A05);
                }
                r5.A01();
            }
            this.A03 = true;
        }
    }
}

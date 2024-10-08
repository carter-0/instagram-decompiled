package X;

import android.os.Build;
import android.view.View;
import java.util.List;

/* renamed from: X.Gg6  reason: case insensitive filesystem */
public final class C52953Gg6 extends 04T implements Runnable, View.OnAttachStateChangeListener, AnonymousClass03Q {
    public 04k A00;
    public boolean A01;
    public boolean A02;
    public final I4O A03;

    public final AnonymousClass04S A01(AnonymousClass04S r2, 04a r3) {
        this.A01 = false;
        return r2;
    }

    public final void A03(04a r2) {
        this.A01 = true;
        this.A02 = true;
    }

    public final void A04(04a r8) {
        this.A01 = false;
        this.A02 = false;
        04k r6 = this.A00;
        if (!(r8.A00.A07() == 0 || r6 == null)) {
            I4O i4o = this.A03;
            IF1 if1 = i4o.A07;
            04h r2 = r6.A00;
            I2A.A01(if1, r2.A05(8));
            I2A.A01(i4o.A08, r2.A05(8));
            i4o.A01(r6);
        }
        this.A00 = null;
    }

    public final void onViewDetachedFromWindow(View view) {
    }

    public C52953Gg6(I4O i4o) {
        super(i4o.A0C ^ true ? 1 : 0);
        this.A03 = i4o;
    }

    public final 04k A02(04k r2, List list) {
        I4O i4o = this.A03;
        i4o.A01(r2);
        if (i4o.A0C) {
            return 04k.A01;
        }
        return r2;
    }

    public final 04k Cvn(View view, 04k r7) {
        this.A00 = r7;
        I4O i4o = this.A03;
        IF1 if1 = i4o.A08;
        04h r2 = r7.A00;
        I2A.A01(if1, r2.A05(8));
        if (this.A01) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.A02) {
            I2A.A01(i4o.A07, r2.A05(8));
            i4o.A01(r7);
        }
        if (i4o.A0C) {
            return 04k.A01;
        }
        return r7;
    }

    public final void run() {
        if (this.A01) {
            this.A01 = false;
            this.A02 = false;
            04k r4 = this.A00;
            if (r4 != null) {
                I4O i4o = this.A03;
                I2A.A01(i4o.A07, r4.A00.A05(8));
                i4o.A01(r4);
                this.A00 = null;
            }
        }
    }

    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }
}

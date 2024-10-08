package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import java.util.Set;

public final class WYL implements C66536MVq {
    public long A00;
    public C59721JVf A01;
    public AnonymousClass41T A02;
    public long A03;
    public boolean A04;
    public final C52809Gd1 A05;
    public final Drawable A06;
    public final View.OnClickListener A07;
    public final String A08;
    public final Set A09 = new HashSet();
    public final /* synthetic */ 215 A0A;

    public WYL(AnonymousClass41T r12, 215 r13, long j) {
        215 r5 = r13;
        this.A0A = r13;
        this.A03 = j;
        this.A02 = r12;
        this.A00 = j;
        this.A05 = new C52809Gd1(this, r13, j);
        this.A06 = 215.A00(this.A02, r13);
        this.A08 = 215.A02(this.A02, r13);
        this.A01 = new C59721JVf(A00(false), AnonymousClass05K.A00);
        this.A07 = new WBH(7, (Object) this, (Object) r13);
        if (r13.A02 < 0) {
            AnonymousClass41T r0 = this.A02;
            215.A04(r5, r0.A05, r0.A08, "Timer started from init", (String) null, r0.A07);
            A02(true);
        }
    }

    public final LSB A00(boolean z) {
        if (z) {
            return new LSB((View.OnClickListener) null, 4, "Unused", (String) null, DbW.A0h(this.A0A.A09, this.A08, 2131952957));
        }
        int A012 = JTP.A01((double) this.A00, 1000.0d);
        Context context = this.A0A.A09;
        return new LSB(this.A07, 4, DbY.A0c(context, Integer.valueOf(A012), 2131952956), context.getString(2131952955), DbW.A0h(context, this.A08, 2131952958));
    }

    public final String C6v() {
        return null;
    }

    public final void Dfh() {
    }

    public final void ECA(AnonymousClass3M8 r2) {
        0qQ.A0B(r2, 0);
        this.A09.add(r2);
    }

    public final void FJ6(AnonymousClass3M8 r2) {
        0qQ.A0B(r2, 0);
        this.A09.remove(r2);
    }

    public final void A01() {
        for (AnonymousClass3M8 A0B : this.A09) {
            A0B.A0B(this);
        }
    }

    public final void A02(boolean z) {
        if (!this.A04) {
            215 r2 = this.A0A;
            AnonymousClass41T r1 = this.A02;
            215.A04(r2, r1.A05, r1.A08, 002.A1D("Timer started from init: ", z), (String) null, r1.A07);
            this.A05.start();
            this.A04 = true;
        }
    }

    public final 1iA BR7() {
        return 1iA.A04;
    }

    public final int BhS() {
        return (int) (((((double) this.A00) * 1.0d) / ((double) this.A03)) * 100.0d);
    }

    public final Integer BzN() {
        return (Integer) this.A01.A00;
    }

    public final LSB BzP() {
        return (LSB) this.A01.A01;
    }

    public final Drawable C6t() {
        return this.A06;
    }
}

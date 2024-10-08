package X;

import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.30k  reason: invalid class name and case insensitive filesystem */
public final class C2355830k implements C252203oj {
    public static final C71392co A07 = C71392co.A03(6.0d, 8.0d);
    public static final C71392co A08 = C71392co.A04(60.0d, 5.0d);
    public static final C71392co A09 = C71392co.A03(6.0d, 9.0d);
    public int A00 = -1;
    public C2355730j A01;
    public WeakReference A02;
    public final 2cs A03;
    public final CopyOnWriteArraySet A04 = new CopyOnWriteArraySet();
    public final Handler A05;
    public final 2cs A06;

    public final void A02(C70952Zb r3) {
        0qQ.A0B(r3, 0);
        this.A04.add(r3);
        2cs r1 = this.A03;
        if (!r1.A0C()) {
            DmE(r1);
        }
    }

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r5) {
        0qQ.A0B(r5, 0);
        2cs r2 = this.A03;
        if (r5 == r2 && r2.A05 == A09 && r2.A0E(1.0d)) {
            this.A05.postDelayed(new C20089Wkn(this), 300);
        } else if (r5 == r2 && r2.A05 == A07 && r2.A0E(0.0d)) {
            Iterator it = this.A04.iterator();
            0qQ.A07(it);
            while (it.hasNext()) {
                ((C70952Zb) it.next()).DY7(this.A00);
            }
            this.A00 = -1;
        }
    }

    public final void DmD(2cs r1) {
    }

    public final void DmE(2cs r6) {
        C2355730j r1;
        C71392co r0;
        0qQ.A0B(r6, 0);
        C71392co r4 = r6.A05;
        float f = (float) r6.A09.A00;
        boolean z = true;
        if (r6 == this.A06) {
            WeakReference weakReference = this.A02;
            if (weakReference != null && (r1 = (C2355730j) weakReference.get()) != null) {
                r0 = A08;
            } else {
                return;
            }
        } else if (r6 == this.A03 && (r1 = this.A01) != null) {
            r0 = A09;
        } else {
            return;
        }
        if (r4 != r0) {
            z = false;
        }
        r1.CvR(z, f);
    }

    public final void A00() {
        2cs r3 = this.A06;
        r3.A09(A08);
        r3.A08(0.0d, true);
        r3.A06(1.0d);
    }

    public final void A01(int i) {
        this.A00 = i;
        2cs r3 = this.A03;
        r3.A09(A09);
        r3.A06 = false;
        r3.A08(0.0d, true);
        r3.A06(1.0d);
    }

    public final void A03(C2355730j r3) {
        this.A01 = r3;
        2cs r1 = this.A03;
        if (!r1.A0C()) {
            DmE(r1);
        }
    }

    public final void A04(WeakReference weakReference) {
        this.A02 = weakReference;
        2cs r1 = this.A06;
        if (!r1.A0C()) {
            DmE(r1);
        }
    }

    public C2355830k() {
        2cp A002 = C61340me.A00();
        2cs A022 = A002.A02();
        A022.A0A(this);
        this.A06 = A022;
        2cs A023 = A002.A02();
        A023.A0A(this);
        this.A03 = A023;
        this.A05 = new Handler();
    }
}

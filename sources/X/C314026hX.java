package X;

import android.view.View;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.6hX  reason: invalid class name and case insensitive filesystem */
public final class C314026hX implements C252203oj {
    public int A00;
    public boolean A01;
    public final 2cs A02;
    public final C313056fm A03;

    public final void DmB(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public final void DmE(2cs r4) {
        View A0D;
        0qQ.A0B(r4, 0);
        float f = (float) r4.A09.A00;
        C313056fm r0 = this.A03;
        if (r0 != null && (A0D = ((C313046fl) r0).A04.A0D(this.A00)) != null && (A0D.getTag() instanceof C316086l5)) {
            C316086l5 r02 = (C316086l5) A0D.getTag();
            0qQ.A0A(r02);
            r02.ERT(f);
        }
    }

    public final void A00() {
        C313056fm r0 = this.A03;
        if (r0 != null) {
            ReboundViewPager reboundViewPager = ((C313046fl) r0).A04;
            int i = reboundViewPager.A08;
            this.A00 = i;
            View A0D = reboundViewPager.A0D(i);
            if (A0D != null && (A0D.getTag() instanceof C316086l5)) {
                0qQ.A0A(A0D.getTag());
            }
            this.A02.A06(0.0d);
        }
    }

    public final boolean A01() {
        2cs r7 = this.A02;
        if (r7.A09.A00 == 1.0d) {
            return false;
        }
        r7.A06(1.0d);
        return true;
    }

    public final void DmC(2cs r7) {
        View A0D;
        if (this.A02.A09.A00 == 1.0d) {
            this.A00 = -1;
            return;
        }
        C313056fm r0 = this.A03;
        if (r0 != null && (A0D = ((C313046fl) r0).A04.A0D(this.A00)) != null) {
            if (A0D.getTag() instanceof C305836Jt) {
                C305836Jt r02 = (C305836Jt) A0D.getTag();
                0qQ.A0A(r02);
                r02.A0T.setVisibility(8);
            }
            if (this.A01) {
                if (A0D.getTag() instanceof C316086l5) {
                    0qQ.A0A(A0D.getTag());
                }
                this.A01 = false;
            }
        }
    }

    public C314026hX(C313056fm r4) {
        2cs A022 = C61340me.A00().A02();
        A022.A06 = true;
        this.A02 = A022;
        A022.A05(1.0d);
        this.A03 = r4;
    }
}

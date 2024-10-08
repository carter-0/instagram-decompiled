package X;

import android.os.Handler;
import com.instagram.pendingmedia.model.ClipInfo;

/* renamed from: X.9RF  reason: invalid class name */
public abstract class AnonymousClass9RF {
    public final AnonymousClass9RG A00;

    public boolean A07() {
        return false;
    }

    public void A02() {
        C41843B2y b2y;
        if (this instanceof C388779oN) {
            C388779oN r2 = (C388779oN) this;
            C388789oO r1 = r2.A05;
            if (!r1.A0H.get() && (b2y = r1.A05) != null) {
                b2y.DFu("onFinish");
            }
            r2.A08();
            C39780A8z a8z = r2.A01;
            if (a8z.A00 != 4) {
                a8z.A00 = 4;
                return;
            }
            return;
        }
        C378809Rh.A02(((C388769oM) this).A02);
    }

    public void A03() {
        ClipInfo clipInfo;
        if (this instanceof C388779oN) {
            C388779oN r4 = (C388779oN) this;
            C39780A8z a8z = r4.A01;
            if (a8z.A00 == 0) {
                a8z.A00 = 1;
            }
            r4.A00.A02(AnonymousClass05K.A01);
            AnonymousClass3Q2 r0 = r4.A05.A09;
            if (!(r0 == null || (clipInfo = r0.A1N) == null)) {
                r4.A02.A02(clipInfo, false);
            }
            r4.A09("oninit", (String) null);
            return;
        }
        C388769oM r2 = (C388769oM) this;
        r2.A00.A02(AnonymousClass05K.A01);
        C378809Rh r02 = r2.A02;
        C378809Rh.A03(r02);
        AnonymousClass9R7 r22 = r2.A01;
        AnonymousClass3Q2 r1 = r02.A09;
        if (r1 != null) {
            r22.A02(r1.A1N, true);
            return;
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public void A04() {
        AnonymousClass9R7 r0;
        C41843B2y b2y;
        if (this instanceof C388779oN) {
            C388779oN r3 = (C388779oN) this;
            C388789oO r2 = r3.A05;
            if (!r2.A0H.get() && (b2y = r2.A05) != null) {
                b2y.DFu("onPause");
            }
            r2.A00 = r2.A07();
            r3.A08();
            C39780A8z a8z = r3.A01;
            if (a8z.A00 == 2) {
                a8z.A00 = 3;
            }
            r0 = r3.A02;
        } else {
            C388769oM r1 = (C388769oM) this;
            C378809Rh.A02(r1.A02);
            r0 = r1.A01;
        }
        r0.E22();
    }

    public void A05() {
        if (this instanceof C388769oM) {
            C388769oM r1 = (C388769oM) this;
            r1.A01.EJ2();
            C378809Rh.A03(r1.A02);
            return;
        }
        C388779oN r3 = (C388779oN) this;
        r3.A02.EJ2();
        C39780A8z a8z = r3.A01;
        int i = a8z.A00;
        if (i == 1 || i == 3) {
            a8z.A00 = 2;
        }
        r3.A09("onresume", (String) null);
        C388789oO r2 = r3.A05;
        if (r2.A09) {
            int i2 = r2.A01;
            STU stu = r2.A05;
            if (stu != null) {
                stu.A09(i2);
            }
            r2.A09 = false;
        }
    }

    public void A06() {
        C41843B2y b2y;
        if (this instanceof C388769oM) {
            C378809Rh r3 = ((C388769oM) this).A02;
            C41838B2t b2t = r3.A04;
            if (b2t != null) {
                r3.A01.post(new C378879Ro(b2t, r3));
            }
            if (!r3.A0A.isEmpty()) {
                AnonymousClass4MM r0 = r3.A04;
                if (r0 == null) {
                    throw AnonymousClass7TE.A0y();
                } else if (r0.A09.A0I.A0J()) {
                    r3.A01.post(new AnonymousClass9SQ(r3));
                }
            }
        } else {
            C388779oN r1 = (C388779oN) this;
            C388789oO r4 = r1.A05;
            Handler handler = r4.A0C;
            handler.post(r1.A04);
            if (!r1.A01.A00() && !r4.A0N() && r1.A00 > 0) {
                Runnable runnable = r1.A03;
                handler.removeCallbacks(runnable);
                handler.postDelayed(runnable, 100);
            }
            if (r4.A0H.compareAndSet(false, true) && (b2y = r4.A05) != null) {
                b2y.onFirstFrameRendered();
            }
        }
    }

    public AnonymousClass9RF(AnonymousClass9RG r1) {
        this.A00 = r1;
        r1.A03 = this;
    }
}

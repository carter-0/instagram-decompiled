package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public final class GC3 extends C252233om implements C252203oj {
    public C52079GDz A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public final 2cs A05;
    public final 2cs A06;
    public final Activity A07;

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r6) {
        0qQ.A0B(r6, 0);
        if (r6.A09.A00 == 1.0d) {
            this.A00 = null;
        }
    }

    public final void DmD(2cs r1) {
    }

    public final void DmE(2cs r6) {
        0qQ.A0B(r6, 0);
        float f = (float) r6.A09.A00;
        C52079GDz gDz = this.A00;
        if (gDz != null) {
            C51967G9n.A19(gDz.A04, f);
        }
        if (this.A00 != null) {
            View view = this.A01;
            if (view != null) {
                view.setAlpha(f);
            }
            View view2 = this.A04;
            if (view2 != null) {
                view2.setAlpha(f);
            }
            View view3 = this.A03;
            if (view3 != null) {
                view3.setAlpha(f);
            }
            View view4 = this.A02;
            if (view4 != null) {
                view4.setAlpha(f);
            }
            int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            View view5 = this.A01;
            if (i == 0) {
                AnonymousClass7TH.A0R(view5);
            } else if (view5 != null) {
                view5.setVisibility(0);
            }
        }
    }

    public final void A00(View view, View view2, View view3, C52079GDz gDz) {
        if (gDz != null) {
            this.A00 = gDz;
            this.A05.A04();
            this.A04 = view;
            this.A03 = view2;
            this.A02 = view3;
        }
    }

    public final void onDestroyView() {
        this.A06.A0B(this);
        this.A01 = null;
        this.A00 = null;
        this.A04 = null;
        this.A03 = null;
        this.A02 = null;
    }

    public final void onPause() {
        2cs r0 = this.A05;
        r0.A01();
        r0.A0B(this);
        View view = this.A01;
        if (view != null) {
            view.setAlpha(1.0f);
        }
        View view2 = this.A04;
        if (view2 != null) {
            view2.setAlpha(1.0f);
        }
        View view3 = this.A03;
        if (view3 != null) {
            view3.setAlpha(1.0f);
        }
        View view4 = this.A02;
        if (view4 != null) {
            view4.setAlpha(1.0f);
        }
        C52079GDz gDz = this.A00;
        if (gDz != null) {
            C51967G9n.A19(gDz.A04, 1.0f);
        }
    }

    public final void onResume() {
        2cs r5 = this.A05;
        r5.A0A(this);
        if (r5.A09.A00 != 1.0d) {
            r5.A06(1.0d);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        ViewGroup viewGroup;
        2dZ A002 = 2dY.A00(this.A07);
        if (A002 != null) {
            viewGroup = A002.A0P;
        } else {
            viewGroup = null;
        }
        this.A01 = viewGroup;
        this.A06.A0A(this);
    }

    public GC3(Activity activity) {
        this.A07 = activity;
        2cs A0J = AnonymousClass7TF.A0J();
        A0J.A06 = true;
        this.A05 = A0J;
        A0J.A02();
        2cs A0J2 = AnonymousClass7TF.A0J();
        A0J2.A06 = true;
        this.A06 = A0J2;
        A0J2.A02();
    }
}

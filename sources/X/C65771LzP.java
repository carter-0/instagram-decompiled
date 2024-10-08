package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.LzP  reason: case insensitive filesystem */
public final class C65771LzP implements MVV {
    public final /* synthetic */ K6J A00;

    public final void Ev1(View view) {
        0qQ.A0B(view, 0);
        K6J k6j = this.A00;
        ViewGroup viewGroup = k6j.A06;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        view.setImportantForAccessibility(1);
        ViewGroup viewGroup2 = k6j.A06;
        if (viewGroup2 != null) {
            viewGroup2.addView(view);
        }
        A01();
    }

    public C65771LzP(K6J k6j) {
        this.A00 = k6j;
    }

    private final void A00() {
        float f;
        K6J k6j = this.A00;
        ViewGroup viewGroup = k6j.A06;
        if (viewGroup != null) {
            C71392co r0 = C315596kB.A02;
            C294975nL A0b = JTP.A0b(viewGroup);
            A0b.A03 = 8;
            C294975nL A0E = A0b.A0E(K6J.A0V);
            View view = k6j.A03;
            if (view != null) {
                f = (float) view.getBottom();
            } else {
                f = 0.0f;
            }
            A0E.A0K(f);
            C65724Lye.A00(A0E, k6j, 18);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    private final void A01() {
        float f;
        K6J k6j = this.A00;
        ViewGroup viewGroup = k6j.A06;
        if (viewGroup != null) {
            C71392co r0 = C315596kB.A02;
            C294975nL A0c = JTP.A0c(viewGroup, 0);
            A0c.A04 = 0;
            C294975nL A0E = A0c.A0E(K6J.A0V);
            View view = k6j.A03;
            if (view != null) {
                f = (float) view.getBottom();
            } else {
                f = 0.0f;
            }
            View view2 = k6j.A04;
            0qQ.A0A(view2);
            A0E.A0T(f, view2.getY() + DbV.A05(k6j).getDimension(R.dimen.asset_picker_redesign_sticker_height));
            C65724Lye.A00(A0E, k6j, 19);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final boolean onBackPressed() {
        K6G A01;
        K6J k6j = this.A00;
        LG7 lg7 = k6j.A08;
        if (lg7 == null) {
            return false;
        }
        KKN kkn = lg7.A01;
        if ((kkn == null || !kkn.onBackPressed()) && (A01 = K6J.A01(k6j)) != null) {
            return A01.onBackPressed();
        }
        return false;
    }

    public final void CLB() {
        A00();
        this.A00.A08 = null;
    }

    public final void CLg() {
        A00();
    }

    public final void Etw() {
        A01();
        K6J k6j = this.A00;
        AnonymousClass0eM r6 = k6j.A0R;
        C63705L3p l3p = new C63705L3p(182.A06(0Tu.A05, DbT.A0X(r6), 36316662907212343L), false);
        ViewGroup viewGroup = k6j.A06;
        if (viewGroup != null) {
            k6j.A08 = new LG7(AnonymousClass7TE.A0S(viewGroup), AnonymousClass7TE.A0l(r6), l3p);
            C71012OYk.A00(C61891KQk.A00, C63234Ktf.A00(AnonymousClass7TE.A0l(r6)));
            LG7 lg7 = k6j.A08;
            if (lg7 != null) {
                lg7.A01(viewGroup, new C64974LlD(k6j, 2));
            }
        }
    }
}

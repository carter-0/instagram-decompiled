package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.LzO  reason: case insensitive filesystem */
public final class C65770LzO implements MVV {
    public final /* synthetic */ K6K A00;

    public final void Ev1(View view) {
        0qQ.A0B(view, 0);
        K6K k6k = this.A00;
        ViewGroup viewGroup = k6k.A07;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        view.setImportantForAccessibility(1);
        ViewGroup viewGroup2 = k6k.A07;
        if (viewGroup2 != null) {
            viewGroup2.addView(view);
        }
        A01();
    }

    public C65770LzO(K6K k6k) {
        this.A00 = k6k;
    }

    private final void A00() {
        K6K k6k = this.A00;
        ViewGroup viewGroup = k6k.A07;
        if (viewGroup != null) {
            C71392co r0 = C315596kB.A02;
            C294975nL A0b = JTP.A0b(viewGroup);
            A0b.A03 = 8;
            C294975nL A0E = A0b.A0E(K6K.A0r);
            View view = k6k.A03;
            if (view != null) {
                A0E.A0K((float) view.getBottom());
                A0E.A05 = new C65718LyY(2, this, k6k);
                A0E.A0H();
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    private final void A01() {
        K6K k6k = this.A00;
        ViewGroup viewGroup = k6k.A07;
        if (viewGroup != null) {
            C71392co r0 = C315596kB.A02;
            C294975nL A0c = JTP.A0c(viewGroup, 0);
            A0c.A04 = 0;
            C294975nL A0E = A0c.A0E(K6K.A0r);
            View view = k6k.A03;
            if (view != null) {
                float bottom = (float) view.getBottom();
                View view2 = k6k.A04;
                if (view2 != null) {
                    A0E.A0T(bottom, view2.getY() + DbV.A05(k6k).getDimension(R.dimen.asset_picker_redesign_sticker_height));
                    C65724Lye.A00(A0E, this, 13);
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final boolean onBackPressed() {
        K6G A002;
        K6K k6k = this.A00;
        LG7 lg7 = k6k.A0A;
        if (lg7 == null) {
            return false;
        }
        KKN kkn = lg7.A01;
        if ((kkn == null || !kkn.onBackPressed()) && (A002 = K6K.A00(k6k)) != null) {
            return A002.onBackPressed();
        }
        return false;
    }

    public final void CLB() {
        A00();
        this.A00.A0A = null;
    }

    public final void CLg() {
        A00();
    }

    public final void Etw() {
        A01();
        K6K k6k = this.A00;
        AnonymousClass0eM r6 = k6k.A0l;
        C63705L3p l3p = new C63705L3p(182.A06(0Tu.A05, DbT.A0X(r6), 36316662907212343L), !k6k.A0S);
        ViewGroup viewGroup = k6k.A07;
        if (viewGroup != null) {
            LG7 lg7 = new LG7(k6k.requireActivity(), AnonymousClass7TE.A0l(r6), l3p);
            k6k.A0A = lg7;
            AnonymousClass2k4 r1 = k6k.dayNightMode;
            0qQ.A0B(r1, 0);
            lg7.A00 = r1;
            C71012OYk.A00(C61891KQk.A00, C63234Ktf.A00(AnonymousClass7TE.A0l(r6)));
            LG7 lg72 = k6k.A0A;
            if (lg72 != null) {
                lg72.A01(viewGroup, new C64974LlD(k6k, 1));
            }
        }
    }
}

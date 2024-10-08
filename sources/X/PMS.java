package X;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.instagram.common.typedurl.ImageUrl;

public final class PMS implements C74361Ptb {
    public ImageUrl A00;
    public C70521O9u A01;
    public boolean A02 = true;
    public final View A03;
    public final AnonymousClass0iw A04;
    public final AnonymousClass0eM A05 = C73906Plh.A00(this, 36);
    public final AnonymousClass0eM A06 = C73906Plh.A00(this, 38);
    public final AnonymousClass0eM A07 = C73906Plh.A00(this, 39);
    public final AnonymousClass0eM A08 = C73906Plh.A00(this, 40);
    public final AnonymousClass0eM A09 = C73906Plh.A00(this, 42);
    public final AnonymousClass0eM A0A = C73906Plh.A00(this, 45);
    public final AnonymousClass0eM A0B = AnonymousClass1YB.A00(C73865Pl2.A00);
    public final AnonymousClass0eM A0C = C73906Plh.A00(this, 46);
    public final AnonymousClass0eM A0D = C73906Plh.A00(this, 47);
    public final AnonymousClass0eM A0E = C73906Plh.A00(this, 48);
    public final AnonymousClass0eM A0F = C73906Plh.A00(this, 49);
    public final AnonymousClass0eM A0G = C73919Plz.A01(this, 1);
    public final AnonymousClass0eM A0H = C73919Plz.A01(this, 3);
    public final AnonymousClass0eM A0I = C73919Plz.A01(this, 4);
    public final AnonymousClass0eM A0J = C73919Plz.A01(this, 5);
    public final AnonymousClass0eM A0K = C73919Plz.A01(this, 6);
    public final AnonymousClass0eM A0L = C73919Plz.A01(this, 7);
    public final AnonymousClass0eM A0M = C73919Plz.A01(this, 8);
    public final AnonymousClass0eM A0N = C73919Plz.A01(this, 9);
    public final AnonymousClass0eM A0O = C73919Plz.A01(this, 10);
    public final AnonymousClass0eM A0P = C73919Plz.A01(this, 11);
    public final boolean A0Q;
    public final boolean A0R;

    public /* synthetic */ PMS(View view, AnonymousClass0iw r5, boolean z, boolean z2) {
        this.A03 = view;
        this.A04 = r5;
        this.A0Q = z;
        this.A0R = z2;
    }

    public static final void A01(View view, PMS pms, int i) {
        view.setAlpha(0.0f);
        view.setTranslationY(C66582MXn.A00(pms.A0K));
        DbY.A0G(view).setDuration(250).setStartDelay((long) (((float) i) * 100.0f)).setInterpolator((DecelerateInterpolator) pms.A0B.getValue()).translationY(0.0f).start();
    }

    public static final void A00(View view) {
        view.setAlpha(1.0f);
        C66580MXl.A1D(C51972G9s.A0I(view).setDuration(250), new PXL(view));
    }

    public static final void A02(PMS pms) {
        View A0c = AnonymousClass7TE.A0c(pms.A0N);
        if (A0c != null) {
            A00(A0c);
        }
        View A0c2 = AnonymousClass7TE.A0c(pms.A0M);
        if (A0c2 != null) {
            A00(A0c2);
        }
        JTO.A0I(pms.A0L).setText(2131954521);
    }

    public final C70521O9u A03() {
        C70521O9u o9u = this.A01;
        if (o9u != null) {
            return o9u;
        }
        0qQ.A0F("listener");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ void ADN(C74270Pry pry) {
        C66583MXo.A0p();
        throw AnonymousClass00P.createAndThrow();
    }
}

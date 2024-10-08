package X;

import android.os.Handler;
import android.view.View;
import com.instagram.android.R;

public final class PMO implements C74361Ptb {
    public OA9 A00;
    public final Handler A01 = AnonymousClass7TF.A0D();
    public final View A02;
    public final View A03;
    public final Runnable A04 = new C73128PXN(this);
    public final AnonymousClass0eM A05 = C73919Plz.A01(this, 18);
    public final AnonymousClass0eM A06 = C73919Plz.A01(this, 19);
    public final AnonymousClass0eM A07 = C73919Plz.A01(this, 20);
    public final AnonymousClass0eM A08 = C73919Plz.A01(this, 21);

    public static final void A00(PMO pmo) {
        View view = pmo.A02;
        if (view.getVisibility() == 0) {
            view.setTranslationY(0.0f);
            C66580MXl.A1D(C66581MXm.A0D(view.animate().translationY(-((float) view.getMeasuredHeight()))), new C73127PXM(pmo));
        }
        pmo.A06.getValue();
        view.setOnTouchListener((View.OnTouchListener) null);
    }

    public PMO(View view) {
        this.A03 = view;
        View A0V = JTR.A0V(view, R.id.in_call_notif);
        A0V.requestApplyInsets();
        this.A02 = A0V;
    }

    public final /* bridge */ /* synthetic */ void ADN(C74270Pry pry) {
        C66583MXo.A0p();
        throw AnonymousClass00P.createAndThrow();
    }
}

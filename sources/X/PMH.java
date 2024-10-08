package X;

import android.view.View;
import com.facebook.proxygen.LigerSamplePolicy;
import com.facebook.rtc.views.omnigridview.OmniGridView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorCoordinatorLayout;

public final class PMH implements C74361Ptb {
    public OK6 A00;
    public boolean A01;
    public final View A02;
    public final UserSession A03;
    public final AnonymousClass0eM A04 = C73922Pm2.A01(this, 11);
    public final AnonymousClass0eM A05 = C73922Pm2.A01(this, 12);
    public final AnonymousClass0eM A06 = C73922Pm2.A01(this, 13);
    public final AnonymousClass0eM A07 = C73922Pm2.A01(this, 14);
    public final AnonymousClass0eM A08 = C73922Pm2.A01(this, 15);

    public final OK6 A00() {
        OK6 ok6 = this.A00;
        if (ok6 != null) {
            return ok6;
        }
        0qQ.A0F("listener");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.Ps0, java.lang.Object] */
    public final /* bridge */ /* synthetic */ void ADN(C74270Pry pry) {
        C71439Oke oke;
        C68292N9f n9f = (C68292N9f) pry;
        0qQ.A0B(n9f, 0);
        boolean z = n9f.A00;
        OmniGridView omniGridView = (OmniGridView) this.A04.getValue();
        if (z) {
            omniGridView.A06 = (C71773OqZ) this.A07.getValue();
            oke = new C71439Oke((Object) this, 15);
        } else {
            oke = null;
            omniGridView.A06 = null;
        }
        omniGridView.A00 = oke;
        if (n9f.A01) {
            View A0c = AnonymousClass7TE.A0c(this.A06);
            0qQ.A0B(A0c, 0);
            A0c.setOnTouchListener((N1V) this.A05.getValue());
        } else {
            AnonymousClass0eM r1 = this.A06;
            if (r1.CVQ()) {
                this.A05.getValue();
                View A0c2 = AnonymousClass7TE.A0c(r1);
                0qQ.A0B(A0c2, 0);
                A0c2.setOnTouchListener((View.OnTouchListener) null);
            }
        }
        boolean z2 = this.A01;
        boolean z3 = n9f.A03;
        if (z2 != z3 && z3) {
            A00().A00.A04.A06(new Object(), LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
        }
        this.A01 = z3;
    }

    public PMH(View view, UserSession userSession) {
        this.A02 = view;
        this.A03 = userSession;
        ((TouchInterceptorCoordinatorLayout) view).CNi(new C71439Oke((Object) this, 14));
    }
}

package X;

import android.widget.RatingBar;

/* renamed from: X.OlJ  reason: case insensitive filesystem */
public final class C71475OlJ implements RatingBar.OnRatingBarChangeListener {
    public final /* synthetic */ RatingBar A00;
    public final /* synthetic */ PMS A01;

    public C71475OlJ(RatingBar ratingBar, PMS pms) {
        this.A01 = pms;
        this.A00 = ratingBar;
    }

    public final void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
        PMS pms = this.A01;
        int i = (int) f;
        C69102Neh neh = pms.A03().A00;
        C71111Ocu ocu = neh.A08;
        ocu.A03(new PPM(i, 0));
        if (i <= 1 || (i == 2 && Math.random() < 0.6d)) {
            C71111Ocu.A00(ocu, C72878PNo.class);
            N9G n9g = neh.A01;
            if (n9g == null) {
                0qQ.A0F("endStateModel");
                throw AnonymousClass00P.createAndThrow();
            }
            ocu.A05(new C68297N9k(!n9g.A09));
        } else {
            ocu.A06(C72878PNo.A00, neh.A00);
        }
        RatingBar ratingBar2 = this.A00;
        ratingBar2.setIsIndicator(true);
        PMS.A00(ratingBar2);
        JTO.A0I(pms.A0L).setText(2131954521);
    }
}

package X;

import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.Fk4  reason: case insensitive filesystem */
public final class C50886Fk4 implements C254093rv {
    public final /* synthetic */ C322106vG A00;

    public final void DJV(AnonymousClass6NS r6, C49599EzI ezI) {
        C322106vG r3 = this.A00;
        C322106vG.A00(r3);
        FrameLayout frameLayout = r3.A00;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        r3.A02 = r6;
        C273694n2 r2 = r3.A01;
        if (r2 != null) {
            r2.setVisibility(8);
            AnonymousClass6NS r0 = r3.A02;
            if (r0 != null) {
                r0.A07(r2);
            }
            r2.measure(View.MeasureSpec.makeMeasureSpec(0nA.A09(AnonymousClass7TE.A0S(r2)), SN3.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(0, 0));
            r2.setTranslationY((float) r2.getMeasuredHeight());
            r2.setVisibility(0);
        }
        2cs r22 = r3.A03;
        r22.A05(-1.0d);
        r22.A04();
        ezI.A02.DbK(ezI.A01);
    }

    public C50886Fk4(C322106vG r1) {
        this.A00 = r1;
    }

    public final void DOJ(String str) {
        AnonymousClass7TH.A0R(this.A00.A00);
    }
}

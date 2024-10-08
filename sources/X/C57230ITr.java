package X;

import android.content.Context;
import android.view.MotionEvent;

/* renamed from: X.ITr  reason: case insensitive filesystem */
public final class C57230ITr implements C253873rY {
    public final JSv A00;
    public final C55848HoV A01;
    public final C253893ra A02;

    public C57230ITr(Context context, JSv jSv, C53346GmW gmW, C55848HoV hoV) {
        0qQ.A0B(jSv, 3);
        this.A00 = jSv;
        this.A01 = hoV;
        Context context2 = context;
        this.A02 = new C253893ra(context2, gmW.A07.A00(), new C57233ITu(this), gmW.A06, hoV.A06, gmW.A01);
    }

    public final boolean DF8(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        return this.A02.DF8(motionEvent);
    }
}

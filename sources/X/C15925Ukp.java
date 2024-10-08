package X;

import android.content.Context;
import android.graphics.PointF;
import android.view.animation.PathInterpolator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ukp  reason: case insensitive filesystem */
public final class C15925Ukp extends C15927Ukr {
    public int A00;
    public final Integer A01 = AnonymousClass05K.A01;
    public final List A02;
    public final List A03;
    public final List A04;
    public final List A05;
    public final C360728f3 A06 = C360728f3.POP;

    public final C360728f3 A0X() {
        return this.A06;
    }

    public C15925Ukp(Context context, int i) {
        super(context, i);
        ArrayList arrayList = new ArrayList();
        this.A02 = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.A03 = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.A04 = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        this.A05 = arrayList4;
        arrayList2.add(new PointF(0.0f, 0.0f));
        C13988Tno.A1T(arrayList2, 0.33333334f, 1.15f);
        C13988Tno.A1T(arrayList2, 0.5555556f, 0.89f);
        C13988Tno.A1T(arrayList2, 0.7777778f, 1.05f);
        arrayList2.add(new PointF(1.0f, 1.0f));
        C13988Tno.A1T(arrayList4, 0.0f, 1.0f);
        C13988Tno.A1T(arrayList4, 0.5f, 1.1f);
        C13988Tno.A1T(arrayList4, 1.0f, 0.0f);
        arrayList.add(new PathInterpolator(0.16666667f, 0.16666667f, 0.13455492f, 1.0f));
        arrayList.add(new PathInterpolator(0.6698928f, 0.0f, 0.42556378f, 1.0f));
        arrayList.add(new PathInterpolator(0.72331685f, 0.0f, 0.42846164f, 1.0f));
        arrayList.add(new PathInterpolator(0.42846164f, 0.0f, 0.5503368f, 1.0f));
        arrayList3.add(new PathInterpolator(0.623265f, 0.0f, 0.5811811f, 1.0f));
        arrayList3.add(new PathInterpolator(0.7035138f, 0.0f, 0.8333333f, 0.8333333f));
    }

    public final void A0R() {
        super.A0R();
        int i = this.A02 - 10;
        if (i < 1) {
            i = 1;
        }
        this.A00 = (64 / i) + 80;
    }
}

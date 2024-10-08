package X;

import android.view.View;
import com.facebook.litho.ComponentHost;

public final class GPF implements C244503bI {
    public final 0eP A00;

    public final /* bridge */ /* synthetic */ C246263eI ADL(AnonymousClass2WF r5, Object obj, Object obj2) {
        0qQ.A0B(r5, 1);
        ComponentHost componentHost = (View) obj;
        0qQ.A0B(componentHost, 1);
        if (componentHost instanceof AnonymousClass2U3) {
            0eP r2 = this.A00;
            float A04 = AnonymousClass7TE.A04(r2.A00);
            float A042 = AnonymousClass7TE.A04(r2.A01);
            ComponentHost componentHost2 = (AnonymousClass2U3) componentHost;
            componentHost2.A00 = A04;
            componentHost2.A01 = A042;
            ComponentHost.A0E(componentHost2);
            return C51965G9l.A0f(new TTN(componentHost, 29));
        }
        throw AnonymousClass7TE.A0z("Setting transform pivot is only supported on Views that implement SupportsPivotTransform. If it isn't possible to add this interface to the View in question, wrap this Component in a Row or Column and apply the transform and pivot there instead.");
    }

    public final String getDescription() {
        return "pivotPercent";
    }

    public GPF(0eP r1) {
        this.A00 = r1;
    }

    public final boolean Ete(Object obj, Object obj2, Object obj3, Object obj4) {
        return !C245173cR.A02(obj, obj2);
    }
}

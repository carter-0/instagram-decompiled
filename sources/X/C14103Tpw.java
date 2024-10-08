package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.Tpw  reason: case insensitive filesystem */
public final class C14103Tpw implements C253183qL {
    public final /* bridge */ /* synthetic */ Object ADM(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        C14100Tpt tpt = (C14100Tpt) obj2;
        if (tpt.A01 <= 0) {
            return null;
        }
        if (tpt.A0C.A00 == 1) {
            view.setVerticalFadingEdgeEnabled(true);
        } else {
            view.setHorizontalFadingEdgeEnabled(true);
        }
        view.setFadingEdgeLength(tpt.A01);
        return null;
    }

    public final /* bridge */ /* synthetic */ boolean Ete(Object obj, Object obj2, Object obj3, Object obj4) {
        return JTQ.A1O(((C14100Tpt) obj).A01, ((C14100Tpt) obj2).A01);
    }

    public final /* bridge */ /* synthetic */ void FIN(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        View view = (View) obj;
        view.setVerticalFadingEdgeEnabled(false);
        view.setHorizontalFadingEdgeEnabled(false);
        view.setFadingEdgeLength(0);
    }

    public final /* synthetic */ Class CAe() {
        return getClass();
    }

    public final /* synthetic */ String getDescription() {
        return C13988Tno.A0d(this);
    }
}

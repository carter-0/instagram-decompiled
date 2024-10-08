package X;

import android.content.Context;
import android.view.View;

public final class GGA implements C253183qL {
    public static final GGA A00 = new Object();

    public final /* bridge */ /* synthetic */ Object ADM(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        GG9 gg9 = (GG9) obj2;
        AnonymousClass7TG.A1O(view, gg9);
        C267324bN r5 = gg9.A02;
        C52046GCs gCs = gg9.A03;
        gCs.A02(view);
        if (GDZ.A00(r5) || r5.A07() != null || gg9.A06) {
            gCs.A03(view, gg9.A00, gg9.A01, r5, gg9.A04, gg9.A06, gg9.A05);
        }
        return C60340gF.A00;
    }

    public final /* synthetic */ String getDescription() {
        return V6I.A00(this);
    }

    public final /* bridge */ /* synthetic */ void FIN(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        View view = (View) obj;
        GG9 gg9 = (GG9) obj2;
        AnonymousClass7TG.A1O(view, gg9);
        gg9.A03.A02(view);
    }

    public final /* synthetic */ Class CAe() {
        return getClass();
    }

    public final /* bridge */ /* synthetic */ boolean Ete(Object obj, Object obj2, Object obj3, Object obj4) {
        return false;
    }
}

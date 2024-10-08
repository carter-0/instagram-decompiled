package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.Tpx  reason: case insensitive filesystem */
public final class C14104Tpx implements C253183qL {
    public final /* bridge */ /* synthetic */ Object ADM(Context context, Object obj, Object obj2, Object obj3) {
        ((View) obj).setNestedScrollingEnabled(((C14100Tpt) obj2).A0A);
        return null;
    }

    public final /* bridge */ /* synthetic */ boolean Ete(Object obj, Object obj2, Object obj3, Object obj4) {
        return JTQ.A1O(((C14100Tpt) obj).A0A ? 1 : 0, ((C14100Tpt) obj2).A0A ? 1 : 0);
    }

    public final /* bridge */ /* synthetic */ void FIN(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        ((View) obj).setNestedScrollingEnabled(true);
    }

    public final /* synthetic */ Class CAe() {
        return getClass();
    }

    public final /* synthetic */ String getDescription() {
        return C13988Tno.A0d(this);
    }
}

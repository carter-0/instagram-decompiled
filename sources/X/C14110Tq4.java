package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Tq4  reason: case insensitive filesystem */
public final class C14110Tq4 implements C253183qL {
    public final /* bridge */ /* synthetic */ Object ADM(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        C228432lf r0 = ((C14100Tpt) obj2).A06;
        if (r0 == null) {
            return null;
        }
        r0.A07(recyclerView);
        return null;
    }

    public final /* bridge */ /* synthetic */ boolean Ete(Object obj, Object obj2, Object obj3, Object obj4) {
        return !2Ob.A00(((C14100Tpt) obj).A06, ((C14100Tpt) obj2).A06);
    }

    public final /* bridge */ /* synthetic */ void FIN(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        C228432lf r0 = ((C14100Tpt) obj2).A06;
        if (r0 != null) {
            r0.A07((RecyclerView) null);
        }
    }

    public final /* synthetic */ Class CAe() {
        return getClass();
    }

    public final /* synthetic */ String getDescription() {
        return C13988Tno.A0d(this);
    }
}

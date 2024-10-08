package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.Tq1  reason: case insensitive filesystem */
public final class C14107Tq1 implements C253183qL {
    public final /* bridge */ /* synthetic */ Object ADM(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        List<AnonymousClass3B3> list = ((C14100Tpt) obj2).A08;
        if (list == null) {
            return null;
        }
        for (AnonymousClass3B3 A11 : list) {
            recyclerView.A11(A11);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ boolean Ete(Object obj, Object obj2, Object obj3, Object obj4) {
        return !2Ob.A00(((C14100Tpt) obj).A08, ((C14100Tpt) obj2).A08);
    }

    public final /* bridge */ /* synthetic */ void FIN(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        RecyclerView recyclerView = (RecyclerView) obj;
        List<AnonymousClass3B3> list = ((C14100Tpt) obj2).A08;
        if (list != null) {
            for (AnonymousClass3B3 A12 : list) {
                recyclerView.A12(A12);
            }
        }
    }

    public final /* synthetic */ Class CAe() {
        return getClass();
    }

    public final /* synthetic */ String getDescription() {
        return C13988Tno.A0d(this);
    }
}

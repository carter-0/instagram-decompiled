package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.Tq3  reason: case insensitive filesystem */
public final class C14109Tq3 implements C253183qL {
    public final /* bridge */ /* synthetic */ Object ADM(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        List list = ((C14100Tpt) obj2).A09;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            recyclerView.A15((C249403jg) list.get(i));
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ boolean Ete(Object obj, Object obj2, Object obj3, Object obj4) {
        List list = ((C14100Tpt) obj).A09;
        List list2 = ((C14100Tpt) obj2).A09;
        if (list == list2) {
            return false;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return true;
        }
        return !list.equals(list2);
    }

    public final /* bridge */ /* synthetic */ void FIN(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        RecyclerView recyclerView = (RecyclerView) obj;
        List list = ((C14100Tpt) obj2).A09;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                recyclerView.A16((C249403jg) list.get(i));
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

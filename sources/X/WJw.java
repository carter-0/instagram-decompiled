package X;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public final class WJw implements C253183qL {
    public final /* bridge */ /* synthetic */ Object ADM(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        0qQ.A0B(recyclerView, 1);
        C252553pI r4 = recyclerView.A0D;
        if ((r4 instanceof GridLayoutManager) && (obj3 instanceof C15169UTu)) {
            ((GridLayoutManager) r4).A01 = new U9T(00k.A0a(((C15169UTu) obj3).A00), 0);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ boolean Ete(Object obj, Object obj2, Object obj3, Object obj4) {
        if (obj3 != null) {
            C15169UTu uTu = (C15169UTu) obj3;
            if (obj4 != null) {
                return C51966G9m.A1a(uTu.A00, ((C15169UTu) obj4).A00);
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final /* synthetic */ Class CAe() {
        return getClass();
    }

    public final /* synthetic */ String getDescription() {
        return C13988Tno.A0d(this);
    }

    public final /* bridge */ /* synthetic */ void FIN(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
    }
}

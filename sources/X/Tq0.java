package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

public final class Tq0 implements C253183qL {
    public final /* bridge */ /* synthetic */ Object ADM(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        C14100Tpt tpt = (C14100Tpt) obj2;
        recyclerView.setAdapter(tpt.A0D);
        recyclerView.setItemAnimator((AnonymousClass3AS) null);
        C17181VLl vLl = tpt.A07;
        if (vLl == null || vLl.A00 == null) {
            int i = tpt.A03;
            if (i >= 0) {
                recyclerView.A0o(i);
                return null;
            }
        } else {
            C252553pI r1 = recyclerView.A0D;
            r1.getClass();
            r1.A1P(tpt.A07.A00);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ boolean Ete(Object obj, Object obj2, Object obj3, Object obj4) {
        return C51969G9p.A1a(((C14100Tpt) obj).A0D, ((C14100Tpt) obj2).A0D);
    }

    public final /* bridge */ /* synthetic */ void FIN(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        RecyclerView recyclerView = (RecyclerView) obj;
        C17181VLl vLl = ((C14100Tpt) obj2).A07;
        if (vLl != null) {
            C252553pI r0 = recyclerView.A0D;
            r0.getClass();
            vLl.A00 = r0.A1M();
        }
        recyclerView.setAdapter((2Rw) null);
    }

    public final /* synthetic */ Class CAe() {
        return getClass();
    }

    public final /* synthetic */ String getDescription() {
        return C13988Tno.A0d(this);
    }
}

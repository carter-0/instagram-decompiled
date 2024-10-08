package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public final class HB8 extends AnonymousClass369 {
    public final C230522pl A00;
    public final RecyclerView A01;
    public final List A02;

    public final /* bridge */ /* synthetic */ void Cs1(Object obj, int i) {
        1Xj r2 = (1Xj) obj;
        0qQ.A0B(r2, 0);
        this.A00.Dv0((0jB) null, r2, i, 0, 0);
    }

    public final void FN9(AnonymousClass345 r4, int i) {
        View A1D;
        0qQ.A0B(r4, 0);
        C252553pI r0 = this.A01.A0D;
        if (r0 != null && (A1D = r0.A1D(i)) != null && C55005Hac.A00(A1D, 0.001d)) {
            1Xj A0T = DbZ.A0T(this.A02, i);
            String id = A0T.getId();
            if (id != null) {
                r4.FNB(id, A0T, i);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final Class C9I() {
        return 1Xj.class;
    }

    public HB8(RecyclerView recyclerView, C230522pl r2, List list) {
        this.A02 = list;
        this.A01 = recyclerView;
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void Crz(Object obj) {
        this.A00.Duz(C51968G9o.A0m(obj));
    }
}

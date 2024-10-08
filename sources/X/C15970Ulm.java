package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;

/* renamed from: X.Ulm  reason: case insensitive filesystem */
public final class C15970Ulm extends AnonymousClass369 {
    public final C15689Ugu A00;
    public final RecyclerView A01;
    public final AnonymousClass340 A02;

    public final void FN9(AnonymousClass345 r10, int i) {
        0qQ.A0B(r10, 0);
        Object C9G = this.A02.C9G(i);
        if (C9G != null) {
            C21051XBs xBs = (C21051XBs) C9G;
            String id = xBs.getId();
            if (id != null) {
                r10.FNB(id, xBs, i);
            }
            RecyclerView recyclerView = this.A01;
            C252553pI r0 = recyclerView.A0D;
            if (r0 != null) {
                View childAt = recyclerView.getChildAt(i - ((LinearLayoutManager) r0).A1a());
                double d = 1.0d;
                if (childAt.getBottom() > recyclerView.getHeight()) {
                    d = 1.0d - ((double) ((childAt.getBottom() - recyclerView.getHeight()) / childAt.getHeight()));
                }
                C15689Ugu ugu = this.A00;
                if (xBs.CAU() != C16606Uy2.SWIPE_TO_OPEN) {
                    Map map = ugu.A07;
                    if (d <= ((double) C13989Tnp.A05(C51966G9m.A14(id, map)))) {
                        return;
                    }
                    if (id != null) {
                        map.put(id, Float.valueOf((float) d));
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final Class C9I() {
        return C21051XBs.class;
    }

    public final /* bridge */ /* synthetic */ void Crz(Object obj) {
        C21051XBs xBs = (C21051XBs) obj;
        0qQ.A0B(xBs, 0);
        C15689Ugu ugu = this.A00;
        if (xBs.CAU() != C16606Uy2.SWIPE_TO_OPEN) {
            String id = xBs.getId();
            if (id != null) {
                ugu.A02(id);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final /* bridge */ /* synthetic */ void Cs1(Object obj, int i) {
        C21051XBs xBs = (C21051XBs) obj;
        0qQ.A0B(xBs, 0);
        C15689Ugu ugu = this.A00;
        if (xBs.CAU() != C16606Uy2.SWIPE_TO_OPEN) {
            long currentTimeMillis = System.currentTimeMillis();
            String id = xBs.getId();
            if (id != null) {
                ugu.A05.put(id, new C17200VMe(id, currentTimeMillis));
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public C15970Ulm(RecyclerView recyclerView, C15689Ugu ugu, AnonymousClass340 r3) {
        this.A02 = r3;
        this.A00 = ugu;
        this.A01 = recyclerView;
    }
}

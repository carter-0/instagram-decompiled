package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.AoN  reason: case insensitive filesystem */
public final class C41101AoN implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AJN A01;
    public final /* synthetic */ C355568Qm A02;

    public C41101AoN(AJN ajn, C355568Qm r2, int i) {
        this.A02 = r2;
        this.A01 = ajn;
        this.A00 = i;
    }

    public final void run() {
        C355568Qm r5 = this.A02;
        RecyclerView recyclerView = r5.A0I;
        if (recyclerView != null && recyclerView.A0T) {
            AJN ajn = this.A01;
            if (!ajn.A04) {
                C249703kE r4 = ajn.A0C;
                if (r4.getAbsoluteAdapterPosition() != -1) {
                    AnonymousClass3AS r0 = recyclerView.A0C;
                    if (r0 == null || !r0.A0L()) {
                        List list = r5.A0K;
                        int size = list.size();
                        int i = 0;
                        while (i < size) {
                            if (((AJN) list.get(i)).A05) {
                                i++;
                            }
                        }
                        r5.A0F.onSwiped(r4, this.A00);
                        return;
                    }
                    r5.A0I.post(this);
                }
            }
        }
    }
}

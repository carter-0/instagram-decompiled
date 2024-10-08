package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.PZU  reason: case insensitive filesystem */
public final class C73250PZU implements Runnable {
    public final /* synthetic */ C61069Jw7 A00;
    public final /* synthetic */ C68478NJv A01;

    public C73250PZU(C61069Jw7 jw7, C68478NJv nJv) {
        this.A01 = nJv;
        this.A00 = jw7;
    }

    public final void run() {
        C68478NJv nJv = this.A01;
        RecyclerView recyclerView = nJv.A0C;
        if (recyclerView != null) {
            AnonymousClass3AS r0 = recyclerView.A0C;
            if (r0 != null && r0.A0L()) {
                RecyclerView recyclerView2 = nJv.A0C;
                if (recyclerView2 != null) {
                    AnonymousClass3AS r2 = recyclerView2.A0C;
                    if (r2 != null) {
                        C71506Olv olv = new C71506Olv(this.A00, nJv);
                        if (!r2.A0L()) {
                            olv.CvT();
                            return;
                        } else {
                            r2.A05.add(olv);
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } else {
                return;
            }
        }
        0qQ.A0F("recyclerView");
        throw AnonymousClass00P.createAndThrow();
    }
}

package X;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Acb  reason: case insensitive filesystem */
public final class C40466Acb implements AnonymousClass7EF {
    public final /* synthetic */ C332297Uk A00;

    public C40466Acb(C332297Uk r1) {
        this.A00 = r1;
    }

    public final void CDN(Rect rect) {
        0qQ.A0B(rect, 0);
        RecyclerView recyclerView = this.A00.A00;
        if (recyclerView == null) {
            0qQ.A0F("messageRecyclerView");
            throw AnonymousClass00P.createAndThrow();
        } else {
            rect.set(0, 0, recyclerView.getWidth(), 0);
        }
    }
}

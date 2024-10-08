package X;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

public final class M78 implements Runnable {
    public final /* synthetic */ RecyclerView A00;
    public final /* synthetic */ C63877LAg A01;

    public M78(RecyclerView recyclerView, C63877LAg lAg) {
        this.A01 = lAg;
        this.A00 = recyclerView;
    }

    public final void run() {
        C63877LAg lAg = this.A01;
        C63926LDj lDj = (C63926LDj) lAg.A06.getValue();
        C58717IwQ iwQ = new C58717IwQ(48, this.A00, lAg);
        Fragment fragment = lDj.A00;
        if (!fragment.mDetached && !AnonymousClass7TE.A1b(lDj.A03.A00)) {
            1NY A0a = AnonymousClass7TG.A0a(lDj.A01);
            A0a.A0A("music/trending/");
            A0a.A0Q(CGO.class, C45699D1y.class);
            1OC A0T = DbT.A0T(A0a, "product", "feed_post");
            C61499KAe.A00(A0T, iwQ, lDj, 3);
            1ES.A00(fragment.requireContext(), AnonymousClass07i.A00(fragment), A0T);
        }
    }
}

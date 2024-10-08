package X;

import android.app.Activity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.EPt  reason: case insensitive filesystem */
public final class C47987EPt extends AnonymousClass6UX {
    public final RecyclerView A00;
    public final List A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47987EPt(Activity activity, RecyclerView recyclerView, C230222pE r4, List list) {
        super(activity, r4);
        AnonymousClass7TF.A1D(r4, 2, list);
        this.A00 = recyclerView;
        this.A01 = list;
    }

    public final AnonymousClass6KT A08(Reel reel, C255773uh r7) {
        AnonymousClass6KT A012;
        LinearLayoutManager linearLayoutManager;
        int indexOf;
        0qQ.A0B(reel, 0);
        List list = this.A01;
        int indexOf2 = list.indexOf(reel);
        RecyclerView recyclerView = this.A00;
        C249703kE A0W = recyclerView.A0W(indexOf2);
        if (A0W instanceof C46966DoK) {
            C252553pI r2 = recyclerView.A0D;
            if ((r2 instanceof GridLayoutManager) && (linearLayoutManager = (LinearLayoutManager) r2) != null && (indexOf = list.indexOf(reel)) >= linearLayoutManager.A1c() && indexOf <= linearLayoutManager.A1d()) {
                A012 = AnonymousClass6KT.A04(((C46966DoK) A0W).A02.getAvatarBounds());
                0qQ.A0A(A012);
                return A012;
            }
        }
        A012 = AnonymousClass6KT.A01();
        0qQ.A0A(A012);
        return A012;
    }

    public final void A09(Reel reel) {
    }

    public final void A0A(Reel reel, C255773uh r2) {
    }

    public final void A0C(Reel reel, C255773uh r2) {
    }
}

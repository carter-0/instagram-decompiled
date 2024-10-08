package X;

import android.app.Activity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.model.reels.Reel;
import java.util.List;

public final class KWH extends AnonymousClass6UX {
    public final RecyclerView A00;
    public final C60441JlZ A01;
    public final L2H A02;
    public final boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KWH(Activity activity, RecyclerView recyclerView, C230222pE r4, C60441JlZ jlZ, L2H l2h, boolean z) {
        super(activity, r4);
        DbW.A1N(r4, 2, jlZ);
        this.A03 = z;
        this.A00 = recyclerView;
        this.A01 = jlZ;
        this.A02 = l2h;
    }

    public final AnonymousClass6KT A08(Reel reel, C255773uh r7) {
        AnonymousClass6KT A012;
        0qQ.A0B(reel, 0);
        List list = this.A01.A02;
        RecyclerView recyclerView = this.A00;
        C249703kE A0W = recyclerView.A0W(list.indexOf(reel) + (this.A03 ? 1 : 0));
        if (A0W instanceof C60644Jor) {
            C252553pI r2 = recyclerView.A0D;
            0qQ.A0C(r2, C66579MXk.A00(21));
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r2;
            int indexOf = list.indexOf(reel);
            if (indexOf >= linearLayoutManager.A1c() && indexOf <= linearLayoutManager.A1d()) {
                A012 = AnonymousClass6KT.A04(((C60644Jor) A0W).A02.getAvatarBounds());
                0qQ.A0A(A012);
                return A012;
            }
        }
        A012 = AnonymousClass6KT.A01();
        0qQ.A0A(A012);
        return A012;
    }

    public final void A09(Reel reel) {
        0qQ.A0B(reel, 0);
        L2H l2h = this.A02;
        if (l2h != null) {
            K7b k7b = l2h.A00;
            AnonymousClass0eM r2 = k7b.A0A;
            if (((C60441JlZ) r2.getValue()).A02.indexOf(reel) + 6 >= ((C60441JlZ) r2.getValue()).A02.size()) {
                K7b.A01(k7b);
            }
        }
    }

    public final void A0A(Reel reel, C255773uh r2) {
    }

    public final void A0C(Reel reel, C255773uh r2) {
    }
}

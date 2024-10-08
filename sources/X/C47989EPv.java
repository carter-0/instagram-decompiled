package X;

import android.app.Activity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.model.reels.Reel;

/* renamed from: X.EPv  reason: case insensitive filesystem */
public final class C47989EPv extends AnonymousClass6UX {
    public final RecyclerView A00;
    public final C46840DmG A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47989EPv(Activity activity, RecyclerView recyclerView, C46840DmG dmG, C230222pE r5) {
        super(activity, r5);
        0qQ.A0B(dmG, 4);
        this.A00 = recyclerView;
        this.A01 = dmG;
    }

    public final AnonymousClass6KT A08(Reel reel, C255773uh r7) {
        AnonymousClass6KT A012;
        0qQ.A0B(reel, 0);
        C46840DmG dmG = this.A01;
        int indexOf = dmG.A00().indexOf(reel);
        RecyclerView recyclerView = this.A00;
        C249703kE A0W = recyclerView.A0W(indexOf);
        if (A0W instanceof C46948Do2) {
            C252553pI r2 = recyclerView.A0D;
            0qQ.A0C(r2, C66579MXk.A00(21));
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r2;
            int indexOf2 = dmG.A00().indexOf(reel);
            if (indexOf2 >= linearLayoutManager.A1c() && indexOf2 <= linearLayoutManager.A1d()) {
                A012 = AnonymousClass6KT.A04(((C46948Do2) A0W).A01.getAvatarBounds());
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

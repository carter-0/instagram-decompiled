package X;

import android.app.Activity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.model.reels.Reel;

public final class KWG extends AnonymousClass6UX {
    public final RecyclerView A00;
    public final C60425JlI A01;
    public final L2J A02;

    public final AnonymousClass6KT A08(Reel reel, C255773uh r7) {
        AnonymousClass6KT A012;
        0qQ.A0B(reel, 0);
        C60425JlI jlI = this.A01;
        int indexOf = jlI.A00().indexOf(reel);
        RecyclerView recyclerView = this.A00;
        C249703kE A0W = recyclerView.A0W(indexOf);
        if (A0W instanceof C60644Jor) {
            C252553pI r2 = recyclerView.A0D;
            0qQ.A0C(r2, C66579MXk.A00(21));
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r2;
            int indexOf2 = jlI.A00().indexOf(reel);
            if (indexOf2 >= linearLayoutManager.A1c() && indexOf2 <= linearLayoutManager.A1d()) {
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
        L2J l2j = this.A02;
        if (l2j != null) {
            C61427K7c k7c = l2j.A00;
            AnonymousClass0eM r2 = k7c.A07;
            if (((C60425JlI) r2.getValue()).A00().indexOf(reel) + 6 >= ((C60425JlI) r2.getValue()).A00().size()) {
                2YL A0H = DbS.A0H(k7c.A0L);
                AnonymousClass7TE.A1Z(new MG3((Object) A0H, (AnonymousClass4D7) null, 27), C318116oQ.A00(A0H));
            }
        }
    }

    public final void A0A(Reel reel, C255773uh r2) {
    }

    public final void A0C(Reel reel, C255773uh r2) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KWG(Activity activity, RecyclerView recyclerView, C230222pE r3, C60425JlI jlI, L2J l2j) {
        super(activity, r3);
        C51972G9s.A1C(r3, jlI);
        this.A00 = recyclerView;
        this.A01 = jlI;
        this.A02 = l2j;
    }
}

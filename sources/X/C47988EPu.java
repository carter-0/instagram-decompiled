package X;

import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.model.reels.Reel;
import java.util.Iterator;

/* renamed from: X.EPu  reason: case insensitive filesystem */
public final class C47988EPu extends AnonymousClass6UX {
    public final RecyclerView A00;
    public final C46850DmS A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47988EPu(Activity activity, RecyclerView recyclerView, C46850DmS dmS, C230222pE r5) {
        super(activity, r5);
        0qQ.A0B(dmS, 4);
        this.A00 = recyclerView;
        this.A01 = dmS;
    }

    public final AnonymousClass6KT A08(Reel reel, C255773uh r6) {
        AnonymousClass6KT A012;
        0qQ.A0B(reel, 0);
        Iterator it = this.A01.A00.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (0qQ.A0K(reel.getId(), ((C47250Dtb) it.next()).A02)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        C249703kE A0W = this.A00.A0W(i);
        if (A0W instanceof C47027DpJ) {
            A012 = AnonymousClass6KT.A04(((C47027DpJ) A0W).A06.getAvatarBounds());
        } else {
            A012 = AnonymousClass6KT.A01();
        }
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

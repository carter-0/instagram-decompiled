package X;

import android.app.Activity;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.model.reels.Reel;
import java.util.Iterator;
import java.util.List;

public final class KWI extends AnonymousClass6UX {
    public final K71 A00;
    public final AnonymousClass3N3 A01;

    public KWI(K71 k71, AnonymousClass3N3 r3) {
        super((Activity) null, (C230222pE) null);
        this.A01 = r3;
        this.A00 = k71;
    }

    public final boolean A07() {
        return true;
    }

    public final void A09(Reel reel) {
    }

    public final void A0A(Reel reel, C255773uh r2) {
    }

    public final void A0B(Reel reel, C255773uh r8) {
        int i;
        0qQ.A0B(r8, 1);
        K71 k71 = this.A00;
        String str = r8.A0k;
        0qQ.A07(str);
        List list = k71.A09;
        if (list != null) {
            Iterator it = list.iterator();
            i = 0;
            while (true) {
                if (it.hasNext()) {
                    if (0qQ.A0K(((Reel) it.next()).getId(), str)) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
        } else {
            i = 0;
        }
        RecyclerView recyclerView = k71.A00;
        if (recyclerView != null) {
            recyclerView.A0p(Math.max(i, 0));
        }
    }

    public final void A0C(Reel reel, C255773uh r2) {
    }

    public final AnonymousClass6KT A08(Reel reel, C255773uh r7) {
        Rect A0W = AnonymousClass7TE.A0W();
        this.A01.AeY().getWindowVisibleDisplayFrame(A0W);
        float f = (float) ((A0W.bottom / 2) * 3);
        return AnonymousClass6KT.A03(new RectF((float) A0W.left, f, (float) A0W.right, f));
    }
}

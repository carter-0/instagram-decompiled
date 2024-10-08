package X;

import android.graphics.Rect;
import android.graphics.RectF;
import com.instagram.model.reels.Reel;

public final class HDO extends AnonymousClass6UX {
    public AnonymousClass3N3 A00;

    public final boolean A07() {
        return true;
    }

    public final void A09(Reel reel) {
    }

    public final void A0A(Reel reel, C255773uh r2) {
    }

    public final void A0B(Reel reel, C255773uh r2) {
    }

    public final void A0C(Reel reel, C255773uh r2) {
    }

    public final AnonymousClass6KT A08(Reel reel, C255773uh r7) {
        Rect A0W = AnonymousClass7TE.A0W();
        this.A00.AeY().getWindowVisibleDisplayFrame(A0W);
        float f = (float) ((A0W.bottom / 2) * 3);
        return AnonymousClass6KT.A03(new RectF((float) A0W.left, f, (float) A0W.right, f));
    }
}

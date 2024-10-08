package X;

import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.Lct  reason: case insensitive filesystem */
public final class C64492Lct implements MRU {
    public final /* synthetic */ 1Xj A00;

    public C64492Lct(1Xj r1) {
        this.A00 = r1;
    }

    public final boolean Esv(Reel reel) {
        1Xj r0 = this.A00;
        String id = reel.getId();
        List BDV = r0.A0C.BDV();
        if (BDV == null || !00k.A0u(BDV, id)) {
            return false;
        }
        return true;
    }
}

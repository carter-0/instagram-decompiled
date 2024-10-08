package X;

import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.util.List;

/* renamed from: X.A8x  reason: case insensitive filesystem */
public final class C39778A8x {
    public String A00;
    public String A01;
    public String A02;
    public final ReelStore A03;

    public final Reel A00(C384619hc r4) {
        0qQ.A0B(r4, 0);
        this.A01 = r4.A00.A1U;
        this.A02 = r4.A01;
        List list = r4.A02;
        0qQ.A07(list);
        this.A00 = (String) 00k.A0J(list);
        return this.A03.A0I(r4.A00, true);
    }

    public C39778A8x(ReelStore reelStore) {
        this.A03 = reelStore;
    }
}

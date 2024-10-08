package X;

import com.instagram.model.reels.Reel;

/* renamed from: X.Lhf  reason: case insensitive filesystem */
public final class C64763Lhf implements C232262tL {
    public final Reel A00;

    public C64763Lhf(Reel reel) {
        0qQ.A0B(reel, 1);
        this.A00 = reel;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return JTP.A0r(this.A00);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C64763Lhf lhf = (C64763Lhf) obj;
        String id = this.A00.getId();
        if (lhf != null) {
            str = lhf.A00.getId();
        } else {
            str = null;
        }
        return 0qQ.A0K(id, str);
    }
}

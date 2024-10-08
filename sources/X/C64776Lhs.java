package X;

import com.instagram.model.reels.Reel;

/* renamed from: X.Lhs  reason: case insensitive filesystem */
public final class C64776Lhs implements C232262tL {
    public final Reel A00;
    public final boolean A01;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return JTP.A0r(this.A00);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        boolean z;
        C64776Lhs lhs = (C64776Lhs) obj;
        boolean z2 = this.A01;
        if (lhs != null) {
            z = lhs.A01;
        } else {
            z = false;
        }
        if (z2 == z) {
            return true;
        }
        return false;
    }

    public C64776Lhs(Reel reel, boolean z) {
        this.A00 = reel;
        this.A01 = z;
    }
}

package X;

import com.instagram.model.reels.Reel;

/* renamed from: X.Jyc  reason: case insensitive filesystem */
public final class C61183Jyc extends AnonymousClass0T0 implements MQH {
    public final int A00;
    public final Reel A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61183Jyc) {
                C61183Jyc jyc = (C61183Jyc) obj;
                if (!0qQ.A0K(this.A01, jyc.A01) || this.A00 != jyc.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A01) + this.A00;
    }

    public C61183Jyc(Reel reel, int i) {
        this.A01 = reel;
        this.A00 = i;
    }
}

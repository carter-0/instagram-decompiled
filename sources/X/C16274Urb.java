package X;

import com.instagram.model.reels.Reel;

/* renamed from: X.Urb  reason: case insensitive filesystem */
public final class C16274Urb extends C18001Vjd {
    public final 1Xj A00;
    public final Reel A01;
    public final String A02;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C16274Urb(X.1Xj r7, com.instagram.model.reels.Reel r8, java.lang.String r9) {
        /*
            r6 = this;
            r0 = 1
            r3 = r9
            X.0qQ.A0B(r9, r0)
            java.lang.Integer r2 = X.AnonymousClass05K.A0j
            boolean r0 = r7.CeS()
            if (r0 == 0) goto L_0x0023
            java.lang.String r4 = "story_video"
        L_0x000f:
            float r5 = r7.A0l()
            X.Vux r1 = new X.Vux
            r1.<init>((X.1Xj) r7)
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            r6.A02 = r9
            r6.A00 = r7
            r6.A01 = r8
            return
        L_0x0023:
            java.lang.String r4 = "story_photo"
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16274Urb.<init>(X.1Xj, com.instagram.model.reels.Reel, java.lang.String):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C16274Urb) {
                C16274Urb urb = (C16274Urb) obj;
                if (!0qQ.A0K(this.A02, urb.A02) || !0qQ.A0K(this.A00, urb.A00) || !0qQ.A0K(this.A01, urb.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0O(this.A02)));
    }
}

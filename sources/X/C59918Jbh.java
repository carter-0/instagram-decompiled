package X;

import com.instagram.pendingmedia.model.constants.ShareType;

/* renamed from: X.Jbh  reason: case insensitive filesystem */
public abstract class C59918Jbh {
    public static final void A00(AnonymousClass3Q2 r1) {
        ShareType shareType;
        if (DbX.A1a(r1.A1u)) {
            shareType = ShareType.DIRECT_SHARE;
        } else if (r1.A5V) {
            shareType = ShareType.REEL_SHARE;
        } else {
            shareType = ShareType.UNKNOWN;
        }
        r1.A1k = shareType;
    }
}

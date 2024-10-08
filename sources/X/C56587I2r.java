package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.HashMap;

/* renamed from: X.I2r  reason: case insensitive filesystem */
public abstract class C56587I2r {
    public static final HashMap A00(1Xj r3, String str) {
        String BtY;
        0qQ.A0B(str, 1);
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, EWI.CONTEXTUAL_FEED.A00);
        if (r3 != null) {
            String A2n = r3.A2n();
            if (A2n != null) {
                A1E.put("media_id", A2n);
            }
            String id = r3.getId();
            if (id != null) {
                A1E.put("media_id", 1Xv.A04(id));
            }
            C65251bZ BtX = r3.A0C.BtX();
            if (!(BtX == null || (BtY = BtX.BtY()) == null || BtY.length() == 0)) {
                A1E.put(AnonymousClass000.A00(5228), BtY);
            }
        }
        A1E.put("module", str);
        return A1E;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.1qK, java.lang.Object, X.6eU] */
    public static final void A01(AnonymousClass1Xp r2, UserSession userSession) {
        AnonymousClass7TG.A1N(userSession, r2);
        r2.AHi();
        1Ng A00 = AnonymousClass1Nd.A00(userSession);
        ? obj = new Object();
        obj.A00 = r2;
        A00.A00(obj);
    }

    public static final boolean A02(AnonymousClass1Xp r1) {
        String str;
        if (r1.BQf() != null) {
            C277994w4 BQf = r1.BQf();
            if (BQf != null) {
                str = BQf.getOverlayType();
            } else {
                str = null;
            }
            if (!"MISINFORMATION".equals(str)) {
                return false;
            }
            return true;
        }
        return false;
    }
}

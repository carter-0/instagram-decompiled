package X;

import com.instagram.api.schemas.ClipsMerchandisingPillType;
import com.instagram.common.session.UserSession;
import java.util.List;

public abstract class B58 {
    public static final boolean A00(C267324bN r4, C267324bN r5, UserSession userSession, int i, boolean z) {
        C67231sQ clipsMetadata;
        C270544gu BRm;
        Object obj;
        C67231sQ clipsMetadata2;
        C270544gu BRm2;
        List BRn;
        1Xj r0 = r4.A02;
        if (r0 == null || (clipsMetadata = r0.A0C.getClipsMetadata()) == null || (BRm = clipsMetadata.BRm()) == null) {
            return false;
        }
        int loopTime = BRm.getLoopTime();
        if (!0qQ.A0K(r4.getId(), r5.getId()) || z) {
            return false;
        }
        1Xj r02 = r4.A02;
        if (r02 == null || (clipsMetadata2 = r02.A0C.getClipsMetadata()) == null || (BRm2 = clipsMetadata2.BRm()) == null || (BRn = BRm2.BRn()) == null) {
            obj = null;
        } else {
            obj = 00k.A0O(BRn, 0);
        }
        if (obj != ClipsMerchandisingPillType.HIGHLIGHTED_USE_AUDIO || i < loopTime || !182.A06(0Tu.A05, userSession, 36316495403487648L)) {
            return false;
        }
        return true;
    }
}

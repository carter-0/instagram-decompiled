package X;

import android.media.AudioRecord;
import com.instagram.common.session.UserSession;

public abstract class XXs {
    public static final boolean A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        0Tu r2 = 0Tu.A05;
        if (!182.A06(r2, userSession, 36311603435864708L) || AudioRecord.getMinBufferSize(DbS.A04(r2, userSession, 36593078412444588L), 12, 2) < 0) {
            return false;
        }
        return true;
    }
}

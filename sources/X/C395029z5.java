package X;

import android.os.Parcelable;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import java.util.ArrayList;

/* renamed from: X.9z5  reason: invalid class name and case insensitive filesystem */
public abstract class C395029z5 {
    public static final Capabilities A00(UserSession userSession) {
        ArrayList A1M = 0sr.A1M(new C376179Gx[]{C376179Gx.MESSAGE_SAVE_MEDIA, C376179Gx.MESSAGE_REPORTING, C376179Gx.MESSAGE_UNSEND});
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 2342156064353879728L)) {
            A1M.add(C376179Gx.MESSAGE_FORWARDING);
        }
        if (182.A06(r2, userSession, 36313055140054702L)) {
            A1M.add(C376179Gx.MESSAGE_REPLY);
        }
        if (182.A06(r2, userSession, 2342156064353683117L)) {
            A1M.add(C376179Gx.REACTIONS);
        }
        Parcelable.Creator creator = Capabilities.CREATOR;
        return C376189Gz.A00(A1M);
    }
}

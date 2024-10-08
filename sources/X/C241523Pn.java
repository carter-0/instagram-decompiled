package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3Pn  reason: invalid class name and case insensitive filesystem */
public final class C241523Pn {
    public final List A00 = 0sr.A1P(new 2aD[]{2aD.A0I, 2aD.A0G, 2aD.A0f, 2aD.A0T, 2aD.A0X});
    public final List A01;

    public C241523Pn() {
        List singletonList = Collections.singletonList(2aD.A0k);
        0qQ.A07(singletonList);
        this.A01 = singletonList;
    }

    public final List A00(Context context, UserSession userSession) {
        if (!0oI.A09(context) || !182.A06(0Tu.A05, userSession, 36327894246505235L)) {
            return this.A00;
        }
        return this.A01;
    }
}

package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.NuF  reason: case insensitive filesystem */
public abstract class C69913NuF {
    public static final NIS A00(UserSession userSession, int i) {
        Bundle A0A = DbY.A0A(userSession);
        A0A.putInt("FeaturedChannelsDisclaimerFragment.ARGUMENT_SUBTITLE_VARIANT", i);
        AnonymousClass0Dg.A00(A0A, userSession);
        NIS nis = new NIS();
        nis.setArguments(A0A);
        return nis;
    }
}

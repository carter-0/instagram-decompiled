package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.api.DeveloperOptionsLauncher;

/* renamed from: X.EhR  reason: case insensitive filesystem */
public abstract class C48618EhR {
    public static final Object A00(C307896Rx r6) {
        FragmentActivity A04 = C308206Td.A04(r6);
        UserSession A0W = DbX.A0W(r6);
        0Tu r3 = 0Tu.A05;
        if (182.A06(r3, A0W, 36312522558538907L) || 182.A06(r3, A0W, 36313514697885747L)) {
            C309516Yo A0Q = DbU.A0Q(A04, A0W);
            A0Q.A0B((Bundle) null, new C227812jx());
            A0Q.A04();
            return null;
        }
        if (2R8.A00(A0W)) {
            DeveloperOptionsLauncher.loadAndLaunchDeveloperOptions(A04, C308206Td.A05(r6), A04, A0W);
        }
        return null;
    }
}

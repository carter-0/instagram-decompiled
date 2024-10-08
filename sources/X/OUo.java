package X;

import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;

public final class OUo {
    public static final OUo A00 = new Object();
    public static final List A01 = Arrays.asList(new String[]{"StellaDirectMessagingService"});

    public final C69370NkA A00(Context context, Intent intent, AnonymousClass0cT r4) {
        0qQ.A0B(r4, 0);
        if (!r4.A03(context, intent, (0bY) null)) {
            return C69370NkA.PERMISSION_ERROR;
        }
        if (DbS.A0S(context) instanceof AnonymousClass0aP) {
            return C69370NkA.APP_NOT_LOGGED_IN;
        }
        return C69370NkA.SUCCESS;
    }
}

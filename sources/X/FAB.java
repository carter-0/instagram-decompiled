package X;

import android.content.Context;
import java.util.Map;

public final class FAB {
    public 1CV A00;
    public final Context A01;

    public static final synchronized 1CV A00(FAB fab) {
        1CV r0;
        synchronized (fab) {
            r0 = fab.A00;
            if (r0 == null) {
                Context applicationContext = fab.A01.getApplicationContext();
                Map map = 1CV.A09;
                r0 = new 1CW(applicationContext, "onetap_prefs").A00();
                fab.A00 = r0;
            }
        }
        return r0;
    }

    public FAB(Context context) {
        this.A01 = context;
    }
}

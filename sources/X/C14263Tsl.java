package X;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Tsl  reason: case insensitive filesystem */
public final class C14263Tsl {
    public final Context A00;
    public final StringBuilder A01 = new StringBuilder();
    public final Map A02 = new HashMap();
    public final Map A03 = new HashMap();
    public final Map A04 = new HashMap();

    public final void A00(X4B x4b) {
        IllegalStateException illegalStateException;
        0qQ.A0B(x4b, 0);
        Map map = this.A02;
        if (map.containsKey(x4b)) {
            synchronized (this) {
                Object obj = map.get(x4b);
                if (obj != null) {
                    for (C17982VjK vjK : (Set) obj) {
                        int i = vjK.A00 - 1;
                        vjK.A00 = i;
                        if (i == 0) {
                            vjK.A01.cleanup();
                            this.A04.remove(vjK.A02);
                        }
                    }
                    Object remove = map.remove(x4b);
                    if (remove != null) {
                        ((Set) remove).clear();
                    } else {
                        illegalStateException = AnonymousClass7TE.A0y();
                    }
                } else {
                    illegalStateException = AnonymousClass7TE.A0y();
                }
                throw illegalStateException;
            }
        }
    }

    public C14263Tsl(Context context) {
        Context applicationContext = context.getApplicationContext();
        0qQ.A07(applicationContext);
        this.A00 = applicationContext;
    }
}

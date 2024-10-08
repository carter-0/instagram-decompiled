package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.VhP  reason: case insensitive filesystem */
public final class C17872VhP {
    public final Context A00;
    public final C66525MVd A01;
    public final Queue A02 = new ConcurrentLinkedQueue();
    public final Map A03 = new HashMap();

    public final synchronized X5B A00(Class cls) {
        String canonicalName;
        Map map;
        RuntimeException runtimeException;
        canonicalName = cls.getCanonicalName();
        map = this.A03;
        if (!map.containsKey(canonicalName)) {
            try {
                X5B x5b = (X5B) cls.newInstance();
                map.put(canonicalName, x5b);
                x5b.CN6(this);
            } catch (InstantiationException e) {
                runtimeException = new RuntimeException(e);
            } catch (IllegalAccessException e2) {
                runtimeException = new RuntimeException(e2);
            }
        }
        return (X5B) map.get(canonicalName);
        throw runtimeException;
    }

    public C17872VhP(Context context) {
        this.A00 = context;
        this.A01 = new WXK(context, (UserSession) null);
    }
}

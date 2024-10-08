package X;

import android.os.Handler;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.SCl  reason: case insensitive filesystem */
public abstract class C11156SCl {
    public static final Handler A00 = AnonymousClass7TF.A0D();
    public static final ConcurrentHashMap A01 = new ConcurrentHashMap();

    public static final void A00(C13761TgX tgX, RR6 rr6) {
        String obj = rr6.toString();
        ConcurrentHashMap concurrentHashMap = A01;
        if (concurrentHashMap.containsKey(obj)) {
            TL0 tl0 = (TL0) concurrentHashMap.get(obj);
            if (tl0 != null) {
                tl0.A00.add(tgX);
                return;
            }
            return;
        }
        TL0 tl02 = new TL0(rr6);
        tl02.A00.add(tgX);
        concurrentHashMap.put(obj, tl02);
        0nY.A00().ATE(new 0va(tl02, 613898998, 3, false, false));
    }
}

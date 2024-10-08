package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7wR  reason: invalid class name and case insensitive filesystem */
public abstract class C347207wR {
    public static final AtomicInteger A00 = new AtomicInteger(0);

    public static final int A00(UserSession userSession, String str, String str2) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(str2, 2);
        int andIncrement = A00.getAndIncrement();
        02m r2 = 02m.A0p;
        r2.markerStart(383656871, andIncrement);
        r2.markerAnnotate(383656871, andIncrement, "config_type", str);
        r2.markerAnnotate(383656871, andIncrement, "module_name", str2);
        return andIncrement;
    }

    public static final int A01(String str) {
        int andIncrement = A00.getAndIncrement();
        02m.A0p.markerStart(383657104, andIncrement);
        02m.A0p.markerAnnotate(383657104, andIncrement, "config_type", str);
        return andIncrement;
    }

    public static final void A02(int i, short s) {
        02m.A0p.markerEnd(383656871, i, s);
    }
}

package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.Set;

/* renamed from: X.9xN  reason: invalid class name and case insensitive filesystem */
public abstract class C393999xN {
    public static final String A00(C279284yO r3, Set set) {
        AnonymousClass7TG.A1N(r3, set);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("destination:");
        A1A.append(r3);
        A1A.append(" tools:");
        if (set.isEmpty()) {
            A1A.append(NetInfoModule.CONNECTION_TYPE_NONE);
        } else {
            for (Object obj : set) {
                A1A.append(obj.toString());
                A1A.append(",");
            }
        }
        String obj2 = A1A.toString();
        0qQ.A07(obj2);
        return obj2;
    }
}

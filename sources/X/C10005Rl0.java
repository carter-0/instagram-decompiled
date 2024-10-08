package X;

import java.util.Collections;
import java.util.Map;

/* renamed from: X.Rl0  reason: case insensitive filesystem */
public abstract class C10005Rl0 {
    public static final C10005Rl0 A00;

    static {
        Map unmodifiableMap = Collections.unmodifiableMap(AnonymousClass7TE.A1E());
        if (unmodifiableMap != null) {
            A00 = new Qy3((Integer) null, unmodifiableMap);
            return;
        }
        throw AnonymousClass7TE.A11("Null splitInstallErrorCodeByModule");
    }
}

package X;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3RE  reason: invalid class name */
public abstract class AnonymousClass3RE {
    public static final AnonymousClass3RP A00;
    public static final AnonymousClass3RQ A01 = new AnonymousClass3RQ();
    public static final Map A02 = new AnonymousClass3RG();
    public static final Map A03 = Collections.unmodifiableMap(new AnonymousClass3RI());
    public static final Set A04 = new AnonymousClass3RF();
    public static final Set A05 = Collections.unmodifiableSet(new AnonymousClass3RR());
    public static final Set A06 = Collections.unmodifiableSet(new AnonymousClass3RH());
    public static final Map A07;

    static {
        Map unmodifiableMap = Collections.unmodifiableMap(new AnonymousClass3RK());
        A07 = unmodifiableMap;
        A00 = new AnonymousClass3RP(unmodifiableMap);
    }
}

package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.5Ku  reason: invalid class name and case insensitive filesystem */
public final class C284055Ku {
    public static final C284055Ku A01 = new C284055Ku(true);
    public static volatile C284055Ku A02;
    public final Map A00;

    static {
        try {
            Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
    }

    public C284055Ku(boolean z) {
        this.A00 = Collections.emptyMap();
    }

    public C284055Ku() {
        this.A00 = new HashMap();
    }
}

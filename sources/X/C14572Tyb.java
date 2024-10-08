package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Tyb  reason: case insensitive filesystem */
public abstract class C14572Tyb {
    public static final Map A00;
    public static final Map A01;

    static {
        HashMap hashMap = new HashMap();
        Integer A0k = C51967G9n.A0k();
        hashMap.put("auto", A0k);
        Integer A0R = C13988Tno.A0R();
        hashMap.put("yes", A0R);
        Integer A0q = C66580MXl.A0q();
        hashMap.put("no", A0q);
        hashMap.put("no_hide_descendants", 4);
        A00 = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(NetInfoModule.CONNECTION_TYPE_NONE, A0k);
        hashMap2.put("polite", A0R);
        hashMap2.put("assertive", A0q);
        A01 = Collections.unmodifiableMap(hashMap2);
    }
}

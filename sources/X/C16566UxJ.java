package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.UxJ  reason: case insensitive filesystem */
public enum C16566UxJ {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    A06(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED),
    BOLD("BOLD"),
    ITALIC("ITALIC"),
    UNDERLINE("UNDERLINE");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C16566UxJ[] uxJArr;
        A02 = 0oU.A00(uxJArr);
        A01 = new HashMap();
        for (C16566UxJ uxJ : values()) {
            A01.put(uxJ.A00, uxJ);
        }
    }

    /* access modifiers changed from: public */
    C16566UxJ(String str) {
        this.A00 = str;
    }
}

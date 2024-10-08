package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Khv  reason: case insensitive filesystem */
public enum C62565Khv {
    AUTO_TAG("auto_tag"),
    SHOW_HINT("show_hint"),
    AUTO_PLACE("auto_place"),
    A06(NetInfoModule.CONNECTION_TYPE_NONE);
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C62565Khv[] khvArr;
        A02 = 0oU.A00(khvArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (C62565Khv khv : values()) {
            A0x.put(khv.A00, khv);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    C62565Khv(String str) {
        this.A00 = str;
    }
}

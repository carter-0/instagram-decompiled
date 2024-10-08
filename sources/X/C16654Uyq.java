package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Uyq  reason: case insensitive filesystem */
public enum C16654Uyq {
    A04(NetInfoModule.CONNECTION_TYPE_NONE);
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C16654Uyq[] uyqArr;
        A02 = 0oU.A00(uyqArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (C16654Uyq uyq : values()) {
            linkedHashMap.put(uyq.A00, uyq);
        }
        A01 = linkedHashMap;
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    C16654Uyq(String str) {
        this.A00 = str;
    }
}

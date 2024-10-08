package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.NjY  reason: case insensitive filesystem */
public enum C69333NjY {
    A04(NetInfoModule.CONNECTION_TYPE_NONE),
    SHOW_ALL("show_all");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C69333NjY[] njYArr;
        A02 = 0oU.A00(njYArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (C69333NjY njY : values()) {
            A0x.put(njY.A00, njY);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    C69333NjY(String str) {
        this.A00 = str;
    }
}

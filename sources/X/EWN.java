package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;

public enum EWN {
    A07(0, NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED),
    CLOSE_FRIENDS(1, "CLOSE_FRIENDS"),
    RECIPROCAL_FOLLOWS(2, "RECIPROCAL_FOLLOWS");
    
    public static final Map A02 = null;
    public static final Map A03 = null;
    public final int A00;
    public final String A01;

    /* access modifiers changed from: public */
    static {
        int i;
        EWN[] ewnArr;
        A04 = 0oU.A00(ewnArr);
        int A0L = 0se.A0L(r4);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap A0x = DbS.A0x(A0L);
        for (EWN ewn : values()) {
            A0x.put(Integer.valueOf(ewn.A00), ewn);
        }
        A02 = A0x;
        LinkedHashMap A0x2 = DbS.A0x(DbY.A00(r3));
        for (EWN ewn2 : values()) {
            A0x2.put(ewn2.A01, ewn2);
        }
        A03 = A0x2;
    }

    /* access modifiers changed from: public */
    EWN(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }
}

package X;

import java.util.LinkedHashMap;
import java.util.Map;

public enum Ki0 {
    READ_ONLY(1),
    GENERIC_READ_ONLY_BLOCK(2),
    MESSAGE_SEND(4),
    MESSENGER_ONLY_ACCOUNTS_READ_ONLY_BLOCK(8),
    MESSAGE_SEND_PRIVATE(16);
    
    public static final Map A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        Ki0[] ki0Arr;
        08f A002 = 0oU.A00(ki0Arr);
        A02 = A002;
        LinkedHashMap A0x = DbS.A0x(DbY.A00(0Yv.A1E(A002, 10)));
        for (Object next : A002) {
            C51967G9n.A1O(next, A0x, ((Ki0) next).A00);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    Ki0(int i) {
        this.A00 = i;
    }
}

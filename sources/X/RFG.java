package X;

import java.util.Map;

public enum RFG {
    VERBOSE(0),
    INFO(1),
    WARNING(2),
    ERROR(3);
    
    public static final Map A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = AnonymousClass7TE.A1E();
        for (RFG rfg : values()) {
            C51967G9n.A1O(rfg, A01, rfg.A00);
        }
    }

    /* access modifiers changed from: public */
    RFG(int i) {
        this.A00 = i;
    }
}

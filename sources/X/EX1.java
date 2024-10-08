package X;

import com.google.common.collect.ImmutableMap;
import java.util.Map;

public enum EX1 {
    FIRST_PARTY("first_party");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        EX1[] ex1Arr;
        A02 = 0oU.A00(ex1Arr);
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        for (EX1 ex1 : values()) {
            builder.put(ex1.A00, ex1);
        }
        A01 = builder.build();
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    EX1(String str) {
        this.A00 = str;
    }
}

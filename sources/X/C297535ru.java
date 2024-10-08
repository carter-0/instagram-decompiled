package X;

import com.facebook.react.modules.appstate.AppStateModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.5ru  reason: invalid class name and case insensitive filesystem */
public enum C297535ru {
    BACKGROUND(AppStateModule.APP_STATE_BACKGROUND),
    OTHER("other");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C297535ru[] r0;
        A02 = 0oU.A00(r0);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (C297535ru r1 : values()) {
            linkedHashMap.put(r1.A00, r1);
        }
        A01 = linkedHashMap;
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    C297535ru(String str) {
        this.A00 = str;
    }
}

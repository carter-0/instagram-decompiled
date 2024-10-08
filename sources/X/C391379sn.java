package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9sn  reason: invalid class name and case insensitive filesystem */
public enum C391379sn {
    UNANSWERED("not_answered"),
    ANSWERED("answered"),
    CURRENT("current");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C391379sn[] r0;
        A02 = 0oU.A00(r0);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (C391379sn r1 : values()) {
            linkedHashMap.put(AnonymousClass7TF.A0j(r1.A00), r1);
        }
        A01 = linkedHashMap;
    }

    public final String toString() {
        return 002.A0R("QuestionState: ", this.A00);
    }

    /* access modifiers changed from: public */
    C391379sn(String str) {
        this.A00 = str;
    }
}

package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HMk  reason: case insensitive filesystem */
public enum C54653HMk {
    Anyone(0),
    AccountsYouFollow(1),
    MentionedOnly(2),
    ParentPostAuthorOnly(3);
    
    public static final Map A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C54653HMk[] hMkArr;
        A02 = 0oU.A00(hMkArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (C54653HMk hMk : values()) {
            C51967G9n.A1O(hMk, A0x, hMk.A00);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    C54653HMk(int i) {
        this.A00 = i;
    }
}

package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Nkk  reason: case insensitive filesystem */
public enum C69406Nkk {
    STORIES_VIEWER_TOP_PARTICIPANTS_BOTTOMSHEET("stories_viewer_top_participants_bottomsheet"),
    DIRECT_THREAD("direct_thread"),
    NOTIFICATION("notification");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C69406Nkk[] nkkArr;
        A02 = 0oU.A00(nkkArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (C69406Nkk nkk : values()) {
            A0x.put(nkk.A00, nkk);
        }
        A01 = A0x;
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    C69406Nkk(String str) {
        this.A00 = str;
    }
}

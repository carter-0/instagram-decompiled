package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.6Im  reason: invalid class name and case insensitive filesystem */
public final class C305546Im implements C305556In {
    public final /* synthetic */ AnonymousClass5Y1 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ C62320sa A02;

    public C305546Im(AnonymousClass5Y1 r1, String str, C62320sa r3) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = r3;
    }

    public final void FIq() {
        Map map = this.A00.A00;
        String str = this.A01;
        List list = (List) map.remove(str);
        if (list != null) {
            list.remove(this.A02);
            if (!list.isEmpty()) {
                map.put(str, list);
            }
        }
    }
}

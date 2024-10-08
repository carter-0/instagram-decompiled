package X;

import java.util.List;

/* renamed from: X.6La  reason: invalid class name and case insensitive filesystem */
public final class C306156La extends C310776bb {
    public final C310756bZ A00;

    public final /* bridge */ /* synthetic */ 0xI A00(C310756bZ r4, C254213s7 r5, Object obj, Object obj2, String str) {
        List list;
        C250973mM r6 = (C250973mM) obj;
        C306176Ld r7 = (C306176Ld) obj2;
        0qQ.A0B(r4, 0);
        0qQ.A0B(r6, 1);
        0qQ.A0B(r7, 2);
        0xI A002 = super.A00(r4, r5, r6, r7, str);
        A002.A08(Integer.valueOf(r7.A00), "segment_index");
        if (r7.A03 && (list = r6.A0H.A17) != null) {
            A002.A08(Integer.valueOf(list.size()), "segment_count");
        }
        return A002;
    }

    public C306156La(C310756bZ r1) {
        super(r1);
        this.A00 = r1;
    }
}

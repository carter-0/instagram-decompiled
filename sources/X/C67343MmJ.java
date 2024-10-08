package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.MmJ  reason: case insensitive filesystem */
public final /* synthetic */ class C67343MmJ implements 1aV {
    public final /* synthetic */ 1wY A00;
    public final /* synthetic */ AnonymousClass3WR A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ C67343MmJ(1wY r1, AnonymousClass3WR r2, String str) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = str;
    }

    public final void accept(Object obj) {
        1wY r4 = this.A00;
        AnonymousClass3WR r3 = this.A01;
        String str = this.A02;
        1wy r1 = r4.A09;
        synchronized (r1) {
            r1.A03.get(str);
        }
        AnonymousClass1xz r0 = r4.A06;
        if (r0 != null) {
            Map map = r0.A02;
            Set set = (Set) map.get(str);
            if (set == null) {
                set = AnonymousClass7TE.A1F();
                map.put(str, set);
            }
            set.add(r3);
        }
    }
}

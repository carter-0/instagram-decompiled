package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.Aaa  reason: case insensitive filesystem */
public final class C40341Aaa implements AnonymousClass8K7 {
    public final /* synthetic */ 1pK A00;
    public final /* synthetic */ LD4 A01;
    public final /* synthetic */ A6R A02;

    public C40341Aaa(1pK r1, LD4 ld4, A6R a6r) {
        this.A00 = r1;
        this.A02 = a6r;
        this.A01 = ld4;
    }

    public final void DQm(C39651A3r a3r, LD4 ld4) {
        Map map = this.A00.A01;
        String str = this.A02.A02;
        List<AnonymousClass8K7> list = (List) map.get(str);
        if (list != null) {
            LD4 ld42 = this.A01;
            for (AnonymousClass8K7 DQm : list) {
                DQm.DQm(a3r, ld42);
            }
        }
        map.remove(str);
    }
}

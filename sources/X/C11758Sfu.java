package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Sfu  reason: case insensitive filesystem */
public final /* synthetic */ class C11758Sfu implements AnonymousClass08X {
    public final /* synthetic */ C319836rJ A00;

    public /* synthetic */ C11758Sfu(C319836rJ r1) {
        this.A00 = r1;
    }

    public final Bundle EKB() {
        C319836rJ r3 = this.A00;
        Iterator A0u = AnonymousClass7TF.A0u(0Yt.A0B(r3.A04));
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            r3.A01(DbT.A13(A1J), ((AnonymousClass08X) A1J.getValue()).EKB());
        }
        Map map = r3.A03;
        Set keySet = map.keySet();
        ArrayList A0v = DbS.A0v(keySet.size());
        ArrayList A14 = Pxg.A14(A0v);
        for (Object next : keySet) {
            A0v.add(next);
            A14.add(map.get(next));
        }
        return Q21.A00(JTQ.A1b("values", A14, AnonymousClass7TE.A1L("keys", A0v)));
    }
}

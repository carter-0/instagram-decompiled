package X;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: X.Hqd  reason: case insensitive filesystem */
public final class C55972Hqd {
    public final C2613149c A00;
    public final C2613349e A01;
    public final Set A02;
    public final C62320sa A03;

    public final synchronized void A00(View view, String str) {
        this.A01.AAO(new C57531IcJ(this), view, (Object) null, str, false);
        this.A02.add(view);
    }

    public C55972Hqd(C2613149c r2, C2613349e r3, C62320sa r4) {
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r4;
        Set newSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        0qQ.A07(newSetFromMap);
        this.A02 = newSetFromMap;
    }
}

package X;

import com.instagram.user.model.User;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.9l8  reason: invalid class name and case insensitive filesystem */
public final class C386769l8 extends 0ng {
    public final /* synthetic */ C363328jX A00;
    public final /* synthetic */ 2Cy A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C386769l8(C363328jX r2, 2Cy r3) {
        super(194);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final void run() {
        C363288jT r6 = this.A00.A00;
        User user = this.A01.A00;
        synchronized (r6) {
            C363368jb r4 = r6.A02;
            r4.A06(user);
            r6.A04.A03(user);
            C363368jb r3 = r6.A01;
            Iterator A0v = AnonymousClass7TF.A0v(r3.A05);
            while (A0v.hasNext()) {
                Map map = ((C293645l7) A0v.next()).A03;
                if (map == null) {
                    map = Collections.emptyMap();
                }
                map.remove(user.getId());
            }
            r4.A04();
            r3.A04();
        }
    }
}

package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.Pd0  reason: case insensitive filesystem */
public final class C73458Pd0 implements AnonymousClass0eK {
    public final /* synthetic */ OJN A00;
    public final /* synthetic */ String A01;

    public C73458Pd0(OJN ojn, String str) {
        this.A00 = ojn;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        List list;
        String str = this.A01;
        if (str == null) {
            list = Collections.emptyList();
        } else {
            C283485Hw r0 = new C283485Hw();
            r0.A01(str);
            list = r0.A02.A01;
        }
        return new C267704c4(list);
    }
}

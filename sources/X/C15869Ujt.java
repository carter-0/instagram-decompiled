package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ujt  reason: case insensitive filesystem */
public final class C15869Ujt extends 0ng {
    public final /* synthetic */ 29f A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ 0rm A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15869Ujt(29f r4, List list, 0rm r6) {
        super(1948240166, 3, false, false);
        this.A01 = list;
        this.A02 = r6;
        this.A00 = r4;
    }

    public final void run() {
        List list = this.A01;
        if (list != null) {
            0Ak r3 = (0Ak) this.A02.A00;
            ArrayList A0p = AnonymousClass7TF.A0p(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C13991Tnr.A1S(A0p, it);
            }
            r3.A0S("color_space", A0p);
            ArrayList A0p2 = AnonymousClass7TF.A0p(list);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C13991Tnr.A1P(A0p2, it2);
            }
            r3.A0S("color_depth", A0p2);
            ArrayList A0p3 = AnonymousClass7TF.A0p(list);
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                C13991Tnr.A1R(A0p3, it3);
            }
            r3.A0S("frame_per_second", A0p3);
        }
        C342057ny.A00(new C20002WjN(this.A02));
    }
}

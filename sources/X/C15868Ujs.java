package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ujs  reason: case insensitive filesystem */
public final class C15868Ujs extends 0ng {
    public final /* synthetic */ 1Ln A00;
    public final /* synthetic */ 29f A01;
    public final /* synthetic */ List A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15868Ujs(1Ln r4, 29f r5, List list) {
        super(1948240166, 3, false, false);
        this.A02 = list;
        this.A00 = r4;
        this.A01 = r5;
    }

    public final void run() {
        List list = this.A02;
        if (list != null) {
            1Ln r3 = this.A00;
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
        C342057ny.A00(new C20001WjM(this.A00));
    }
}

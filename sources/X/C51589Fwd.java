package X;

import com.instagram.model.direct.DirectShareTarget;
import java.util.List;

/* renamed from: X.Fwd  reason: case insensitive filesystem */
public final class C51589Fwd implements AnonymousClass0eL, 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    public C51589Fwd(E5H e5h, List list, int i, boolean z) {
        this.A00 = i;
        this.A01 = e5h;
        this.A02 = list;
        this.A03 = z;
    }

    public final Object invoke(Object obj) {
        if (this.A00 != 0) {
            E5H e5h = (E5H) this.A01;
            List list = (List) this.A02;
            boolean z = this.A03;
            C257443xP r10 = (C257443xP) obj;
            if (r10.A06()) {
                DbZ.A1Y(e5h);
                AnonymousClass7VT.A00(e5h.A04).A02((C254763t0) r10.A03(), DbT.A14((DirectShareTarget) list.get(0)), new C51589Fwd(e5h, list, 0, z), true);
            } else {
                E5H.A0A(e5h, (C254783t2) null, list, z);
            }
        } else {
            E5H.A0A((E5H) this.A01, (C254783t2) obj, (List) this.A02, this.A03);
        }
        return C60340gF.A00;
    }
}

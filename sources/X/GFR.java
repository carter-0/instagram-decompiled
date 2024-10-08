package X;

import java.util.List;

public final class GFR implements AnonymousClass2UZ {
    public final /* synthetic */ C53618GrX A00;
    public final /* synthetic */ 2V5 A01;
    public final /* synthetic */ GFQ A02;

    public GFR(C53618GrX grX, 2V5 r2, GFQ gfq) {
        this.A00 = grX;
        this.A02 = gfq;
        this.A01 = r2;
    }

    public final void Dwu(2V5 r5) {
        Object obj;
        C53618GrX grX = this.A00;
        GFQ gfq = this.A02;
        int A09 = C51970G9q.A09(this.A01);
        List list = gfq.A00.A0J;
        if (list != null) {
            obj = 00k.A0O(list, A09);
        } else {
            obj = null;
        }
        grX.A00(obj);
    }
}

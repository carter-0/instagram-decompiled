package X;

import com.instagram.model.mediasize.ImageInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Uci  reason: case insensitive filesystem */
public final class C15432Uci extends C18477VsT {
    public final C17201VMf A00;
    public final ImageInfo A01;
    public final List A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15432Uci(C17582Vaa vaa) {
        super(new C18478VsU(vaa.A01, vaa.A05), vaa.A02, vaa.A03, 100);
        0qQ.A0B(vaa, 1);
        ArrayList arrayList = new ArrayList();
        this.A02 = arrayList;
        this.A01 = C18679Vwc.A01(vaa.A00);
        arrayList.addAll(C18679Vwc.A02(vaa.A04));
        this.A00 = new C17201VMf(vaa.A03);
    }

    public C15432Uci(C17629VbL vbL, int i) {
        super(new C18478VsU(vbL.A01, vbL.A06), vbL.A03, vbL.A04, i);
        ArrayList arrayList = new ArrayList();
        this.A02 = arrayList;
        this.A01 = C18679Vwc.A01(vbL.A00);
        arrayList.addAll(C18679Vwc.A02(vbL.A05));
        this.A00 = new C17201VMf(vbL.A04);
    }

    public C15432Uci(C17732Vd1 vd1) {
        super(new C18478VsU(vd1.A04, vd1.A0G), vd1.A08, vd1.A0A, 100);
        ArrayList arrayList = new ArrayList();
        this.A02 = arrayList;
        this.A01 = C18679Vwc.A01(vd1.A01);
        arrayList.addAll(C18679Vwc.A02(vd1.A0B));
        this.A00 = new C17201VMf(vd1.A0A);
    }
}

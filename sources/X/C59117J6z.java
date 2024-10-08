package X;

import java.util.List;

/* renamed from: X.J6z  reason: case insensitive filesystem */
public final class C59117J6z extends 0Yg implements 0sL {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ C53698Gsp A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59117J6z(C53698Gsp gsp, float f, float f2) {
        super(2);
        this.A02 = gsp;
        this.A00 = f;
        this.A01 = f2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C57564Icr icr = (C57564Icr) obj2;
        0qQ.A0B(icr, 1);
        String str = icr.A02;
        String str2 = icr.A03;
        String str3 = icr.A00;
        String str4 = icr.A01;
        if (str3 == null || str4 == null) {
            return null;
        }
        float[] fArr = C53911GwH.A0L;
        C53698Gsp gsp = this.A02;
        0sP r5 = gsp.A02;
        List list = gsp.A01;
        return new C53911GwH(str, str2, str3, str4, r5, this.A00, this.A01, list.size(), list.indexOf(icr));
    }
}

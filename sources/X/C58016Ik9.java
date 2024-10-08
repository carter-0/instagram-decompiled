package X;

import java.util.Map;

/* renamed from: X.Ik9  reason: case insensitive filesystem */
public final /* synthetic */ class C58016Ik9 implements 0sP {
    public final /* synthetic */ C244113af A00;

    public /* synthetic */ C58016Ik9(C244113af r1) {
        this.A00 = r1;
    }

    public final Object invoke(Object obj) {
        String str;
        C244113af r2 = this.A00;
        Map map = (Map) obj;
        map.put("isSpec", AnonymousClass7TE.A0v());
        map.put("component", r2.A00.A0J());
        C251263mp r0 = r2.A01.A01;
        if (r0 != null) {
            str = r0.A0J();
        } else {
            str = null;
        }
        map.put("location", str);
        return C60340gF.A00;
    }
}

package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.OTc  reason: case insensitive filesystem */
public final class C70955OTc {
    public final String A00;
    public final List A01;
    public final Map A02;
    public final boolean A03;
    public final /* synthetic */ C72199OyL A04;

    public C70955OTc(C72199OyL oyL, String str, List list, Map map, boolean z) {
        this.A04 = oyL;
        this.A00 = str;
        this.A01 = list;
        this.A03 = z;
        this.A02 = map;
    }

    public static final void A00(C70955OTc oTc) {
        Iterator it = oTc.A01.iterator();
        while (it.hasNext()) {
            String A0g = C66580MXl.A0a(it).A0g();
            if (A0g != null) {
                oTc.A04.A02.remove(new N49(oTc.A00, A0g, 29));
            }
        }
    }
}

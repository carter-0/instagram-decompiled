package X;

import java.util.Iterator;
import java.util.Map;

public final class S32 {
    public final /* synthetic */ C10260RpK A00;
    public final /* synthetic */ S2R A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Iterator A03;
    public final /* synthetic */ Map A04;
    public final /* synthetic */ Map A05;

    public S32(C10260RpK rpK, S2R s2r, String str, Iterator it, Map map, Map map2) {
        this.A01 = s2r;
        this.A05 = map;
        this.A02 = str;
        this.A03 = it;
        this.A04 = map2;
        this.A00 = rpK;
    }

    public final void A00(String str, Throwable th) {
        if (th != null) {
            this.A01.A00(th, (Map) null);
            return;
        }
        Map map = this.A05;
        map.put(this.A02, str);
        C11095S9w.A01(this.A00, this.A01, this.A03, this.A04, map);
    }
}

package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class INI implements C13752TgO {
    public final AnonymousClass6RB A00;
    public final String A01;
    public final Map A02;
    public final long A03;
    public final H5C A04;
    public final String A05;
    public final String A06;
    public final Map A07;
    public final Map A08;

    public INI(AnonymousClass6RB r3, H5C h5c, String str, String str2, String str3, Map map, Map map2, long j) {
        Map map3;
        0qQ.A0B(str2, 3);
        this.A04 = h5c;
        this.A01 = str;
        this.A06 = str2;
        this.A05 = str3;
        this.A03 = j;
        this.A08 = map;
        this.A07 = map2;
        this.A00 = r3;
        if (h5c != null) {
            map3 = A00(h5c.A00, this, AnonymousClass05K.A00);
        } else {
            map3 = null;
        }
        this.A02 = map3;
    }

    public static final Map A00(C7310Q3m q3m, INI ini, Integer num) {
        0eP[] r1;
        0eP A1L;
        Integer num2 = num;
        if (!(q3m instanceof C7311Q3n)) {
            if (q3m instanceof R9Q) {
                1Kn.A00((C307786Rm) null, "BloksComponentQueryInitialData", 002.A0g("Network request failed for component query with app id ", ini.A05, ". To find the server-side error trace, open Opes and filter to buenopaths containing that app id."), ((R9Q) q3m).A00);
                num2 = AnonymousClass05K.A0C;
            } else {
                throw AnonymousClass7TE.A1K();
            }
        }
        Map A002 = C9814Rhc.A00(q3m, num2);
        if (!(q3m instanceof C7312Q3o)) {
            r1 = new 0eP[2];
            A1L = AnonymousClass7TE.A1L("components", (Object) null);
        } else {
            Map map = ((C7312Q3o) q3m).A00.A01;
            LinkedHashMap A0o = C51975G9x.A0o(map);
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                A0o.put(A1J.getKey(), new C7284Q2j(A1J.getValue(), ini.A06, 0sn.A00, ini.A07));
            }
            r1 = new 0eP[2];
            A1L = AnonymousClass7TE.A1L("components", A0o);
        }
        r1[0] = A1L;
        r1[1] = AnonymousClass7TE.A1L("info", A002);
        return 0Yt.A06(r1);
    }

    public final Runnable AIV(C307786Rm r11, C307446Qd r12, C229652no r13) {
        AnonymousClass6RN r1;
        if (this.A04 != null) {
            return null;
        }
        AnonymousClass6RB r3 = this.A00;
        HPH A022 = r3.A02(this.A05, this.A08, new C59101J6j(49, (Object) this, (Object) r12), this.A03, false);
        if (A022 instanceof H5C) {
            synchronized (r3.A0A) {
                r1 = r3.A00;
            }
            r12.A0G(new C307876Rv(r1), A00(((H5C) A022).A00, this, AnonymousClass05K.A01), "acq", this.A01);
            return null;
        } else if (A022 instanceof C52691Gb3) {
            return ((C52691Gb3) A022).A00;
        } else {
            throw AnonymousClass7TE.A1K();
        }
    }

    public final /* bridge */ /* synthetic */ Object BHB() {
        return this.A02;
    }
}

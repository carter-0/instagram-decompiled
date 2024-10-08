package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6SA  reason: invalid class name */
public final class AnonymousClass6SA {
    public C307456Qe A00;
    public C229652no A01;
    public final C307766Rj A02;
    public final AnonymousClass6SB A03;
    public final AnonymousClass6SB A04;
    public final C307436Qc A05;
    public final HashMap A06 = new HashMap();
    public final List A07 = new ArrayList();
    public final List A08 = new ArrayList();
    public final Map A09 = new HashMap();
    public final Map A0A;
    public final Map A0B = new HashMap();
    public final Set A0C;
    public final C276744tp A0D;
    public final String A0E;
    public final Map A0F;

    public final C307896Rx A00(C276544tV r16, AnonymousClass6SD r17, C277014uI r18) {
        List list = r16.A09;
        Map map = this.A09;
        C307456Qe r4 = this.A00;
        Map map2 = this.A0B;
        C276744tp r8 = this.A0D;
        return new C307896Rx((C276634te) null, (C307786Rm) null, (C307786Rm) null, r4, r17, this.A01, r18, r8, AnonymousClass05K.A00, this.A0E, (String) null, list, map, map2);
    }

    public final void A01(String str, Object obj) {
        this.A09.put(str, obj);
        Set set = this.A0C;
        if (set != null && !Q06.A00(this.A0F.get(str), obj)) {
            set.add(str);
        }
    }

    public AnonymousClass6SA(C307456Qe r5, C307766Rj r6, AnonymousClass6SE r7, C229652no r8, C307436Qc r9, C276744tp r10, String str, Map map) {
        this.A0D = r10;
        this.A0A = map;
        this.A01 = r8;
        this.A0E = str;
        this.A00 = r5;
        this.A02 = r6;
        this.A05 = r9;
        if (r7 != null) {
            AnonymousClass6SB r1 = r7.A00;
            this.A04 = new AnonymousClass6SB(r1);
            this.A03 = r1;
            this.A0F = r7.A07;
            this.A0C = new HashSet();
            for (Map.Entry entry : r7.A06.entrySet()) {
                Object key = entry.getKey();
                if (!Q06.A00(entry.getValue(), r5.A08.get(key))) {
                    this.A0C.add(key);
                }
            }
            return;
        }
        this.A04 = new AnonymousClass6SB((AnonymousClass6SB) null);
        this.A03 = new AnonymousClass6SB((AnonymousClass6SB) null);
        this.A0F = Collections.emptyMap();
    }
}

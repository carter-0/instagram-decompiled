package X;

import android.util.Pair;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.5DE  reason: invalid class name */
public final class AnonymousClass5DE {
    public static final 1UV A08 = new AnonymousClass5DF();
    public final C61410nE A00;
    public final C282255Cj A01;
    public final Map A02 = new HashMap();
    public final Map A03 = new HashMap();
    public final Map A04 = new HashMap();
    public final AnonymousClass5DD A05;
    public final AnonymousClass5DC A06;
    public final 2Dm A07;

    public static void A00(AnonymousClass5DE r4) {
        ArrayList arrayList = new ArrayList();
        for (AbstractMap values : r4.A02.values()) {
            arrayList.addAll(values.values());
        }
        1bC r2 = r4.A07.A0H;
        if (!AnonymousClass2Oq.A06.A03()) {
            r2.A02.ATE(new C66659MaS(r2, arrayList));
        }
    }

    public final Pair A01(String str) {
        this.A03.remove(str);
        Object remove = this.A04.remove(str);
        if (remove == null) {
            return null;
        }
        Map map = this.A02;
        AbstractMap abstractMap = (AbstractMap) map.get(remove);
        if (abstractMap == null) {
            return null;
        }
        1OS r2 = (1OS) abstractMap.remove(str);
        if (abstractMap.isEmpty()) {
            map.remove(remove);
        }
        if (r2 == null) {
            return null;
        }
        A00(this);
        return new Pair(r2, new C66656MaP(C66655MaO.A00(r2)));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        if (r2.equals("executing") == false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(X.1OS r8, X.C74248Prc r9) {
        /*
            r7 = this;
            java.lang.String r6 = r8.A05
            java.util.Map r0 = r7.A04
            boolean r1 = r0.containsKey(r6)
            r0 = 0
            if (r1 != 0) goto L_0x000c
            return r0
        L_0x000c:
            X.C66660MaT.A00(r8, r9)
            X.MaP r9 = (X.C66656MaP) r9
            java.lang.String r2 = r9.A02
            int r0 = r2.hashCode()
            r1 = 2
            r5 = 1
            switch(r0) {
                case -1090974990: goto L_0x005b;
                case -948696717: goto L_0x004e;
                case 1501196714: goto L_0x002e;
                case 1563991648: goto L_0x002b;
                case 1885454214: goto L_0x0028;
                default: goto L_0x001c;
            }
        L_0x001c:
            java.lang.String r0 = "Unsupported lifecycleState: "
            java.lang.String r1 = X.002.A0R(r0, r2)
            java.lang.String r0 = "DirectMutationStore_setLifecycleState"
            X.0wb.A03(r0, r1)
        L_0x0027:
            return r5
        L_0x0028:
            java.lang.String r0 = "upload_failed_transient"
            goto L_0x0030
        L_0x002b:
            java.lang.String r0 = "uploaded"
            goto L_0x0030
        L_0x002e:
            java.lang.String r0 = "upload_failed_permanent"
        L_0x0030:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.5Cj r1 = r7.A01
            java.lang.String r0 = r8.A02()
            X.1Oe r0 = r1.A00(r0)
            long r3 = r0.A00(r2)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0064
            r7.A01(r6)
            return r5
        L_0x004e:
            java.lang.String r0 = "queued"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x001c
            int r0 = r9.A00
            if (r0 <= r1) goto L_0x0064
            return r5
        L_0x005b:
            java.lang.String r0 = "executing"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0027
            goto L_0x001c
        L_0x0064:
            A00(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5DE.A03(X.1OS, X.Prc):boolean");
    }

    public AnonymousClass5DE(C61410nE r2, C282255Cj r3, AnonymousClass5DD r4, AnonymousClass5DC r5, 2Dm r6) {
        this.A00 = r2;
        this.A06 = r5;
        this.A07 = r6;
        this.A01 = r3;
        this.A05 = r4;
    }

    public final String A02(1OS r7, C74248Prc prc) {
        C66660MaT.A00(r7, prc);
        String AXJ = ((AnonymousClass1Oc) this.A01.A01(r7.A02()).A05.getValue()).AXJ(r7);
        AXJ.getClass();
        String str = r7.A05;
        Map map = this.A04;
        String str2 = (String) map.get(str);
        if (str2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("DirectMutation has already been dispatched: mutation=");
            sb.append(r7);
            0wb.A04("DuplicateDispatch", sb.toString(), 1);
            return str2;
        }
        Map map2 = this.A02;
        AbstractMap abstractMap = (AbstractMap) map2.get(AXJ);
        if (abstractMap == null) {
            abstractMap = new LinkedHashMap();
            map2.put(AXJ, abstractMap);
        }
        abstractMap.put(str, r7);
        map.put(str, AXJ);
        A00(this);
        return AXJ;
    }
}

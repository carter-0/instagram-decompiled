package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2uZ  reason: invalid class name and case insensitive filesystem */
public final class C232862uZ {
    public static final void A00(UserSession userSession, C254523sc r3, 1Xj r4, String str) {
        String str2;
        0qQ.A0B(r4, 1);
        0qQ.A0B(str, 3);
        if (r3 != null && r4.CcK()) {
            r3.A1h = Boolean.valueOf(C231122qu.A0O(userSession, r4));
            C53246Gku gku = r4.A0B;
            if (gku != null) {
                r3.A1g = true;
                r3.A3m = Long.valueOf((long) gku.A00);
                String str3 = gku.A01;
                r3.A62 = str3;
                r3.A64 = str3;
                if (gku.A04) {
                    r3.A5b = gku.A03;
                    r3.A5a = gku.A02;
                } else {
                    r3.A5Z = gku.A03;
                }
            }
            if (str.equals("feed_contextual_ads_chain")) {
                Integer A2P = r4.A2P();
                if (A2P != null) {
                    str2 = A2P.toString();
                } else {
                    str2 = null;
                }
                r3.A5h = str2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004e, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C254523sc r3, X.1Xj r4) {
        /*
            r2 = 1
            if (r4 == 0) goto L_0x0021
            boolean r0 = r4.A5F()
            if (r0 == 0) goto L_0x0040
            X.1Xy r0 = r4.A0C
            java.util.List r1 = r0.Alu()
            if (r1 == 0) goto L_0x0040
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0040
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0029
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0029
        L_0x0021:
            r2 = 0
        L_0x0022:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r3.A1D = r0
            return
        L_0x0029:
            java.util.Iterator r1 = r1.iterator()
        L_0x002d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0021
            java.lang.Object r0 = r1.next()
            X.1Xj r0 = (X.1Xj) r0
            X.3xb r0 = r0.A1G()
            if (r0 == 0) goto L_0x002d
            goto L_0x0022
        L_0x0040:
            boolean r0 = r4.A5H()
            if (r0 == 0) goto L_0x0051
            X.1Xj r0 = r4.A1b()
            X.3xb r0 = r0.A1G()
        L_0x004e:
            if (r0 == 0) goto L_0x0021
            goto L_0x0022
        L_0x0051:
            X.3xb r0 = r4.A1G()
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C232862uZ.A02(X.3sc, X.1Xj):void");
    }

    public final void A03(UserSession userSession, C254523sc r9, 1Xj r10, AnonymousClass3W1 r11, StringBuilder sb) {
        List list;
        double d;
        long j;
        long A00;
        String str;
        0qQ.A0B(userSession, 2);
        0qQ.A0B(sb, 3);
        if (r10.CcK()) {
            11Z.A06("This operation must be run on UI thread.");
            sb.delete(0, sb.length());
            sb.append(C231122qu.A0E(userSession, r10));
            r9.A71 = sb.toString();
            r9.A4S = C233832wY.A00(userSession);
            if (C231122qu.A0D(userSession, r10) != null) {
                r9.A4a = C231122qu.A0D(userSession, r10);
            }
            if (C231122qu.A0B(userSession, r10) != null) {
                r9.A56 = C231122qu.A0B(userSession, r10);
                r9.A55 = C231122qu.A0A(userSession, r10);
                r9.A57 = C231122qu.A0C(userSession, r10);
            }
            r9.A2q = Integer.valueOf(AnonymousClass0xl.A00(C61170le.A00).A00());
            r9.A2u = Integer.valueOf(AnonymousClass1GD.A03() ? 1 : 0);
            if (C228342lQ.A02(userSession)) {
                r9.A4X = C228342lQ.A01(1Au.A00(userSession)).toString();
                r9.A4Y = C228342lQ.A00(userSession).toString();
            }
            C250513lZ injected = r10.A0C.getInjected();
            if (injected != null) {
                list = injected.ArM();
            } else {
                list = null;
            }
            Map A0L = C231122qu.A0L(list);
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : A0L.entrySet()) {
                C250953mK r1 = (C250953mK) entry.getKey();
                int intValue = ((Number) entry.getValue()).intValue();
                if (r1.ordinal() == 13) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("optimization_type", String.valueOf(r1.A00));
                    if (r10.A4f()) {
                        str = String.valueOf(intValue);
                    } else {
                        str = "1120001";
                    }
                    hashMap.put("option_value", str);
                    arrayList.add(hashMap);
                }
            }
            if (!(!arrayList.isEmpty())) {
                arrayList = null;
            }
            r9.A7U = arrayList;
            if (!r10.A60()) {
                C2360532g A002 = C2360432f.A00(userSession);
                if (C2360532g.A00(r10, A002, r11)) {
                    if (182.A06(0Tu.A05, A002.A00, 36323534854696182L)) {
                        A00 = 3000;
                    } else {
                        A00 = 4000;
                    }
                } else {
                    UserSession userSession2 = A002.A00;
                    0Tu r5 = 0Tu.A05;
                    if (!182.A06(r5, userSession2, 36316070202511262L) || !r10.CeS()) {
                        d = 1000.0d;
                        j = 37160495131721844L;
                    } else {
                        d = 1000.0d;
                        j = 37160495132573813L;
                    }
                    A00 = (long) (d * 182.A00(r5, userSession2, j));
                }
                r10.getId();
                r9.A2M = Double.valueOf((double) (A00 / 1000));
                r9.A26 = false;
                r9.A25 = false;
            }
            r9.A1S = r10.A0G;
            if (C247643gg.A0B(userSession, r10)) {
                r9.A2y = r10.A0I;
            }
        }
    }

    public static final void A01(C254523sc r1) {
        if (r1 != null) {
            r1.A2q = Integer.valueOf(AnonymousClass0xl.A00(C61170le.A00).A00());
            r1.A2u = Integer.valueOf(AnonymousClass1GD.A03() ? 1 : 0);
        }
    }
}

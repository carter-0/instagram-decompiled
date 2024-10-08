package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.80k  reason: invalid class name and case insensitive filesystem */
public abstract class C3494480k {
    public final Context A00;
    public final C3494680m A01;
    public final UserSession A02;
    public final C279284yO A03;
    public final Map A04 = new HashMap();
    public final boolean A05;

    public static final HashSet A00(C3494480k r6) {
        C358088aL r0;
        Set of;
        HashSet hashSet = new HashSet();
        Map map = r6.A04;
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            if (!((Boolean) entry.getValue()).booleanValue()) {
                hashSet.add(key);
            }
        }
        if (r6 instanceof C3494380j) {
            of = new HashSet();
        } else {
            if (r6 instanceof C3494780n) {
                of = EnumSet.of(C358088aL.A0b, C358088aL.A0W);
            } else {
                if (r6 instanceof C3494980p) {
                    r0 = C358088aL.A09;
                } else {
                    r0 = C358088aL.A0D;
                }
                of = EnumSet.of(r0);
            }
            0qQ.A07(of);
        }
        for (Object next : of) {
            if (!map.containsKey(next) || !0qQ.A0K(map.get(next), true)) {
                hashSet.add(next);
            }
        }
        return hashSet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c8, code lost:
        if (X.182.A06(X.0Tu.A05, r9.A02, 36327245706574069L) == false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ea, code lost:
        if (X.182.A06(X.0Tu.A05, r9.A02, 36327245706508532L) == false) goto L_0x00ec;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3494480k(android.content.Context r10, com.instagram.common.session.UserSession r11, X.C279284yO r12, boolean r13) {
        /*
            r9 = this;
            r9.<init>()
            r9.A00 = r10
            r9.A02 = r11
            r9.A03 = r12
            r9.A05 = r13
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r9.A04 = r0
            boolean r0 = r9 instanceof X.C3494380j
            if (r0 == 0) goto L_0x0035
            X.80l r1 = X.C3494580l.A03
        L_0x0018:
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r12, r1)
            java.lang.Object r0 = r2.second
            X.80l r0 = (X.C3494580l) r0
            java.util.HashSet r1 = A00(r9)
            java.util.Set r0 = r0.A01
            r0.clear()
            r0.addAll(r1)
            X.80m r0 = new X.80m
            r0.<init>(r2)
            r9.A01 = r0
            return
        L_0x0035:
            boolean r0 = r9 instanceof X.C3494880o
            if (r0 == 0) goto L_0x011d
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            android.content.Context r0 = r9.A00
            boolean r8 = X.C3495180r.A01(r0)
            X.4yO r12 = r9.A03
            X.9QA r5 = X.AnonymousClass9QA.A00
            boolean r0 = X.0qQ.A0K(r12, r5)
            if (r0 == 0) goto L_0x0058
            com.instagram.common.session.UserSession r0 = r9.A02
            X.AnonymousClass3BJ.A00(r0)
        L_0x0058:
            X.8aL r0 = X.C358088aL.A0l
            r3.put(r0, r4)
            X.8aL r0 = X.C358088aL.A0C
            r3.put(r0, r4)
            boolean r0 = X.0qQ.A0K(r12, r5)
            if (r0 == 0) goto L_0x0119
            boolean r0 = r9.A05
            if (r0 != 0) goto L_0x0119
            com.instagram.common.session.UserSession r6 = r9.A02
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319939969163087(0x8108cb00201f4f, double:3.0322145129337024E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x0119
            X.8aL r0 = X.C358088aL.A0x
        L_0x007d:
            r3.put(r0, r4)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            X.8aL r0 = X.C358088aL.A0U
            r1.add(r0)
            X.8aL r0 = X.C358088aL.A0T
            r3.put(r0, r1)
            boolean r0 = X.0qQ.A0K(r12, r5)
            if (r0 == 0) goto L_0x00ad
            boolean r0 = r9.A05
            if (r0 != 0) goto L_0x00ad
            com.instagram.common.session.UserSession r6 = r9.A02
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319939969163087(0x8108cb00201f4f, double:3.0322145129337024E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x00ad
            X.8aL r0 = X.C358088aL.A0B
            r3.put(r0, r4)
        L_0x00ad:
            X.80M r7 = X.AnonymousClass80M.A00
            boolean r0 = X.0qQ.A0K(r12, r7)
            if (r0 != 0) goto L_0x00ca
            boolean r0 = X.0qQ.A0K(r12, r5)
            if (r0 == 0) goto L_0x00cf
            com.instagram.common.session.UserSession r6 = r9.A02
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327245706574069(0x810f70000238f5, double:3.036834690690251E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 != 0) goto L_0x00cf
        L_0x00ca:
            X.8aL r0 = X.C358088aL.A0M
            r3.put(r0, r4)
        L_0x00cf:
            if (r8 == 0) goto L_0x00f1
            boolean r0 = X.0qQ.A0K(r12, r7)
            if (r0 != 0) goto L_0x00ec
            boolean r0 = X.0qQ.A0K(r12, r5)
            if (r0 == 0) goto L_0x00f1
            com.instagram.common.session.UserSession r6 = r9.A02
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327245706508532(0x810f70000138f4, double:3.036834690648805E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 != 0) goto L_0x00f1
        L_0x00ec:
            X.8aL r0 = X.C358088aL.A0D
            r3.put(r0, r4)
        L_0x00f1:
            boolean r0 = X.0qQ.A0K(r12, r5)
            if (r0 == 0) goto L_0x0101
            X.8aL r0 = X.C358088aL.A0O
            r3.put(r0, r4)
            X.8aL r0 = X.C358088aL.A0S
            r3.put(r0, r4)
        L_0x0101:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Set r1 = r3.keySet()
            X.0qQ.A07(r1)
            r0 = 1
            java.util.Map r0 = X.C3495080q.A00(r2, r1, r0)
        L_0x0112:
            X.80l r1 = new X.80l
            r1.<init>(r3, r0)
            goto L_0x0018
        L_0x0119:
            X.8aL r0 = X.C358088aL.A0B
            goto L_0x007d
        L_0x011d:
            boolean r0 = r9 instanceof X.C3494980p
            if (r0 == 0) goto L_0x027f
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            X.8aL r0 = X.C358088aL.A0g
            r3.put(r0, r2)
            android.content.Context r5 = r9.A00
            boolean r0 = X.C305756Jk.A00(r5)
            if (r0 == 0) goto L_0x0147
            X.4yO r1 = r9.A03
            X.80M r0 = X.AnonymousClass80M.A00
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0147
            X.8aL r0 = X.C358088aL.A0G
            r3.put(r0, r2)
        L_0x0147:
            com.instagram.common.session.UserSession r6 = r9.A02
            X.0Tu r4 = X.0Tu.A05
            r0 = 36317844023023212(0x8106e30000166c, double:3.030889028155148E-306)
            boolean r0 = X.182.A06(r4, r6, r0)
            if (r0 == 0) goto L_0x015b
            X.8aL r0 = X.C358088aL.A0K
            r3.put(r0, r2)
        L_0x015b:
            r0 = 36330179169174013(0x81121b000141fd, double:3.038689824250561E-306)
            boolean r0 = X.182.A06(r4, r6, r0)
            if (r0 != 0) goto L_0x0176
            r0 = 36330716040020709(0x811298000042e5, double:3.039029343535817E-306)
            boolean r0 = X.182.A06(r4, r6, r0)
            if (r0 != 0) goto L_0x0176
            X.8aL r0 = X.C358088aL.A04
            r3.put(r0, r2)
        L_0x0176:
            X.8aL r0 = X.C358088aL.A0F
            r3.put(r0, r2)
            X.8aL r0 = X.C358088aL.A0E
            r3.put(r0, r2)
            X.8aL r0 = X.C358088aL.A0t
            r3.put(r0, r2)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            X.8aL r0 = X.C358088aL.A10
            r1.add(r0)
            X.8aL r0 = X.C358088aL.A0q
            r1.add(r0)
            X.8aL r7 = X.C358088aL.A0z
            r3.put(r7, r1)
            X.8aL r0 = X.C358088aL.A0y
            r3.put(r0, r2)
            boolean r0 = X.C3495180r.A01(r5)
            if (r0 == 0) goto L_0x01b4
            r0 = 36327245706442995(0x810f70000038f3, double:3.036834690607359E-306)
            boolean r0 = X.182.A06(r4, r6, r0)
            if (r0 != 0) goto L_0x01b4
            X.8aL r0 = X.C358088aL.A0D
            r3.put(r0, r2)
        L_0x01b4:
            X.0xi r0 = X.0tS.A4E
            X.0tS r0 = r0.A01(r5)
            int r1 = r0.A02()
            r0 = 49
            if (r1 <= r0) goto L_0x01d2
            r0 = 36330179169108476(0x81121b000041fc, double:3.038689824209115E-306)
            boolean r0 = X.182.A06(r4, r6, r0)
            if (r0 != 0) goto L_0x01d2
            X.8aL r0 = X.C358088aL.A0J
            r3.put(r0, r2)
        L_0x01d2:
            X.8aL r0 = X.C358088aL.A09
            r3.put(r0, r2)
            X.8aL r0 = X.C358088aL.A0k
            r3.put(r0, r2)
            X.8aL r0 = X.C358088aL.A0j
            r3.put(r0, r2)
            java.util.Set r0 = r3.keySet()
            X.0qQ.A07(r0)
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x01f1:
            boolean r0 = r2.hasNext()
            r5 = 0
            if (r0 == 0) goto L_0x0206
            java.lang.Object r1 = r2.next()
            if (r1 == r7) goto L_0x01f1
            X.8aL r0 = X.C358088aL.A0D
            if (r1 == r0) goto L_0x01f1
            r4.add(r1)
            goto L_0x01f1
        L_0x0206:
            X.8aL r1 = X.C358088aL.A0D
            X.0eP r0 = new X.0eP
            r0.<init>(r1, r4)
            X.0eP[] r0 = new X.0eP[]{r0}
            java.util.HashMap r4 = X.0Yt.A02(r0)
            X.0Tu r2 = X.0Tu.A06
            r0 = 36317998641977057(0x810707000216e1, double:3.03098680980416E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x0270
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.util.List r0 = X.C3494980p.A00
            java.util.Iterator r7 = r0.iterator()
        L_0x022d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x024c
            java.lang.Object r2 = r7.next()
            boolean r0 = r3.containsKey(r2)
            if (r0 == 0) goto L_0x022d
            java.lang.Object r1 = r3.remove(r2)
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>(r1)
            r6.put(r2, r0)
            goto L_0x022d
        L_0x024c:
            java.util.Set r0 = r3.entrySet()
            X.0qQ.A07(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x0257:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x026f
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r6.put(r1, r0)
            goto L_0x0257
        L_0x026f:
            r3 = r6
        L_0x0270:
            X.4yO r12 = r9.A03
            java.util.Set r0 = r3.keySet()
            X.0qQ.A07(r0)
            java.util.Map r0 = X.C3495080q.A00(r4, r0, r5)
            goto L_0x0112
        L_0x027f:
            X.0Tu r4 = X.0Tu.A05
            r0 = 36322817595353549(0x810b69000329cd, double:3.034034335323821E-306)
            boolean r0 = X.182.A06(r4, r11, r0)
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            if (r0 == 0) goto L_0x02d0
            X.8aL r0 = X.C358088aL.A0d
            r3.put(r0, r2)
            X.8aL r0 = X.C358088aL.A0X
            r3.put(r0, r2)
            X.8aL r0 = X.C358088aL.A0V
            r3.put(r0, r2)
            X.8aL r0 = X.C358088aL.A0a
            r3.put(r0, r2)
            r0 = 36311255543382495(0x8100e5000301df, double:3.02672244710068E-306)
            boolean r0 = X.182.A06(r4, r11, r0)
            if (r0 == 0) goto L_0x02ba
            X.8aL r0 = X.C358088aL.A0Y
            r3.put(r0, r2)
        L_0x02ba:
            X.8aL r0 = X.C358088aL.A0c
        L_0x02bc:
            r3.put(r0, r2)
            X.4yO r12 = r9.A03
            java.util.Set r2 = r3.keySet()
            X.0qQ.A07(r2)
            r1 = 0
            r0 = 0
            java.util.Map r0 = X.C3495080q.A00(r1, r2, r0)
            goto L_0x0112
        L_0x02d0:
            X.8aL r0 = X.C358088aL.A0d
            r3.put(r0, r2)
            X.8aL r0 = X.C358088aL.A0X
            r3.put(r0, r2)
            r0 = 36311255543382495(0x8100e5000301df, double:3.02672244710068E-306)
            boolean r0 = X.182.A06(r4, r11, r0)
            if (r0 == 0) goto L_0x02ea
            X.8aL r0 = X.C358088aL.A0Y
            r3.put(r0, r2)
        L_0x02ea:
            X.8aL r0 = X.C358088aL.A0c
            r3.put(r0, r2)
            X.8aL r0 = X.C358088aL.A0V
            r3.put(r0, r2)
            X.8aL r0 = X.C358088aL.A0a
            goto L_0x02bc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3494480k.<init>(android.content.Context, com.instagram.common.session.UserSession, X.4yO, boolean):void");
    }
}

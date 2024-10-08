package X;

import com.instagram.android.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6S9  reason: invalid class name */
public final class AnonymousClass6S9 {
    public static final AnonymousClass6S9 A00 = new Object();

    public static final AnonymousClass6SE A00(C307786Rm r15, C307456Qe r16, AnonymousClass6SE r17, C276544tV r18, C229652no r19, C307436Qc r20) {
        C276544tV r0;
        C276544tV r3 = r18;
        0qQ.A0B(r3, 1);
        C229652no r11 = r19;
        0qQ.A0B(r11, 4);
        C307436Qc r12 = r20;
        0qQ.A0B(r12, 5);
        C307786Rm r2 = r15;
        C276744tp A05 = C307476Qg.A05(r15);
        Map map = (Map) r15.A01.get(R.id.bk_context_key_data_modules);
        if (map == null) {
            map = Collections.emptyMap();
        }
        AnonymousClass6SE r10 = r17;
        AnonymousClass6SA r7 = new AnonymousClass6SA(r16, (C307766Rj) r2.A00(R.id.bk_context_key_scoped_client_id_mapper), r10, r11, r12, A05, C307476Qg.A07(r2), map);
        AnonymousClass6SC r1 = new AnonymousClass6SC(new HashSet());
        HashMap hashMap = new HashMap();
        AnonymousClass6S9 r6 = A00;
        if (r17 != null) {
            r0 = r10.A01;
        } else {
            r0 = null;
        }
        C276544tV A01 = r6.A01(r7, r3, r0, r1, hashMap);
        Set set = r1.A00;
        HashMap hashMap2 = new HashMap(set.size());
        for (Object next : set) {
            hashMap2.put(next, r7.A00.A08.get(next));
        }
        Map map2 = r7.A00.A08;
        Map map3 = r7.A09;
        return new AnonymousClass6SE(r7.A04, r3, A01, r7.A06, r7.A07, r7.A08, map2, map3, hashMap2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: X.4tV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: X.4tV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v30, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v19, resolved type: X.4tV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v20, resolved type: X.4tV} */
    /* JADX WARNING: type inference failed for: r10v16, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x029d, code lost:
        if (X.C276544tV.A00(r5, 153) != null) goto L_0x029f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d8, code lost:
        if (r20 != false) goto L_0x00da;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0269 A[Catch:{ 6QV -> 0x00bd, all -> 0x044b }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x026e A[Catch:{ 6QV -> 0x00bd, all -> 0x044b }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0295 A[Catch:{ 6QV -> 0x00bd, all -> 0x044b }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02a9 A[Catch:{ 6QV -> 0x00bd, all -> 0x044b }] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02bb A[Catch:{ 6QV -> 0x00bd, all -> 0x044b }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02d7 A[Catch:{ 6QV -> 0x00bd, all -> 0x044b }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x033a A[Catch:{ 6QV -> 0x00bd, all -> 0x044b }] */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0414 A[Catch:{ 6QV -> 0x00bd, all -> 0x044b }] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x043e  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x022b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01b1 A[Catch:{ 6QV -> 0x00bd, all -> 0x044b }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01da A[Catch:{ 6QV -> 0x00bd, all -> 0x044b }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.C276544tV A01(X.AnonymousClass6SA r35, X.C276544tV r36, X.C276544tV r37, X.AnonymousClass6SD r38, java.util.Map r39) {
        /*
            r34 = this;
            r3 = r36
            r2 = r37
            int r0 = r3.A00
            r0 = r0 & 1
            if (r0 == 0) goto L_0x04a0
            r4 = r35
            r33 = r38
            r32 = r39
            if (r37 == 0) goto L_0x002f
            X.4tV r0 = r2.A07
            if (r0 != r3) goto L_0x002f
            java.util.Set r8 = r4.A0C
            if (r8 == 0) goto L_0x002f
            X.6SB r7 = r4.A03
            android.util.SparseArray r0 = r7.A02
            int r6 = r2.A03
            java.lang.Object r5 = r0.get(r6)
            java.util.Set r5 = (java.util.Set) r5
            if (r5 != 0) goto L_0x0038
            java.lang.String r1 = "BindEvaluator"
            java.lang.String r0 = "A previously bound node has a null variable dependency map"
            X.1Kn.A02(r1, r0)
        L_0x002f:
            X.3kJ r0 = X.1KZ.A01
            boolean r24 = r0.isTracing()
            if (r24 == 0) goto L_0x0071
            goto L_0x004d
        L_0x0038:
            java.util.Iterator r1 = r5.iterator()
        L_0x003c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x045b
            java.lang.Object r0 = r1.next()
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L_0x003c
            goto L_0x002f
        L_0x004d:
            java.lang.String r0 = r3.A0B()     // Catch:{ all -> 0x044b }
            java.lang.String r1 = "Bloks Bind Subtree "
            if (r0 == 0) goto L_0x005c
            java.lang.String r0 = X.002.A0R(r1, r0)     // Catch:{ all -> 0x044b }
            X.1KZ.A01(r0)     // Catch:{ all -> 0x044b }
        L_0x005c:
            java.lang.String r0 = X.Q07.A02(r3)     // Catch:{ all -> 0x044b }
            java.lang.String r1 = X.002.A0R(r1, r0)     // Catch:{ all -> 0x044b }
            r0 = 0
            X.0qQ.A0B(r1, r0)     // Catch:{ all -> 0x044b }
            X.3kJ r0 = X.1KZ.A01     // Catch:{ all -> 0x044b }
            X.1Kb r0 = r0.ADH(r1)     // Catch:{ all -> 0x044b }
            r0.flush()     // Catch:{ all -> 0x044b }
        L_0x0071:
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x044b }
            r0.<init>()     // Catch:{ all -> 0x044b }
            X.6SC r1 = new X.6SC     // Catch:{ all -> 0x044b }
            r1.<init>(r0)     // Catch:{ all -> 0x044b }
            java.util.HashMap r23 = new java.util.HashMap     // Catch:{ all -> 0x044b }
            r23.<init>()     // Catch:{ all -> 0x044b }
            r6 = 135(0x87, float:1.89E-43)
            java.lang.Object r7 = X.C276544tV.A00(r3, r6)     // Catch:{ all -> 0x044b }
            if (r7 == 0) goto L_0x0280
            boolean r0 = r7 instanceof java.util.List     // Catch:{ all -> 0x044b }
            r22 = 0
            r21 = 1
            if (r0 == 0) goto L_0x00a5
            java.util.List r7 = (java.util.List) r7     // Catch:{ all -> 0x044b }
            r20 = 1
        L_0x0094:
            boolean r0 = r7.isEmpty()     // Catch:{ all -> 0x044b }
            if (r0 != 0) goto L_0x0280
            r0 = r22
            java.lang.Object r0 = r7.get(r0)     // Catch:{ all -> 0x044b }
            boolean r0 = r0 instanceof java.lang.String     // Catch:{ all -> 0x044b }
            if (r0 == 0) goto L_0x00da
            goto L_0x00d6
        L_0x00a5:
            X.4uI r5 = X.C280054zv.A00(r3, r7, r6)     // Catch:{ all -> 0x044b }
            if (r5 == 0) goto L_0x0280
            X.6Rx r9 = r4.A00(r3, r1, r5)     // Catch:{ all -> 0x044b }
            X.6Tm r0 = X.AnonymousClass6Tm.A01     // Catch:{ 6QV -> 0x00bd }
            java.lang.Object r7 = X.AnonymousClass6Tn.A00(r9, r0, r5)     // Catch:{ 6QV -> 0x00bd }
            if (r7 == 0) goto L_0x00ba
            java.util.List r7 = (java.util.List) r7     // Catch:{ 6QV -> 0x00bd }
            goto L_0x00c9
        L_0x00ba:
            java.util.List r7 = java.util.Collections.EMPTY_LIST     // Catch:{ 6QV -> 0x00bd }
            goto L_0x00c9
        L_0x00bd:
            r8 = move-exception
            X.6Rm r7 = r9.A03     // Catch:{ all -> 0x044b }
            java.lang.String r5 = "BindEvaluator"
            java.lang.String r0 = "Exception evaluating onBind"
            X.1Kn.A00(r7, r5, r0, r8)     // Catch:{ all -> 0x044b }
            java.util.List r7 = java.util.Collections.EMPTY_LIST     // Catch:{ all -> 0x044b }
        L_0x00c9:
            r0 = 0
            r9.A01 = r0     // Catch:{ all -> 0x044b }
            X.6Rz r0 = r9.A07     // Catch:{ all -> 0x044b }
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A00     // Catch:{ all -> 0x044b }
            r0.clear()     // Catch:{ all -> 0x044b }
            r20 = 0
            goto L_0x0094
        L_0x00d6:
            r19 = 1
            if (r20 == 0) goto L_0x00dc
        L_0x00da:
            r19 = 0
        L_0x00dc:
            java.lang.String r9 = "BindEvaluator"
            r18 = 2
            if (r19 != 0) goto L_0x00e4
            if (r20 == 0) goto L_0x0102
        L_0x00e4:
            int r5 = r7.size()     // Catch:{ all -> 0x044b }
            int r5 = r5 % r18
            r0 = r21
            if (r5 != r0) goto L_0x0102
            java.lang.String r7 = "Encountered odd number of elements in interleaved binding array. Mode ["
            if (r20 == 0) goto L_0x00ff
            java.lang.String r5 = "SPLIT_BIND"
        L_0x00f4:
            java.lang.String r0 = "]"
            java.lang.String r0 = X.002.A0g(r7, r5, r0)     // Catch:{ all -> 0x044b }
            X.1Kn.A02(r9, r0)     // Catch:{ all -> 0x044b }
            goto L_0x0280
        L_0x00ff:
            java.lang.String r5 = "INTERLEAVED"
            goto L_0x00f4
        L_0x0102:
            java.util.List r0 = r3.A09     // Catch:{ all -> 0x044b }
            r17 = r0
            if (r0 != 0) goto L_0x010c
            java.util.List r17 = java.util.Collections.emptyList()     // Catch:{ all -> 0x044b }
        L_0x010c:
            r16 = 0
            r5 = r3
            r8 = r16
            r11 = 0
        L_0x0112:
            int r0 = r7.size()     // Catch:{ all -> 0x044b }
            if (r11 >= r0) goto L_0x0282
            if (r20 == 0) goto L_0x0162
            int r14 = r11 + 1
            java.lang.Object r11 = r7.get(r11)     // Catch:{ all -> 0x044b }
            boolean r0 = r11 instanceof java.lang.String     // Catch:{ all -> 0x044b }
            if (r0 == 0) goto L_0x013c
            r10 = r11
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x044b }
            if (r10 == 0) goto L_0x013e
            int r12 = X.C276474tO.A00(r10)     // Catch:{ all -> 0x044b }
        L_0x012d:
            java.lang.Object r0 = r7.get(r14)     // Catch:{ all -> 0x044b }
            X.4uI r13 = X.C280054zv.A00(r5, r0, r12)     // Catch:{ all -> 0x044b }
            if (r13 == 0) goto L_0x027c
            X.6Rx r11 = r4.A00(r5, r1, r13)     // Catch:{ all -> 0x044b }
            goto L_0x0145
        L_0x013c:
            r10 = r16
        L_0x013e:
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ all -> 0x044b }
            int r12 = r11.intValue()     // Catch:{ all -> 0x044b }
            goto L_0x012d
        L_0x0145:
            X.6Tm r0 = X.AnonymousClass6Tm.A01     // Catch:{ 6QV -> 0x014c }
            java.lang.Object r13 = X.AnonymousClass6Tn.A00(r11, r0, r13)     // Catch:{ 6QV -> 0x014c }
            goto L_0x0155
        L_0x014c:
            r15 = move-exception
            X.6Rm r13 = r11.A03     // Catch:{ all -> 0x044b }
            java.lang.String r0 = "Exception evaluating expression"
            X.1Kn.A00(r13, r9, r0, r15)     // Catch:{ all -> 0x044b }
            r13 = 0
        L_0x0155:
            r0 = r16
            r11.A01 = r0     // Catch:{ all -> 0x044b }
            X.6Rz r0 = r11.A07     // Catch:{ all -> 0x044b }
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A00     // Catch:{ all -> 0x044b }
            r0.clear()     // Catch:{ all -> 0x044b }
            goto L_0x027a
        L_0x0162:
            if (r19 == 0) goto L_0x0175
            int r14 = r11 + 1
            java.lang.Object r10 = r7.get(r11)     // Catch:{ all -> 0x044b }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x044b }
            int r12 = X.C276474tO.A00(r10)     // Catch:{ all -> 0x044b }
            java.lang.Object r13 = r7.get(r14)     // Catch:{ all -> 0x044b }
            goto L_0x01ac
        L_0x0175:
            java.lang.Object r13 = r7.get(r11)     // Catch:{ all -> 0x044b }
            java.util.List r13 = (java.util.List) r13     // Catch:{ all -> 0x044b }
            r0 = r22
            java.lang.Object r0 = r13.get(r0)     // Catch:{ all -> 0x044b }
            java.lang.String r10 = X.Q3L.A02(r0)     // Catch:{ all -> 0x044b }
            java.lang.String r0 = r5.A0C()     // Catch:{ all -> 0x044b }
            if (r0 == 0) goto L_0x0199
            boolean r0 = r10.equals(r0)     // Catch:{ all -> 0x044b }
            if (r0 != 0) goto L_0x0199
            java.lang.String r0 = "Encountered binding targeted for a descendant "
            X.1Kn.A02(r9, r0)     // Catch:{ all -> 0x044b }
            r14 = r11
            goto L_0x027c
        L_0x0199:
            r0 = r21
            java.lang.Object r10 = r13.get(r0)     // Catch:{ all -> 0x044b }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x044b }
            int r12 = X.C276474tO.A00(r10)     // Catch:{ all -> 0x044b }
            r0 = r18
            java.lang.Object r13 = r13.get(r0)     // Catch:{ all -> 0x044b }
            goto L_0x01ad
        L_0x01ac:
            r11 = r14
        L_0x01ad:
            r0 = 32
            if (r12 >= r0) goto L_0x01c8
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x044b }
            int r0 = r5.A04     // Catch:{ all -> 0x044b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x044b }
            java.lang.Object[] r10 = new java.lang.Object[]{r14, r10, r0}     // Catch:{ all -> 0x044b }
            java.lang.String r0 = "Encountered invalid minified key: %s, raw: %s for styleId: %s while unwrapping binding expression"
            java.lang.String r0 = java.lang.String.format(r0, r10)     // Catch:{ all -> 0x044b }
            X.1Kn.A02(r9, r0)     // Catch:{ all -> 0x044b }
        L_0x01c8:
            X.1Kj r0 = X.C64361Kj.A00()     // Catch:{ all -> 0x044b }
            X.1KX r10 = r0.A03()     // Catch:{ all -> 0x044b }
            int r0 = r5.A04     // Catch:{ all -> 0x044b }
            int[] r15 = r10.A00(r0)     // Catch:{ all -> 0x044b }
            int r14 = r15.length     // Catch:{ all -> 0x044b }
            r10 = 0
        L_0x01d8:
            if (r10 >= r14) goto L_0x022b
            r0 = r15[r10]     // Catch:{ all -> 0x044b }
            if (r0 != r12) goto L_0x01e6
            java.util.List r13 = (java.util.List) r13     // Catch:{ all -> 0x044b }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x044b }
            r10.<init>()     // Catch:{ all -> 0x044b }
            goto L_0x01e9
        L_0x01e6:
            int r10 = r10 + 1
            goto L_0x01d8
        L_0x01e9:
            if (r13 == 0) goto L_0x020d
            java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x044b }
        L_0x01ef:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x044b }
            if (r0 == 0) goto L_0x020d
            java.lang.Object r28 = r13.next()     // Catch:{ all -> 0x044b }
            r25 = r4
            r26 = r5
            r27 = r2
            r29 = r17
            r30 = r23
            X.4tV r0 = X.C7289Q2o.A00(r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x044b }
            if (r0 == 0) goto L_0x01ef
            r10.add(r0)     // Catch:{ all -> 0x044b }
            goto L_0x01ef
        L_0x020d:
            r13 = r10
            java.util.Iterator r14 = r10.iterator()     // Catch:{ all -> 0x044b }
        L_0x0212:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x044b }
            if (r0 == 0) goto L_0x0263
            java.lang.Object r10 = r14.next()     // Catch:{ all -> 0x044b }
            X.4tV r10 = (X.C276544tV) r10     // Catch:{ all -> 0x044b }
            if (r8 != 0) goto L_0x0225
            android.util.SparseArray r8 = new android.util.SparseArray     // Catch:{ all -> 0x044b }
            r8.<init>()     // Catch:{ all -> 0x044b }
        L_0x0225:
            int r0 = r10.A03     // Catch:{ all -> 0x044b }
            r8.put(r0, r10)     // Catch:{ all -> 0x044b }
            goto L_0x0212
        L_0x022b:
            X.1Kj r0 = X.C64361Kj.A00()     // Catch:{ all -> 0x044b }
            X.1KX r10 = r0.A03()     // Catch:{ all -> 0x044b }
            int r0 = r5.A04     // Catch:{ all -> 0x044b }
            int[] r15 = r10.A01(r0)     // Catch:{ all -> 0x044b }
            int r14 = r15.length     // Catch:{ all -> 0x044b }
            r10 = 0
        L_0x023b:
            if (r10 >= r14) goto L_0x0263
            r0 = r15[r10]     // Catch:{ all -> 0x044b }
            if (r0 != r12) goto L_0x0254
            r25 = r4
            r26 = r5
            r27 = r2
            r28 = r13
            r29 = r17
            r30 = r23
            X.4tV r13 = X.C7289Q2o.A00(r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x044b }
            if (r13 == 0) goto L_0x0263
            goto L_0x0257
        L_0x0254:
            int r10 = r10 + 1
            goto L_0x023b
        L_0x0257:
            if (r8 != 0) goto L_0x025e
            android.util.SparseArray r8 = new android.util.SparseArray     // Catch:{ all -> 0x044b }
            r8.<init>()     // Catch:{ all -> 0x044b }
        L_0x025e:
            int r0 = r13.A03     // Catch:{ all -> 0x044b }
            r8.put(r0, r13)     // Catch:{ all -> 0x044b }
        L_0x0263:
            int r10 = r5.A04     // Catch:{ all -> 0x044b }
            r0 = 13688(0x3578, float:1.9181E-41)
            if (r10 == r0) goto L_0x026e
            X.4tV r5 = X.Q07.A00(r5, r3, r13, r12)     // Catch:{ all -> 0x044b }
            goto L_0x0278
        L_0x026e:
            java.util.List r10 = r4.A07     // Catch:{ all -> 0x044b }
            X.Dhg r0 = new X.Dhg     // Catch:{ all -> 0x044b }
            r0.<init>(r5, r13, r12)     // Catch:{ all -> 0x044b }
            r10.add(r0)     // Catch:{ all -> 0x044b }
        L_0x0278:
            r14 = r11
            goto L_0x027c
        L_0x027a:
            if (r13 != 0) goto L_0x01ac
        L_0x027c:
            int r11 = r14 + 1
            goto L_0x0112
        L_0x0280:
            r5 = r3
            goto L_0x028d
        L_0x0282:
            X.6SB r0 = r4.A04     // Catch:{ all -> 0x044b }
            if (r8 == 0) goto L_0x028d
            android.util.SparseArray r7 = r0.A01     // Catch:{ all -> 0x044b }
            int r0 = r5.A03     // Catch:{ all -> 0x044b }
            r7.put(r0, r8)     // Catch:{ all -> 0x044b }
        L_0x028d:
            r22 = 0
            java.lang.Object r0 = X.C276544tV.A00(r5, r6)     // Catch:{ all -> 0x044b }
            if (r0 != 0) goto L_0x029f
            r0 = 153(0x99, float:2.14E-43)
            java.lang.Object r0 = X.C276544tV.A00(r5, r0)     // Catch:{ all -> 0x044b }
            r21 = 0
            if (r0 == 0) goto L_0x02a1
        L_0x029f:
            r21 = 1
        L_0x02a1:
            int r0 = r5.A00     // Catch:{ all -> 0x044b }
            r0 = r0 & 2
            r20 = 0
            if (r0 == 0) goto L_0x02ab
            r20 = 1
        L_0x02ab:
            java.util.HashSet r7 = new java.util.HashSet     // Catch:{ all -> 0x044b }
            r7.<init>()     // Catch:{ all -> 0x044b }
            X.C64361Kj.A00()     // Catch:{ all -> 0x044b }
            int r6 = r5.A04     // Catch:{ all -> 0x044b }
            boolean r0 = X.C250563lf.A0m(r6)     // Catch:{ all -> 0x044b }
            if (r0 == 0) goto L_0x02c4
            int r0 = r5.A03     // Catch:{ all -> 0x044b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x044b }
            r7.add(r0)     // Catch:{ all -> 0x044b }
        L_0x02c4:
            X.1Kj r0 = X.C64361Kj.A00()     // Catch:{ all -> 0x044b }
            X.1KX r0 = r0.A03()     // Catch:{ all -> 0x044b }
            int[] r11 = r0.A01(r6)     // Catch:{ all -> 0x044b }
            X.0qQ.A0A(r11)     // Catch:{ all -> 0x044b }
            int r10 = r11.length     // Catch:{ all -> 0x044b }
            r9 = 0
        L_0x02d5:
            if (r9 >= r10) goto L_0x0321
            r8 = r11[r9]     // Catch:{ all -> 0x044b }
            X.4tV r14 = r5.A07(r8)     // Catch:{ all -> 0x044b }
            if (r14 == 0) goto L_0x031e
            if (r37 == 0) goto L_0x02e2
            goto L_0x02e4
        L_0x02e2:
            r6 = 0
            goto L_0x02e8
        L_0x02e4:
            X.4tV r6 = r2.A07(r8)     // Catch:{ all -> 0x044b }
        L_0x02e8:
            X.6S9 r12 = A00     // Catch:{ all -> 0x044b }
            r13 = r4
            r15 = r6
            r16 = r1
            r17 = r23
            X.4tV r12 = r12.A01(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x044b }
            r0 = 0
            if (r12 == r6) goto L_0x02f8
            r0 = 1
        L_0x02f8:
            r21 = r21 | r0
            int r0 = r12.A00     // Catch:{ all -> 0x044b }
            r6 = r0 & 2
            r0 = 0
            if (r6 == 0) goto L_0x0302
            r0 = 1
        L_0x0302:
            r20 = r20 | r0
            java.util.Set r6 = r12.A02     // Catch:{ all -> 0x044b }
            if (r6 != 0) goto L_0x030c
            java.util.Set r6 = java.util.Collections.emptySet()     // Catch:{ all -> 0x044b }
        L_0x030c:
            X.0qQ.A0A(r6)     // Catch:{ all -> 0x044b }
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x044b }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x031a
            r7.addAll(r6)     // Catch:{ all -> 0x044b }
        L_0x031a:
            X.4tV r5 = X.Q07.A00(r5, r3, r12, r8)     // Catch:{ all -> 0x044b }
        L_0x031e:
            int r9 = r9 + 1
            goto L_0x02d5
        L_0x0321:
            X.1Kj r0 = X.C64361Kj.A00()     // Catch:{ all -> 0x044b }
            X.1KX r6 = r0.A03()     // Catch:{ all -> 0x044b }
            int r0 = r5.A04     // Catch:{ all -> 0x044b }
            int[] r8 = r6.A00(r0)     // Catch:{ all -> 0x044b }
            X.0qQ.A0A(r8)     // Catch:{ all -> 0x044b }
            int r0 = r8.length     // Catch:{ all -> 0x044b }
            r31 = r0
            r9 = 0
        L_0x0336:
            r0 = r31
            if (r9 >= r0) goto L_0x03fa
            r13 = r8[r9]     // Catch:{ all -> 0x044b }
            java.util.List r12 = r5.A0M(r13)     // Catch:{ all -> 0x044b }
            X.0qQ.A07(r12)     // Catch:{ all -> 0x044b }
            if (r37 == 0) goto L_0x0346
            goto L_0x0348
        L_0x0346:
            r11 = 0
            goto L_0x034c
        L_0x0348:
            java.util.List r11 = r2.A0M(r13)     // Catch:{ all -> 0x044b }
        L_0x034c:
            java.util.Iterator r19 = r12.iterator()     // Catch:{ all -> 0x044b }
            r10 = r12
            r6 = 0
            r18 = 0
        L_0x0354:
            boolean r0 = r19.hasNext()     // Catch:{ all -> 0x044b }
            if (r0 == 0) goto L_0x03da
            java.lang.Object r14 = r19.next()     // Catch:{ all -> 0x044b }
            int r17 = r6 + 1
            if (r6 >= 0) goto L_0x036a
            X.0sr.A1T()     // Catch:{ all -> 0x044b }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x044b }
            throw r0     // Catch:{ all -> 0x044b }
        L_0x036a:
            X.4tV r14 = (X.C276544tV) r14     // Catch:{ all -> 0x044b }
            if (r14 == 0) goto L_0x03d6
            X.4tV r0 = X.Q07.A01(r14, r11, r6)     // Catch:{ all -> 0x044b }
            X.6S9 r25 = A00     // Catch:{ all -> 0x044b }
            r26 = r4
            r27 = r14
            r28 = r0
            r29 = r1
            r30 = r23
            X.4tV r15 = r25.A01(r26, r27, r28, r29, r30)     // Catch:{ all -> 0x044b }
            r16 = 0
            if (r15 == r0) goto L_0x0388
            r16 = 1
        L_0x0388:
            r21 = r21 | r16
            int r0 = r15.A00     // Catch:{ all -> 0x044b }
            r16 = r0 & 2
            r0 = 0
            if (r16 == 0) goto L_0x0392
            r0 = 1
        L_0x0392:
            r20 = r20 | r0
            java.util.Set r0 = r15.A02     // Catch:{ all -> 0x044b }
            if (r0 != 0) goto L_0x039c
            java.util.Set r0 = java.util.Collections.emptySet()     // Catch:{ all -> 0x044b }
        L_0x039c:
            X.0qQ.A0A(r0)     // Catch:{ all -> 0x044b }
            boolean r16 = r0.isEmpty()     // Catch:{ all -> 0x044b }
            r16 = r16 ^ 1
            if (r16 == 0) goto L_0x03aa
            r7.addAll(r0)     // Catch:{ all -> 0x044b }
        L_0x03aa:
            if (r15 == r14) goto L_0x03d6
            if (r10 != r12) goto L_0x03b3
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x044b }
            r10.<init>(r12)     // Catch:{ all -> 0x044b }
        L_0x03b3:
            int r14 = r15.A04     // Catch:{ all -> 0x044b }
            r0 = 16851(0x41d3, float:2.3613E-41)
            if (r14 != r0) goto L_0x03d1
            java.util.List r0 = r15.A0L()     // Catch:{ all -> 0x044b }
            int r6 = r6 + r18
            r10.remove(r6)     // Catch:{ all -> 0x044b }
            X.0qQ.A0A(r0)     // Catch:{ all -> 0x044b }
            r10.addAll(r6, r0)     // Catch:{ all -> 0x044b }
            int r6 = r0.size()     // Catch:{ all -> 0x044b }
            r0 = 1
            int r6 = r6 - r0
            int r18 = r18 + r6
            goto L_0x03d6
        L_0x03d1:
            int r6 = r6 + r18
            r10.set(r6, r15)     // Catch:{ all -> 0x044b }
        L_0x03d6:
            r6 = r17
            goto L_0x0354
        L_0x03da:
            if (r10 == r12) goto L_0x03e0
            X.4tV r5 = X.Q07.A00(r5, r3, r10, r13)     // Catch:{ all -> 0x044b }
        L_0x03e0:
            if (r5 == r3) goto L_0x03f6
            int r6 = r5.A00     // Catch:{ all -> 0x044b }
            r0 = r6 & -3
            if (r20 == 0) goto L_0x03ea
            r0 = r6 | 2
        L_0x03ea:
            r5.A00 = r0     // Catch:{ all -> 0x044b }
            r6 = r7
            boolean r0 = r7.isEmpty()     // Catch:{ all -> 0x044b }
            if (r0 == 0) goto L_0x03f4
            r6 = 0
        L_0x03f4:
            r5.A02 = r6     // Catch:{ all -> 0x044b }
        L_0x03f6:
            int r9 = r9 + 1
            goto L_0x0336
        L_0x03fa:
            if (r21 != 0) goto L_0x03ff
            if (r37 == 0) goto L_0x03ff
            goto L_0x0401
        L_0x03ff:
            r2 = r5
            goto L_0x0405
        L_0x0401:
            X.4tV r0 = r2.A07     // Catch:{ all -> 0x044b }
            if (r0 != r3) goto L_0x03ff
        L_0x0405:
            X.6SB r6 = r4.A04     // Catch:{ all -> 0x044b }
            r0 = r22
            X.0qQ.A0B(r2, r0)     // Catch:{ all -> 0x044b }
            boolean r0 = r23.isEmpty()     // Catch:{ all -> 0x044b }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x041d
            android.util.SparseArray r5 = r6.A00     // Catch:{ all -> 0x044b }
            int r4 = r2.A03     // Catch:{ all -> 0x044b }
            r0 = r23
            r5.put(r4, r0)     // Catch:{ all -> 0x044b }
        L_0x041d:
            java.util.Set r4 = r1.A00     // Catch:{ all -> 0x044b }
            java.util.Set r0 = r23.keySet()     // Catch:{ all -> 0x044b }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x044b }
            r4.removeAll(r0)     // Catch:{ all -> 0x044b }
            android.util.SparseArray r1 = r6.A02     // Catch:{ all -> 0x044b }
            int r0 = r2.A03     // Catch:{ all -> 0x044b }
            r1.put(r0, r4)     // Catch:{ all -> 0x044b }
            r0 = r33
            r0.A7n(r4)     // Catch:{ all -> 0x044b }
            r1 = r32
            r0 = r23
            r1.putAll(r0)     // Catch:{ all -> 0x044b }
            if (r24 == 0) goto L_0x044a
            X.1KZ.A00()
            java.lang.String r0 = r3.A0B()
            if (r0 == 0) goto L_0x044a
            X.1KZ.A00()
        L_0x044a:
            return r2
        L_0x044b:
            r1 = move-exception
            if (r24 == 0) goto L_0x045a
            X.1KZ.A00()
            java.lang.String r0 = r3.A0B()
            if (r0 == 0) goto L_0x045a
            X.1KZ.A00()
        L_0x045a:
            throw r1
        L_0x045b:
            r0 = r33
            r0.A7n(r5)
            X.6SB r1 = r4.A04
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.5lw r0 = new X.5lw
            r0.<init>(r7, r1)
            r2.A0S(r0)
            android.util.SparseArray r0 = r7.A00
            java.lang.Object r1 = r0.get(r6)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L_0x049f
            r0 = r32
            r0.putAll(r1)
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x0485:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x049f
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            r4.A01(r1, r0)
            goto L_0x0485
        L_0x049f:
            return r37
        L_0x04a0:
            return r36
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6S9.A01(X.6SA, X.4tV, X.4tV, X.6SD, java.util.Map):X.4tV");
    }
}

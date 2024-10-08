package X;

import android.content.Context;
import com.instagram.android.R;
import java.util.List;

public final class WK3 implements C253183qL {
    public static final C276574tY A02 = C19205WPl.A00;
    public final C307786Rm A00;
    public final C276544tV A01;

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, X.Vfg] */
    /* JADX WARNING: type inference failed for: r13v0, types: [java.lang.Object, X.Vfg] */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.lang.Object, X.Vfg] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object ADM(android.content.Context r23, java.lang.Object r24, java.lang.Object r25, java.lang.Object r26) {
        /*
            r22 = this;
            r2 = r25
            java.util.List r2 = (java.util.List) r2
            r21 = 0
            r0 = r23
            r12 = r24
            X.C51973G9u.A1E(r0, r12, r2)
            X.4tk r0 = X.C276674ti.A00()
            if (r0 == 0) goto L_0x01f4
            r3 = r22
            X.6Rm r11 = r3.A00
            X.4tV r10 = r3.A01
            r1 = 2131428750(0x7f0b058e, float:1.8479153E38)
            X.4tY r0 = A02
            java.lang.Object r8 = r11.A01(r0, r10, r1)
            X.0qQ.A07(r8)
            X.VMl r8 = (X.C17207VMl) r8
            int r0 = r10.A03
            long r0 = (long) r0
            java.lang.Class r3 = r3.getClass()
            long r19 = X.C308106Ss.A00(r3, r0)
            long[] r9 = r8.A00
            X.4tk r18 = X.C276674ti.A00()
            if (r18 != 0) goto L_0x00e6
            java.util.Iterator r14 = r2.iterator()
        L_0x003e:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x01ea
            java.lang.Object r7 = r14.next()
            X.4tV r7 = (X.C276544tV) r7
            int r0 = r7.A03
            long r0 = (long) r0
            r2 = 27
            long r0 = r0 << r2
            r2 = 8070450532247928832(0x7000000000000000, double:3.105036184601418E231)
            long r0 = r0 | r2
            if (r9 == 0) goto L_0x0073
            boolean r2 = X.C16921VAy.A00(r0)
            if (r2 != 0) goto L_0x0073
            boolean r2 = X.03t.A0Q(r9, r0)
            if (r2 == 0) goto L_0x003e
            java.lang.Object[] r3 = X.C276694tk.A00()
            r2 = 1
            r2 = r3[r2]
            if (r2 != 0) goto L_0x006b
            r2 = 0
        L_0x006b:
            X.Vfg r2 = (X.C17769Vfg) r2
            if (r2 == 0) goto L_0x003e
            r2.A00(r0)
            goto L_0x003e
        L_0x0073:
            X.4tk r5 = X.C276674ti.A00()
            if (r5 != 0) goto L_0x0083
            X.1Kj r0 = X.C64361Kj.A00()
            X.4tw r0 = r0.A09
            r0.A01(r11, r7, r10, r12)
            goto L_0x003e
        L_0x0083:
            X.Vfg r4 = new X.Vfg
            r4.<init>()
            java.lang.Object[] r2 = X.C276694tk.A00()
            r13 = 1
            r3 = r2[r13]
            java.lang.Object[] r2 = X.C276694tk.A00()
            r2[r13] = r4
            boolean r2 = r3 instanceof X.C17769Vfg     // Catch:{ all -> 0x00de }
            r6 = r3
            if (r2 != 0) goto L_0x009b
            r6 = 0
        L_0x009b:
            X.Vfg r6 = (X.C17769Vfg) r6     // Catch:{ all -> 0x00de }
            X.1Kj r2 = X.C64361Kj.A00()     // Catch:{ all -> 0x00de }
            X.4tw r2 = r2.A09     // Catch:{ all -> 0x00de }
            r2.A01(r11, r7, r10, r12)     // Catch:{ all -> 0x00de }
            java.util.LinkedHashSet r2 = r4.A00     // Catch:{ all -> 0x00de }
            if (r2 == 0) goto L_0x00b5
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x00de }
            if (r2 != 0) goto L_0x00b5
            if (r6 == 0) goto L_0x00b5
            r6.A00(r0)     // Catch:{ all -> 0x00de }
        L_0x00b5:
            java.lang.Object[] r2 = X.C276694tk.A00()
            r2[r13] = r3
            java.util.LinkedHashSet r2 = r4.A00
            if (r2 == 0) goto L_0x003e
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x003e
            X.VjJ r5 = r5.A03
            java.util.LinkedHashSet r2 = r4.A00
            if (r2 == 0) goto L_0x00dc
            long[] r4 = X.00k.A0y(r2)
        L_0x00cf:
            r2 = 0
            X.VVU r3 = new X.VVU
            r3.<init>(r2, r2, r4)
            r2 = r21
            r5.A01(r3, r0, r2)
            goto L_0x003e
        L_0x00dc:
            r4 = 0
            goto L_0x00cf
        L_0x00de:
            r1 = move-exception
            java.lang.Object[] r0 = X.C276694tk.A00()
            r0[r13] = r3
            throw r1
        L_0x00e6:
            X.Vfg r7 = new X.Vfg
            r7.<init>()
            java.lang.Object[] r0 = X.C276694tk.A00()
            r17 = 1
            r6 = r0[r17]
            java.lang.Object[] r0 = X.C276694tk.A00()
            r0[r17] = r7
            boolean r0 = r6 instanceof X.C17769Vfg     // Catch:{ all -> 0x01ec }
            r5 = r6
            if (r0 != 0) goto L_0x00ff
            r5 = 0
        L_0x00ff:
            X.Vfg r5 = (X.C17769Vfg) r5     // Catch:{ all -> 0x01ec }
            java.util.Iterator r16 = r2.iterator()     // Catch:{ all -> 0x01ec }
        L_0x0105:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x01ec }
            if (r0 == 0) goto L_0x01ab
            java.lang.Object r15 = r16.next()     // Catch:{ all -> 0x01ec }
            X.4tV r15 = (X.C276544tV) r15     // Catch:{ all -> 0x01ec }
            int r0 = r15.A03     // Catch:{ all -> 0x01ec }
            long r3 = (long) r0     // Catch:{ all -> 0x01ec }
            r0 = 27
            long r3 = r3 << r0
            r0 = 8070450532247928832(0x7000000000000000, double:3.105036184601418E231)
            long r3 = r3 | r0
            if (r9 == 0) goto L_0x0139
            boolean r0 = X.C16921VAy.A00(r3)     // Catch:{ all -> 0x01ec }
            if (r0 != 0) goto L_0x0139
            boolean r0 = X.03t.A0Q(r9, r3)     // Catch:{ all -> 0x01ec }
            if (r0 == 0) goto L_0x0105
            java.lang.Object[] r0 = X.C276694tk.A00()     // Catch:{ all -> 0x01ec }
            r0 = r0[r17]     // Catch:{ all -> 0x01ec }
            if (r0 != 0) goto L_0x0131
            r0 = 0
        L_0x0131:
            X.Vfg r0 = (X.C17769Vfg) r0     // Catch:{ all -> 0x01ec }
            if (r0 == 0) goto L_0x0105
            r0.A00(r3)     // Catch:{ all -> 0x01ec }
            goto L_0x0105
        L_0x0139:
            X.4tk r14 = X.C276674ti.A00()     // Catch:{ all -> 0x01ec }
            if (r14 != 0) goto L_0x0149
            X.1Kj r0 = X.C64361Kj.A00()     // Catch:{ all -> 0x01ec }
            X.4tw r0 = r0.A09     // Catch:{ all -> 0x01ec }
            r0.A01(r11, r15, r10, r12)     // Catch:{ all -> 0x01ec }
            goto L_0x0105
        L_0x0149:
            X.Vfg r13 = new X.Vfg     // Catch:{ all -> 0x01ec }
            r13.<init>()     // Catch:{ all -> 0x01ec }
            java.lang.Object[] r0 = X.C276694tk.A00()     // Catch:{ all -> 0x01ec }
            r2 = r0[r17]     // Catch:{ all -> 0x01ec }
            java.lang.Object[] r0 = X.C276694tk.A00()     // Catch:{ all -> 0x01ec }
            r0[r17] = r13     // Catch:{ all -> 0x01ec }
            boolean r0 = r2 instanceof X.C17769Vfg     // Catch:{ all -> 0x01a3 }
            r1 = r2
            if (r0 != 0) goto L_0x0160
            r1 = 0
        L_0x0160:
            X.Vfg r1 = (X.C17769Vfg) r1     // Catch:{ all -> 0x01a3 }
            X.1Kj r0 = X.C64361Kj.A00()     // Catch:{ all -> 0x01a3 }
            X.4tw r0 = r0.A09     // Catch:{ all -> 0x01a3 }
            r0.A01(r11, r15, r10, r12)     // Catch:{ all -> 0x01a3 }
            java.util.LinkedHashSet r0 = r13.A00     // Catch:{ all -> 0x01a3 }
            if (r0 == 0) goto L_0x017a
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x01a3 }
            if (r0 != 0) goto L_0x017a
            if (r1 == 0) goto L_0x017a
            r1.A00(r3)     // Catch:{ all -> 0x01a3 }
        L_0x017a:
            java.lang.Object[] r0 = X.C276694tk.A00()     // Catch:{ all -> 0x01ec }
            r0[r17] = r2     // Catch:{ all -> 0x01ec }
            java.util.LinkedHashSet r0 = r13.A00     // Catch:{ all -> 0x01ec }
            if (r0 == 0) goto L_0x0105
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x01ec }
            if (r0 != 0) goto L_0x0105
            X.VjJ r14 = r14.A03     // Catch:{ all -> 0x01ec }
            java.util.LinkedHashSet r0 = r13.A00     // Catch:{ all -> 0x01ec }
            if (r0 == 0) goto L_0x01a1
            long[] r2 = X.00k.A0y(r0)     // Catch:{ all -> 0x01ec }
        L_0x0194:
            r0 = 0
            X.VVU r1 = new X.VVU     // Catch:{ all -> 0x01ec }
            r1.<init>(r0, r0, r2)     // Catch:{ all -> 0x01ec }
            r0 = r21
            r14.A01(r1, r3, r0)     // Catch:{ all -> 0x01ec }
            goto L_0x0105
        L_0x01a1:
            r2 = 0
            goto L_0x0194
        L_0x01a3:
            r1 = move-exception
            java.lang.Object[] r0 = X.C276694tk.A00()     // Catch:{ all -> 0x01ec }
            r0[r17] = r2     // Catch:{ all -> 0x01ec }
            throw r1     // Catch:{ all -> 0x01ec }
        L_0x01ab:
            java.util.LinkedHashSet r0 = r7.A00     // Catch:{ all -> 0x01ec }
            if (r0 == 0) goto L_0x01bc
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x01ec }
            if (r0 != 0) goto L_0x01bc
            if (r5 == 0) goto L_0x01bc
            r0 = r19
            r5.A00(r0)     // Catch:{ all -> 0x01ec }
        L_0x01bc:
            java.lang.Object[] r0 = X.C276694tk.A00()
            r0[r17] = r6
            java.util.LinkedHashSet r0 = r7.A00
            if (r0 == 0) goto L_0x01ea
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x01ea
            r0 = r18
            X.VjJ r5 = r0.A03
            java.util.LinkedHashSet r0 = r7.A00
            if (r0 == 0) goto L_0x01e8
            long[] r0 = X.00k.A0y(r0)
        L_0x01d8:
            r4 = 0
            X.VVU r3 = new X.VVU
            r3.<init>(r4, r4, r0)
            r2 = r21
            r0 = r19
            r5.A01(r3, r0, r2)
        L_0x01e5:
            r8.A00 = r4
            return r4
        L_0x01e8:
            r0 = 0
            goto L_0x01d8
        L_0x01ea:
            r4 = 0
            goto L_0x01e5
        L_0x01ec:
            r1 = move-exception
            java.lang.Object[] r0 = X.C276694tk.A00()
            r0[r17] = r6
            throw r1
        L_0x01f4:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WK3.ADM(android.content.Context, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ void FIN(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        List<C276544tV> list = (List) obj2;
        AnonymousClass7TG.A1O(obj, list);
        C307786Rm r6 = this.A00;
        C276544tV r5 = this.A01;
        Object A012 = r6.A01(A02, r5, R.id.bk_context_key_model_extension_state);
        0qQ.A07(A012);
        long[] jArr = ((C17207VMl) A012).A00;
        for (C276544tV r7 : list) {
            long j = (((long) r7.A03) << 27) | 8070450532247928832L;
            if (jArr == null || (03t.A0Q(jArr, j) && C16921VAy.A00(j))) {
                C64361Kj.A00().A09.A02(r6, r7, r5, obj);
            }
        }
    }

    public WK3(C307786Rm r1, C276544tV r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final /* synthetic */ Class CAe() {
        return getClass();
    }

    public final /* bridge */ /* synthetic */ boolean Ete(Object obj, Object obj2, Object obj3, Object obj4) {
        VVU A002;
        C276694tk A003 = C276674ti.A00();
        if (A003 != null) {
            C276544tV r6 = this.A01;
            long A004 = C308106Ss.A00(getClass(), (long) r6.A03);
            C17981VjJ vjJ = A003.A04;
            if (vjJ == null || (A002 = vjJ.A00(A004)) == null) {
                return false;
            }
            boolean A005 = C16921VAy.A00(A004);
            if (!A005) {
                Object obj5 = C276694tk.A00()[1];
                if (obj5 == null) {
                    obj5 = null;
                }
                C17769Vfg vfg = (C17769Vfg) obj5;
                if (vfg != null) {
                    vfg.A00(A004);
                }
                return A005;
            }
            Object A012 = this.A00.A01(A02, r6, R.id.bk_context_key_model_extension_state);
            0qQ.A07(A012);
            ((C17207VMl) A012).A00 = A002.A02;
            return A005;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final /* synthetic */ String getDescription() {
        return C13988Tno.A0d(this);
    }
}

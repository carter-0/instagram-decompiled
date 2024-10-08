package X;

import java.util.Map;

public final class I11 {
    public final C305006Gb A00;
    public final HLV A01;
    public final String A02;
    public final Map A03 = AnonymousClass7TE.A1H();
    public final 0sL A04;

    public final void A01(Object obj, String str, String str2, 0sK r10) {
        this.A00.CfA(new C73950PmU(this, str2, str, 6), new J6I(obj, 29), AnonymousClass5PI.A04(new JK0(r10, 9), -877655627, true), 1);
    }

    /* JADX WARNING: type inference failed for: r11v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(java.lang.String r15, X.0sP r16, X.0sP r17, X.0sI r18, X.AnonymousClass62P r19) {
        /*
            r14 = this;
            r0 = 0
            r6 = r19
            X.0qQ.A0B(r6, r0)
            r7 = 3
            r10 = r14
            X.HLV r1 = r14.A01
            X.HLV r0 = X.HLV.HIDE
            r9 = r16
            if (r1 != r0) goto L_0x002e
            java.util.HashSet r3 = X.AnonymousClass7TE.A1F()
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r6.iterator()
        L_0x001c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002f
            java.lang.Object r1 = r2.next()
            java.lang.Object r0 = r9.invoke(r1)
            X.C51971G9r.A1O(r0, r1, r3, r11)
            goto L_0x001c
        L_0x002e:
            r11 = r6
        L_0x002f:
            java.util.List r11 = (java.util.List) r11
            X.6Gb r5 = r14.A00
            int r4 = r11.size()
            r13 = 27
            X.PqV r8 = new X.PqV
            r12 = r15
            r8.<init>((java.lang.Object) r9, (java.lang.Object) r10, (java.lang.Object) r11, (java.lang.String) r12, (int) r13)
            X.MMv r3 = new X.MMv
            r0 = r17
            r3.<init>(r7, r0, r11)
            r2 = 2126948908(0x7ec6aa2c, float:1.3203536E38)
            r1 = 7
            X.GaB r0 = new X.GaB
            r7 = r18
            r0.<init>((int) r1, (java.lang.Object) r7, (java.lang.Object) r6)
            X.5PJ r0 = X.AnonymousClass5PI.A03(r0, r2)
            r5.CfA(r8, r3, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I11.A02(java.lang.String, X.0sP, X.0sP, X.0sI, X.62P):void");
    }

    public static final String A00(I11 i11, String str, String str2, int i) {
        String A0j = 002.A0j(i11.A02, str2, str, ':', ':');
        Map map = i11.A03;
        Number A14 = C51966G9m.A14(A0j, map);
        if (A14 != null) {
            if (A14.intValue() != i) {
                HLV hlv = i11.A01;
                if (hlv != HLV.THROW) {
                    0kg r2 = 0kg.A0A;
                    StringBuilder A1A = AnonymousClass7TE.A1A();
                    A1A.append("Key collision for ");
                    A1A.append(A0j);
                    A1A.append(". ");
                    A1A.append(hlv);
                    A1A.append(" item at index - ");
                    A1A.append(i);
                    0wb.A01(r2, "IgLazyColumn", C51967G9n.A0r(A1A, '.'));
                    0sL r0 = i11.A04;
                    if (r0 != null) {
                        C51967G9n.A1P(A0j, r0, i);
                    }
                    A0j = 002.A0G(A0j, ':', i);
                } else {
                    throw AnonymousClass7TF.A0W("IgLazyColumn key conflict: ", A0j);
                }
            }
            return A0j;
        }
        map.put(A0j, Integer.valueOf(i));
        return A0j;
    }

    public I11(C305006Gb r2, HLV hlv, String str, 0sL r5) {
        AnonymousClass7TG.A1O(str, hlv);
        this.A02 = str;
        this.A01 = hlv;
        this.A00 = r2;
        this.A04 = r5;
    }
}

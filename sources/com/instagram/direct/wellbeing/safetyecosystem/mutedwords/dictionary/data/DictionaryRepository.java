package com.instagram.direct.wellbeing.safetyecosystem.mutedwords.dictionary.data;

import X.00p;
import X.0qQ;
import X.AnonymousClass7TE;
import X.C297145rH;
import X.C51972G9s;
import X.DbS;
import X.JTP;
import X.N49;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class DictionaryRepository {
    public final List A00 = AnonymousClass7TE.A1C();
    public final C297145rH A01;
    public final Set A02 = DbS.A0y();

    public final ArrayList A02(List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            Iterator it2 = this.A00.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (00p.A0j(((N49) next).A01, A18, true)) {
                    if (next != null) {
                    }
                }
            }
            JTP.A1T(C51972G9s.A0n(), A18, A1C, 44);
        }
        this.A00.addAll(0, A1C);
        return A1C;
    }

    public final void A03(String str) {
        0qQ.A0B(str, 0);
        List list = this.A00;
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (0qQ.A0K(((N49) it.next()).A00, str)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        list.remove(i);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME7, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass4D7 r9) {
        /*
            r8 = this;
            r3 = 30
            boolean r0 = X.ME7.A02(r3, r9)
            if (r0 == 0) goto L_0x0087
            r4 = r9
            X.ME7 r4 = (X.ME7) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0087
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A01
            X.1Hj r6 = X.1Hj.A02
            int r0 = r4.A00
            r7 = 0
            r5 = 1
            if (r0 == 0) goto L_0x0038
            if (r0 != r5) goto L_0x008f
            X.0eS.A00(r1)
        L_0x0025:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x002f
            r7 = 1
        L_0x002a:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r7)
            return r6
        L_0x002f:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x002a
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0038:
            X.0eS.A00(r1)
            X.5rH r3 = r8.A01
            if (r3 == 0) goto L_0x002a
            java.util.List r0 = r8.A00
            java.util.HashSet r2 = X.AnonymousClass7TE.A1F()
            java.util.Iterator r1 = r0.iterator()
        L_0x0049:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x005b
            java.lang.Object r0 = r1.next()
            X.N49 r0 = (X.N49) r0
            java.lang.String r0 = r0.A01
            r2.add(r0)
            goto L_0x0049
        L_0x005b:
            java.util.Set r0 = r8.A02
            java.util.Set r1 = X.094.A02(r0, r2)
            java.util.Set r2 = X.094.A02(r2, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0076
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0076
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            return r6
        L_0x0076:
            java.util.List r1 = X.00k.A0a(r1)
            java.util.List r0 = X.00k.A0a(r2)
            r4.A00 = r5
            java.lang.Object r1 = r3.FL5(r1, r0, r4)
            if (r1 != r6) goto L_0x0025
            return r6
        L_0x0087:
            r0 = 42
            X.ME7 r4 = new X.ME7
            r4.<init>(r8, r9, r3, r0)
            goto L_0x0016
        L_0x008f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.wellbeing.safetyecosystem.mutedwords.dictionary.data.DictionaryRepository.A00(X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDh, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v3, types: [int] */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.AnonymousClass4D7 r9) {
        /*
            r8 = this;
            r4 = 40
            boolean r0 = X.C66129MDh.A01(r4, r9)
            if (r0 == 0) goto L_0x0088
            r3 = r9
            X.MDh r3 = (X.C66129MDh) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0088
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r4 = r3.A02
            X.1Hj r2 = X.1Hj.A02
            int r0 = r3.A00
            r7 = 0
            r1 = 1
            if (r0 == 0) goto L_0x0074
            if (r0 != r1) goto L_0x009d
            java.lang.Object r3 = r3.A01
            com.instagram.direct.wellbeing.safetyecosystem.mutedwords.dictionary.data.DictionaryRepository r3 = (com.instagram.direct.wellbeing.safetyecosystem.mutedwords.dictionary.data.DictionaryRepository) r3
            X.0eS.A00(r4)
        L_0x0029:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x008e
            java.util.Set r1 = r3.A02
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r2 = r4.A00
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0
            r1.addAll(r0)
            java.util.List r6 = r3.A00
            r6.clear()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Comparator r1 = java.lang.String.CASE_INSENSITIVE_ORDER
            X.0qQ.A08(r1)
            X.0qQ.A0B(r2, r7)
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>(r1)
            X.00k.A0r(r2, r0)
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x005a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00a2
            java.lang.String r3 = X.AnonymousClass7TE.A18(r4)
            int r2 = r7 + 1
            java.lang.String r1 = java.lang.String.valueOf(r7)
            X.0qQ.A0A(r3)
            r0 = 44
            X.JTP.A1T(r1, r3, r5, r0)
            r7 = r2
            goto L_0x005a
        L_0x0074:
            X.0eS.A00(r4)
            X.5rH r0 = r8.A01
            if (r0 == 0) goto L_0x00a6
            r3.A01 = r8
            r3.A00 = r1
            java.lang.Object r4 = r0.Bat(r3, r1)
            if (r4 != r2) goto L_0x0086
            return r2
        L_0x0086:
            r3 = r8
            goto L_0x0029
        L_0x0088:
            X.MDh r3 = new X.MDh
            r3.<init>(r8, r9, r4)
            goto L_0x0016
        L_0x008e:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0098
            java.util.List r0 = r3.A00
            r0.clear()
            goto L_0x00a6
        L_0x0098:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x009d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00a2:
            r6.addAll(r5)
            r7 = 1
        L_0x00a6:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.wellbeing.safetyecosystem.mutedwords.dictionary.data.DictionaryRepository.A01(X.4D7):java.lang.Object");
    }

    public DictionaryRepository(C297145rH r2) {
        this.A01 = r2;
    }
}

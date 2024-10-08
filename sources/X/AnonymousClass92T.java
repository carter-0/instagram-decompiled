package X;

import android.os.CancellationSignal;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* renamed from: X.92T  reason: invalid class name */
public final class AnonymousClass92T {
    public final C251983oI A00;

    /* JADX WARNING: type inference failed for: r7v1, types: [X.MDh, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v10 */
    /* JADX WARNING: type inference failed for: r7v11 */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0108, code lost:
        if (r2 == r5) goto L_0x010a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object A00(X.AnonymousClass92T r18, X.AnonymousClass4D7 r19) {
        /*
            r6 = r18
            r3 = 39
            r4 = r19
            boolean r0 = X.C66129MDh.A01(r3, r4)
            if (r0 == 0) goto L_0x0135
            r7 = r4
            X.MDh r7 = (X.C66129MDh) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0135
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x001a:
            java.lang.Object r2 = r7.A02
            X.1Hj r5 = X.1Hj.A02
            int r1 = r7.A00
            r9 = 2
            r0 = 1
            if (r1 == 0) goto L_0x00e8
            if (r1 == r0) goto L_0x010b
            if (r1 != r9) goto L_0x013c
            java.lang.Object r8 = r7.A01
            java.util.List r8 = (java.util.List) r8
            X.0eS.A00(r2)
        L_0x002f:
            java.util.List r2 = (java.util.List) r2
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.util.Iterator r9 = r2.iterator()
        L_0x003a:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0074
            java.lang.Object r3 = r9.next()
            X.5oT r3 = (X.C295555oT) r3
            long r1 = r3.A01
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r1)
            java.lang.Object r7 = r6.get(r0)
            if (r7 != 0) goto L_0x005b
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.put(r0, r7)
        L_0x005b:
            java.util.Set r7 = (java.util.Set) r7
            int r5 = r3.A00
            X.92I[] r4 = X.AnonymousClass92I.A02
            int r3 = r4.length
            r2 = 0
        L_0x0063:
            if (r2 >= r3) goto L_0x006e
            r1 = r4[r2]
            int r0 = r1.A00
            if (r0 == r5) goto L_0x0070
            int r2 = r2 + 1
            goto L_0x0063
        L_0x006e:
            X.92I r1 = X.AnonymousClass92I.A06
        L_0x0070:
            r7.add(r1)
            goto L_0x003a
        L_0x0074:
            r0 = 10
            int r0 = X.0Yv.A1E(r8, r0)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            java.util.Iterator r9 = r8.iterator()
        L_0x0083:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x010a
            java.lang.Object r7 = r9.next()
            X.5rE r7 = (X.C297125rE) r7
            java.lang.String r13 = r7.A03
            java.lang.String r14 = r7.A07
            java.lang.String r15 = r7.A04
            boolean r4 = r7.A08
            int r8 = r7.A01
            X.5ol[] r3 = X.C295705ol.A02
            int r2 = r3.length
            r1 = 0
        L_0x009d:
            if (r1 >= r2) goto L_0x00a8
            r12 = r3[r1]
            int r0 = r12.A00
            if (r0 == r8) goto L_0x00aa
            int r1 = r1 + 1
            goto L_0x009d
        L_0x00a8:
            X.5ol r12 = X.C295705ol.A05
        L_0x00aa:
            int r8 = r7.A00
            X.5om[] r3 = X.C295715om.A02
            int r2 = r3.length
            r1 = 0
        L_0x00b0:
            if (r1 >= r2) goto L_0x00bb
            r11 = r3[r1]
            int r0 = r11.A00
            if (r0 == r8) goto L_0x00bd
            int r1 = r1 + 1
            goto L_0x00b0
        L_0x00bb:
            X.5om r11 = X.C295715om.A05
        L_0x00bd:
            java.lang.String r3 = r7.A06
            long r0 = r7.A02
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r0)
            java.lang.Object r0 = r6.get(r2)
            if (r0 != 0) goto L_0x00d1
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
        L_0x00d1:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r17 = X.00k.A0a(r0)
            boolean r0 = r7.A09
            X.5ky r10 = new X.5ky
            r18 = r4
            r19 = r0
            r16 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r5.add(r10)
            goto L_0x0083
        L_0x00e8:
            X.0eS.A00(r2)
            r7.A01 = r6
            r7.A00 = r0
            java.lang.String r1 = "\n        SELECT *\n        FROM content_filter_dictionary_metadata\n      "
            r4 = 0
            java.util.TreeMap r0 = X.1WY.A08
            X.1WY r3 = X.1Wa.A00(r1, r4)
            android.os.CancellationSignal r2 = new android.os.CancellationSignal
            r2.<init>()
            X.3oI r1 = r6.A00
            X.5rD r0 = new X.5rD
            r0.<init>(r3, r6)
            java.lang.Object r2 = X.1wR.A00(r2, r1, r0, r7, r4)
            if (r2 != r5) goto L_0x0112
        L_0x010a:
            return r5
        L_0x010b:
            java.lang.Object r6 = r7.A01
            X.92T r6 = (X.AnonymousClass92T) r6
            X.0eS.A00(r2)
        L_0x0112:
            r8 = r2
            java.util.List r8 = (java.util.List) r8
            r7.A01 = r8
            r7.A00 = r9
            java.lang.String r1 = "\n        SELECT *\n        FROM content_filter_dictionary_client_availability\n      "
            r4 = 0
            java.util.TreeMap r0 = X.1WY.A08
            X.1WY r3 = X.1Wa.A00(r1, r4)
            android.os.CancellationSignal r2 = new android.os.CancellationSignal
            r2.<init>()
            X.3oI r1 = r6.A00
            X.5rF r0 = new X.5rF
            r0.<init>(r3, r6)
            java.lang.Object r2 = X.1wR.A00(r2, r1, r0, r7, r4)
            if (r2 != r5) goto L_0x002f
            return r5
        L_0x0135:
            X.MDh r7 = new X.MDh
            r7.<init>(r6, r4, r3)
            goto L_0x001a
        L_0x013c:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass92T.A00(X.92T, X.4D7):java.lang.Object");
    }

    public final Object A01(String str, AnonymousClass4D7 r6) {
        TreeMap treeMap = 1WY.A08;
        1WY A002 = 1Wa.A00("\n        SELECT *\n        FROM content_filter_dictionary_metadata\n        WHERE dictionary_key = ?\n      ", 1);
        A002.ADh(1, str);
        return 1wR.A00(new CancellationSignal(), this.A00, new C41329AsC(A002, this), r6, false);
    }

    public final Object A02(List list, AnonymousClass4D7 r7) {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("        SELECT id, dictionary_key");
        sb.append("\n");
        sb.append("        FROM content_filter_dictionary_metadata");
        sb.append("\n");
        sb.append("        WHERE dictionary_key IN (");
        int size = list.size();
        1wO.A00(sb, size);
        sb.append(")");
        sb.append("\n");
        sb.append("      ");
        String obj = sb.toString();
        TreeMap treeMap = 1WY.A08;
        1WY A002 = 1Wa.A00(obj, size);
        Iterator it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            A002.ADh(i, (String) it.next());
            i++;
        }
        return 1wR.A00(new CancellationSignal(), this.A00, new C298365tJ(A002, this), r7, false);
    }

    public AnonymousClass92T(C251983oI r1) {
        this.A00 = r1;
    }

    public AnonymousClass92T() {
    }
}

package X;

import android.os.CancellationSignal;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;

/* renamed from: X.7Ux  reason: invalid class name and case insensitive filesystem */
public final class C332407Ux {
    public final C251983oI A00;

    public static final A6J A00(C381649c6 r10, String str, List list) {
        C381629c4 r4 = null;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (r10 != null) {
            r4 = new C381629c4(r10.A01, r10.A00, 1);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C381679c9 r0 = (C381679c9) it.next();
            String str2 = r0.A03;
            long j = r0.A01;
            long j2 = r0.A00;
            0qQ.A0B(str2, 0);
            linkedHashMap.put(str2, new C381629c4(j, j2, 1));
        }
        0qQ.A0B(str, 0);
        return new A6J(r4, str, 0Yt.A0B(linkedHashMap));
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MED, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object A01(X.C332407Ux r7, java.lang.String r8, X.AnonymousClass4D7 r9) {
        /*
            r3 = 42
            boolean r0 = X.MED.A04(r3, r9)
            if (r0 == 0) goto L_0x0080
            r6 = r9
            X.MED r6 = (X.MED) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0080
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r6.A04
            X.1Hj r5 = X.1Hj.A02
            int r1 = r6.A00
            r0 = 2
            r2 = 1
            if (r1 == 0) goto L_0x0036
            if (r1 == r2) goto L_0x0046
            if (r1 != r0) goto L_0x0086
            java.lang.Object r4 = r6.A03
            X.9c6 r4 = (X.C381649c6) r4
            java.lang.Object r8 = r6.A02
            java.lang.String r8 = (java.lang.String) r8
            X.0eS.A00(r3)
        L_0x002f:
            java.util.List r3 = (java.util.List) r3
            X.A6J r0 = A00(r4, r8, r3)
            return r0
        L_0x0036:
            X.0eS.A00(r3)
            r6.A01 = r7
            r6.A02 = r8
            r6.A00 = r2
            java.lang.Object r3 = r7.A03(r8, r6)
            if (r3 != r5) goto L_0x0051
            return r5
        L_0x0046:
            java.lang.Object r8 = r6.A02
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r6.A01
            X.7Ux r7 = (X.C332407Ux) r7
            X.0eS.A00(r3)
        L_0x0051:
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r4 = X.00k.A0J(r3)
            X.9c6 r4 = (X.C381649c6) r4
            r6.A01 = r7
            r6.A02 = r8
            r6.A03 = r4
            r6.A00 = r0
            java.lang.String r1 = "\n        SELECT *\n        FROM user_impression_tracker\n        WHERE intervention_type = ?\n      "
            java.util.TreeMap r0 = X.1WY.A08
            X.1WY r0 = X.1Wa.A00(r1, r2)
            r0.ADh(r2, r8)
            android.os.CancellationSignal r3 = new android.os.CancellationSignal
            r3.<init>()
            X.3oI r2 = r7.A00
            X.AsH r1 = new X.AsH
            r1.<init>(r0, r7)
            r0 = 0
            java.lang.Object r3 = X.1wR.A00(r3, r2, r1, r6, r0)
            if (r3 != r5) goto L_0x002f
            return r5
        L_0x0080:
            X.MED r6 = new X.MED
            r6.<init>(r7, r9, r3)
            goto L_0x0016
        L_0x0086:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C332407Ux.A01(X.7Ux, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDx, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0046 A[LOOP:0: B:11:0x0040->B:13:0x0046, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object A02(X.C332407Ux r9, X.AnonymousClass4D7 r10) {
        /*
            r3 = 26
            boolean r0 = X.C66145MDx.A02(r3, r10)
            if (r0 == 0) goto L_0x00a5
            r6 = r10
            X.MDx r6 = (X.C66145MDx) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a5
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r7 = r6.A03
            X.1Hj r5 = X.1Hj.A02
            int r1 = r6.A00
            r8 = 2
            r0 = 1
            if (r1 == 0) goto L_0x0055
            if (r1 == r0) goto L_0x0078
            if (r1 != r8) goto L_0x0105
            java.lang.Object r1 = r6.A02
            java.util.List r1 = (java.util.List) r1
            X.0eS.A00(r7)
        L_0x002b:
            java.util.List r7 = (java.util.List) r7
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.Iterator r2 = r1.iterator()
        L_0x0040:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00ac
            java.lang.Object r1 = r2.next()
            X.9c6 r1 = (X.C381649c6) r1
            java.lang.String r0 = r1.A02
            r8.add(r0)
            r6.put(r0, r1)
            goto L_0x0040
        L_0x0055:
            X.0eS.A00(r7)
            r6.A01 = r9
            r6.A00 = r0
            java.lang.String r1 = "\n        SELECT *\n        FROM global_impression_tracker\n      "
            r4 = 0
            java.util.TreeMap r0 = X.1WY.A08
            X.1WY r3 = X.1Wa.A00(r1, r4)
            android.os.CancellationSignal r2 = new android.os.CancellationSignal
            r2.<init>()
            X.3oI r1 = r9.A00
            X.5ng r0 = new X.5ng
            r0.<init>(r3, r9)
            java.lang.Object r7 = X.1wR.A00(r2, r1, r0, r6, r4)
            if (r7 != r5) goto L_0x007f
            return r5
        L_0x0078:
            java.lang.Object r9 = r6.A01
            X.7Ux r9 = (X.C332407Ux) r9
            X.0eS.A00(r7)
        L_0x007f:
            java.util.List r7 = (java.util.List) r7
            r6.A01 = r9
            r6.A02 = r7
            r6.A00 = r8
            java.lang.String r1 = "\n        SELECT *\n        FROM user_impression_tracker\n      "
            r4 = 0
            java.util.TreeMap r0 = X.1WY.A08
            X.1WY r3 = X.1Wa.A00(r1, r4)
            android.os.CancellationSignal r2 = new android.os.CancellationSignal
            r2.<init>()
            X.3oI r1 = r9.A00
            X.5nh r0 = new X.5nh
            r0.<init>(r3, r9)
            java.lang.Object r0 = X.1wR.A00(r2, r1, r0, r6, r4)
            if (r0 == r5) goto L_0x0111
            r1 = r7
            r7 = r0
            goto L_0x002b
        L_0x00a5:
            X.MDx r6 = new X.MDx
            r6.<init>(r9, r10, r3)
            goto L_0x0016
        L_0x00ac:
            java.util.Iterator r3 = r7.iterator()
        L_0x00b0:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00d5
            java.lang.Object r2 = r3.next()
            X.9c9 r2 = (X.C381679c9) r2
            java.lang.String r1 = r2.A02
            r8.add(r1)
            java.lang.Object r0 = r5.get(r1)
            if (r0 != 0) goto L_0x00cf
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.put(r1, r0)
        L_0x00cf:
            java.util.List r0 = (java.util.List) r0
            r0.add(r2)
            goto L_0x00b0
        L_0x00d5:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r8.iterator()
        L_0x00de:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x010d
            java.lang.Object r2 = r3.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r6.get(r2)
            if (r1 != 0) goto L_0x00f1
            r1 = 0
        L_0x00f1:
            X.9c6 r1 = (X.C381649c6) r1
            java.lang.Object r0 = r5.get(r2)
            if (r0 != 0) goto L_0x00fb
            X.0sn r0 = X.0sn.A00
        L_0x00fb:
            java.util.List r0 = (java.util.List) r0
            X.A6J r0 = A00(r1, r2, r0)
            r4.add(r0)
            goto L_0x00de
        L_0x0105:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x010d:
            java.util.List r5 = X.00k.A0a(r4)
        L_0x0111:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C332407Ux.A02(X.7Ux, X.4D7):java.lang.Object");
    }

    public final Object A03(String str, AnonymousClass4D7 r6) {
        TreeMap treeMap = 1WY.A08;
        1WY A002 = 1Wa.A00("\n        SELECT *\n        FROM global_impression_tracker\n        WHERE intervention_type = ?\n      ", 1);
        A002.ADh(1, str);
        return 1wR.A00(new CancellationSignal(), this.A00, new C41332AsF(A002, this), r6, false);
    }

    public C332407Ux(C251983oI r1) {
        this.A00 = r1;
    }

    public C332407Ux() {
    }
}

package com.instagram.preferences.common.datastore;

import X.00k;
import X.0qQ;
import X.19B;
import X.19E;
import X.1Eo;
import X.1Hj;
import X.AnonymousClass12V;
import X.AnonymousClass2Q9;
import X.AnonymousClass4D7;
import X.AnonymousClass5KU;
import X.AnonymousClass5Ka;
import X.AnonymousClass9K0;
import X.C262224Cq;
import X.C262294Dd;
import X.C377439Lv;
import X.C60340gF;
import X.C74116PpJ;
import X.MH2;
import X.MH5;
import X.MYK;
import java.util.ArrayList;
import java.util.List;

public final class IgDatastoreEditor implements C262294Dd {
    public final AnonymousClass5KU A00;
    public final List A01 = new ArrayList();
    public final C262224Cq A02;

    public IgDatastoreEditor(AnonymousClass5KU r3, AnonymousClass12V r4) {
        0qQ.A0B(r3, 1);
        0qQ.A0B(r4, 2);
        this.A00 = r3;
        this.A02 = 19E.A02(r4.CO6(1393575193, 3));
    }

    public static final Object A00(AnonymousClass5KU r5, List list, AnonymousClass4D7 r7) {
        Object FK3 = r5.FK3(r7, new MH2((Object) new AnonymousClass9K0(list, (AnonymousClass4D7) null), (AnonymousClass4D7) null, 24, 42));
        if (FK3 != 1Hj.A02) {
            return C60340gF.A00;
        }
        return FK3;
    }

    public final C262294Dd E5f(String str, String str2) {
        0qQ.A0B(str2, 1);
        A01(new AnonymousClass5Ka(str), str2);
        return this;
    }

    private final void A01(AnonymousClass5Ka r4, Object obj) {
        this.A01.add(new C377439Lv(33, r4, obj));
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.9JT, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object ABn(X.AnonymousClass4D7 r6) {
        /*
            r5 = this;
            r3 = 39
            boolean r0 = X.AnonymousClass9JT.A00(r3, r6)
            if (r0 == 0) goto L_0x0022
            r4 = r6
            X.9JT r4 = (X.AnonymousClass9JT) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0022
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A01
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x0036
            if (r0 != r2) goto L_0x002e
            goto L_0x002a
        L_0x0022:
            r0 = 42
            X.9JT r4 = new X.9JT
            r4.<init>(r5, r6, r3, r0)
            goto L_0x0016
        L_0x002a:
            X.0eS.A00(r1)     // Catch:{ all -> 0x0050 }
            goto L_0x004d
        L_0x002e:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0036:
            X.0eS.A00(r1)
            java.util.List r0 = r5.A01
            java.util.List r1 = X.00k.A0a(r0)
            r0.clear()
            X.5KU r0 = r5.A00     // Catch:{ all -> 0x0050 }
            r4.A00 = r2     // Catch:{ all -> 0x0050 }
            java.lang.Object r0 = A00(r0, r1, r4)     // Catch:{ all -> 0x0050 }
            if (r0 != r3) goto L_0x004d
            return r3
        L_0x004d:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x0050:
            r2 = move-exception
            java.lang.String r1 = "Failed to write to datastore"
            X.CTg r0 = new X.CTg
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.preferences.common.datastore.IgDatastoreEditor.ABn(X.4D7):java.lang.Object");
    }

    public final C262294Dd AHL() {
        this.A01.add(C74116PpJ.A00);
        return this;
    }

    public final AnonymousClass2Q9 AIN() {
        List list = this.A01;
        List A0a = 00k.A0a(list);
        list.clear();
        C262224Cq r3 = this.A02;
        return 1Eo.A02(19B.A00, new MH5((Object) this, (Object) A0a, (AnonymousClass4D7) null, 3), r3);
    }

    public final C262294Dd E5S(String str, boolean z) {
        A01(new AnonymousClass5Ka(str), Boolean.valueOf(z));
        return this;
    }

    public final C262294Dd E5Y(String str, int i) {
        A01(new AnonymousClass5Ka(str), Integer.valueOf(i));
        return this;
    }

    public final C262294Dd E5b(String str, long j) {
        A01(new AnonymousClass5Ka(str), Long.valueOf(j));
        return this;
    }

    public final C262294Dd ED2(String str) {
        this.A01.add(new MYK(str, 42));
        return this;
    }
}

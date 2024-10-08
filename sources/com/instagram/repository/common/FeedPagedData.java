package com.instagram.repository.common;

import X.02z;
import X.05G;
import X.0sP;
import X.106;
import X.10b;
import X.AnonymousClass0r6;
import X.AnonymousClass4D7;
import X.AnonymousClass5GO;
import X.AnonymousClass5GP;
import X.AnonymousClass9JK;
import X.C60340gF;
import X.JVB;
import com.instagram.newsfeed.data.ActivityPagedData;
import kotlin.Deprecated;

@Deprecated(message = "Don't use this. Manage the paging state in ViewModel instead.")
public abstract class FeedPagedData {
    public Object A00;
    public final AnonymousClass0r6 A01;
    public final 05G A02;

    public Object A02(Object obj, AnonymousClass4D7 r3) {
        return ((ActivityPagedData) this).A03((AnonymousClass9JK) obj, r3);
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object A00(com.instagram.repository.common.FeedPagedData r8, X.AnonymousClass4D7 r9) {
        /*
            r3 = 41
            boolean r0 = X.C66138MDq.A02(r3, r9)
            if (r0 == 0) goto L_0x00ab
            r7 = r9
            X.MDq r7 = (X.C66138MDq) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ab
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0016:
            java.lang.Object r4 = r7.A02
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r5 = 1
            if (r0 == 0) goto L_0x0077
            if (r0 != r5) goto L_0x00b7
            java.lang.Object r8 = r7.A01
            com.instagram.repository.common.FeedPagedData r8 = (com.instagram.repository.common.FeedPagedData) r8
            X.0eS.A00(r4)
        L_0x0028:
            X.MU8 r4 = (X.MU8) r4
            java.lang.Object r0 = r4.BWB()
            r8.A00 = r0
            X.05G r5 = r8.A02
        L_0x0032:
            java.lang.Object r6 = r5.getValue()
            r3 = r6
            X.5GP r3 = (X.AnonymousClass5GP) r3
            boolean r0 = r4 instanceof X.C61230JzO
            if (r0 == 0) goto L_0x0060
            r0 = r4
            X.JzO r0 = (X.C61230JzO) r0
            java.lang.Throwable r2 = r0.A00
            X.0sP r1 = r4.BV7()
            java.lang.Object r0 = r3.A00()
            java.lang.Object r0 = r1.invoke(r0)
            X.KWO r1 = new X.KWO
            r1.<init>(r0, r2)
        L_0x0053:
            boolean r0 = r5.AIY(r6, r1)
            if (r0 == 0) goto L_0x0032
            boolean r0 = r4 instanceof X.C59817JZo
        L_0x005b:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            return r6
        L_0x0060:
            boolean r0 = r4 instanceof X.C59817JZo
            if (r0 == 0) goto L_0x00b2
            r0 = r4
            X.JZo r0 = (X.C59817JZo) r0
            X.0sP r1 = r0.A00
            java.lang.Object r0 = r3.A00()
            java.lang.Object r0 = r1.invoke(r0)
            X.5GQ r1 = new X.5GQ
            r1.<init>(r0)
            goto L_0x0053
        L_0x0077:
            X.0eS.A00(r4)
            java.lang.Object r4 = r8.A00
            if (r4 == 0) goto L_0x0088
            X.05G r3 = r8.A02
            java.lang.Object r0 = r3.getValue()
            boolean r0 = r0 instanceof X.AnonymousClass5GR
            if (r0 == 0) goto L_0x008a
        L_0x0088:
            r0 = 0
            goto L_0x005b
        L_0x008a:
            java.lang.Object r2 = r3.getValue()
            r0 = r2
            X.5GP r0 = (X.AnonymousClass5GP) r0
            java.lang.Object r1 = r0.A00()
            X.5GR r0 = new X.5GR
            r0.<init>(r1)
            boolean r0 = r3.AIY(r2, r0)
            if (r0 == 0) goto L_0x008a
            r7.A01 = r8
            r7.A00 = r5
            java.lang.Object r4 = r8.A02(r4, r7)
            if (r4 != r6) goto L_0x0028
            return r6
        L_0x00ab:
            X.MDq r7 = new X.MDq
            r7.<init>(r8, r9, r3)
            goto L_0x0016
        L_0x00b2:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00b7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.repository.common.FeedPagedData.A00(com.instagram.repository.common.FeedPagedData, X.4D7):java.lang.Object");
    }

    public static /* synthetic */ C60340gF A01(FeedPagedData feedPagedData, 0sP r4) {
        Object value;
        AnonymousClass5GP r1;
        05G r3 = feedPagedData.A02;
        do {
            value = r3.getValue();
            r1 = (AnonymousClass5GP) value;
            Object A002 = r1.A00();
            if (A002 != null) {
                r1 = JVB.A00(r1, r4.invoke(A002));
            }
        } while (!r3.AIY(value, r1));
        return C60340gF.A00;
    }

    public FeedPagedData(Object obj) {
        02z A012 = 106.A01(AnonymousClass5GO.A00);
        this.A02 = A012;
        this.A00 = obj;
        this.A01 = 10b.A03(A012);
    }
}

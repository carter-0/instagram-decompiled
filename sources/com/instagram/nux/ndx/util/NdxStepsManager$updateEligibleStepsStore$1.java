package com.instagram.nux.ndx.util;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C49591EzA;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.nux.ndx.util.NdxStepsManager$updateEligibleStepsStore$1", f = "NdxStepsManager.kt", i = {0, 0}, l = {40, 46}, m = "invokeSuspend", n = {"steps", "start$iv"}, s = {"L$0", "J$0"})
public final class NdxStepsManager$updateEligibleStepsStore$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ C49591EzA A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NdxStepsManager$updateEligibleStepsStore$1(C49591EzA ezA, AnonymousClass4D7 r3, int i, long j) {
        super(2, r3);
        this.A06 = ezA;
        this.A05 = j;
        this.A04 = i;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.nux.ndx.util.NdxStepsManager$updateEligibleStepsStore$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r8) {
        return new NdxStepsManager$updateEligibleStepsStore$1(this.A06, r8, this.A04, this.A05);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: X.0rm} */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00ee, code lost:
        if (r14 == r6) goto L_0x00f0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            X.1Hj r6 = X.1Hj.A02
            int r0 = r13.A00
            r5 = 2
            r9 = 1
            if (r0 == 0) goto L_0x008a
            if (r0 == r9) goto L_0x00b3
            java.lang.Object r3 = r13.A02
            X.EzA r3 = (X.C49591EzA) r3
            X.0eS.A00(r14)
        L_0x0011:
            java.util.AbstractCollection r14 = (java.util.AbstractCollection) r14
            r14.isEmpty()
            long r9 = java.lang.System.currentTimeMillis()
            com.instagram.common.session.UserSession r0 = r3.A01
            java.lang.Integer r6 = r3.A03
            X.1Am r1 = X.1Al.A01(r0)
            X.1An r0 = X.1An.A2I
            X.0xa r0 = r1.A03(r0)
            r7 = 0
            X.0qQ.A0B(r6, r5)
            X.0xY r4 = r0.AR4()
            java.util.Set r1 = X.00k.A0k(r14)
            java.lang.String r0 = "ndx_ig4a_steps"
            r4.E5h(r0, r1)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = "written_timestamp"
            r4.E5c(r2, r0)
            java.lang.String r0 = "multiple_account"
            boolean r0 = r14.contains(r0)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = "ma_impression_cnt"
            r4.E5Z(r0, r7)
        L_0x004f:
            r4.apply()
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r9
            X.35F r5 = r3.A02
            java.util.Iterator r4 = r14.iterator()
        L_0x005d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00f1
            java.lang.String r3 = X.AnonymousClass7TE.A18(r4)
            X.0wc r1 = r5.A00
            java.lang.String r0 = "ig4a_ndx_request"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = "flow_name"
            r2.AAJ(r0, r3)
            java.lang.String r0 = "written"
            X.DbY.A1F(r2, r0)
            java.lang.String r1 = java.lang.String.valueOf(r7)
            java.lang.String r0 = "step_latency"
            r2.AAJ(r0, r1)
            java.lang.String r0 = X.C49048EoS.A00(r6)
            X.DbV.A1K(r2, r0)
            goto L_0x005d
        L_0x008a:
            X.0eS.A00(r14)
            X.0rm r0 = new X.0rm
            r0.<init>()
            X.EzA r1 = r13.A06
            int r8 = r13.A04
            long r3 = java.lang.System.currentTimeMillis()
            com.instagram.common.session.UserSession r7 = r1.A01
            java.lang.Integer r2 = r1.A03
            com.instagram.nux.ndx.util.NdxStepsFetcher r1 = new com.instagram.nux.ndx.util.NdxStepsFetcher
            r1.<init>(r7, r2)
            r13.A02 = r0
            r13.A03 = r0
            r13.A01 = r3
            r13.A00 = r9
            java.lang.Object r14 = r1.A00(r8, r13)
            if (r14 == r6) goto L_0x00f0
            r7 = r0
            goto L_0x00c0
        L_0x00b3:
            long r3 = r13.A01
            java.lang.Object r0 = r13.A03
            X.0rm r0 = (X.0rm) r0
            java.lang.Object r7 = r13.A02
            X.0rm r7 = (X.0rm) r7
            X.0eS.A00(r14)
        L_0x00c0:
            r0.A00 = r14
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r3
            X.EzA r3 = r13.A06
            X.35F r10 = r3.A02
            java.lang.Integer r11 = r3.A03
            java.lang.Object r0 = r7.A00
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r10.A01(r11, r0, r1)
            java.lang.Object r12 = r7.A00
            if (r12 == 0) goto L_0x00f1
            com.instagram.common.session.UserSession r9 = r3.A01
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            android.app.Activity r8 = r3.A00
            com.instagram.nux.ndx.util.NdxStepsFilterer r7 = new com.instagram.nux.ndx.util.NdxStepsFilterer
            r7.<init>(r8, r9, r10, r11, r12)
            r13.A02 = r3
            r0 = 0
            r13.A03 = r0
            r13.A00 = r5
            java.lang.Object r14 = r7.A01(r13)
            if (r14 != r6) goto L_0x0011
        L_0x00f0:
            return r6
        L_0x00f1:
            X.EzA r0 = r13.A06
            X.35F r2 = r0.A02
            java.lang.Integer r5 = r0.A03
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = r13.A05
            long r3 = r3 - r0
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.0wc r0 = r2.A00
            java.lang.String r1 = "ig4a_ndx_request"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r0, r1)
            java.lang.String r0 = "flow_name"
            r2.AAJ(r0, r1)
            java.lang.String r0 = "finish"
            X.DbY.A1F(r2, r0)
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "step_latency"
            r2.AAJ(r0, r1)
            java.lang.String r0 = X.C49048EoS.A00(r5)
            X.DbV.A1K(r2, r0)
            X.0gF r6 = X.C60340gF.A00
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nux.ndx.util.NdxStepsManager$updateEligibleStepsStore$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NdxStepsManager$updateEligibleStepsStore$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}

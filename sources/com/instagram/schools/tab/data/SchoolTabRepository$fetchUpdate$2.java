package com.instagram.schools.tab.data;

import X.0sP;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.C60340gF;
import X.KWX;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.schools.tab.data.SchoolTabRepository$fetchUpdate$2", f = "SchoolTabRepository.kt", i = {0, 0}, l = {45}, m = "invokeSuspend", n = {"$this$update$iv", "prevValue$iv"}, s = {"L$0", "L$3"})
public final class SchoolTabRepository$fetchUpdate$2 extends AnonymousClass1Ek implements 0sP {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public boolean A07;
    public final /* synthetic */ int A08;
    public final /* synthetic */ KWX A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SchoolTabRepository$fetchUpdate$2(KWX kwx, String str, AnonymousClass4D7 r4, int i, boolean z) {
        super(1, r4);
        this.A09 = kwx;
        this.A08 = i;
        this.A0A = str;
        this.A0B = z;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.schools.tab.data.SchoolTabRepository$fetchUpdate$2, X.4D7] */
    public final AnonymousClass4D7 create(AnonymousClass4D7 r7) {
        return new SchoolTabRepository$fetchUpdate$2(this.A09, this.A0A, r7, this.A08, this.A0B);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((SchoolTabRepository$fetchUpdate$2) create((AnonymousClass4D7) obj)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [com.instagram.schools.tab.data.SchoolTabRepository$fetchUpdate$2, X.4D7] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0070 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x002d  */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.1Hj r6 = X.1Hj.A02
            int r0 = r9.A01
            r5 = 1
            if (r0 == 0) goto L_0x0030
            boolean r1 = r9.A07
            int r8 = r9.A00
            java.lang.Object r7 = r9.A05
            java.lang.Object r2 = r9.A04
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r9.A03
            X.KWX r4 = (X.KWX) r4
            java.lang.Object r3 = r9.A02
            X.05G r3 = (X.05G) r3
            X.0eS.A00(r10)
        L_0x001c:
            X.MQ0 r10 = (X.MQ0) r10
            r0 = 0
            X.0qQ.A0B(r10, r0)
            X.JwG r0 = new X.JwG
            r0.<init>((X.MQ0) r10)
            boolean r0 = r3.AIY(r7, r0)
            if (r0 == 0) goto L_0x0052
            X.0gF r6 = X.C60340gF.A00
            return r6
        L_0x0030:
            X.0eS.A00(r10)
            X.KWX r4 = r9.A09
            X.05G r3 = r4.A02
        L_0x0037:
            java.lang.Object r2 = r3.getValue()
            X.JUj r1 = X.C59702JUj.A00
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.JwG r0 = new X.JwG
            r0.<init>((X.MQ0) r1)
            boolean r0 = r3.AIY(r2, r0)
            if (r0 == 0) goto L_0x0037
            int r8 = r9.A08
            java.lang.String r2 = r9.A0A
            boolean r1 = r9.A0B
        L_0x0052:
            java.lang.Object r7 = r3.getValue()
            com.instagram.schools.tab.data.SchoolTabDataSource r0 = r4.A01
            r9.A02 = r3
            r9.A03 = r4
            r9.A04 = r2
            r9.A05 = r7
            r9.A06 = r7
            r9.A00 = r8
            r9.A07 = r1
            r9.A01 = r5
            if (r1 == 0) goto L_0x0071
            java.lang.Object r10 = com.instagram.schools.tab.data.SchoolTabDataSource.A02(r0, r2, r9, r8)
        L_0x006e:
            if (r10 != r6) goto L_0x001c
            return r6
        L_0x0071:
            java.lang.Object r10 = com.instagram.schools.tab.data.SchoolTabDataSource.A01(r0, r2, r9, r8)
            goto L_0x006e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.schools.tab.data.SchoolTabRepository$fetchUpdate$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

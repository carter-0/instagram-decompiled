package com.instagram.fanclub.memberlist.viewmodel;

import X.0rm;
import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C47869EKp;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.fanclub.memberlist.viewmodel.CreatorMessagingSelectionScreenViewModel$fetchMemberData$2", f = "CreatorMessagingSelectionScreenViewModel.kt", i = {0, 0, 1}, l = {84, 85, 86, 89}, m = "invokeSuspend", n = {"fetchMembersJob", "fetchMemberCountJob", "fetchMembersJob"}, s = {"L$0", "L$1", "L$0"})
public final class CreatorMessagingSelectionScreenViewModel$fetchMemberData$2 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ C47869EKp A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ 0rm A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreatorMessagingSelectionScreenViewModel$fetchMemberData$2(C47869EKp eKp, String str, AnonymousClass4D7 r4, 0rm r5, boolean z, boolean z2) {
        super(2, r4);
        this.A03 = eKp;
        this.A07 = z;
        this.A06 = z2;
        this.A05 = r5;
        this.A04 = str;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, com.instagram.fanclub.memberlist.viewmodel.CreatorMessagingSelectionScreenViewModel$fetchMemberData$2] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r9) {
        C47869EKp eKp = this.A03;
        boolean z = this.A07;
        boolean z2 = this.A06;
        ? creatorMessagingSelectionScreenViewModel$fetchMemberData$2 = new CreatorMessagingSelectionScreenViewModel$fetchMemberData$2(eKp, this.A04, r9, this.A05, z, z2);
        creatorMessagingSelectionScreenViewModel$fetchMemberData$2.A02 = obj;
        return creatorMessagingSelectionScreenViewModel$fetchMemberData$2;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.4D7, com.instagram.fanclub.memberlist.viewmodel.CreatorMessagingSelectionScreenViewModel$fetchMemberData$2] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0085 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            X.1Hj r4 = X.1Hj.A02
            r5 = r17
            int r0 = r5.A00
            r2 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            r15 = 0
            if (r0 == 0) goto L_0x0020
            if (r0 == r8) goto L_0x006c
            if (r0 == r7) goto L_0x0089
            X.0eS.A00(r18)
        L_0x0014:
            X.EKp r0 = r5.A03
            X.05G r1 = r0.A00
            X.EKm r0 = X.C47866EKm.A00
            r1.Epw(r0)
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0020:
            X.0eS.A00(r18)
            java.lang.Object r9 = r5.A02
            X.4Cq r9 = (X.C262224Cq) r9
            X.EKp r12 = r5.A03
            X.05G r1 = r12.A00
            X.EKn r0 = X.C47867EKn.A00
            r1.Epw(r0)
            X.0rm r13 = r5.A05
            java.lang.String r14 = r5.A04
            r1 = 45
            X.MGl r11 = new X.MGl
            r16 = r1
            r11.<init>((java.lang.Object) r12, (java.lang.Object) r13, (java.lang.String) r14, (X.AnonymousClass4D7) r15, (int) r16)
            X.19B r10 = X.19B.A00
            X.2Q8 r3 = X.1Eo.A02(r10, r11, r9)
            boolean r0 = r5.A07
            if (r0 == 0) goto L_0x0086
            boolean r0 = r5.A06
            if (r0 != 0) goto L_0x0086
            X.MGt r0 = new X.MGt
            r0.<init>((java.lang.Object) r12, (X.AnonymousClass4D7) r15, (int) r1)
            X.2Q8 r2 = X.1Eo.A02(r10, r0, r9)
            r1 = 46
            X.MGt r0 = new X.MGt
            r0.<init>((java.lang.Object) r12, (X.AnonymousClass4D7) r15, (int) r1)
            X.2Q8 r0 = X.1Eo.A02(r10, r0, r9)
            r5.A02 = r3
            r5.A01 = r0
            r5.A00 = r8
            java.lang.Object r1 = r2.A0E(r5)
            if (r1 != r4) goto L_0x0077
            return r4
        L_0x006c:
            java.lang.Object r0 = r5.A01
            X.2Q9 r0 = (X.AnonymousClass2Q9) r0
            java.lang.Object r3 = r5.A02
            X.2Q9 r3 = (X.AnonymousClass2Q9) r3
            X.0eS.A00(r18)
        L_0x0077:
            r5.A02 = r3
            r5.A01 = r15
            r5.A00 = r7
            X.4Cp r0 = (X.C262214Cp) r0
            java.lang.Object r0 = r0.A0E(r5)
            if (r0 != r4) goto L_0x0090
            return r4
        L_0x0086:
            r5.A00 = r2
            goto L_0x0094
        L_0x0089:
            java.lang.Object r3 = r5.A02
            X.2Q9 r3 = (X.AnonymousClass2Q9) r3
            X.0eS.A00(r18)
        L_0x0090:
            r5.A02 = r15
            r5.A00 = r6
        L_0x0094:
            X.4Cp r3 = (X.C262214Cp) r3
            java.lang.Object r0 = r3.A0E(r5)
            if (r0 != r4) goto L_0x0014
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.memberlist.viewmodel.CreatorMessagingSelectionScreenViewModel$fetchMemberData$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CreatorMessagingSelectionScreenViewModel$fetchMemberData$2) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}

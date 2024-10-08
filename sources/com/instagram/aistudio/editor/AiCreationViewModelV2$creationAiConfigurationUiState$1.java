package com.instagram.aistudio.editor;

import X.0sI;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60316JjJ;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.aistudio.editor.AiCreationViewModelV2$creationAiConfigurationUiState$1", f = "AiCreationViewModelV2.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AiCreationViewModelV2$creationAiConfigurationUiState$1 extends AnonymousClass1Ek implements 0sI {
    public /* synthetic */ int A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public /* synthetic */ Object A03;
    public final /* synthetic */ C60316JjJ A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AiCreationViewModelV2$creationAiConfigurationUiState$1(C60316JjJ jjJ, AnonymousClass4D7 r3) {
        super(5, r3);
        this.A04 = jjJ;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int A0M = AnonymousClass7TE.A0M(obj4);
        AiCreationViewModelV2$creationAiConfigurationUiState$1 aiCreationViewModelV2$creationAiConfigurationUiState$1 = new AiCreationViewModelV2$creationAiConfigurationUiState$1(this.A04, (AnonymousClass4D7) obj5);
        aiCreationViewModelV2$creationAiConfigurationUiState$1.A01 = obj;
        aiCreationViewModelV2$creationAiConfigurationUiState$1.A02 = obj2;
        aiCreationViewModelV2$creationAiConfigurationUiState$1.A03 = obj3;
        aiCreationViewModelV2$creationAiConfigurationUiState$1.A00 = A0M;
        return aiCreationViewModelV2$creationAiConfigurationUiState$1.invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0108, code lost:
        if (r3 == false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x012a, code lost:
        if (r1 == false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0156, code lost:
        if (r3.A0J == false) goto L_0x00b4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x016d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            r30 = this;
            X.0eS.A00(r31)
            r7 = r30
            java.lang.Object r3 = r7.A01
            X.Jvz r3 = (X.C61061Jvz) r3
            java.lang.Object r6 = r7.A02
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r7.A03
            java.lang.String r5 = (java.lang.String) r5
            int r12 = r7.A00
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            if (r3 == 0) goto L_0x0042
            java.util.List r0 = r3.A0E
            if (r0 == 0) goto L_0x0042
            java.util.Iterator r4 = r0.iterator()
        L_0x0021:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0042
            java.lang.Object r1 = r4.next()
            X.Jvt r1 = (X.C61055Jvt) r1
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0021
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x003c
            java.lang.String r0 = ", "
            r2.append(r0)
        L_0x003c:
            java.lang.String r0 = r1.A01
            r2.append(r0)
            goto L_0x0021
        L_0x0042:
            X.JjJ r0 = r7.A04
            com.instagram.common.session.UserSession r8 = r0.A01
            java.lang.Integer r4 = X.JTS.A0e(r8)
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            boolean r14 = X.AnonymousClass7TF.A1W(r4, r1)
            X.KX0 r1 = r0.A00
            X.0Ud r7 = r1.A0c
            java.util.Map r4 = X.JTO.A19(r7)
            if (r3 == 0) goto L_0x0165
            java.lang.String r1 = r3.A08
        L_0x005c:
            java.lang.Object r9 = r4.get(r1)
            java.lang.Integer r1 = X.JTS.A0e(r8)
            int r4 = r1.intValue()
            r29 = 0
            r1 = 1
            if (r4 == r1) goto L_0x0161
            r1 = 2
            if (r4 != r1) goto L_0x0076
            X.Kix r1 = X.C62626Kix.PUBLIC_FOR_IG_PRIVATE_ACCOUNTS
        L_0x0072:
            if (r9 != r1) goto L_0x0076
            r29 = 1
        L_0x0076:
            if (r14 != 0) goto L_0x015d
            X.4Cl r1 = X.DbX.A0m(r8)
            java.lang.Integer r16 = r1.B6v()
        L_0x0080:
            if (r3 == 0) goto L_0x015a
            com.instagram.common.typedurl.ImageUrl r15 = r3.A01
        L_0x0084:
            java.lang.String r1 = "Required value was null."
            if (r15 == 0) goto L_0x016d
            if (r3 == 0) goto L_0x0168
            java.lang.String r10 = r3.A06
            if (r10 == 0) goto L_0x0168
            java.lang.String r11 = r3.A09
            java.util.List r4 = r3.A0C
            if (r4 != 0) goto L_0x0096
            X.0sn r4 = X.0sn.A00
        L_0x0096:
            java.lang.String r1 = r3.A08
            r20 = r1
            if (r1 != 0) goto L_0x009e
            java.lang.String r20 = ""
        L_0x009e:
            java.lang.Object r7 = X.JTR.A0z(r1, r7)
            X.Kix r7 = (X.C62626Kix) r7
            if (r7 == 0) goto L_0x00b4
            int r9 = r7.ordinal()
            r7 = 7
            if (r9 == r7) goto L_0x0152
            r7 = 2
            if (r9 == r7) goto L_0x0152
            r7 = 8
            if (r9 == r7) goto L_0x0152
        L_0x00b4:
            r27 = 0
        L_0x00b6:
            boolean r9 = r3.A0L
            java.util.List r7 = r3.A0E
            r25 = r7
            if (r7 != 0) goto L_0x00c0
            X.0sn r25 = X.0sn.A00
        L_0x00c0:
            java.lang.String r21 = X.DbT.A10(r2)
            X.0Ud r0 = r0.A0F
            java.lang.Object r3 = X.JTR.A0z(r1, r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324076023131910(0x810c8e00272f06, double:3.0348301701181386E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            if (r0 == 0) goto L_0x014f
            android.content.Context r2 = X.C51966G9m.A0P(r8)
            X.Kix r0 = X.C62626Kix.PUBLIC
            r1 = 1
            r13 = 0
            boolean r8 = X.AnonymousClass7TF.A1W(r3, r0)
            if (r9 == r1) goto L_0x00e6
            r1 = 0
        L_0x00e6:
            r3 = 0
            if (r7 == 0) goto L_0x014d
            boolean r0 = r7 instanceof java.util.Collection
            if (r0 == 0) goto L_0x012d
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x012d
        L_0x00f3:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r3 = X.C51968G9o.A0t(r7)
        L_0x00fb:
            boolean r3 = X.0qQ.A0K(r0, r3)
            if (r14 == 0) goto L_0x0125
            if (r8 == 0) goto L_0x010a
            if (r1 == 0) goto L_0x010a
            r0 = 2131952692(0x7f130434, float:1.9541834E38)
            if (r3 != 0) goto L_0x010d
        L_0x010a:
            r0 = 2131952691(0x7f130433, float:1.9541832E38)
        L_0x010d:
            java.lang.String r23 = X.C51967G9n.A0p(r2, r0)
        L_0x0111:
            X.JvB r14 = new X.JvB
            r22 = r5
            r24 = r4
            r26 = r12
            r28 = r9
            r19 = r11
            r18 = r6
            r17 = r10
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r14
        L_0x0125:
            if (r8 == 0) goto L_0x010a
            r0 = 2131952690(0x7f130432, float:1.954183E38)
            if (r1 != 0) goto L_0x010d
            goto L_0x010a
        L_0x012d:
            java.util.Iterator r3 = r7.iterator()
        L_0x0131:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00f3
            java.lang.Object r0 = r3.next()
            X.Jvt r0 = (X.C61055Jvt) r0
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x0131
            int r13 = r13 + 1
            if (r13 >= 0) goto L_0x0131
            X.0sr.A1S()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x014d:
            r0 = r3
            goto L_0x00fb
        L_0x014f:
            java.lang.String r23 = ""
            goto L_0x0111
        L_0x0152:
            boolean r7 = r3.A0J
            r27 = 1
            if (r7 != 0) goto L_0x00b6
            goto L_0x00b4
        L_0x015a:
            r15 = 0
            goto L_0x0084
        L_0x015d:
            r16 = 0
            goto L_0x0080
        L_0x0161:
            X.Kix r1 = X.C62626Kix.PUBLIC
            goto L_0x0072
        L_0x0165:
            r1 = 0
            goto L_0x005c
        L_0x0168:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x016d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.aistudio.editor.AiCreationViewModelV2$creationAiConfigurationUiState$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

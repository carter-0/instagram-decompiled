package com.meta.metaai.components.voice.viewmodel;

import X.0sL;
import X.0sP;
import X.AnonymousClass07Z;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C53033GhO;
import X.C60340gF;
import android.content.Context;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.meta.metaai.components.voice.viewmodel.MetaAiVoiceSessionViewModel$startVoiceSession$4", f = "MetaAiVoiceSessionViewModel.kt", i = {0}, l = {116, 132, 162, 165, 168}, m = "invokeSuspend", n = {"previousState"}, s = {"L$0"})
public final class MetaAiVoiceSessionViewModel$startVoiceSession$4 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ Context A03;
    public final /* synthetic */ AnonymousClass07Z A04;
    public final /* synthetic */ C53033GhO A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ 0sP A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MetaAiVoiceSessionViewModel$startVoiceSession$4(Context context, AnonymousClass07Z r3, C53033GhO ghO, String str, String str2, AnonymousClass4D7 r7, 0sP r8, long j, boolean z, boolean z2) {
        super(2, r7);
        this.A05 = ghO;
        this.A02 = j;
        this.A06 = str;
        this.A03 = context;
        this.A07 = str2;
        this.A08 = r8;
        this.A09 = z;
        this.A0A = z2;
        this.A04 = r3;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.meta.metaai.components.voice.viewmodel.MetaAiVoiceSessionViewModel$startVoiceSession$4, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r14) {
        C53033GhO ghO = this.A05;
        long j = this.A02;
        String str = this.A06;
        return new MetaAiVoiceSessionViewModel$startVoiceSession$4(this.A03, this.A04, ghO, str, this.A07, r14, this.A08, j, this.A09, this.A0A);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.meta.metaai.components.voice.viewmodel.MetaAiVoiceSessionViewModel$startVoiceSession$4, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x016c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x016d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            r27 = this;
            r1 = r28
            X.1Hj r2 = X.1Hj.A02
            r3 = r27
            int r0 = r3.A00
            r7 = 3
            r4 = 2
            r8 = 1
            if (r0 == 0) goto L_0x0015
            if (r0 == r8) goto L_0x00c3
            X.0eS.A00(r1)
        L_0x0012:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x0015:
            X.0eS.A00(r1)
            X.GhO r1 = r3.A05
            X.05G r0 = r1.A0A
            java.lang.Object r6 = r0.getValue()
            X.I4Z r6 = (X.I4Z) r6
            X.OVH r5 = r1.A03
            long r9 = r3.A02
            java.lang.String r14 = r3.A06
            if (r14 != 0) goto L_0x002c
            java.lang.String r14 = "meta_ai_voice_sheet"
        L_0x002c:
            android.content.Context r13 = r3.A03
            java.lang.String r12 = r3.A07
            X.0sP r11 = r3.A08
            boolean r0 = r3.A09
            X.Jty r1 = new X.Jty
            r22 = r0
            r15 = r1
            r16 = r13
            r17 = r14
            r18 = r12
            r19 = r11
            r20 = r9
            r15.<init>(r16, r17, r18, r19, r20, r22)
            r3.A01 = r6
            r3.A00 = r8
            X.AnonymousClass38W.A00()
            java.lang.String r9 = r1.A02
            com.instagram.common.session.UserSession r11 = r5.A00
            X.7Rj r0 = X.OVH.A03
            boolean r24 = X.DbW.A1S(r4, r9, r0)
            com.instagram.rtc.analytics.RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplIdFromString r13 = new com.instagram.rtc.analytics.RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplIdFromString
            r13.<init>(r9)
            X.OWf r10 = X.C70320O1y.A00(r11)
            r10.A01 = r9
            r10.A01(r4)
            r0 = 816(0x330, float:1.143E-42)
            java.lang.String r9 = X.C273654mx.A00(r0)
            r10.A04(r9)
            android.content.Context r0 = r1.A01
            X.OyC r10 = X.C66953Mfm.A00(r0, r11)
            java.lang.String r0 = "-1"
            X.OWA r11 = r10.A06
            java.lang.Integer r16 = X.AnonymousClass05K.A00
            java.lang.Integer r17 = X.AnonymousClass05K.A01
            r12 = 0
            java.lang.String r19 = X.AnonymousClass7TF.A0b()
            java.lang.String r10 = new java.lang.String
            r10.<init>()
            r14 = r12
            r15 = r12
            r20 = r0
            r21 = r0
            r22 = r12
            r23 = r12
            r18 = r9
            java.lang.String r12 = r11.A01(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            X.0qQ.A0B(r12, r8)
            X.OWb r11 = X.C71004OWb.A00
            r9 = 942(0x3ae, float:1.32E-42)
            java.lang.String r10 = X.C66579MXk.A00(r9)
            r9 = 447(0x1bf, float:6.26E-43)
            java.lang.String r9 = X.C66579MXk.A00(r9)
            java.lang.String r9 = X.002.A0u(r10, r0, r9, r12)
            r0 = 609(0x261, float:8.53E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r11.A00(r0, r9)
            X.0eM r0 = r5.A02
            java.lang.Object r0 = r0.getValue()
            com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdk r0 = (com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdk) r0
            java.lang.Object r1 = r0.A00(r1, r3)
            if (r1 != r2) goto L_0x00ca
            return r2
        L_0x00c3:
            java.lang.Object r6 = r3.A01
            X.I4Z r6 = (X.I4Z) r6
            X.0eS.A00(r1)
        L_0x00ca:
            X.Kl2 r1 = (X.C62702Kl2) r1
            boolean r0 = r1 instanceof X.K0G
            r5 = 0
            if (r0 == 0) goto L_0x016d
            X.GhO r7 = r3.A05
            X.05G r9 = r7.A0A
        L_0x00d5:
            java.lang.Object r10 = r9.getValue()
            r11 = r10
            X.I4Z r11 = (X.I4Z) r11
            java.lang.String r0 = r11.A05
            r18 = r0
            java.lang.String r0 = r11.A06
            r19 = r0
            X.HMJ r0 = r11.A01
            r26 = r0
            boolean r0 = r11.A0A
            r17 = r0
            boolean r0 = r11.A08
            r16 = r0
            boolean r15 = r11.A0B
            android.net.Uri r14 = r11.A00
            java.lang.Integer r13 = r11.A04
            X.JMQ r12 = r11.A02
            boolean r11 = r11.A09
            X.I4Z r0 = new X.I4Z
            r20 = r8
            r21 = r17
            r22 = r16
            r23 = r8
            r24 = r15
            r25 = r11
            r15 = r12
            r16 = r5
            r17 = r13
            r12 = r0
            r13 = r14
            r14 = r26
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            boolean r0 = r9.AIY(r10, r0)
            if (r0 == 0) goto L_0x00d5
            X.0sa r0 = r7.A05
            r0.invoke()
            X.K0G r1 = (X.K0G) r1
            com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession r9 = r1.A00
            r7.A00 = r9
            if (r9 == 0) goto L_0x012d
            r0 = 50
            X.LB4 r8 = r9.A00
            r8.A01 = r0
        L_0x012d:
            boolean r0 = r3.A0A
            if (r0 == 0) goto L_0x0145
            if (r9 == 0) goto L_0x013a
            boolean r0 = r6.A0A
            r0 = r0 ^ 1
            r9.A02(r0)
        L_0x013a:
            com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession r1 = r7.A00
            if (r1 == 0) goto L_0x0145
            boolean r0 = r6.A08
            r0 = r0 ^ 1
            r1.A01(r0)
        L_0x0145:
            X.07Z r13 = r3.A04
            X.07V r10 = r13.getLifecycle()
            X.07U r9 = X.07U.A05
            android.content.Context r12 = r3.A03
            long r0 = r3.A02
            X.0sP r8 = r3.A08
            boolean r6 = r3.A09
            X.ImJ r11 = new X.ImJ
            r14 = r7
            r15 = r5
            r16 = r8
            r17 = r0
            r19 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r19)
            r3.A01 = r5
            r3.A00 = r4
            java.lang.Object r0 = X.AnonymousClass3DM.A00(r9, r10, r3, r11)
        L_0x016a:
            if (r0 != r2) goto L_0x0012
            return r2
        L_0x016d:
            boolean r0 = r1 instanceof X.K0I
            if (r0 == 0) goto L_0x0189
            X.4CZ r0 = X.AnonymousClass12W.A00
            X.134 r10 = X.AnonymousClass12y.A00
            X.GhO r4 = r3.A05
            android.content.Context r1 = r3.A03
            r0 = 16
            X.ImP r11 = new X.ImP
            r11.<init>(r4, r1, r5, r0)
            r3.A01 = r5
        L_0x0182:
            r3.A00 = r7
            java.lang.Object r0 = X.1Eo.A00(r3, r10, r11)
            goto L_0x016a
        L_0x0189:
            boolean r1 = r1 instanceof X.K0J
            X.4CZ r0 = X.AnonymousClass12W.A00
            X.134 r10 = X.AnonymousClass12y.A00
            if (r1 == 0) goto L_0x01a0
            X.GhO r4 = r3.A05
            android.content.Context r1 = r3.A03
            r0 = 17
            X.ImP r11 = new X.ImP
            r11.<init>(r4, r1, r5, r0)
            r3.A01 = r5
            r7 = 4
            goto L_0x0182
        L_0x01a0:
            X.GhO r9 = r3.A05
            android.content.Context r8 = r3.A03
            long r6 = r3.A02
            X.07Z r4 = r3.A04
            X.0sP r1 = r3.A08
            boolean r0 = r3.A09
            com.meta.metaai.components.voice.viewmodel.MetaAiVoiceSessionViewModel$startVoiceSession$4$4 r11 = new com.meta.metaai.components.voice.viewmodel.MetaAiVoiceSessionViewModel$startVoiceSession$4$4
            r19 = r0
            r12 = r8
            r13 = r4
            r14 = r9
            r15 = r5
            r16 = r1
            r17 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r19)
            r3.A01 = r5
            r7 = 5
            goto L_0x0182
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.components.voice.viewmodel.MetaAiVoiceSessionViewModel$startVoiceSession$4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MetaAiVoiceSessionViewModel$startVoiceSession$4) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}

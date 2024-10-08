package com.instagram.direct.msys.mailbox.core.mutation;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C254933tI;
import X.C60340gF;
import X.C63822L8d;
import X.C70472O7x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.msys.mailbox.core.mutation.MsysVoiceMessageSender$sendSecureVoiceMessage$1", f = "MsysVoiceMessageSender.kt", i = {}, l = {35, 60}, m = "invokeSuspend", n = {}, s = {})
public final class MsysVoiceMessageSender$sendSecureVoiceMessage$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C254933tI A02;
    public final /* synthetic */ C70472O7x A03;
    public final /* synthetic */ C63822L8d A04;
    public final /* synthetic */ Long A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MsysVoiceMessageSender$sendSecureVoiceMessage$1(C254933tI r2, C70472O7x o7x, C63822L8d l8d, Long l, String str, String str2, String str3, AnonymousClass4D7 r9, long j) {
        super(2, r9);
        this.A03 = o7x;
        this.A04 = l8d;
        this.A07 = str;
        this.A01 = j;
        this.A02 = r2;
        this.A08 = str2;
        this.A06 = str3;
        this.A05 = l;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.direct.msys.mailbox.core.mutation.MsysVoiceMessageSender$sendSecureVoiceMessage$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r13) {
        C70472O7x o7x = this.A03;
        C63822L8d l8d = this.A04;
        String str = this.A07;
        long j = this.A01;
        return new MsysVoiceMessageSender$sendSecureVoiceMessage$1(this.A02, o7x, l8d, this.A05, str, this.A08, this.A06, r13, j);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.direct.msys.mailbox.core.mutation.MsysVoiceMessageSender$sendSecureVoiceMessage$1, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0098 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0099  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r36) {
        /*
            r35 = this;
            r4 = r36
            X.1Hj r3 = X.1Hj.A02
            r5 = r35
            int r0 = r5.A00
            r2 = 2
            r6 = 1
            if (r0 == 0) goto L_0x0014
            if (r0 == r6) goto L_0x0031
            X.0eS.A00(r4)
        L_0x0011:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x0014:
            X.0eS.A00(r4)
            X.O7x r0 = r5.A03
            com.instagram.common.session.UserSession r4 = r0.A00
            X.L8d r0 = r5.A04
            java.lang.String r1 = r0.A01
            java.lang.String r0 = r5.A07
            X.Dba.A0j(r6, r4, r1)
            com.facebook.msys.mca.MailboxFutureImpl r0 = X.C71031OZi.A00(r4, r1, r0)
            r5.A00 = r6
            java.lang.Object r4 = X.C303606Aa.A01(r0, r5)
            if (r4 != r3) goto L_0x0034
            return r3
        L_0x0031:
            X.0eS.A00(r4)
        L_0x0034:
            java.lang.String r4 = (java.lang.String) r4
            X.OUC r11 = X.C70947OSu.A01
            X.O7x r0 = r5.A03
            com.instagram.common.session.UserSession r12 = r0.A00
            long r0 = r5.A01
            r28 = 5
            r13 = 0
            X.L8d r7 = r5.A04
            java.lang.String r6 = r7.A01
            java.io.File r6 = X.AnonymousClass7TE.A0t(r6)
            java.lang.String r22 = r6.getName()
            X.0qQ.A07(r22)
            java.lang.String r6 = r7.A01
            java.io.File r6 = X.AnonymousClass7TE.A0t(r6)
            long r32 = r6.length()
            int r10 = r7.A00
            X.3tI r6 = r5.A02
            if (r6 == 0) goto L_0x0099
            java.lang.String r6 = r6.A0T
            if (r6 == 0) goto L_0x0099
            java.lang.Long r18 = X.AnonymousClass7TE.A10(r6)
        L_0x0068:
            r34 = 0
            java.lang.String r9 = r5.A08
            java.lang.String r8 = r5.A07
            java.lang.String r7 = r5.A06
            java.lang.Long r6 = r5.A05
            java.lang.String r20 = "audio/mp4"
            r14 = r13
            r15 = r13
            r16 = r13
            r17 = r13
            r21 = r20
            r23 = r13
            r24 = r4
            r25 = r9
            r26 = r8
            r27 = r7
            r29 = r10
            r30 = r0
            r19 = r6
            com.facebook.msys.mca.MailboxFutureImpl r0 = r11.A01(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r32, r34)
            r5.A00 = r2
            java.lang.Object r0 = X.C303606Aa.A01(r0, r5)
            if (r0 != r3) goto L_0x0011
            return r3
        L_0x0099:
            r18 = 0
            goto L_0x0068
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.msys.mailbox.core.mutation.MsysVoiceMessageSender$sendSecureVoiceMessage$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MsysVoiceMessageSender$sendSecureVoiceMessage$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}

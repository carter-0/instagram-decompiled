package com.instagram.direct.msys.mailbox.core.mutation;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass9HR;
import X.C352218Cl;
import X.C60340gF;
import X.C70744OJp;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.msys.mailbox.core.mutation.MsysImageSender$sendSecureImageMessage$1", f = "MsysImageSender.kt", i = {1, 2, 2}, l = {40, 45, 49, 77}, m = "invokeSuspend", n = {"msysThreadId", "msysThreadId", "imageUUID"}, s = {"L$0", "L$0", "L$1"})
public final class MsysImageSender$sendSecureImageMessage$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public final /* synthetic */ C70744OJp A03;
    public final /* synthetic */ AnonymousClass9HR A04;
    public final /* synthetic */ C352218Cl A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ Long A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MsysImageSender$sendSecureImageMessage$1(C70744OJp oJp, AnonymousClass9HR r3, C352218Cl r4, Integer num, Long l, String str, String str2, String str3, AnonymousClass4D7 r10, boolean z) {
        super(2, r10);
        this.A03 = oJp;
        this.A04 = r3;
        this.A05 = r4;
        this.A09 = str;
        this.A06 = num;
        this.A07 = l;
        this.A0B = z;
        this.A0A = str2;
        this.A08 = str3;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.direct.msys.mailbox.core.mutation.MsysImageSender$sendSecureImageMessage$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r13) {
        C70744OJp oJp = this.A03;
        AnonymousClass9HR r2 = this.A04;
        C352218Cl r3 = this.A05;
        String str = this.A09;
        return new MsysImageSender$sendSecureImageMessage$1(oJp, r2, r3, this.A06, this.A07, str, this.A0A, this.A08, r13, this.A0B);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.direct.msys.mailbox.core.mutation.MsysImageSender$sendSecureImageMessage$1, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0057 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00fe A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r41) {
        /*
            r40 = this;
            r10 = r41
            X.1Hj r3 = X.1Hj.A02
            r4 = r40
            int r0 = r4.A00
            r7 = 4
            r8 = 3
            r5 = 2
            r9 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r9) goto L_0x0034
            if (r0 == r5) goto L_0x0058
            if (r0 == r8) goto L_0x0082
            X.0eS.A00(r10)
        L_0x0017:
            X.0gF r3 = X.C60340gF.A00
        L_0x0019:
            return r3
        L_0x001a:
            X.0eS.A00(r10)
            X.OJp r0 = r4.A03
            com.instagram.common.session.UserSession r2 = r0.A00
            X.67N r1 = X.OUC.A00(r2)
            X.9HR r0 = r4.A04
            com.google.common.util.concurrent.ListenableFuture r0 = X.C70881OPy.A01(r1, r2, r0)
            r4.A00 = r9
            java.lang.Object r10 = X.C70357O3j.A00(r0, r4)
            if (r10 != r3) goto L_0x0037
            return r3
        L_0x0034:
            X.0eS.A00(r10)
        L_0x0037:
            r6 = r10
            com.instagram.model.direct.threadkey.impl.MsysThreadId r6 = (com.instagram.model.direct.threadkey.impl.MsysThreadId) r6
            X.OJp r0 = r4.A03
            com.instagram.common.session.UserSession r2 = r0.A00
            X.8Cl r0 = r4.A05
            java.lang.String r1 = r0.A06()
            java.lang.String r0 = r4.A09
            X.Dba.A0j(r9, r2, r1)
            com.facebook.msys.mca.MailboxFutureImpl r0 = X.C71031OZi.A00(r2, r1, r0)
            r4.A01 = r6
            r4.A00 = r5
            java.lang.Object r10 = X.C303606Aa.A01(r0, r4)
            if (r10 != r3) goto L_0x005f
            return r3
        L_0x0058:
            java.lang.Object r6 = r4.A01
            com.instagram.model.direct.threadkey.impl.MsysThreadId r6 = (com.instagram.model.direct.threadkey.impl.MsysThreadId) r6
            X.0eS.A00(r10)
        L_0x005f:
            java.lang.String r10 = (java.lang.String) r10
            X.OJp r0 = r4.A03
            com.instagram.common.session.UserSession r2 = r0.A00
            X.8Cl r0 = r4.A05
            java.lang.String r1 = r0.A06()
            java.lang.String r0 = r4.A09
            X.Dba.A0j(r9, r2, r1)
            com.facebook.msys.mca.MailboxFutureImpl r0 = X.C71031OZi.A00(r2, r1, r0)
            r4.A01 = r6
            r4.A02 = r10
            r4.A00 = r8
            java.lang.Object r2 = X.C303606Aa.A01(r0, r4)
            if (r2 == r3) goto L_0x0019
            r1 = r10
            goto L_0x008e
        L_0x0082:
            java.lang.Object r1 = r4.A02
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r6 = r4.A01
            com.instagram.model.direct.threadkey.impl.MsysThreadId r6 = (com.instagram.model.direct.threadkey.impl.MsysThreadId) r6
            X.0eS.A00(r10)
            r2 = r10
        L_0x008e:
            java.lang.String r2 = (java.lang.String) r2
            X.8Cl r0 = r4.A05
            int r11 = r0.A06
            int r10 = r0.A09
            X.OUC r16 = X.C70947OSu.A01
            X.OJp r8 = r4.A03
            com.instagram.common.session.UserSession r8 = r8.A00
            r17 = r8
            long r8 = r6.A00
            java.lang.Integer r18 = X.JTO.A0w(r11)
            java.lang.Integer r19 = X.JTO.A0w(r10)
            java.lang.Integer r20 = X.JTO.A0w(r11)
            java.lang.Integer r21 = X.JTO.A0w(r10)
            java.io.File r10 = r0.A03()
            java.lang.String r27 = r10.getName()
            X.0qQ.A07(r27)
            java.io.File r0 = r0.A03()
            long r37 = r0.length()
            r34 = 0
            java.lang.Integer r15 = r4.A06
            java.lang.Long r14 = r4.A07
            boolean r13 = r4.A0B
            java.lang.String r12 = r4.A0A
            r0 = 0
            java.lang.String r11 = r4.A09
            java.lang.String r10 = r4.A08
            java.lang.Long r24 = X.AnonymousClass4KK.A01(r6)
            java.lang.String r25 = "image/jpeg"
            r26 = r25
            r28 = r2
            r29 = r1
            r30 = r12
            r31 = r11
            r32 = r10
            r33 = r5
            r35 = r8
            r39 = r13
            r22 = r15
            r23 = r14
            com.facebook.msys.mca.MailboxFutureImpl r1 = r16.A01(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37, r39)
            r4.A01 = r0
            r4.A02 = r0
            r4.A00 = r7
            java.lang.Object r0 = X.C303606Aa.A01(r1, r4)
            if (r0 != r3) goto L_0x0017
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.msys.mailbox.core.mutation.MsysImageSender$sendSecureImageMessage$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MsysImageSender$sendSecureImageMessage$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}

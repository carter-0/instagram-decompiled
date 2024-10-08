package com.instagram.direct.send;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass9HR;
import X.C60340gF;
import com.instagram.common.session.UserSession;
import java.io.File;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.send.MsysAvatarStickerSender$sendSecureAvatarStickerMessage$1", f = "MsysAvatarStickerSender.kt", i = {1, 2, 2}, l = {40, 44, 48}, m = "invokeSuspend", n = {"threadId", "threadId", "previewUUID"}, s = {"L$0", "L$0", "L$1"})
public final class MsysAvatarStickerSender$sendSecureAvatarStickerMessage$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ AnonymousClass9HR A06;
    public final /* synthetic */ File A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MsysAvatarStickerSender$sendSecureAvatarStickerMessage$1(UserSession userSession, AnonymousClass9HR r3, File file, String str, String str2, String str3, String str4, AnonymousClass4D7 r9, int i, int i2) {
        super(2, r9);
        this.A05 = userSession;
        this.A06 = r3;
        this.A07 = file;
        this.A09 = str;
        this.A03 = i;
        this.A04 = i2;
        this.A0B = str2;
        this.A0A = str3;
        this.A08 = str4;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.direct.send.MsysAvatarStickerSender$sendSecureAvatarStickerMessage$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r13) {
        return new MsysAvatarStickerSender$sendSecureAvatarStickerMessage$1(this.A05, this.A06, this.A07, this.A09, this.A0B, this.A0A, this.A08, r13, this.A03, this.A04);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.direct.send.MsysAvatarStickerSender$sendSecureAvatarStickerMessage$1, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00ac A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00d3 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r36) {
        /*
            r35 = this;
            r3 = r36
            X.1Hj r9 = X.1Hj.A02
            r4 = r35
            int r0 = r4.A00
            r8 = 3
            r7 = 2
            r5 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0074
            if (r0 == r5) goto L_0x008c
            if (r0 == r7) goto L_0x00ad
            java.lang.Object r1 = r4.A02
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r4.A01
            com.instagram.model.direct.threadkey.impl.MsysThreadId r0 = (com.instagram.model.direct.threadkey.impl.MsysThreadId) r0
            X.0eS.A00(r3)
        L_0x001d:
            java.lang.String r3 = (java.lang.String) r3
            X.OUC r11 = X.C70947OSu.A01
            com.instagram.common.session.UserSession r12 = r4.A05
            long r7 = r0.A00
            java.lang.String r9 = r4.A09
            int r10 = r4.A03
            java.lang.Integer r13 = X.JTO.A0w(r10)
            int r6 = r4.A04
            java.lang.Integer r14 = X.JTO.A0w(r6)
            java.lang.Integer r15 = X.JTO.A0w(r10)
            java.lang.Integer r16 = X.JTO.A0w(r6)
            java.io.File r6 = r4.A07
            java.lang.String r22 = r6.getName()
            X.0qQ.A07(r22)
            long r32 = r6.length()
            r29 = 0
            java.lang.String r6 = r4.A0B
            java.lang.Long r18 = X.C51972G9s.A0i(r6)
            java.lang.String r6 = r4.A0A
            java.lang.String r4 = r4.A08
            java.lang.Long r19 = X.AnonymousClass4KK.A01(r0)
            r21 = r9
            r24 = r3
            r25 = r2
            r26 = r6
            r27 = r4
            r28 = r5
            r30 = r7
            r34 = r29
            r20 = r9
            r23 = r1
            r17 = r2
            r11.A01(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r32, r34)
            X.0gF r9 = X.C60340gF.A00
            return r9
        L_0x0074:
            X.0eS.A00(r3)
            com.instagram.common.session.UserSession r3 = r4.A05
            X.67N r1 = X.OUC.A00(r3)
            X.9HR r0 = r4.A06
            com.google.common.util.concurrent.ListenableFuture r0 = X.C70881OPy.A01(r1, r3, r0)
            r4.A00 = r5
            java.lang.Object r3 = X.C70357O3j.A00(r0, r4)
            if (r3 != r9) goto L_0x008f
            return r9
        L_0x008c:
            X.0eS.A00(r3)
        L_0x008f:
            r0 = r3
            com.instagram.model.direct.threadkey.impl.MsysThreadId r0 = (com.instagram.model.direct.threadkey.impl.MsysThreadId) r0
            com.instagram.common.session.UserSession r6 = r4.A05
            java.io.File r1 = r4.A07
            java.lang.String r3 = X.JTP.A0t(r1)
            r1 = 0
            X.0qQ.A0B(r6, r1)
            com.facebook.msys.mca.MailboxFutureImpl r1 = X.C71031OZi.A00(r6, r3, r2)
            r4.A01 = r0
            r4.A00 = r7
            java.lang.Object r3 = X.C303606Aa.A01(r1, r4)
            if (r3 != r9) goto L_0x00b4
            return r9
        L_0x00ad:
            java.lang.Object r0 = r4.A01
            com.instagram.model.direct.threadkey.impl.MsysThreadId r0 = (com.instagram.model.direct.threadkey.impl.MsysThreadId) r0
            X.0eS.A00(r3)
        L_0x00b4:
            r1 = r3
            java.lang.String r1 = (java.lang.String) r1
            com.instagram.common.session.UserSession r7 = r4.A05
            java.io.File r3 = r4.A07
            java.lang.String r6 = X.JTP.A0t(r3)
            r3 = 0
            X.0qQ.A0B(r7, r3)
            com.facebook.msys.mca.MailboxFutureImpl r3 = X.C71031OZi.A00(r7, r6, r2)
            r4.A01 = r0
            r4.A02 = r1
            r4.A00 = r8
            java.lang.Object r3 = X.C303606Aa.A01(r3, r4)
            if (r3 != r9) goto L_0x001d
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.send.MsysAvatarStickerSender$sendSecureAvatarStickerMessage$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MsysAvatarStickerSender$sendSecureAvatarStickerMessage$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}

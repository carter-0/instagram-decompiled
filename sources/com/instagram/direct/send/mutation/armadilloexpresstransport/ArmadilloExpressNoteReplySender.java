package com.instagram.direct.send.mutation.armadilloexpresstransport;

import X.AnonymousClass12T;
import X.C262224Cq;
import X.C51966G9m;
import X.JTR;
import android.content.Context;
import com.instagram.common.session.UserSession;

public final class ArmadilloExpressNoteReplySender {
    public final Context A00;
    public final UserSession A01;
    public final C262224Cq A02;
    public final AnonymousClass12T A03;

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MED, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(X.N1Z r9, com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender r10, X.1kF r11, X.AnonymousClass4D7 r12) {
        /*
            r7 = r9
            r3 = 39
            boolean r0 = X.MED.A04(r3, r12)
            if (r0 == 0) goto L_0x00c6
            r5 = r12
            X.MED r5 = (X.MED) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00c6
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0017:
            java.lang.Object r1 = r5.A04
            X.1Hj r6 = X.1Hj.A02
            int r0 = r5.A00
            r9 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0091
            if (r0 != r4) goto L_0x00cd
            java.lang.Object r7 = r5.A03
            X.N1Z r7 = (X.N1Z) r7
            java.lang.Object r11 = r5.A02
            X.1kF r11 = (X.1kF) r11
            java.lang.Object r10 = r5.A01
            com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender r10 = (com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender) r10
            X.0eS.A00(r1)
        L_0x0032:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x00d2
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r0 = X.C66834MdS.A03(r1)
            if (r0 == 0) goto L_0x0086
            X.NFm r1 = com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport.A00(r0)
            java.lang.String r0 = "image/webp"
            r1.A06(r0)
            X.R5b r1 = r1.A02()
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r1 = (com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport) r1
            com.instagram.direct.armadilloexpress.transportpayload.AvatarSticker r0 = com.instagram.direct.armadilloexpress.transportpayload.AvatarSticker.DEFAULT_INSTANCE
            X.R4O r2 = r0.A0I()
            X.NFt r2 = (X.C68412NFt) r2
            r2.A06(r1)
            r2.A09(r4)
            com.instagram.common.session.UserSession r0 = r10.A01
            X.797 r1 = X.AnonymousClass796.A01(r0, r11)
            X.797 r0 = X.AnonymousClass797.ARMADILLO_EXPRESS_OPEN_EB
            if (r1 != r0) goto L_0x0075
            X.6o8 r0 = r11.A00
            if (r0 == 0) goto L_0x00d3
            java.lang.String r0 = r0.A0S
            r2.A07(r0)
            X.6o8 r0 = r11.A00
            if (r0 == 0) goto L_0x00d3
            java.lang.String r0 = r0.A0a
            r2.A08(r0)
        L_0x0075:
            com.instagram.direct.armadilloexpress.transportpayload.Media r0 = com.instagram.direct.armadilloexpress.transportpayload.Media.DEFAULT_INSTANCE
            X.R4O r0 = r0.A0I()
            X.NFp r0 = (X.C68408NFp) r0
            r0.A06(r2)
            X.R5b r9 = r0.A02()
            com.instagram.direct.armadilloexpress.transportpayload.Media r9 = (com.instagram.direct.armadilloexpress.transportpayload.Media) r9
        L_0x0086:
            X.OVn r6 = X.C70992OVn.A00
            com.instagram.common.session.UserSession r8 = r10.A01
            r10 = 0
            r12 = r10
            com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r6 = r6.A00(r7, r8, r9, r10, r11, r12)
            return r6
        L_0x0091:
            X.0eS.A00(r1)
            X.6o8 r0 = r11.A00
            if (r0 == 0) goto L_0x00d3
            com.instagram.common.typedurl.ImageUrl r3 = r0.A0H
            X.0qQ.A07(r3)
            X.1NK r2 = X.1NK.A00()
            com.instagram.common.session.UserSession r1 = r10.A01
            java.lang.String r0 = "SendReceiverFetchXma"
            X.3LX r0 = r2.A0K(r1, r3, r0)
            if (r0 == 0) goto L_0x00d2
            android.graphics.Bitmap r2 = r0.A01
            if (r2 == 0) goto L_0x00d2
            int r1 = r2.getWidth()
            int r0 = r2.getHeight()
            r5.A01 = r10
            r5.A02 = r11
            r5.A03 = r7
            r5.A00 = r4
            java.lang.Object r1 = A00(r2, r10, r5, r1, r0)
            if (r1 != r6) goto L_0x0032
            return r6
        L_0x00c6:
            X.MED r5 = new X.MED
            r5.<init>(r10, r12, r3)
            goto L_0x0017
        L_0x00cd:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00d2:
            return r9
        L_0x00d3:
            java.lang.String r0 = "avatarSticker"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender.A02(X.N1Z, com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender, X.1kF, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.MDh, X.4D7] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(android.graphics.Bitmap r10, com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender r11, X.AnonymousClass4D7 r12, int r13, int r14) {
        /*
            r4 = 37
            boolean r0 = X.C66129MDh.A01(r4, r12)
            if (r0 == 0) goto L_0x007a
            r1 = r12
            X.MDh r1 = (X.C66129MDh) r1
            int r3 = r1.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x007a
            int r3 = r3 - r2
            r1.A00 = r3
        L_0x0016:
            java.lang.Object r4 = r1.A02
            X.1Hj r3 = X.1Hj.A02
            int r5 = r1.A00
            r0 = 0
            r2 = 1
            if (r5 == 0) goto L_0x0030
            if (r5 != r2) goto L_0x0080
            java.lang.Object r9 = r1.A01
            X.3Q2 r9 = (X.AnonymousClass3Q2) r9
            X.0eS.A00(r4)
        L_0x0029:
            boolean r1 = r4 instanceof X.C62013KVm
            if (r1 == 0) goto L_0x002f
            java.lang.String r0 = r9.A2N
        L_0x002f:
            return r0
        L_0x0030:
            X.0eS.A00(r4)
            java.lang.String r4 = X.JTQ.A0Z()
            X.3Q2 r9 = X.AnonymousClass9T3.A01(r4)
            android.content.Context r7 = r11.A00
            java.io.File r6 = X.0mb.A04(r7)
            r6.deleteOnExit()
            android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.PNG
            r4 = 100
            X.1MF.A0L(r5, r10, r6, r4)
            java.lang.String r4 = X.JTP.A0t(r6)
            r9.A33 = r4
            r9.A0S = r13
            r9.A0R = r14
            com.instagram.pendingmedia.service.upload.armadilloexpress.ArmadilloExpressMediaUploader r4 = com.instagram.pendingmedia.service.upload.armadilloexpress.ArmadilloExpressMediaUploader.A00
            com.instagram.common.session.UserSession r8 = r11.A01
            X.37k r10 = X.C2373637i.A00(r7, r8)
            X.1Cn r12 = new X.1Cn
            r12.<init>(r7)
            java.lang.String r13 = "ArmadilloExpressNoteReplySender"
            X.LvH r11 = X.C65542LvH.A00
            X.0sm r14 = X.0Yt.A0E()
            X.LP8 r6 = new X.LP8
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r1.A01 = r9
            r1.A00 = r2
            java.lang.Object r4 = r4.A00(r6, r1)
            if (r4 != r3) goto L_0x0029
            return r3
        L_0x007a:
            X.MDh r1 = new X.MDh
            r1.<init>(r11, r12, r4)
            goto L_0x0016
        L_0x0080:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender.A00(android.graphics.Bitmap, com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender, X.4D7, int, int):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r15v2, types: [X.ME0, X.4D7] */
    /* JADX WARNING: type inference failed for: r15v5 */
    /* JADX WARNING: type inference failed for: r15v6 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.N1Z r15, com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender r16, X.AnonymousClass1kB r17, X.AnonymousClass4D7 r18) {
        /*
            r13 = r16
            r12 = r17
            r8 = r15
            r3 = 17
            r4 = r18
            boolean r0 = X.ME0.A02(r3, r4)
            if (r0 == 0) goto L_0x019c
            r15 = r4
            X.ME0 r15 = (X.ME0) r15
            int r2 = r15.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x019c
            int r2 = r2 - r1
            r15.A00 = r2
        L_0x001d:
            java.lang.Object r14 = r15.A05
            X.1Hj r5 = X.1Hj.A02
            int r0 = r15.A00
            r3 = 2
            r7 = 1
            r10 = 0
            if (r0 == 0) goto L_0x0128
            if (r0 == r7) goto L_0x015a
            if (r0 != r3) goto L_0x01a3
            java.lang.Object r4 = r15.A04
            com.instagram.model.mediasize.GifUrlImpl r4 = (com.instagram.model.mediasize.GifUrlImpl) r4
            java.lang.Object r8 = r15.A03
            X.N1Z r8 = (X.N1Z) r8
            java.lang.Object r12 = r15.A02
            X.1kB r12 = (X.AnonymousClass1kB) r12
            java.lang.Object r13 = r15.A01
            com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender r13 = (com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender) r13
            X.0eS.A00(r14)
        L_0x003f:
            java.lang.String r14 = (java.lang.String) r14
            if (r14 == 0) goto L_0x01a8
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r0 = X.C66834MdS.A03(r14)
            if (r0 == 0) goto L_0x011d
            X.NFm r1 = com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport.A00(r0)
            java.lang.String r0 = "image/gif"
            r1.A06(r0)
            X.R5b r2 = r1.A02()
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r2 = (com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport) r2
            com.instagram.direct.armadilloexpress.transportpayload.Gif r0 = com.instagram.direct.armadilloexpress.transportpayload.Gif.DEFAULT_INSTANCE
            X.R4O r3 = r0.A0I()
            X.NFQ r3 = (X.NFQ) r3
            X.R5b r1 = X.C66580MXl.A0L(r3)
            com.instagram.direct.armadilloexpress.transportpayload.Gif r1 = (com.instagram.direct.armadilloexpress.transportpayload.Gif) r1
            r2.getClass()
            r1.mediaTransport_ = r2
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            X.Cw1 r0 = r12.A07()
            boolean r2 = r0.A07
            X.R5b r1 = X.C66580MXl.A0L(r3)
            com.instagram.direct.armadilloexpress.transportpayload.Gif r1 = (com.instagram.direct.armadilloexpress.transportpayload.Gif) r1
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
            r1.isSticker_ = r2
            java.lang.Float r0 = r4.A03
            float r0 = r0.floatValue()
            int r2 = (int) r0
            X.R5b r1 = X.C66580MXl.A0L(r3)
            com.instagram.direct.armadilloexpress.transportpayload.Gif r1 = (com.instagram.direct.armadilloexpress.transportpayload.Gif) r1
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.width_ = r2
            java.lang.Float r0 = r4.A02
            float r0 = r0.floatValue()
            int r2 = (int) r0
            X.R5b r1 = X.C66580MXl.A0L(r3)
            com.instagram.direct.armadilloexpress.transportpayload.Gif r1 = (com.instagram.direct.armadilloexpress.transportpayload.Gif) r1
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.height_ = r2
            com.instagram.common.session.UserSession r0 = r13.A01
            X.797 r1 = X.AnonymousClass796.A01(r0, r12)
            X.797 r0 = X.AnonymousClass797.ARMADILLO_EXPRESS_OPEN_EB
            if (r1 != r0) goto L_0x010c
            X.Cw1 r0 = r12.A07()
            java.lang.String r2 = r0.A05
            if (r2 == 0) goto L_0x00cf
            X.R5b r1 = X.C66580MXl.A0L(r3)
            com.instagram.direct.armadilloexpress.transportpayload.Gif r1 = (com.instagram.direct.armadilloexpress.transportpayload.Gif) r1
            int r0 = r1.bitField0_
            r0 = r0 | 16
            r1.bitField0_ = r0
            r1.stickerId_ = r2
        L_0x00cf:
            java.lang.String r2 = r4.A09
            X.R5b r1 = X.C66580MXl.A0L(r3)
            com.instagram.direct.armadilloexpress.transportpayload.Gif r1 = (com.instagram.direct.armadilloexpress.transportpayload.Gif) r1
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            r1.gifUrl_ = r2
            java.lang.Integer r0 = r4.A05
            if (r0 == 0) goto L_0x00f8
            int r2 = r0.intValue()
            X.R5b r1 = X.C66580MXl.A0L(r3)
            com.instagram.direct.armadilloexpress.transportpayload.Gif r1 = (com.instagram.direct.armadilloexpress.transportpayload.Gif) r1
            int r0 = r1.bitField0_
            r0 = r0 | 64
            r1.bitField0_ = r0
            r1.gifSize_ = r2
        L_0x00f8:
            X.Cw1 r0 = r12.A07()
            boolean r2 = r0.A06
            X.R5b r1 = X.C66580MXl.A0L(r3)
            com.instagram.direct.armadilloexpress.transportpayload.Gif r1 = (com.instagram.direct.armadilloexpress.transportpayload.Gif) r1
            int r0 = r1.bitField0_
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.bitField0_ = r0
            r1.isRandom_ = r2
        L_0x010c:
            com.instagram.direct.armadilloexpress.transportpayload.Media r0 = com.instagram.direct.armadilloexpress.transportpayload.Media.DEFAULT_INSTANCE
            X.R4O r0 = r0.A0I()
            X.NFp r0 = (X.C68408NFp) r0
            r0.A07(r3)
            X.R5b r10 = r0.A02()
            com.instagram.direct.armadilloexpress.transportpayload.Media r10 = (com.instagram.direct.armadilloexpress.transportpayload.Media) r10
        L_0x011d:
            X.OVn r7 = X.C70992OVn.A00
            com.instagram.common.session.UserSession r9 = r13.A01
            r11 = 0
            r13 = r11
            com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r5 = r7.A00(r8, r9, r10, r11, r12, r13)
            return r5
        L_0x0128:
            X.0eS.A00(r14)
            X.Cw1 r0 = r12.A07()
            com.instagram.model.mediasize.GifUrlImpl r4 = r0.A02
            if (r4 == 0) goto L_0x01a8
            r15.A01 = r13
            r15.A02 = r12
            r15.A03 = r8
            r15.A04 = r4
            r15.A00 = r7
            X.3Pl r6 = X.JTQ.A0m(r15)
            X.7Sw r0 = X.C331897Sw.A0A
            android.content.Context r0 = r13.A00
            X.7Sw r2 = X.C331917Sy.A00(r0)
            java.lang.String r1 = r4.A09
            X.Lrg r0 = new X.Lrg
            r0.<init>(r7, r6)
            r2.A05(r0, r1)
            java.lang.Object r14 = r6.A00()
            if (r14 != r5) goto L_0x016d
            return r5
        L_0x015a:
            java.lang.Object r4 = r15.A04
            com.instagram.model.mediasize.GifUrlImpl r4 = (com.instagram.model.mediasize.GifUrlImpl) r4
            java.lang.Object r8 = r15.A03
            X.N1Z r8 = (X.N1Z) r8
            java.lang.Object r12 = r15.A02
            X.1kB r12 = (X.AnonymousClass1kB) r12
            java.lang.Object r13 = r15.A01
            com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender r13 = (com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender) r13
            X.0eS.A00(r14)
        L_0x016d:
            java.lang.String r14 = (java.lang.String) r14
            if (r14 == 0) goto L_0x01a8
            java.lang.Float r0 = r4.A02
            float r0 = r0.floatValue()
            int r2 = (int) r0
            java.lang.Float r0 = r4.A03
            float r0 = r0.floatValue()
            int r1 = (int) r0
            X.Cw1 r0 = r12.A07()
            boolean r0 = r0.A07
            r15.A01 = r13
            r15.A02 = r12
            r15.A03 = r8
            r15.A04 = r4
            r15.A00 = r3
            r16 = r2
            r17 = r1
            r18 = r0
            java.lang.Object r14 = A03(r13, r14, r15, r16, r17, r18)
            if (r14 != r5) goto L_0x003f
            return r5
        L_0x019c:
            X.ME0 r15 = new X.ME0
            r15.<init>(r13, r4, r3)
            goto L_0x001d
        L_0x01a3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01a8:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender.A01(X.N1Z, com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender, X.1kB, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.MDh, X.4D7] */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0075 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender r8, java.lang.String r9, X.AnonymousClass4D7 r10, int r11, int r12, boolean r13) {
        /*
            r4 = 36
            boolean r0 = X.C66129MDh.A01(r4, r10)
            if (r0 == 0) goto L_0x006f
            r0 = r10
            X.MDh r0 = (X.C66129MDh) r0
            int r3 = r0.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x006f
            int r3 = r3 - r2
            r0.A00 = r3
        L_0x0016:
            java.lang.Object r3 = r0.A02
            X.1Hj r1 = X.1Hj.A02
            int r4 = r0.A00
            r2 = 1
            if (r4 == 0) goto L_0x002f
            if (r4 != r2) goto L_0x0077
            java.lang.Object r7 = r0.A01
            X.3Q2 r7 = (X.AnonymousClass3Q2) r7
            X.0eS.A00(r3)
        L_0x0028:
            boolean r0 = r3 instanceof X.C62013KVm
            if (r0 == 0) goto L_0x0075
            java.lang.String r1 = r7.A2N
            return r1
        L_0x002f:
            X.0eS.A00(r3)
            java.lang.String r3 = X.JTQ.A0Z()
            X.3Q2 r7 = new X.3Q2
            r7.<init>(r3)
            X.1iA r3 = X.1iA.A06
            r7.A0V(r3)
            r7.A33 = r9
            r7.A0S = r12
            r7.A0R = r11
            r7.A57 = r13
            com.instagram.pendingmedia.service.upload.armadilloexpress.ArmadilloExpressMediaUploader r3 = com.instagram.pendingmedia.service.upload.armadilloexpress.ArmadilloExpressMediaUploader.A00
            android.content.Context r5 = r8.A00
            com.instagram.common.session.UserSession r6 = r8.A01
            X.37k r8 = X.C2373637i.A00(r5, r6)
            X.1Cn r10 = new X.1Cn
            r10.<init>(r5)
            java.lang.String r11 = "ArmadilloExpressNoteReplySender"
            X.LvH r9 = X.C65542LvH.A00
            X.0sm r12 = X.0Yt.A0E()
            X.LP8 r4 = new X.LP8
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r0.A01 = r7
            r0.A00 = r2
            java.lang.Object r3 = r3.A00(r4, r0)
            if (r3 != r1) goto L_0x0028
            return r1
        L_0x006f:
            X.MDh r0 = new X.MDh
            r0.<init>(r8, r10, r4)
            goto L_0x0016
        L_0x0075:
            r1 = 0
            return r1
        L_0x0077:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender.A03(com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender, java.lang.String, X.4D7, int, int, boolean):java.lang.Object");
    }

    public ArmadilloExpressNoteReplySender(UserSession userSession) {
        this.A01 = userSession;
        AnonymousClass12T r1 = AnonymousClass12T.A00;
        this.A03 = r1;
        this.A02 = JTR.A17(r1, 319);
        this.A00 = C51966G9m.A0P(userSession);
    }
}

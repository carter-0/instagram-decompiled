package com.instagram.direct.send.mutation.armadilloexpresstransport.media;

import X.1NK;
import X.2RR;
import X.AnonymousClass0eM;
import X.AnonymousClass3LX;
import X.AnonymousClass45F;
import X.AnonymousClass4D7;
import X.C227792jv;
import X.C241503Pl;
import X.C352218Cl;
import X.C376649Iu;
import X.C39908AIz;
import X.C51966G9m;
import X.C69851NtF;
import X.C71105Ocj;
import X.C71877OsL;
import X.JTP;
import X.JTQ;
import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.realtimeclient.RealtimeConstants;

public final class DirectConfigureMediaMessageMutationFactory {
    public final Context A00;
    public final UserSession A01;

    private final Object A00(ImageUrl imageUrl, AnonymousClass4D7 r13, boolean z) {
        Bitmap bitmap;
        if (imageUrl == null) {
            return null;
        }
        if (z) {
            UserSession userSession = this.A01;
            String A0o = JTP.A0o(imageUrl);
            C241503Pl A0m = JTQ.A0m(r13);
            AnonymousClass0eM r0 = C71105Ocj.A05;
            C69851NtF.A00(userSession).A03(new C71877OsL(A0m, 2), A0o);
            return A0m.A00();
        }
        1NK A002 = 1NK.A00();
        UserSession userSession2 = this.A01;
        AnonymousClass3LX A0K = A002.A0K(userSession2, imageUrl, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING);
        if (A0K == null || (bitmap = A0K.A01) == null) {
            return null;
        }
        C352218Cl A03 = C39908AIz.A03(bitmap, (C376649Iu) null, userSession2, 2RR.A01(), AnonymousClass45F.A04("direct_temp_photo", ".jpg"), 0, false);
        C376649Iu r1 = A0K.A02;
        if (r1 != null) {
            C227792jv.A02(r1, A03.A03());
        }
        return A03.A06();
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.ME0, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0042 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.AnonymousClass797 r16, com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaMessageMutationFactory r17, X.1Xj r18, com.instagram.model.direct.DirectThreadKey r19, X.AnonymousClass4D7 r20, boolean r21) {
        /*
            r2 = r17
            r9 = r19
            r3 = r18
            r8 = r16
            r5 = 19
            r7 = r20
            boolean r0 = X.ME0.A02(r5, r7)
            if (r0 == 0) goto L_0x0060
            r6 = r7
            X.ME0 r6 = (X.ME0) r6
            int r4 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r1
            if (r0 == 0) goto L_0x0060
            int r4 = r4 - r1
            r6.A00 = r4
        L_0x0020:
            java.lang.Object r5 = r6.A05
            X.1Hj r1 = X.1Hj.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L_0x0044
            if (r0 != r4) goto L_0x0095
            java.lang.Object r8 = r6.A04
            X.797 r8 = (X.AnonymousClass797) r8
            java.lang.Object r3 = r6.A03
            X.1Xj r3 = (X.1Xj) r3
            java.lang.Object r9 = r6.A02
            com.instagram.model.direct.DirectThreadKey r9 = (com.instagram.model.direct.DirectThreadKey) r9
            java.lang.Object r2 = r6.A01
            com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaMessageMutationFactory r2 = (com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaMessageMutationFactory) r2
            X.0eS.A00(r5)
        L_0x003e:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L_0x0066
            r1 = 0
            return r1
        L_0x0044:
            X.0eS.A00(r5)
            android.content.Context r0 = r2.A00
            com.instagram.model.mediasize.ExtendedImageUrl r0 = r3.A1n(r0)
            r6.A01 = r2
            r6.A02 = r9
            r6.A03 = r3
            r6.A04 = r8
            r6.A00 = r4
            r4 = r21
            java.lang.Object r5 = r2.A00(r0, r6, r4)
            if (r5 != r1) goto L_0x003e
            return r1
        L_0x0060:
            X.ME0 r6 = new X.ME0
            r6.<init>(r2, r7, r5)
            goto L_0x0020
        L_0x0066:
            int r15 = r3.A0y()
            int r16 = r3.A0x()
            r21 = 0
            long r17 = java.lang.System.currentTimeMillis()
            long r19 = java.lang.System.currentTimeMillis()
            java.io.File r14 = X.AnonymousClass7TE.A0t(r5)
            X.8Cl r13 = new X.8Cl
            r13.<init>(r14, r15, r16, r17, r19, r21)
            android.content.Context r6 = r2.A00
            com.instagram.common.session.UserSession r7 = r2.A01
            com.instagram.pendingmedia.model.constants.ShareType r11 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_SHARE
            X.1ua r12 = X.JTO.A0n(r6, r7)
            r10 = 0
            r14 = r10
            r15 = r10
            r16 = r10
            X.5yB r1 = X.LTU.A02(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r1
        L_0x0095:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaMessageMutationFactory.A01(X.797, com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaMessageMutationFactory, X.1Xj, com.instagram.model.direct.DirectThreadKey, X.4D7, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.JUI, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00aa A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(X.AnonymousClass797 r15, com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaMessageMutationFactory r16, X.1Xj r17, com.instagram.model.direct.DirectThreadKey r18, X.AnonymousClass4D7 r19, boolean r20) {
        /*
            r4 = r17
            r8 = r20
            r3 = r16
            r13 = r18
            r12 = r15
            r7 = 2
            r5 = r19
            boolean r0 = X.JUI.A01(r7, r5)
            if (r0 == 0) goto L_0x00fd
            r6 = r5
            X.JUI r6 = (X.JUI) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00fd
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0020:
            java.lang.Object r0 = r6.A05
            X.1Hj r5 = X.1Hj.A02
            int r1 = r6.A00
            r17 = 0
            r11 = 1
            if (r1 == 0) goto L_0x0079
            if (r1 == r11) goto L_0x00cc
            if (r1 != r7) goto L_0x0104
            java.lang.Object r2 = r6.A04
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r12 = r6.A03
            X.797 r12 = (X.AnonymousClass797) r12
            java.lang.Object r13 = r6.A02
            com.instagram.model.direct.DirectThreadKey r13 = (com.instagram.model.direct.DirectThreadKey) r13
            java.lang.Object r3 = r6.A01
            com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaMessageMutationFactory r3 = (com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaMessageMutationFactory) r3
            X.0eS.A00(r0)
        L_0x0042:
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0109
            r1 = 0
            X.JYp r1 = X.C59796JYp.A01(r2, r1)
            X.0qQ.A07(r1)
            java.lang.String r5 = r1.A07
            X.0qQ.A07(r5)
            long r6 = r1.A03
            com.instagram.common.session.UserSession r11 = r3.A01
            r4 = r11
            r8 = r6
            com.instagram.pendingmedia.model.ClipInfo r14 = X.Q0X.A03(r4, r5, r6, r8)
            int r1 = r14.A09
            float r2 = (float) r1
            int r1 = r14.A06
            float r1 = (float) r1
            float r2 = r2 / r1
            r14.A00 = r2
            android.content.Context r10 = r3.A00
            com.instagram.pendingmedia.model.constants.ShareType r15 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_SHARE
            X.1ua r16 = X.JTO.A0n(r10, r11)
            r19 = r17
            r20 = r17
            r18 = r0
            X.5yB r5 = X.LTU.A01(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r5
        L_0x0079:
            X.0eS.A00(r0)
            java.lang.String r10 = r4.A2U()
            r6.A01 = r3
            r6.A02 = r13
            r6.A03 = r4
            r6.A04 = r15
            r6.A06 = r8
            r6.A00 = r11
            if (r10 == 0) goto L_0x00ca
            if (r20 == 0) goto L_0x00ab
            com.instagram.common.session.UserSession r1 = r3.A01
            X.3Pl r2 = X.JTQ.A0m(r6)
            X.0eM r0 = X.C71105Ocj.A05
            X.Ocj r1 = X.C69851NtF.A00(r1)
            X.OsL r0 = new X.OsL
            r0.<init>(r2, r7)
            r1.A03(r0, r10)
            java.lang.Object r0 = r2.A00()
        L_0x00a8:
            if (r0 != r5) goto L_0x00e1
            return r5
        L_0x00ab:
            android.content.Context r9 = r3.A00
            long r0 = java.lang.System.nanoTime()
            java.lang.String r2 = ".mp4"
            java.lang.String r0 = X.AnonymousClass457.A09(r9, r2, r0, r11)
            java.io.File r9 = X.AnonymousClass7TE.A0t(r0)
            com.instagram.common.session.UserSession r2 = r3.A01
            r0 = -1
            java.io.File r0 = X.C59730JVo.A07(r2, r9, r10, r0)
            if (r0 == 0) goto L_0x00ca
            java.lang.String r0 = r0.getPath()
            goto L_0x00a8
        L_0x00ca:
            r0 = 0
            goto L_0x00a8
        L_0x00cc:
            boolean r8 = r6.A06
            java.lang.Object r12 = r6.A04
            X.797 r12 = (X.AnonymousClass797) r12
            java.lang.Object r4 = r6.A03
            X.1Xj r4 = (X.1Xj) r4
            java.lang.Object r13 = r6.A02
            com.instagram.model.direct.DirectThreadKey r13 = (com.instagram.model.direct.DirectThreadKey) r13
            java.lang.Object r3 = r6.A01
            com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaMessageMutationFactory r3 = (com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaMessageMutationFactory) r3
            X.0eS.A00(r0)
        L_0x00e1:
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0109
            android.content.Context r0 = r3.A00
            com.instagram.model.mediasize.ExtendedImageUrl r0 = r4.A1n(r0)
            r6.A01 = r3
            r6.A02 = r13
            r6.A03 = r12
            r6.A04 = r2
            r6.A00 = r7
            java.lang.Object r0 = r3.A00(r0, r6, r8)
            if (r0 != r5) goto L_0x0042
            return r5
        L_0x00fd:
            X.JUI r6 = new X.JUI
            r6.<init>(r3, r5, r7)
            goto L_0x0020
        L_0x0104:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0109:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaMessageMutationFactory.A02(X.797, com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaMessageMutationFactory, X.1Xj, com.instagram.model.direct.DirectThreadKey, X.4D7, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r12v1, types: [X.MDh, X.4D7] */
    /* JADX WARNING: type inference failed for: r12v5 */
    /* JADX WARNING: type inference failed for: r12v6 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.AnonymousClass797 r21, X.C254703su r22, X.C65701gB r23, X.AnonymousClass4D7 r24) {
        /*
            r20 = this;
            r3 = r23
            r4 = 38
            r5 = r24
            boolean r0 = X.C66129MDh.A01(r4, r5)
            r9 = r20
            if (r0 == 0) goto L_0x0031
            r12 = r5
            X.MDh r12 = (X.C66129MDh) r12
            int r2 = r12.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0031
            int r2 = r2 - r1
            r12.A00 = r2
        L_0x001c:
            java.lang.Object r11 = r12.A02
            X.1Hj r5 = X.1Hj.A02
            int r0 = r12.A00
            r6 = 0
            r4 = 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0037
            if (r0 == r1) goto L_0x006e
            if (r0 == r4) goto L_0x006e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0031:
            X.MDh r12 = new X.MDh
            r12.<init>(r9, r5, r4)
            goto L_0x001c
        L_0x0037:
            X.0eS.A00(r11)
            r0 = r22
            X.1Xj r10 = r0.A0s
            if (r10 == 0) goto L_0x0098
            boolean r13 = r0.A1S()
            X.1iA r0 = r10.BR7()
            int r0 = r0.ordinal()
            r8 = r21
            if (r0 == r2) goto L_0x0061
            if (r0 != r1) goto L_0x0097
            com.instagram.model.direct.DirectThreadKey r11 = r3.C6K()
            r12.A01 = r3
            r12.A00 = r4
            java.lang.Object r11 = A02(r8, r9, r10, r11, r12, r13)
        L_0x005e:
            if (r11 != r5) goto L_0x0075
            return r5
        L_0x0061:
            com.instagram.model.direct.DirectThreadKey r11 = r3.C6K()
            r12.A01 = r3
            r12.A00 = r1
            java.lang.Object r11 = A01(r8, r9, r10, r11, r12, r13)
            goto L_0x005e
        L_0x006e:
            java.lang.Object r3 = r12.A01
            X.1gB r3 = (X.C65701gB) r3
            X.0eS.A00(r11)
        L_0x0075:
            X.5yB r11 = (X.C300925yB) r11
            if (r11 == 0) goto L_0x0097
            X.MaY r8 = r3.A02
            com.instagram.model.direct.DirectThreadKey r12 = r3.C6K()
            java.lang.Long r15 = r3.A04
            long r0 = r3.A00
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r2)
            X.1fi r5 = new X.1fi
            r7 = r6
            r9 = r6
            r10 = r6
            r13 = r6
            r16 = r6
            r19 = r2
            r17 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19)
            return r5
        L_0x0097:
            return r6
        L_0x0098:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaMessageMutationFactory.A03(X.797, X.3su, X.1gB, X.4D7):java.lang.Object");
    }

    public DirectConfigureMediaMessageMutationFactory(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = C51966G9m.A0P(userSession);
    }
}

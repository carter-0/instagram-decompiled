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

public final class DirectConfigureMediaCollectionMessageMutationFactory {
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

    /* JADX WARNING: type inference failed for: r2v1, types: [X.ME2, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x018f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.C254703su r18, com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaCollectionMessageMutationFactory r19, X.AnonymousClass4D7 r20, boolean r21) {
        /*
            r0 = r19
            r6 = r21
            r10 = 3
            r5 = r20
            boolean r1 = X.ME2.A02(r10, r5)
            if (r1 == 0) goto L_0x0187
            r2 = r5
            X.ME2 r2 = (X.ME2) r2
            int r4 = r2.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r3
            if (r1 == 0) goto L_0x0187
            int r4 = r4 - r3
            r2.A00 = r4
        L_0x001b:
            java.lang.Object r5 = r2.A06
            X.1Hj r9 = X.1Hj.A02
            int r1 = r2.A00
            r12 = 1
            r11 = 2
            if (r1 == 0) goto L_0x016a
            if (r1 == r12) goto L_0x0151
            if (r1 == r11) goto L_0x0136
            if (r1 != r10) goto L_0x0190
            boolean r6 = r2.A08
            java.lang.Object r13 = r2.A05
            java.lang.Object r4 = r2.A04
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r3 = r2.A03
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Object r1 = r2.A02
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r2.A01
            com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaCollectionMessageMutationFactory r0 = (com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaCollectionMessageMutationFactory) r0
            X.0eS.A00(r5)
        L_0x0042:
            java.lang.String r5 = (java.lang.String) r5
            X.3tC r13 = (X.C254873tC) r13
            com.instagram.model.mediasize.ExtendedImageUrl r7 = r13.A0X
            if (r7 == 0) goto L_0x0070
            int r15 = r7.getWidth()
            int r16 = r7.getHeight()
            long r17 = java.lang.System.currentTimeMillis()
            long r19 = java.lang.System.currentTimeMillis()
            r7 = 0
            if (r5 == 0) goto L_0x0133
            java.io.File r14 = X.AnonymousClass7TE.A0t(r5)
        L_0x0061:
            r21 = 0
            X.8Cl r13 = new X.8Cl
            r13.<init>(r14, r15, r16, r17, r19, r21)
            X.KR0 r8 = new X.KR0
            r8.<init>(r7, r13)
        L_0x006d:
            r1.add(r8)
        L_0x0070:
            X.0gF r5 = X.C60340gF.A00
            r3.add(r5)
        L_0x0075:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x018f
            java.lang.Object r13 = r4.next()
            boolean r5 = r13 instanceof X.C254873tC
            if (r5 == 0) goto L_0x0070
            r7 = r13
            X.3tC r7 = (X.C254873tC) r7
            com.instagram.model.mediasize.GifUrlImpl r5 = r7.A0Z
            if (r5 == 0) goto L_0x0121
            com.instagram.model.mediasize.GifUrlImpl r7 = r7.A0Z
            java.lang.String r5 = "null cannot be cast to non-null type com.instagram.common.typedurl.GifUrl"
            X.0qQ.A0C(r7, r5)
            java.lang.String r5 = r7.A09
            X.ME2.A00(r0, r1, r3, r4, r2)
            r2.A05 = r13
            r2.A08 = r6
            r2.A00 = r12
            if (r5 != 0) goto L_0x00e3
            r5 = 0
        L_0x009f:
            java.lang.String r5 = (java.lang.String) r5
            X.3tC r13 = (X.C254873tC) r13
            com.instagram.model.mediasize.ExtendedImageUrl r7 = r13.A0X
            X.ME2.A00(r0, r1, r3, r4, r2)
            r2.A05 = r5
            r2.A08 = r6
            r2.A00 = r11
            java.lang.Object r7 = r0.A00(r7, r2, r6)
            if (r7 == r9) goto L_0x018e
            r8 = r5
            r5 = r7
        L_0x00b6:
            java.lang.String r5 = (java.lang.String) r5
            if (r8 == 0) goto L_0x0070
            if (r5 == 0) goto L_0x0070
            r7 = 0
            X.JYp r7 = X.C59796JYp.A01(r8, r7)
            X.0qQ.A07(r7)
            java.lang.String r14 = r7.A07
            X.0qQ.A07(r14)
            long r15 = r7.A03
            com.instagram.common.session.UserSession r13 = r0.A01
            r17 = r15
            com.instagram.pendingmedia.model.ClipInfo r13 = X.Q0X.A03(r13, r14, r15, r17)
            int r7 = r13.A09
            float r8 = (float) r7
            int r7 = r13.A06
            float r7 = (float) r7
            float r8 = r8 / r7
            r13.A00 = r8
            r7 = 0
            X.KR1 r8 = new X.KR1
            r8.<init>(r13, r7, r5)
            goto L_0x006d
        L_0x00e3:
            if (r6 == 0) goto L_0x0100
            com.instagram.common.session.UserSession r8 = r0.A01
            X.3Pl r14 = X.JTQ.A0m(r2)
            X.0eM r7 = X.C71105Ocj.A05
            X.Ocj r8 = X.C69851NtF.A00(r8)
            X.OsL r7 = new X.OsL
            r7.<init>(r14, r11)
            r8.A03(r7, r5)
            java.lang.Object r5 = r14.A00()
        L_0x00fd:
            if (r5 != r9) goto L_0x009f
            return r9
        L_0x0100:
            android.content.Context r15 = r0.A00
            long r7 = java.lang.System.nanoTime()
            java.lang.String r14 = ".mp4"
            java.lang.String r7 = X.AnonymousClass457.A09(r15, r14, r7, r12)
            java.io.File r15 = X.AnonymousClass7TE.A0t(r7)
            com.instagram.common.session.UserSession r14 = r0.A01
            r7 = -1
            java.io.File r5 = X.C59730JVo.A07(r14, r15, r5, r7)
            if (r5 == 0) goto L_0x011f
            java.lang.String r5 = r5.getPath()
            goto L_0x00fd
        L_0x011f:
            r5 = 0
            goto L_0x00fd
        L_0x0121:
            com.instagram.model.mediasize.ExtendedImageUrl r5 = r7.A0X
            X.ME2.A00(r0, r1, r3, r4, r2)
            r2.A05 = r13
            r2.A08 = r6
            r2.A00 = r10
            java.lang.Object r5 = r0.A00(r5, r2, r6)
            if (r5 != r9) goto L_0x0042
            return r9
        L_0x0133:
            r14 = r7
            goto L_0x0061
        L_0x0136:
            boolean r6 = r2.A08
            java.lang.Object r8 = r2.A05
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r4 = r2.A04
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r3 = r2.A03
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Object r1 = r2.A02
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r2.A01
            com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaCollectionMessageMutationFactory r0 = (com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaCollectionMessageMutationFactory) r0
            X.0eS.A00(r5)
            goto L_0x00b6
        L_0x0151:
            boolean r6 = r2.A08
            java.lang.Object r13 = r2.A05
            java.lang.Object r4 = r2.A04
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r3 = r2.A03
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Object r1 = r2.A02
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r2.A01
            com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaCollectionMessageMutationFactory r0 = (com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaCollectionMessageMutationFactory) r0
            X.0eS.A00(r5)
            goto L_0x009f
        L_0x016a:
            java.util.ArrayList r1 = X.JTQ.A0e(r5)
            r3 = r18
            java.lang.Object r4 = r3.A1T
            r3 = 12
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            X.0qQ.A0C(r4, r3)
            java.util.List r4 = (java.util.List) r4
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r4.iterator()
            goto L_0x0075
        L_0x0187:
            X.ME2 r2 = new X.ME2
            r2.<init>(r0, r5, r10)
            goto L_0x001b
        L_0x018e:
            return r9
        L_0x018f:
            return r1
        L_0x0190:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaCollectionMessageMutationFactory.A01(X.3su, com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaCollectionMessageMutationFactory, X.4D7, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDs, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003e A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.C254703su r24, X.C65701gB r25, X.AnonymousClass4D7 r26, boolean r27) {
        /*
            r23 = this;
            r2 = r25
            r11 = r27
            r4 = 8
            r7 = r26
            boolean r0 = X.C66140MDs.A01(r4, r7)
            r6 = r23
            if (r0 == 0) goto L_0x0065
            r5 = r7
            X.MDs r5 = (X.C66140MDs) r5
            int r3 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0065
            int r3 = r3 - r1
            r5.A00 = r3
        L_0x001e:
            java.lang.Object r10 = r5.A03
            X.1Hj r8 = X.1Hj.A02
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L_0x0040
            if (r0 != r4) goto L_0x00a1
            boolean r11 = r5.A05
            java.lang.Object r2 = r5.A02
            X.1gB r2 = (X.C65701gB) r2
            java.lang.Object r3 = r5.A01
            com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaCollectionMessageMutationFactory r3 = (com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaCollectionMessageMutationFactory) r3
            X.0eS.A00(r10)
        L_0x0036:
            java.util.List r10 = (java.util.List) r10
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x006b
            r8 = 0
        L_0x003f:
            return r8
        L_0x0040:
            X.0eS.A00(r10)
            r7 = r24
            boolean r3 = r7.A1a()
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = "Message type must be a collection of media."
            X.17k.A0J(r3, r0, r1)
            boolean r0 = r7.A1S()
            r5.A01 = r6
            r5.A02 = r2
            r5.A05 = r11
            r5.A00 = r4
            java.lang.Object r10 = A01(r7, r6, r5, r0)
            if (r10 == r8) goto L_0x003f
            r3 = r6
            goto L_0x0036
        L_0x0065:
            X.MDs r5 = new X.MDs
            r5.<init>(r6, r7, r4)
            goto L_0x001e
        L_0x006b:
            com.instagram.common.session.UserSession r5 = r3.A01
            com.instagram.model.direct.DirectThreadKey r6 = r2.C6K()
            com.instagram.pendingmedia.model.constants.ShareType r7 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_SHARE
            X.1ud r1 = X.1ua.A0G
            android.content.Context r0 = r3.A00
            X.1ua r8 = r1.A01(r0, r5)
            r9 = 0
            X.5yB r14 = X.LTU.A04(r5, r6, r7, r8, r9, r10, r11)
            X.MaY r11 = r2.A02
            com.instagram.model.direct.DirectThreadKey r15 = r2.C6K()
            java.lang.Long r3 = r2.A04
            long r0 = r2.A00
            r22 = 0
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r22)
            X.1fi r8 = new X.1fi
            r10 = r9
            r12 = r9
            r13 = r9
            r16 = r9
            r19 = r9
            r20 = r0
            r18 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r22)
            return r8
        L_0x00a1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaCollectionMessageMutationFactory.A02(X.3su, X.1gB, X.4D7, boolean):java.lang.Object");
    }

    public DirectConfigureMediaCollectionMessageMutationFactory(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = C51966G9m.A0P(userSession);
    }
}

package com.instagram.direct.send.mutation.armadilloexpresstransport.media;

import X.C51966G9m;
import android.content.Context;
import com.instagram.common.session.UserSession;

public final class DirectConfigureAnimatedMediaMessageMutationFactory {
    public final Context A00;
    public final UserSession A01;

    /* JADX WARNING: type inference failed for: r5v1, types: [X.ME0, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass797 r20, X.C254703su r21, X.C65701gB r22, X.AnonymousClass4D7 r23) {
        /*
            r19 = this;
            r0 = r22
            r6 = r20
            r4 = 18
            r8 = r23
            boolean r1 = X.ME0.A02(r4, r8)
            r7 = r19
            if (r1 == 0) goto L_0x0101
            r5 = r8
            X.ME0 r5 = (X.ME0) r5
            int r3 = r5.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x0101
            int r3 = r3 - r2
            r5.A00 = r3
        L_0x001e:
            java.lang.Object r8 = r5.A05
            X.1Hj r9 = X.1Hj.A02
            int r1 = r5.A00
            r4 = 1
            if (r1 == 0) goto L_0x00a8
            if (r1 != r4) goto L_0x0108
            java.lang.Object r1 = r5.A04
            com.instagram.model.direct.gifs.DirectAnimatedMedia r1 = (com.instagram.model.direct.gifs.DirectAnimatedMedia) r1
            java.lang.Object r6 = r5.A03
            X.797 r6 = (X.AnonymousClass797) r6
            java.lang.Object r0 = r5.A02
            X.1gB r0 = (X.C65701gB) r0
            java.lang.Object r3 = r5.A01
            com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureAnimatedMediaMessageMutationFactory r3 = (com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureAnimatedMediaMessageMutationFactory) r3
            X.0eS.A00(r8)
        L_0x003c:
            java.lang.String r8 = (java.lang.String) r8
            r9 = 0
            if (r8 == 0) goto L_0x008c
            boolean r2 = r6.A00()
            android.content.Context r5 = r3.A00
            com.instagram.common.session.UserSession r6 = r3.A01
            if (r2 == 0) goto L_0x008d
            com.instagram.model.mediasize.GifUrlImpl r3 = r1.A02
            java.lang.Float r2 = r3.A03
            float r2 = r2.floatValue()
            int r12 = (int) r2
            java.lang.Float r2 = r3.A02
            float r2 = r2.floatValue()
            int r13 = (int) r2
            boolean r2 = r1.A06
            r9 = r5
            r10 = r6
            r11 = r8
            r14 = r2
            X.3Q2 r2 = X.LTU.A06(r9, r10, r11, r12, r13, r14)
        L_0x0065:
            X.MaY r11 = r0.A02
            com.instagram.model.direct.DirectThreadKey r13 = r0.C6K()
            X.5yB r12 = X.C63326Kv9.A00(r2)
            java.lang.Long r14 = r0.A04
            long r2 = r0.A00
            com.instagram.model.mediasize.GifUrlImpl r4 = r1.A02
            java.lang.Float r1 = r4.A03
            float r15 = r1.floatValue()
            java.lang.Float r1 = r4.A02
            float r16 = r1.floatValue()
            com.instagram.direct.model.DirectForwardingParams r10 = r0.A03()
            X.1fV r9 = new X.1fV
            r17 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x008c:
            return r9
        L_0x008d:
            com.instagram.model.direct.DirectThreadKey r7 = r0.C6K()
            com.instagram.model.mediasize.GifUrlImpl r3 = r1.A02
            java.lang.Float r2 = r3.A03
            float r2 = r2.floatValue()
            int r9 = (int) r2
            java.lang.Float r2 = r3.A02
            float r2 = r2.floatValue()
            int r10 = (int) r2
            boolean r11 = r1.A06
            X.3Q2 r2 = X.LTU.A05(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0065
        L_0x00a8:
            X.0eS.A00(r8)
            r3 = r21
            java.lang.Object r1 = r3.A1T
            r2 = 1002(0x3ea, float:1.404E-42)
            java.lang.String r2 = X.C66579MXk.A00(r2)
            X.0qQ.A0C(r1, r2)
            com.instagram.model.direct.gifs.DirectAnimatedMedia r1 = (com.instagram.model.direct.gifs.DirectAnimatedMedia) r1
            boolean r3 = r3.A1S()
            com.instagram.model.mediasize.GifUrlImpl r2 = r1.A02
            java.lang.String r8 = r2.A09
            X.ME0.A00(r7, r0, r6, r1, r5)
            r5.A00 = r4
            if (r8 != 0) goto L_0x00cd
            r8 = 0
        L_0x00ca:
            r3 = r7
            goto L_0x003c
        L_0x00cd:
            if (r3 == 0) goto L_0x00eb
            com.instagram.common.session.UserSession r3 = r7.A01
            X.3Pl r5 = X.JTQ.A0m(r5)
            X.0eM r2 = X.C71105Ocj.A05
            X.Ocj r4 = X.C69851NtF.A00(r3)
            r3 = 2
            X.OsL r2 = new X.OsL
            r2.<init>(r5, r3)
            r4.A03(r2, r8)
        L_0x00e4:
            java.lang.Object r8 = r5.A00()
            if (r8 != r9) goto L_0x00ca
            return r9
        L_0x00eb:
            X.3Pl r5 = X.JTQ.A0m(r5)
            X.7Sw r2 = X.C331897Sw.A0A
            android.content.Context r2 = r7.A00
            X.7Sw r4 = X.C331917Sy.A00(r2)
            r3 = 2
            X.Lrg r2 = new X.Lrg
            r2.<init>(r3, r5)
            r4.A05(r2, r8)
            goto L_0x00e4
        L_0x0101:
            X.ME0 r5 = new X.ME0
            r5.<init>(r7, r8, r4)
            goto L_0x001e
        L_0x0108:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureAnimatedMediaMessageMutationFactory.A00(X.797, X.3su, X.1gB, X.4D7):java.lang.Object");
    }

    public DirectConfigureAnimatedMediaMessageMutationFactory(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = C51966G9m.A0P(userSession);
    }
}

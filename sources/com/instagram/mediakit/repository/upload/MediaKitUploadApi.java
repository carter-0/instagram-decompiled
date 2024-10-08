package com.instagram.mediakit.repository.upload;

import X.0qQ;
import X.AnonymousClass12T;
import X.C262224Cq;
import X.JTR;
import com.instagram.common.session.UserSession;

public final class MediaKitUploadApi {
    public final UserSession A00;
    public final C262224Cq A01 = JTR.A17(AnonymousClass12T.A00, 2010364072);

    public MediaKitUploadApi(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDz, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.N4Q r14, com.instagram.mediakit.repository.upload.MediaKitUploadApi r15, X.1ua r16, X.AnonymousClass4D7 r17) {
        /*
            r3 = 3
            r4 = r17
            boolean r0 = X.C66147MDz.A02(r3, r4)
            if (r0 == 0) goto L_0x00bf
            r6 = r4
            X.MDz r6 = (X.C66147MDz) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00bf
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0017:
            java.lang.Object r1 = r6.A04
            X.1Hj r4 = X.1Hj.A02
            int r0 = r6.A00
            r3 = 1
            if (r0 == 0) goto L_0x0026
            if (r0 != r3) goto L_0x00c6
            X.0eS.A00(r1)
        L_0x0025:
            return r1
        L_0x0026:
            X.0eS.A00(r1)
            java.lang.Object r5 = r14.A01
            com.instagram.common.gallery.Medium r5 = (com.instagram.common.gallery.Medium) r5
            java.lang.String r11 = r5.A0X
            java.lang.String r1 = r14.A02
            boolean r0 = r5.CeS()
            r7 = 0
            X.0qQ.A0B(r1, r7)
            X.3Q2 r2 = new X.3Q2
            r2.<init>(r1)
            if (r0 == 0) goto L_0x00bc
            X.1iA r0 = X.1iA.A0a
        L_0x0042:
            r2.A1G = r0
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.MEDIA_KIT
            r2.A0e(r0)
            boolean r0 = r5.CeS()
            if (r0 == 0) goto L_0x00b1
            int r0 = r5.A03
            long r12 = (long) r0
            com.instagram.common.session.UserSession r10 = r15.A00
            X.0Tu r8 = X.0Tu.A05
            r0 = 36597764222749659(0x82057900120bdb, double:3.207911689610326E-306)
            int r0 = X.DbS.A04(r8, r10, r0)
            long r14 = (long) r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 * r0
            com.instagram.pendingmedia.model.ClipInfo r10 = X.Q0X.A03(r10, r11, r12, r14)
        L_0x0067:
            int r9 = r10.A09
            float r8 = (float) r9
            int r1 = r10.A06
            float r0 = (float) r1
            float r8 = r8 / r0
            r10.A00 = r8
            r2.A33 = r11
            r2.A3L = r11
            r2.A02 = r8
            r2.A0H = r9
            r2.A0G = r1
            r2.A0K = r7
            r2.A1N = r10
            boolean r0 = r5.CeS()
            if (r0 == 0) goto L_0x0097
            java.lang.String r0 = r5.A0a
            r2.A33 = r0
            java.util.List r0 = X.AnonymousClass7TE.A1I(r10)
            r2.A4G = r0
            java.util.HashMap r0 = X.Q0Y.A02(r11)
            r2.A44 = r0
            X.JTS.A1R(r2, r11)
        L_0x0097:
            r7 = r16
            X.C66147MDz.A00(r7, r2, r5, r6, r3)
            X.3Pl r1 = X.JTQ.A0m(r6)
            boolean r0 = r5.CeS()
            X.JTQ.A1J(r2, r7, r0)
            r7.A0I(r2, r3, r3)
            java.lang.Object r1 = r1.A00()
            if (r1 != r4) goto L_0x0025
            return r4
        L_0x00b1:
            com.instagram.pendingmedia.model.ClipInfo r10 = X.JTT.A0d(r5)
            float r0 = r5.A00()
            r10.A00 = r0
            goto L_0x0067
        L_0x00bc:
            X.1iA r0 = X.1iA.A0Q
            goto L_0x0042
        L_0x00bf:
            X.MDz r6 = new X.MDz
            r6.<init>(r15, r4, r3)
            goto L_0x0017
        L_0x00c6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.mediakit.repository.upload.MediaKitUploadApi.A00(X.N4Q, com.instagram.mediakit.repository.upload.MediaKitUploadApi, X.1ua, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDz, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.1ua r7, java.lang.String r8, X.AnonymousClass4D7 r9) {
        /*
            r6 = this;
            r4 = 2
            boolean r0 = X.C66147MDz.A02(r4, r9)
            if (r0 == 0) goto L_0x0058
            r3 = r9
            X.MDz r3 = (X.C66147MDz) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0058
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r3.A04
            X.1Hj r5 = X.1Hj.A02
            int r0 = r3.A00
            r4 = 1
            if (r0 == 0) goto L_0x0024
            if (r0 != r4) goto L_0x005e
            X.0eS.A00(r1)
        L_0x0023:
            return r1
        L_0x0024:
            X.0eS.A00(r1)
            X.C66147MDz.A00(r6, r8, r7, r3, r4)
            X.3Pl r3 = X.JTQ.A0m(r3)
            com.instagram.common.session.UserSession r0 = r6.A00
            X.3Q2 r2 = X.JTQ.A0M(r0, r8)
            if (r2 != 0) goto L_0x0041
            r0 = 0
            r3.resumeWith(r0)
        L_0x003a:
            java.lang.Object r1 = r3.A00()
            if (r1 != r5) goto L_0x0023
            return r5
        L_0x0041:
            java.lang.String r0 = r2.A35
            r1 = 0
            r7.A07(r1, r0, r4)
            X.LvN r0 = new X.LvN
            r0.<init>(r2, r7, r3)
            r7.A0J(r0)
            X.1vC r0 = new X.1vC
            r0.<init>()
            r7.A0G(r2, r0, r1)
            goto L_0x003a
        L_0x0058:
            X.MDz r3 = new X.MDz
            r3.<init>(r6, r9, r4)
            goto L_0x0015
        L_0x005e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.mediakit.repository.upload.MediaKitUploadApi.A01(X.1ua, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.4D7, X.MDp] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.1ua r13, java.util.List r14, X.AnonymousClass4D7 r15) {
        /*
            r12 = this;
            r3 = 48
            boolean r0 = X.C66137MDp.A02(r3, r15)
            r9 = r12
            if (r0 == 0) goto L_0x0069
            r4 = r15
            X.MDp r4 = (X.C66137MDp) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0069
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0017:
            java.lang.Object r2 = r4.A02
            X.1Hj r5 = X.1Hj.A02
            int r0 = r4.A00
            r3 = 1
            if (r0 == 0) goto L_0x0040
            if (r0 != r3) goto L_0x0071
            java.lang.Object r1 = r4.A01
            java.util.Iterator r1 = (java.util.Iterator) r1
            X.0eS.A00(r2)
        L_0x0029:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x006e
            java.lang.Object r0 = r1.next()
            X.2Q9 r0 = (X.AnonymousClass2Q9) r0
            r4.A01 = r1
            r4.A00 = r3
            java.lang.Object r0 = X.JTO.A10(r0, r4)
            if (r0 != r5) goto L_0x0029
            return r5
        L_0x0040:
            X.0eS.A00(r2)
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r14)
            java.util.Iterator r1 = r14.iterator()
        L_0x004b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0064
            java.lang.Object r8 = r1.next()
            X.4Cq r0 = r12.A01
            r10 = 0
            r11 = 19
            X.MGh r6 = new X.MGh
            r7 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            X.JTQ.A1M(r2, r6, r0)
            goto L_0x004b
        L_0x0064:
            java.util.Iterator r1 = r2.iterator()
            goto L_0x0029
        L_0x0069:
            X.MDp r4 = X.C66137MDp.A00(r12, r15, r3)
            goto L_0x0017
        L_0x006e:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x0071:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.mediakit.repository.upload.MediaKitUploadApi.A02(X.1ua, java.util.List, X.4D7):java.lang.Object");
    }
}

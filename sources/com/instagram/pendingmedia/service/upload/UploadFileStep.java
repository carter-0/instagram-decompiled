package com.instagram.pendingmedia.service.upload;

import X.AnonymousClass4D7;
import X.LP8;
import X.MU6;

public final class UploadFileStep implements MU6 {
    /* JADX WARNING: type inference failed for: r15v2, types: [X.MDz, X.4D7] */
    /* JADX WARNING: type inference failed for: r15v5 */
    /* JADX WARNING: type inference failed for: r15v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.LP8 r14, com.instagram.pendingmedia.service.upload.UploadFileStep r15, X.AnonymousClass4D7 r16) {
        /*
            r1 = r14
            r4 = 12
            r5 = r16
            boolean r0 = X.C66147MDz.A02(r4, r5)
            r6 = r15
            if (r0 == 0) goto L_0x0096
            r15 = r5
            X.MDz r15 = (X.C66147MDz) r15
            int r3 = r15.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x0096
            int r3 = r3 - r2
            r15.A00 = r3
        L_0x001a:
            java.lang.Object r7 = r15.A04
            X.1Hj r5 = X.1Hj.A02
            int r0 = r15.A00
            r4 = 1
            java.lang.String r3 = ""
            if (r0 == 0) goto L_0x005d
            if (r0 != r4) goto L_0x00f7
            java.lang.Object r2 = r15.A03
            X.3Q2 r2 = (X.AnonymousClass3Q2) r2
            java.lang.Object r1 = r15.A02
            X.LP8 r1 = (X.LP8) r1
            X.0eS.A00(r7)
        L_0x0032:
            X.KnM r7 = (X.C62846KnM) r7
            boolean r0 = r7 instanceof X.C62021KVv
            if (r0 == 0) goto L_0x009d
            com.instagram.common.session.UserSession r4 = r1.A0C
            java.lang.String r0 = r2.A3Q
            if (r0 == 0) goto L_0x003f
            r3 = r0
        L_0x003f:
            X.KkW r0 = X.C62670KkW.FILE_UPLOADED_IN_SUCCESS
            X.O01.A00(r0, r4, r3)
            X.3Q2 r2 = r1.A0D
            X.KVv r7 = (X.C62021KVv) r7
            X.SJe r0 = r7.A00
            java.lang.String r0 = r0.A05
            java.lang.Long r0 = X.JTQ.A0T(r0)
            r2.A2I = r0
            X.3QD r0 = X.AnonymousClass3QD.UPLOADED
            r2.A0b(r0)
            r0 = 0
            r1.A04 = r0
            X.KVm r5 = X.C62013KVm.A00
            return r5
        L_0x005d:
            X.0eS.A00(r7)
            X.3Q2 r2 = r14.A0D
            java.lang.String r12 = r2.A2t
            X.KVq r10 = new X.KVq
            r10.<init>(r2)
            r14.A07 = r10
            com.instagram.common.session.UserSession r9 = r14.A0C
            r8 = 0
            X.1iA r7 = r2.A1G
            java.lang.String r0 = r2.A2s
            X.SFy r0 = X.C64171LRw.A01(r9, r8, r2, r0)
            X.L4y r11 = new X.L4y
            r11.<init>(r0, r7)
            com.instagram.pendingmedia.service.upload.FbUploaderUtil r8 = com.instagram.pendingmedia.service.upload.FbUploaderUtil.A00
            X.SmU r9 = X.JTR.A0e(r9)
            int r0 = r2.A09
            java.lang.String r13 = r2.A3t
            java.lang.String r14 = r2.A3B
            if (r14 != 0) goto L_0x008a
            r14 = r3
        L_0x008a:
            X.C66147MDz.A00(r6, r1, r2, r15, r4)
            r16 = r0
            java.lang.Object r7 = r8.A05(r9, r10, r11, r12, r13, r14, r15, r16)
            if (r7 != r5) goto L_0x0032
            return r5
        L_0x0096:
            X.MDz r15 = new X.MDz
            r15.<init>(r6, r5, r4)
            goto L_0x001a
        L_0x009d:
            boolean r0 = r7 instanceof X.KVt
            if (r0 != 0) goto L_0x00aa
            boolean r0 = r7 instanceof X.C62020KVu
            if (r0 != 0) goto L_0x00aa
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00aa:
            X.3Q2 r4 = r1.A0D
            long r7 = r4.A05()
            r5 = 0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x00e3
            com.instagram.common.session.UserSession r1 = r1.A0C
            java.lang.String r0 = r2.A3Q
            if (r0 == 0) goto L_0x00bd
            r3 = r0
        L_0x00bd:
            X.KkW r0 = X.C62670KkW.FILE_UPLOADED_IN_ERROR
            X.O01.A00(r0, r1, r3)
            r7 = 0
            r0 = 2131968772(0x7f134304, float:1.9574448E38)
            X.L6e r6 = new X.L6e
            r6.<init>(r7, r7, r0)
            r11 = 2131959579(0x7f131f1b, float:1.9555802E38)
            r12 = 2131959578(0x7f131f1a, float:1.95558E38)
            X.LAQ r5 = new X.LAQ
            r8 = r7
            r9 = r7
            r10 = r7
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            X.1xC r1 = X.1xC.A01
            X.3GS r0 = new X.3GS
            r0.<init>(r5)
            r1.A00(r0)
        L_0x00e3:
            X.3QD r0 = X.AnonymousClass3QD.NOT_UPLOADED
            r4.A0b(r0)
            X.55S r2 = X.AnonymousClass55S.A0D
            r1 = 0
            java.lang.String r0 = "upload file error"
            X.55U r0 = X.AnonymousClass55V.A01(r2, r0, r1, r1)
            X.KVk r5 = new X.KVk
            r5.<init>(r0)
            return r5
        L_0x00f7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.upload.UploadFileStep.A00(X.LP8, com.instagram.pendingmedia.service.upload.UploadFileStep, X.4D7):java.lang.Object");
    }

    public final String getName() {
        return "UploadFile";
    }

    public final Object FIH(LP8 lp8, AnonymousClass4D7 r3) {
        return A00(lp8, this, r3);
    }
}

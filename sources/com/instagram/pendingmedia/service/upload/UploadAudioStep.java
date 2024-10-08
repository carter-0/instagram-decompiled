package com.instagram.pendingmedia.service.upload;

import X.0Yt;
import X.0qQ;
import X.0sm;
import X.AnonymousClass0iw;
import X.AnonymousClass3Q2;
import X.AnonymousClass3QD;
import X.AnonymousClass55S;
import X.AnonymousClass55U;
import X.C11286SJe;
import X.C2373737j;
import X.C2373837k;
import X.C62011KVk;
import X.C62013KVm;
import X.C63949LEr;
import X.DbV;
import X.LP8;
import X.MU6;

public final class UploadAudioStep implements MU6 {
    public final C63949LEr A00;
    public final boolean A01;

    private final C62013KVm A01(C11286SJe sJe, LP8 lp8) {
        AnonymousClass3Q2 r2 = lp8.A0D;
        lp8.A04 = null;
        if (r2.A6C) {
            r2.A2I = DbV.A0q(sJe.A05);
        }
        r2.A3v = sJe.A05;
        r2.A0b(AnonymousClass3QD.UPLOADED);
        C63949LEr lEr = this.A00;
        C2373837k r4 = lEr.A01;
        AnonymousClass3Q2 r3 = lEr.A00;
        C2373737j r42 = (C2373737j) r4;
        C2373737j.A07(C2373737j.A00((AnonymousClass0iw) null, r3, r42, "upload_audio_success"), r42);
        0sm A0E = 0Yt.A0E();
        0qQ.A0B(A0E, 1);
        r42.A0G(r3, A0E, -1);
        return C62013KVm.A00;
    }

    /* JADX WARNING: type inference failed for: r20v1, types: [X.4D7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(X.LP8 r19, com.instagram.pendingmedia.service.upload.UploadAudioStep r20, X.AnonymousClass4D7 r21) {
        /*
            r6 = r20
            r9 = r19
            r3 = 18
            r4 = r21
            boolean r0 = X.ME9.A03(r3, r4)
            if (r0 == 0) goto L_0x00c0
            r8 = r4
            X.ME9 r8 = (X.ME9) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00c0
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x001c:
            java.lang.Object r1 = r8.A03
            X.1Hj r7 = X.1Hj.A02
            int r0 = r8.A00
            r10 = 1
            if (r0 == 0) goto L_0x0041
            if (r0 != r10) goto L_0x00f3
            java.lang.Object r9 = r8.A02
            X.LP8 r9 = (X.LP8) r9
            java.lang.Object r6 = r8.A01
            com.instagram.pendingmedia.service.upload.UploadAudioStep r6 = (com.instagram.pendingmedia.service.upload.UploadAudioStep) r6
            X.0eS.A00(r1)
        L_0x0032:
            X.KnM r1 = (X.C62846KnM) r1
            boolean r0 = r1 instanceof X.KVt
            if (r0 == 0) goto L_0x00c6
            X.KVt r1 = (X.KVt) r1
            java.lang.String r0 = r1.A00
            X.KVk r7 = r6.A00(r9, r0)
            return r7
        L_0x0041:
            X.0eS.A00(r1)
            X.3Q2 r11 = r9.A0D
            X.4n7 r3 = r11.A1L
            if (r3 == 0) goto L_0x0113
            X.LEr r0 = r6.A00
            X.37k r4 = r0.A01
            X.3Q2 r2 = r0.A00
            X.37j r4 = (X.C2373737j) r4
            java.lang.String r0 = "upload_audio_attempt"
            r1 = 0
            X.0xI r0 = X.C2373737j.A00(r1, r2, r4, r0)
            X.C2373737j.A07(r0, r4)
            r4.EG0(r2)
            X.3QD r2 = r11.A6J
            X.3QD r0 = X.AnonymousClass3QD.UPLOADED_VIDEO
            boolean r0 = r2.A00(r0)
            if (r0 != 0) goto L_0x00f8
            java.lang.String r0 = r11.A3t
            boolean r0 = X.0qQ.A0K(r0, r0)
            if (r0 == 0) goto L_0x00f8
            X.KVo r0 = new X.KVo
            r0.<init>(r11)
            r9.A07 = r0
            com.instagram.common.session.UserSession r0 = r9.A0C
            java.lang.String r2 = r11.A3t
            X.0yf r2 = X.C64193LTa.A00(r0, r11, r2)
            com.instagram.pendingmedia.service.upload.FbUploaderUtil r13 = com.instagram.pendingmedia.service.upload.FbUploaderUtil.A00
            X.SmU r14 = X.JTR.A0e(r0)
            java.lang.String r5 = r3.A01
            X.Lb3 r15 = r9.A07
            int r4 = r11.A09
            java.lang.String r3 = r11.A3t
            boolean r12 = r11.A6C
            if (r12 == 0) goto L_0x00b5
            X.1iA r2 = r11.A1G
            java.lang.String r12 = r11.A2s
            X.SFy r1 = X.C64171LRw.A01(r0, r1, r11, r12)
            X.L4y r0 = new X.L4y
            r0.<init>(r1, r2)
        L_0x009f:
            X.ME9.A01(r6, r9, r8, r10)
            java.lang.String r19 = ""
            r21 = r4
            r20 = r8
            r18 = r3
            r17 = r5
            r16 = r0
            java.lang.Object r1 = r13.A05(r14, r15, r16, r17, r18, r19, r20, r21)
            if (r1 != r7) goto L_0x0032
            return r7
        L_0x00b5:
            java.lang.String r1 = r11.A0F()
            X.1iA r0 = X.1iA.A07
            X.L4y r0 = X.C64171LRw.A02(r0, r1, r2)
            goto L_0x009f
        L_0x00c0:
            X.ME9 r8 = X.ME9.A00(r6, r4, r3)
            goto L_0x001c
        L_0x00c6:
            boolean r0 = r1 instanceof X.C62020KVu
            if (r0 == 0) goto L_0x00e1
            X.KVu r1 = (X.C62020KVu) r1
            java.lang.Throwable r1 = r1.A00
            java.lang.String r0 = "audio"
            X.55U r2 = com.instagram.pendingmedia.service.upload.FbUploaderUtil.A02(r9, r0, r1)
            X.3Q2 r1 = r9.A0D
            X.3QD r0 = X.AnonymousClass3QD.NOT_UPLOADED
            r1.A0b(r0)
            X.KVk r7 = new X.KVk
            r7.<init>(r2)
            return r7
        L_0x00e1:
            boolean r0 = r1 instanceof X.C62021KVv
            if (r0 == 0) goto L_0x00ee
            X.KVv r1 = (X.C62021KVv) r1
            X.SJe r0 = r1.A00
            X.KVm r7 = r6.A01(r0, r9)
            return r7
        L_0x00ee:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00f3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00f8:
            java.lang.String r3 = "Pre-upload cancelled"
            X.55S r0 = X.AnonymousClass55S.A0M
            X.55U r2 = r9.A02(r0, r3)
            X.LEr r1 = r9.A0F
            X.55U r0 = r9.A04
            if (r0 == 0) goto L_0x0111
            java.lang.Throwable r0 = r0.A08
        L_0x0108:
            r1.A01(r3, r0)
            X.KVk r7 = new X.KVk
            r7.<init>(r2)
            return r7
        L_0x0111:
            r0 = 0
            goto L_0x0108
        L_0x0113:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.upload.UploadAudioStep.A02(X.LP8, com.instagram.pendingmedia.service.upload.UploadAudioStep, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object FIH(X.LP8 r14, X.AnonymousClass4D7 r15) {
        /*
            r13 = this;
            r3 = 26
            boolean r0 = X.C66138MDq.A02(r3, r15)
            if (r0 == 0) goto L_0x010a
            r4 = r15
            X.MDq r4 = (X.C66138MDq) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x010a
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r4.A02
            X.1Hj r3 = X.1Hj.A02
            int r1 = r4.A00
            r2 = 1
            if (r1 == 0) goto L_0x0034
            if (r1 != r2) goto L_0x0111
            java.lang.Object r14 = r4.A01
            X.LP8 r14 = (X.LP8) r14
            X.0eS.A00(r0)
        L_0x0028:
            boolean r1 = r0 instanceof X.C62013KVm
            if (r1 == 0) goto L_0x0033
            X.37k r2 = r14.A0E
            X.3Q2 r1 = r14.A0D
            r2.EGC(r1)
        L_0x0033:
            return r0
        L_0x0034:
            X.0eS.A00(r0)
            java.util.EnumSet r1 = X.C63538Kyn.A00
            X.3QD r0 = r14.A06
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0120
            boolean r0 = r13.A01
            if (r0 == 0) goto L_0x0050
            r4.A01 = r14
            r4.A00 = r2
            java.lang.Object r0 = A02(r14, r13, r4)
            if (r0 != r3) goto L_0x0028
            return r3
        L_0x0050:
            X.3Q2 r2 = r14.A0D
            X.4n7 r6 = r2.A1L
            if (r6 == 0) goto L_0x011b
            X.LEr r0 = r13.A00
            X.37k r3 = r0.A01
            X.3Q2 r1 = r0.A00
            X.37j r3 = (X.C2373737j) r3
            java.lang.String r0 = "upload_audio_attempt"
            r5 = 0
            X.0xI r0 = X.C2373737j.A00(r5, r1, r3, r0)
            X.C2373737j.A07(r0, r3)
            r3.EG0(r1)
            X.3QD r1 = r2.A6J
            X.3QD r0 = X.AnonymousClass3QD.UPLOADED_VIDEO
            boolean r0 = r1.A00(r0)
            if (r0 != 0) goto L_0x00ee
            java.lang.String r0 = r2.A3t
            boolean r0 = X.0qQ.A0K(r0, r0)
            if (r0 == 0) goto L_0x00ee
            X.KVp r0 = new X.KVp
            r0.<init>(r2)
            r14.A07 = r0
            com.instagram.common.session.UserSession r4 = r14.A0C
            java.lang.String r0 = r2.A3t
            X.0yf r3 = X.C64193LTa.A00(r4, r2, r0)
            X.SmU r7 = X.JTR.A0e(r4)
            java.lang.String r10 = r6.A01
            X.Lb3 r8 = r14.A07
            int r12 = r2.A09
            java.lang.String r11 = r2.A3t
            boolean r0 = r2.A6C
            if (r0 == 0) goto L_0x00bb
            X.1iA r1 = r2.A1G
            java.lang.String r0 = r2.A2s
            X.SFy r0 = X.C64171LRw.A01(r4, r5, r2, r0)
            X.L4y r9 = new X.L4y
            r9.<init>(r0, r1)
        L_0x00a9:
            X.KnM r1 = com.instagram.pendingmedia.service.upload.FbUploaderUtil.A03(r7, r8, r9, r10, r11, r12)
            boolean r0 = r1 instanceof X.KVt
            if (r0 == 0) goto L_0x00c6
            X.KVt r1 = (X.KVt) r1
            java.lang.String r0 = r1.A00
            X.KVk r0 = r13.A00(r14, r0)
            goto L_0x0028
        L_0x00bb:
            java.lang.String r1 = r2.A0F()
            X.1iA r0 = X.1iA.A07
            X.L4y r9 = X.C64171LRw.A02(r0, r1, r3)
            goto L_0x00a9
        L_0x00c6:
            boolean r0 = r1 instanceof X.C62020KVu
            if (r0 == 0) goto L_0x00e0
            X.KVu r1 = (X.C62020KVu) r1
            java.lang.Throwable r1 = r1.A00
            java.lang.String r0 = "audio"
            X.55U r1 = com.instagram.pendingmedia.service.upload.FbUploaderUtil.A02(r14, r0, r1)
            X.3QD r0 = X.AnonymousClass3QD.NOT_UPLOADED
            r2.A0b(r0)
            X.KVk r0 = new X.KVk
            r0.<init>(r1)
            goto L_0x0028
        L_0x00e0:
            boolean r0 = r1 instanceof X.C62021KVv
            if (r0 == 0) goto L_0x0116
            X.KVv r1 = (X.C62021KVv) r1
            X.SJe r0 = r1.A00
            X.KVm r0 = r13.A01(r0, r14)
            goto L_0x0028
        L_0x00ee:
            java.lang.String r3 = "Pre-upload cancelled"
            X.55S r0 = X.AnonymousClass55S.A0M
            X.55U r2 = r14.A02(r0, r3)
            X.LEr r1 = r14.A0F
            X.55U r0 = r14.A04
            if (r0 == 0) goto L_0x0108
            java.lang.Throwable r0 = r0.A08
        L_0x00fe:
            r1.A01(r3, r0)
            X.KVk r0 = new X.KVk
            r0.<init>(r2)
            goto L_0x0028
        L_0x0108:
            r0 = 0
            goto L_0x00fe
        L_0x010a:
            X.MDq r4 = new X.MDq
            r4.<init>(r13, r15, r3)
            goto L_0x0016
        L_0x0111:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0116:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x011b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0120:
            X.KVl r3 = X.C62012KVl.A00
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.upload.UploadAudioStep.FIH(X.LP8, X.4D7):java.lang.Object");
    }

    public final String getName() {
        return "UploadAudio";
    }

    public UploadAudioStep(C63949LEr lEr, boolean z) {
        this.A00 = lEr;
        this.A01 = z;
    }

    private final C62011KVk A00(LP8 lp8, String str) {
        Throwable th;
        AnonymousClass55U A012 = FbUploaderUtil.A01(lp8, str);
        lp8.A0D.A0b(AnonymousClass3QD.NOT_UPLOADED);
        C63949LEr lEr = this.A00;
        AnonymousClass55U r0 = lp8.A04;
        if (r0 != null) {
            th = r0.A08;
        } else {
            th = null;
        }
        AnonymousClass55S r3 = A012.A01;
        0qQ.A0B(str, 0);
        C2373837k r2 = lEr.A01;
        AnonymousClass3Q2 r1 = lEr.A00;
        C2373737j r22 = (C2373737j) r2;
        C2373737j.A0B(r1, r22, "upload_audio_failure", str);
        r22.EFz(r3, r1, str, th);
        return new C62011KVk(A012);
    }
}

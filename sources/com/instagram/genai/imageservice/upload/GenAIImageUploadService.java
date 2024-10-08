package com.instagram.genai.imageservice.upload;

import X.AnonymousClass4HU;
import X.AnonymousClass4HW;
import X.AnonymousClass7TG;
import X.C335967dq;
import X.C61082JwK;
import X.C63638L1a;
import android.content.Context;
import com.instagram.common.session.UserSession;

public final class GenAIImageUploadService {
    public final Context A00;
    public final C61082JwK A01;
    public final C63638L1a A02;
    public final AnonymousClass4HW A03 = C335967dq.A00(AnonymousClass4HU.A00);
    public final UserSession A04;

    /* JADX WARNING: type inference failed for: r13v1, types: [X.MDo, X.4D7] */
    /* JADX WARNING: type inference failed for: r13v4 */
    /* JADX WARNING: type inference failed for: r13v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.genai.imageservice.upload.GenAIImageUploadService r16, java.lang.String r17, X.AnonymousClass4D7 r18, int r19) {
        /*
            r3 = 45
            r4 = r18
            boolean r0 = X.C66136MDo.A01(r3, r4)
            r5 = r16
            if (r0 == 0) goto L_0x0091
            r13 = r4
            X.MDo r13 = (X.C66136MDo) r13
            int r2 = r13.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0091
            int r2 = r2 - r1
            r13.A00 = r2
        L_0x001a:
            java.lang.Object r4 = r13.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r13.A00
            r3 = 1
            if (r0 == 0) goto L_0x0059
            if (r0 != r3) goto L_0x009e
            X.0eS.A00(r4)
        L_0x0028:
            X.KnM r4 = (X.C62846KnM) r4
            boolean r0 = r4 instanceof X.KVt
            r1 = 0
            if (r0 == 0) goto L_0x0039
            X.KVt r4 = (X.KVt) r4
            java.lang.String r0 = r4.A00
        L_0x0033:
            X.KS8 r2 = new X.KS8
            r2.<init>(r0, r1)
            return r2
        L_0x0039:
            boolean r0 = r4 instanceof X.C62020KVu
            if (r0 == 0) goto L_0x0044
            X.KVu r4 = (X.C62020KVu) r4
            java.lang.Throwable r1 = r4.A00
            java.lang.String r0 = "Media Upload Failure"
            goto L_0x0033
        L_0x0044:
            boolean r0 = r4 instanceof X.C62021KVv
            if (r0 == 0) goto L_0x0099
            X.KVv r4 = (X.C62021KVv) r4
            X.SJe r0 = r4.A00
            java.lang.String r0 = r0.A05
            if (r0 == 0) goto L_0x0056
            X.KS7 r2 = new X.KS7
            r2.<init>(r0)
            return r2
        L_0x0056:
            java.lang.String r0 = "Successful response, but missing file handle"
            goto L_0x0033
        L_0x0059:
            X.0eS.A00(r4)
            java.lang.String r11 = X.JTQ.A0Z()
            com.instagram.pendingmedia.service.upload.FbUploaderUtil r6 = com.instagram.pendingmedia.service.upload.FbUploaderUtil.A00
            com.instagram.common.session.UserSession r14 = r5.A04
            X.SmU r7 = X.JTR.A0e(r14)
            X.Lb3 r8 = new X.Lb3
            r8.<init>()
            X.1iA r1 = X.1iA.A0F
            java.lang.String r16 = "ig_sharing_genai"
            X.JwK r0 = r5.A01
            boolean r0 = r0.A01
            r10 = r17
            r18 = r19
            r15 = r11
            r19 = r0
            X.SFy r0 = X.C63392KwD.A00(r14, r15, r16, r17, r18, r19)
            X.L4y r9 = new X.L4y
            r9.<init>(r0, r1)
            r13.A00 = r3
            r14 = 0
            java.lang.String r12 = ""
            java.lang.Object r4 = r6.A05(r7, r8, r9, r10, r11, r12, r13, r14)
            if (r4 != r2) goto L_0x0028
            return r2
        L_0x0091:
            r0 = 42
            X.MDo r13 = new X.MDo
            r13.<init>(r5, r4, r3, r0)
            goto L_0x001a
        L_0x0099:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x009e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageservice.upload.GenAIImageUploadService.A00(com.instagram.genai.imageservice.upload.GenAIImageUploadService, java.lang.String, X.4D7, int):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDo, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(android.graphics.Bitmap r12, java.lang.String r13, X.AnonymousClass4D7 r14) {
        /*
            r11 = this;
            r3 = 44
            boolean r0 = X.C66136MDo.A01(r3, r14)
            r6 = r11
            if (r0 == 0) goto L_0x0047
            r4 = r14
            X.MDo r4 = (X.C66136MDo) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0047
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0017:
            java.lang.Object r3 = r4.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            r9 = 0
            if (r0 == 0) goto L_0x0031
            if (r0 != r1) goto L_0x0054
            X.0eS.A00(r3)
        L_0x0026:
            X.5mw r3 = (X.C294735mw) r3
            boolean r0 = r3 instanceof X.C294725mv
            if (r0 == 0) goto L_0x004f
            X.5mv r3 = (X.C294725mv) r3
            java.lang.Object r2 = r3.A00
            return r2
        L_0x0031:
            X.0eS.A00(r3)
            X.4HW r0 = r11.A03
            r10 = 2
            X.MEH r5 = new X.MEH
            r7 = r12
            r8 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            r4.A00 = r1
            java.lang.Object r3 = r0.A00(r13, r4, r5)
            if (r3 != r2) goto L_0x0026
            return r2
        L_0x0047:
            r0 = 42
            X.MDo r4 = new X.MDo
            r4.<init>(r11, r14, r3, r0)
            goto L_0x0017
        L_0x004f:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0054:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageservice.upload.GenAIImageUploadService.A01(android.graphics.Bitmap, java.lang.String, X.4D7):java.lang.Object");
    }

    public GenAIImageUploadService(Context context, C61082JwK jwK, UserSession userSession, C63638L1a l1a) {
        AnonymousClass7TG.A1P(context, jwK);
        this.A00 = context;
        this.A04 = userSession;
        this.A01 = jwK;
        this.A02 = l1a;
    }
}

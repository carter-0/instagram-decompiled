package com.meta.metaai.imagine.creation.impl.data;

import X.HMY;
import X.I25;
import X.I86;
import android.app.Application;
import com.meta.metaai.imagine.service.ImagineNetworkService;

public final class EmuFlashRepository {
    public final Application A00;
    public final I25 A01;
    public final I86 A02;
    public final HMY A03;
    public final ImagineNetworkService A04;

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDl, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f7, code lost:
        if (r1 == r4) goto L_0x00f9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C56085HsY r14, X.AnonymousClass4D7 r15) {
        /*
            r13 = this;
            r4 = 5
            boolean r0 = X.C66133MDl.A01(r4, r15)
            if (r0 == 0) goto L_0x010e
            r3 = r15
            X.MDl r3 = (X.C66133MDl) r3
            int r2 = r3.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x010e
            int r2 = r2 - r1
            r3.A01 = r2
        L_0x0015:
            java.lang.Object r1 = r3.A05
            X.1Hj r4 = X.1Hj.A02
            int r0 = r3.A01
            r10 = 0
            r5 = 2
            r12 = 1
            if (r0 == 0) goto L_0x0054
            if (r0 == r12) goto L_0x0048
            if (r0 != r5) goto L_0x0115
            int r2 = r3.A00
            java.lang.Object r8 = r3.A04
            X.HtY r8 = (X.C56146HtY) r8
            java.lang.Object r14 = r3.A03
            java.lang.Object r7 = r3.A02
            com.meta.metaai.imagine.creation.impl.data.EmuFlashRepository r7 = (com.meta.metaai.imagine.creation.impl.data.EmuFlashRepository) r7
            X.0eS.A00(r1)
        L_0x0033:
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            if (r1 == 0) goto L_0x0047
            X.Hss r10 = new X.Hss
            r10.<init>(r1, r8, r2)
            X.I86 r1 = r7.A02
            r0 = 0
            X.0qQ.A0B(r14, r0)
            android.util.LruCache r0 = r1.A00
            r0.put(r14, r10)
        L_0x0047:
            return r10
        L_0x0048:
            int r2 = r3.A00
            java.lang.Object r14 = r3.A03
            java.lang.Object r7 = r3.A02
            com.meta.metaai.imagine.creation.impl.data.EmuFlashRepository r7 = (com.meta.metaai.imagine.creation.impl.data.EmuFlashRepository) r7
            X.0eS.A00(r1)
            goto L_0x00b2
        L_0x0054:
            X.0eS.A00(r1)
            r1 = 0
            r0 = 2147483647(0x7fffffff, float:NaN)
            X.2HY r1 = X.C229632nm.A0C(r1, r0)
            X.2SQ r0 = X.2SP.A00
            int r2 = X.C229632nm.A04(r0, r1)
            X.I25 r6 = r13.A01
            com.facebook.quicklog.QuickPerformanceLogger r7 = r6.A00
            if (r7 == 0) goto L_0x0071
            r0 = 325725822(0x136a2e7e, float:2.9557875E-27)
            r7.markerStart(r0, r2)
        L_0x0071:
            java.lang.String r1 = "query_begin"
            if (r7 == 0) goto L_0x007b
            r0 = 325725822(0x136a2e7e, float:2.9557875E-27)
            r7.markerPoint(r0, r2, r1)
        L_0x007b:
            X.Htc r7 = r6.A01
            X.Nky r0 = r7.A02
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "entry_point"
            r6.A09(r0, r1, r2)
            java.lang.String r1 = r7.A0B
            java.lang.String r0 = "surface_session_id"
            r6.A09(r0, r1, r2)
            java.lang.String r1 = r7.A0A
            java.lang.String r0 = "bottom_sheet_session_id"
            r6.A09(r0, r1, r2)
            com.meta.metaai.imagine.service.ImagineNetworkService r7 = r13.A04
            java.lang.String r9 = r14.A01
            int r11 = r14.A00
            X.HMY r8 = r13.A03
            r3.A02 = r13
            r3.A03 = r14
            r3.A00 = r2
            r3.A01 = r12
            X.MFg r6 = new X.MFg
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0 = 30000(0x7530, double:1.4822E-319)
            java.lang.Object r1 = com.meta.metaai.imagine.service.ImagineNetworkServiceKt.A03(r3, r6, r0)
            if (r1 == r4) goto L_0x00f9
            r7 = r13
        L_0x00b2:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00fa
            X.I25 r9 = r7.A01
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r8 = r1.A00
            X.HtY r8 = (X.C56146HtY) r8
            java.lang.String r1 = r8.A07
            java.lang.String r0 = "request_id"
            r9.A09(r0, r1, r2)
            java.lang.String r1 = r8.A08
            java.lang.String r0 = "response_id"
            r9.A09(r0, r1, r2)
            java.lang.String r6 = "query_end"
            com.facebook.quicklog.QuickPerformanceLogger r1 = r9.A00
            if (r1 == 0) goto L_0x00da
            r0 = 325725822(0x136a2e7e, float:2.9557875E-27)
            r1.markerPoint(r0, r2, r6)
        L_0x00da:
            java.lang.String r0 = r8.A04
            java.lang.String r6 = r8.A0A
            android.app.Application r1 = r7.A00
            java.lang.Long.parseLong(r0)
            r3.A02 = r7
            r3.A03 = r14
            r3.A04 = r8
            r3.A00 = r2
            r3.A01 = r5
            android.util.DisplayMetrics r0 = X.AnonymousClass7TF.A0E(r1)
            int r0 = r0.heightPixels
            java.lang.Object r1 = X.C56366HxJ.A00(r1, r6, r3, r0)
            if (r1 != r4) goto L_0x0033
        L_0x00f9:
            return r4
        L_0x00fa:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x011a
            X.5sO r1 = (X.C297815sO) r1
            java.lang.Object r1 = r1.A00
            boolean r0 = r1 instanceof X.C54543HIe
            if (r0 != 0) goto L_0x0047
            X.I25 r0 = r7.A01
            X.HQf r1 = (X.C54726HQf) r1
            r0.A02(r1)
            return r10
        L_0x010e:
            X.MDl r3 = new X.MDl
            r3.<init>(r13, r15, r4)
            goto L_0x0015
        L_0x0115:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x011a:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.imagine.creation.impl.data.EmuFlashRepository.A00(X.HsY, X.4D7):java.lang.Object");
    }

    public /* synthetic */ EmuFlashRepository(Application application, I25 i25, HMY hmy, ImagineNetworkService imagineNetworkService) {
        I86 i86 = new I86();
        this.A00 = application;
        this.A04 = imagineNetworkService;
        this.A03 = hmy;
        this.A01 = i25;
        this.A02 = i86;
        application.registerComponentCallbacks(i86);
    }
}

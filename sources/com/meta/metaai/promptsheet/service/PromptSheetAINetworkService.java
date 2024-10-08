package com.meta.metaai.promptsheet.service;

import X.0qQ;
import X.1vm;
import X.1vn;
import X.1vo;
import X.C56316HwT;
import android.app.Application;
import com.meta.foa.session.FoaUserSession;

public final class PromptSheetAINetworkService {
    public final Application A00;
    public final 1vo A01;
    public final FoaUserSession A02;

    /* JADX WARNING: type inference failed for: r6v1, types: [X.Il7, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C56088Hsb r10, X.AnonymousClass4D7 r11) {
        /*
            r9 = this;
            r3 = 3
            boolean r0 = X.C58075Il7.A02(r3, r11)
            if (r0 == 0) goto L_0x006c
            r6 = r11
            X.Il7 r6 = (X.C58075Il7) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006c
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r6.A01
            X.1Hj r8 = X.1Hj.A02
            int r0 = r6.A00
            r7 = 1
            if (r0 == 0) goto L_0x003a
            if (r0 != r7) goto L_0x0088
            X.0eS.A00(r1)
        L_0x0023:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0074
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.3JD r0 = (X.AnonymousClass3JD) r0
            java.lang.Object r0 = r0.Bny()
            if (r0 == 0) goto L_0x007d
            X.3Ih r8 = X.C41845B3m.A0d(r0)
            return r8
        L_0x003a:
            X.0eS.A00(r1)
            X.1vo r5 = r9.A01
            java.lang.Class<X.CxS> r0 = X.C45492CxS.class
            java.lang.Object r3 = X.C41847B3o.A16(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x008d }
            X.DFm r3 = (X.C45932DFm) r3     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x008d }
            java.lang.String r2 = "IGD"
            X.2IS r1 = r3.A00
            java.lang.String r0 = "app"
            r1.A04(r0, r2)
            r3.A02 = r7
            X.1Ef r4 = r3.build()
            long r2 = r10.A00
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            X.1Ef r0 = r4.setFreshCacheAgeMs(r2)
            X.1Ef r0 = r0.setMaxToleratedCacheAgeMs(r2)
            r6.A00 = r7
            java.lang.Object r1 = X.C55228HeJ.A00(r5, r0, r6)
            if (r1 != r8) goto L_0x0023
            return r8
        L_0x006c:
            r0 = 42
            X.Il7 r6 = new X.Il7
            r6.<init>((java.lang.Object) r9, (X.AnonymousClass4D7) r11, (int) r3, (int) r0)
            goto L_0x0015
        L_0x0074:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0083
            X.5sO r1 = (X.C297815sO) r1
            java.lang.Object r0 = r1.A00
            goto L_0x007e
        L_0x007d:
            r0 = 0
        L_0x007e:
            X.5sO r8 = X.C41845B3m.A0c(r0)
            return r8
        L_0x0083:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0088:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x008d:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.promptsheet.service.PromptSheetAINetworkService.A00(X.Hsb, X.4D7):java.lang.Object");
    }

    public /* synthetic */ PromptSheetAINetworkService(Application application, FoaUserSession foaUserSession) {
        1vn A012 = 1vm.A01(C56316HwT.A00(foaUserSession));
        0qQ.A0B(A012, 3);
        this.A00 = application;
        this.A02 = foaUserSession;
        this.A01 = A012;
    }
}

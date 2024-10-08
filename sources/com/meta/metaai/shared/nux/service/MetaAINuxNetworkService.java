package com.meta.metaai.shared.nux.service;

import X.0qQ;
import X.1vm;
import X.1vn;
import X.1vo;
import X.C56316HwT;
import android.app.Application;
import com.meta.foa.session.FoaUserSession;

public final class MetaAINuxNetworkService {
    public final Application A00;
    public final 1vo A01;
    public final FoaUserSession A02;

    /* JADX WARNING: type inference failed for: r5v1, types: [X.Il7, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C54639HLw r9, X.AnonymousClass4D7 r10) {
        /*
            r8 = this;
            r3 = 7
            boolean r0 = X.C58075Il7.A02(r3, r10)
            if (r0 == 0) goto L_0x0073
            r5 = r10
            X.Il7 r5 = (X.C58075Il7) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0073
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r5.A01
            X.1Hj r7 = X.1Hj.A02
            int r0 = r5.A00
            r6 = 1
            if (r0 == 0) goto L_0x0034
            if (r0 != r6) goto L_0x008f
            X.0eS.A00(r1)
        L_0x0023:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x007b
            java.lang.Object r0 = X.C51975G9x.A0f(r1)
            if (r0 == 0) goto L_0x0084
            X.3Ih r7 = X.C41845B3m.A0d(r0)
            return r7
        L_0x0034:
            X.0eS.A00(r1)
            X.1vo r4 = r8.A01
            java.lang.Class<X.HuE> r2 = X.C56185HuE.class
            java.lang.String r1 = "create"
            r0 = 0
            java.lang.Object r3 = X.C41847B3o.A17(r2, r1, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0099 }
            X.II5 r3 = (X.II5) r3     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0099 }
            int r1 = r9.ordinal()
            if (r1 == r0) goto L_0x0070
            r0 = 3
            if (r1 == r0) goto L_0x0070
            if (r1 == r6) goto L_0x006d
            r0 = 2
            if (r1 != r0) goto L_0x0094
            java.lang.String r2 = "WRITE_WITH_AI_MMLLM"
        L_0x0054:
            X.2IS r1 = r3.A00
            java.lang.String r0 = "intent_card_type"
            r1.A04(r0, r2)
            r3.A02 = r6
            X.1Ef r0 = r3.build()
            X.0qQ.A07(r0)
            r5.A00 = r6
            java.lang.Object r1 = X.C55228HeJ.A00(r4, r0, r5)
            if (r1 != r7) goto L_0x0023
            return r7
        L_0x006d:
            java.lang.String r2 = "WRITE_WITH_AI"
            goto L_0x0054
        L_0x0070:
            java.lang.String r2 = "IMAGINE"
            goto L_0x0054
        L_0x0073:
            r0 = 42
            X.Il7 r5 = new X.Il7
            r5.<init>((java.lang.Object) r8, (X.AnonymousClass4D7) r10, (int) r3, (int) r0)
            goto L_0x0015
        L_0x007b:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x008a
            X.5sO r1 = (X.C297815sO) r1
            java.lang.Object r0 = r1.A00
            goto L_0x0085
        L_0x0084:
            r0 = 0
        L_0x0085:
            X.5sO r7 = X.C41845B3m.A0c(r0)
            return r7
        L_0x008a:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x008f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0094:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0099:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.shared.nux.service.MetaAINuxNetworkService.A00(X.HLw, X.4D7):java.lang.Object");
    }

    public /* synthetic */ MetaAINuxNetworkService(Application application, FoaUserSession foaUserSession) {
        1vn A012 = 1vm.A01(C56316HwT.A00(foaUserSession));
        0qQ.A0B(A012, 3);
        this.A00 = application;
        this.A02 = foaUserSession;
        this.A01 = A012;
    }
}

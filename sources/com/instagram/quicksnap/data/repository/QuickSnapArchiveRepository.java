package com.instagram.quicksnap.data.repository;

import X.02z;
import X.05G;
import X.AnonymousClass0Ud;
import X.C61077JwF;
import X.DbS;
import com.instagram.quicksnap.data.api.QuickSnapApi;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class QuickSnapArchiveRepository {
    public final QuickSnapApi A00;
    public final 05G A01;
    public final AnonymousClass0Ud A02;

    /* JADX WARNING: type inference failed for: r8v1, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass4D7 r11) {
        /*
            r10 = this;
            r3 = 32
            boolean r0 = X.C66138MDq.A02(r3, r11)
            if (r0 == 0) goto L_0x007e
            r8 = r11
            X.MDq r8 = (X.C66138MDq) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x007e
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x0016:
            java.lang.Object r9 = r8.A02
            X.1Hj r7 = X.1Hj.A02
            int r0 = r8.A00
            r6 = 1
            if (r0 == 0) goto L_0x004d
            if (r0 != r6) goto L_0x0084
            java.lang.Object r0 = r8.A01
            com.instagram.quicksnap.data.repository.QuickSnapArchiveRepository r0 = (com.instagram.quicksnap.data.repository.QuickSnapArchiveRepository) r0
            X.0eS.A00(r9)
        L_0x0028:
            X.JwF r9 = (X.C61077JwF) r9
            X.05G r6 = r0.A01
        L_0x002c:
            java.lang.Object r5 = r6.getValue()
            r0 = r5
            X.JwF r0 = (X.C61077JwF) r0
            java.lang.Object r4 = r9.A00
            java.util.List r4 = (java.util.List) r4
            java.lang.String r3 = r0.A01
            r2 = 0
            X.0qQ.A0B(r4, r2)
            r1 = 16
            X.JwF r0 = new X.JwF
            r0.<init>((java.util.List) r4, (java.lang.String) r3, (boolean) r2, (int) r1)
            boolean r0 = r6.AIY(r5, r0)
            if (r0 == 0) goto L_0x002c
            X.0gF r7 = X.C60340gF.A00
        L_0x004c:
            return r7
        L_0x004d:
            X.0eS.A00(r9)
            X.05G r5 = r10.A01
        L_0x0052:
            java.lang.Object r4 = r5.getValue()
            r0 = r4
            X.JwF r0 = (X.C61077JwF) r0
            java.lang.Object r3 = r0.A00
            java.util.List r3 = (java.util.List) r3
            java.lang.String r2 = r0.A01
            r0 = 0
            X.0qQ.A0B(r3, r0)
            r1 = 16
            X.JwF r0 = new X.JwF
            r0.<init>((java.util.List) r3, (java.lang.String) r2, (boolean) r6, (int) r1)
            boolean r0 = r5.AIY(r4, r0)
            if (r0 == 0) goto L_0x0052
            com.instagram.quicksnap.data.api.QuickSnapApi r0 = r10.A00
            r8.A01 = r10
            r8.A00 = r6
            java.lang.Object r9 = r0.A05(r8)
            if (r9 == r7) goto L_0x004c
            r0 = r10
            goto L_0x0028
        L_0x007e:
            X.MDq r8 = new X.MDq
            r8.<init>(r10, r11, r3)
            goto L_0x0016
        L_0x0084:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quicksnap.data.repository.QuickSnapArchiveRepository.A00(X.4D7):java.lang.Object");
    }

    public QuickSnapArchiveRepository(QuickSnapApi quickSnapApi) {
        this.A00 = quickSnapApi;
        02z A10 = DbS.A10(new C61077JwF((List) null, (String) null, false, 7, (DefaultConstructorMarker) null, 16));
        this.A01 = A10;
        this.A02 = A10;
    }
}

package com.instagram.creation.capture.quickcapture.inspirationhub.network;

import X.0Yv;
import X.0qQ;
import X.1ES;
import X.1Ey;
import X.1IW;
import X.1Xj;
import X.AnonymousClass4D7;
import X.AnonymousClass72Q;
import X.C290815g0;
import X.C377149Ks;
import X.H7U;
import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class InspirationHubNetworkDataSource {
    public final UserSession A00;
    public final AnonymousClass72Q A01;

    public InspirationHubNetworkDataSource(UserSession userSession, Context context) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(context, 2);
        this.A00 = userSession;
        this.A01 = new AnonymousClass72Q(context, userSession);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: X.0rm} */
    /* JADX WARNING: type inference failed for: r5v1, types: [X.9JX, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r13, X.AnonymousClass4D7 r14) {
        /*
            r12 = this;
            r3 = 26
            boolean r0 = X.AnonymousClass9JX.A00(r3, r14)
            if (r0 == 0) goto L_0x005c
            r5 = r14
            X.9JX r5 = (X.AnonymousClass9JX) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005c
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r1 = 1
            if (r0 == 0) goto L_0x002b
            if (r0 != r1) goto L_0x0062
            java.lang.Object r6 = r5.A01
            X.0rm r6 = (X.0rm) r6
            X.0eS.A00(r2)
        L_0x0028:
            java.lang.Object r4 = r6.A00
            return r4
        L_0x002b:
            X.0eS.A00(r2)
            r11 = 0
            java.lang.String[] r0 = new java.lang.String[]{r13}
            java.util.HashSet r10 = X.0sc.A05(r0)
            r9 = 0
            com.instagram.common.session.UserSession r6 = r12.A00
            X.3BU r7 = X.AnonymousClass3BU.INSPIRATION_HUB
            java.lang.String r8 = "auto_created_reels"
            X.1GP r3 = X.AnonymousClass5FI.A00(r6, r7, r8, r9, r10, r11)
            X.0rm r6 = new X.0rm
            r6.<init>()
            r0 = 4
            X.9Mt r2 = new X.9Mt
            r2.<init>(r12, r6, r13, r0)
            r5.A01 = r6
            r5.A00 = r1
            r1 = 1370611006(0x51b1dd3e, float:9.549013E10)
            r0 = 3
            java.lang.Object r0 = r3.A01(r5, r2, r1, r0)
            if (r0 != r4) goto L_0x0028
            return r4
        L_0x005c:
            X.9JX r5 = new X.9JX
            r5.<init>(r12, r14, r3)
            goto L_0x0016
        L_0x0062:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubNetworkDataSource.A00(java.lang.String, X.4D7):java.lang.Object");
    }

    public final Object A01(List list, AnonymousClass4D7 r8) {
        AnonymousClass72Q r3 = this.A01;
        ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(r3.A00((1Xj) it.next()));
        }
        C290815g0 A012 = r3.A01(arrayList, (List) null);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = 1IW.A02;
        1IW r32 = new 1IW(1, 1Ey.A02(r8));
        r32.A0I();
        A012.A00 = new H7U(r32);
        r32.CO0(new C377149Ks(A012, 5));
        1ES.A05(A012, 1370611006, 3, true, false);
        return r32.A0E();
    }
}

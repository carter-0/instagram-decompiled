package com.facebook.commonavatarliveediting.api;

import X.0qQ;
import X.0sP;
import X.136;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass7TE;
import X.C60340gF;
import X.C62975KpR;
import X.C66223MJe;
import X.JTR;
import com.facebook.fbavatar.cdsavatareditor.liveediting.ig.IgCdlProviderBuilder;
import java.util.Iterator;
import java.util.Set;

public final class CdlProviderHolderRegistry implements 0sP {
    public static CdlProviderHolderRegistry A03;
    public static final C62975KpR A04 = new Object();
    public final IgCdlProviderBuilder A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(C66223MJe.A00);
    public final 136 A02 = new 136();

    /* JADX WARNING: type inference failed for: r7v1, types: [X.ME2, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cd, code lost:
        r0 = th;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0074 A[Catch:{ all -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0087 A[Catch:{ all -> 0x00cb }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a3 A[Catch:{ all -> 0x00cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C15046UKz r11, com.facebook.commonavatarliveediting.prefetch.CommonCdlProviderHolder r12, X.C18073Vl1 r13, X.AnonymousClass4D7 r14, boolean r15) {
        /*
            r10 = this;
            r1 = 1
            boolean r0 = X.ME2.A02(r1, r14)
            if (r0 == 0) goto L_0x002d
            r7 = r14
            X.ME2 r7 = (X.ME2) r7
            int r3 = r7.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x002d
            int r3 = r3 - r2
            r7.A00 = r3
        L_0x0015:
            java.lang.Object r6 = r7.A06
            X.1Hj r8 = X.1Hj.A02
            int r0 = r7.A00
            r5 = 2
            r2 = 1
            r4 = 0
            if (r0 == 0) goto L_0x004c
            if (r0 == r1) goto L_0x0038
            if (r0 != r5) goto L_0x0033
            java.lang.Object r3 = r7.A02
            X.136 r3 = (X.136) r3
            java.lang.Object r9 = r7.A01
            com.facebook.commonavatarliveediting.api.CdlProviderHolderRegistry r9 = (com.facebook.commonavatarliveediting.api.CdlProviderHolderRegistry) r9
            goto L_0x0088
        L_0x002d:
            X.ME2 r7 = new X.ME2
            r7.<init>(r10, r14, r1)
            goto L_0x0015
        L_0x0033:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0038:
            boolean r15 = r7.A08
            java.lang.Object r3 = r7.A05
            X.136 r3 = (X.136) r3
            java.lang.Object r11 = r7.A03
            X.UKz r11 = (X.C15046UKz) r11
            java.lang.Object r12 = r7.A02
            java.lang.Object r9 = r7.A01
            com.facebook.commonavatarliveediting.api.CdlProviderHolderRegistry r9 = (com.facebook.commonavatarliveediting.api.CdlProviderHolderRegistry) r9
            X.0eS.A00(r6)
            goto L_0x0061
        L_0x004c:
            X.0eS.A00(r6)
            X.136 r3 = r10.A02
            X.ME2.A00(r10, r12, r11, r13, r7)
            r7.A05 = r3
            r7.A08 = r15
            r7.A00 = r1
            java.lang.Object r0 = X.136.A00(r7, r3)
            if (r0 == r8) goto L_0x00d2
            r9 = r10
        L_0x0061:
            X.0eM r0 = r9.A01     // Catch:{ all -> 0x00cb }
            java.lang.Object r1 = X.AnonymousClass7TE.A14(r0)     // Catch:{ all -> 0x00cb }
            java.util.Set r1 = (java.util.Set) r1     // Catch:{ all -> 0x00cb }
            java.lang.ref.WeakReference r0 = X.C51965G9l.A0v(r12)     // Catch:{ all -> 0x00cb }
            r1.add(r0)     // Catch:{ all -> 0x00cb }
            com.facebook.fbavatar.cdsavatareditor.liveediting.ig.IgCdlProviderBuilder r0 = r9.A00     // Catch:{ all -> 0x00cb }
            if (r15 != 0) goto L_0x0075
            r2 = 0
        L_0x0075:
            r7.A01 = r9     // Catch:{ all -> 0x00cb }
            r7.A02 = r3     // Catch:{ all -> 0x00cb }
            r7.A03 = r4     // Catch:{ all -> 0x00cb }
            r7.A04 = r4     // Catch:{ all -> 0x00cb }
            r7.A05 = r4     // Catch:{ all -> 0x00cb }
            r7.A00 = r5     // Catch:{ all -> 0x00cb }
            java.lang.Object r6 = r0.A01(r11, r7, r2)     // Catch:{ all -> 0x00cb }
            if (r6 != r8) goto L_0x008b
            return r8
        L_0x0088:
            X.0eS.A00(r6)     // Catch:{ all -> 0x00cd }
        L_0x008b:
            X.MTM r6 = (X.MTM) r6     // Catch:{ all -> 0x00cd }
            X.0eM r0 = r9.A01     // Catch:{ all -> 0x00cd }
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)     // Catch:{ all -> 0x00cd }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ all -> 0x00cd }
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r0)     // Catch:{ all -> 0x00cd }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x00cd }
        L_0x009d:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x00cd }
            if (r0 == 0) goto L_0x00c7
            java.lang.Object r1 = X.JTR.A10(r2)     // Catch:{ all -> 0x00cd }
            com.facebook.commonavatarliveediting.prefetch.CommonCdlProviderHolder r1 = (com.facebook.commonavatarliveediting.prefetch.CommonCdlProviderHolder) r1     // Catch:{ all -> 0x00cd }
            if (r1 == 0) goto L_0x00bb
            r0 = 0
            X.0qQ.A0B(r6, r0)     // Catch:{ all -> 0x00cd }
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A05     // Catch:{ all -> 0x00cd }
            boolean r0 = r0.get()     // Catch:{ all -> 0x00cd }
            if (r0 != 0) goto L_0x00be
            monitor-enter(r1)     // Catch:{ all -> 0x00cd }
            r1.cdlProviderInstance = r6     // Catch:{ all -> 0x00c4 }
            goto L_0x00bd
        L_0x00bb:
            r0 = 0
            goto L_0x00c0
        L_0x00bd:
            monitor-exit(r1)     // Catch:{ all -> 0x00cd }
        L_0x00be:
            X.0gF r0 = X.C60340gF.A00     // Catch:{ all -> 0x00cd }
        L_0x00c0:
            r5.add(r0)     // Catch:{ all -> 0x00cd }
            goto L_0x009d
        L_0x00c4:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00cd }
            throw r0     // Catch:{ all -> 0x00cd }
        L_0x00c7:
            r3.A05(r4)
            return r6
        L_0x00cb:
            r0 = move-exception
            goto L_0x00ce
        L_0x00cd:
            r0 = move-exception
        L_0x00ce:
            r3.A05(r4)
            throw r0
        L_0x00d2:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.commonavatarliveediting.api.CdlProviderHolderRegistry.A00(X.UKz, com.facebook.commonavatarliveediting.prefetch.CommonCdlProviderHolder, X.Vl1, X.4D7, boolean):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        0qQ.A0B(obj, 0);
        Iterator it = ((Set) AnonymousClass7TE.A14(this.A01)).iterator();
        while (it.hasNext()) {
            0sP r0 = (0sP) JTR.A10(it);
            if (r0 != null) {
                r0.invoke(obj);
            }
        }
        return C60340gF.A00;
    }

    public CdlProviderHolderRegistry(IgCdlProviderBuilder igCdlProviderBuilder) {
        this.A00 = igCdlProviderBuilder;
        igCdlProviderBuilder.A01 = this;
    }
}

package com.facebook.commonavatarliveediting.prefetch;

import X.0QV;
import X.0qQ;
import X.0sP;
import X.136;
import X.AnonymousClass00P;
import X.AnonymousClass7TE;
import X.C51965G9l;
import X.C60340gF;
import X.C62470KgL;
import X.JTQ;
import X.JTR;
import X.MTM;
import android.content.Context;
import com.facebook.commonavatarliveediting.api.CdlProviderHolderRegistry;
import com.facebook.fbavatar.cdsavatareditor.liveediting.ig.IgCdlProviderBuilder;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public final class CommonCdlProviderHolder implements 0sP {
    public static CommonCdlProviderHolder A07;
    public CdlProviderHolderRegistry A00;
    public 0QV A01;
    public final Context A02;
    public final IgCdlProviderBuilder A03;
    public final List A04 = AnonymousClass7TE.A1C();
    public final AtomicBoolean A05 = new AtomicBoolean(true);
    public final 136 A06 = new 136();
    public MTM cdlProviderInstance;
    public AtomicBoolean requiresRAMCacheForCDL = JTQ.A0k();

    /* JADX WARNING: type inference failed for: r12v1, types: [X.JUI, X.4D7] */
    /* JADX WARNING: type inference failed for: r12v4 */
    /* JADX WARNING: type inference failed for: r12v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d0, code lost:
        r2.A05((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d3, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079 A[Catch:{ all -> 0x00cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a9 A[Catch:{ all -> 0x00cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C15046UKz r15, X.C18073Vl1 r16, X.AnonymousClass4D7 r17, boolean r18) {
        /*
            r14 = this;
            r9 = r15
            r11 = r16
            r6 = r18
            r1 = 0
            r4 = r17
            boolean r0 = X.JUI.A01(r1, r4)
            if (r0 == 0) goto L_0x0034
            r12 = r4
            X.JUI r12 = (X.JUI) r12
            int r3 = r12.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x0034
            int r3 = r3 - r2
            r12.A00 = r3
        L_0x001c:
            java.lang.Object r8 = r12.A05
            X.1Hj r5 = X.1Hj.A02
            int r0 = r12.A00
            r4 = 2
            r7 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0055
            if (r0 == r7) goto L_0x003f
            if (r0 != r4) goto L_0x003a
            java.lang.Object r2 = r12.A02
            X.136 r2 = (X.136) r2
            java.lang.Object r10 = r12.A01
            com.facebook.commonavatarliveediting.prefetch.CommonCdlProviderHolder r10 = (com.facebook.commonavatarliveediting.prefetch.CommonCdlProviderHolder) r10
            goto L_0x009c
        L_0x0034:
            X.JUI r12 = new X.JUI
            r12.<init>(r14, r4, r1)
            goto L_0x001c
        L_0x003a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x003f:
            boolean r6 = r12.A06
            java.lang.Object r2 = r12.A04
            X.136 r2 = (X.136) r2
            java.lang.Object r11 = r12.A03
            X.Vl1 r11 = (X.C18073Vl1) r11
            java.lang.Object r9 = r12.A02
            X.UKz r9 = (X.C15046UKz) r9
            java.lang.Object r10 = r12.A01
            com.facebook.commonavatarliveediting.prefetch.CommonCdlProviderHolder r10 = (com.facebook.commonavatarliveediting.prefetch.CommonCdlProviderHolder) r10
            X.0eS.A00(r8)
            goto L_0x0075
        L_0x0055:
            X.0eS.A00(r8)
            java.util.concurrent.atomic.AtomicBoolean r0 = r14.A05
            boolean r0 = r0.compareAndSet(r7, r1)
            if (r0 == 0) goto L_0x00d7
            X.136 r2 = r14.A06
            r12.A01 = r14
            r12.A02 = r15
            r12.A03 = r11
            r12.A04 = r2
            r12.A06 = r6
            r12.A00 = r7
            java.lang.Object r0 = X.136.A00(r12, r2)
            if (r0 == r5) goto L_0x00d9
            r10 = r14
        L_0x0075:
            X.MTM r0 = r10.cdlProviderInstance     // Catch:{ all -> 0x00cf }
            if (r0 != 0) goto L_0x00d4
            com.facebook.commonavatarliveediting.api.CdlProviderHolderRegistry r8 = r10.A00     // Catch:{ all -> 0x00cf }
            if (r8 != 0) goto L_0x0087
            java.lang.String r0 = "cdlProviderHolderRegistry"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x00cf }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0     // Catch:{ all -> 0x00cf }
        L_0x0087:
            boolean r13 = X.AnonymousClass7TF.A1P(r6)
            r12.A01 = r10     // Catch:{ all -> 0x00cf }
            r12.A02 = r2     // Catch:{ all -> 0x00cf }
            r12.A03 = r3     // Catch:{ all -> 0x00cf }
            r12.A04 = r3     // Catch:{ all -> 0x00cf }
            r12.A00 = r4     // Catch:{ all -> 0x00cf }
            java.lang.Object r8 = r8.A00(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x00cf }
            if (r8 != r5) goto L_0x009f
            return r5
        L_0x009c:
            X.0eS.A00(r8)     // Catch:{ all -> 0x00cf }
        L_0x009f:
            X.MTM r8 = (X.MTM) r8     // Catch:{ all -> 0x00cf }
            java.util.concurrent.atomic.AtomicBoolean r0 = r10.A05     // Catch:{ all -> 0x00cf }
            boolean r0 = r0.get()     // Catch:{ all -> 0x00cf }
            if (r0 != 0) goto L_0x00d4
            monitor-enter(r10)     // Catch:{ all -> 0x00cf }
            r10.cdlProviderInstance = r8     // Catch:{ all -> 0x00cc }
            X.Oqi r0 = new X.Oqi     // Catch:{ all -> 0x00cc }
            r0.<init>(r10, r1)     // Catch:{ all -> 0x00cc }
            X.0bo[] r1 = new X.C59900bo[]{r0}     // Catch:{ all -> 0x00cc }
            X.0QV r0 = new X.0QV     // Catch:{ all -> 0x00cc }
            r0.<init>(r1)     // Catch:{ all -> 0x00cc }
            r10.A01 = r0     // Catch:{ all -> 0x00cc }
            X.0b6.A00()     // Catch:{ all -> 0x00cc }
            android.content.Context r0 = r10.A02     // Catch:{ all -> 0x00cc }
            android.content.Context r1 = r0.getApplicationContext()     // Catch:{ all -> 0x00cc }
            X.0QV r0 = r10.A01     // Catch:{ all -> 0x00cc }
            X.0b6.A02(r1, r0)     // Catch:{ all -> 0x00cc }
            monitor-exit(r10)     // Catch:{ all -> 0x00cf }
            goto L_0x00d4
        L_0x00cc:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x00cf }
            throw r0     // Catch:{ all -> 0x00cf }
        L_0x00cf:
            r0 = move-exception
            r2.A05(r3)
            throw r0
        L_0x00d4:
            r2.A05(r3)
        L_0x00d7:
            X.0gF r5 = X.C60340gF.A00
        L_0x00d9:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.commonavatarliveediting.prefetch.CommonCdlProviderHolder.A00(X.UKz, X.Vl1, X.4D7, boolean):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        0qQ.A0B(obj, 0);
        if (obj == C62470KgL.SUCCEEDED) {
            CdlProviderHolderRegistry cdlProviderHolderRegistry = this.A00;
            if (cdlProviderHolderRegistry == null) {
                0qQ.A0F("cdlProviderHolderRegistry");
                throw AnonymousClass00P.createAndThrow();
            }
            boolean z = this.requiresRAMCacheForCDL.get();
            if (!z) {
                Set set = (Set) AnonymousClass7TE.A14(cdlProviderHolderRegistry.A01);
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator it = set.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        CommonCdlProviderHolder commonCdlProviderHolder = (CommonCdlProviderHolder) JTR.A10(it);
                        if (commonCdlProviderHolder != null && commonCdlProviderHolder.requiresRAMCacheForCDL.get()) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
            }
            cdlProviderHolderRegistry.A00.A02(z);
        }
        for (Object A1W : this.A04) {
            C51965G9l.A1W(A1W, obj);
        }
        return C60340gF.A00;
    }

    public CommonCdlProviderHolder(Context context, IgCdlProviderBuilder igCdlProviderBuilder) {
        this.A03 = igCdlProviderBuilder;
        this.A02 = context;
    }
}

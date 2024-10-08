package com.instagram.ar.core.discovery.minigallery.services;

import X.0qQ;
import android.content.Context;
import com.instagram.ar.core.discovery.minigallery.persistence.MiniGalleryCategoriesRepository;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

public final class MiniGalleryCategoriesService {
    public final long A00 = TimeUnit.DAYS.toMillis(90);
    public final Context A01;
    public final MiniGalleryCategoriesRepository A02;
    public final UserSession A03;

    /* JADX WARNING: type inference failed for: r5v1, types: [X.9JU, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.ar.core.discovery.minigallery.services.MiniGalleryCategoriesService r6, X.AnonymousClass849 r7, X.AnonymousClass4D7 r8) {
        /*
            r3 = 6
            boolean r0 = X.AnonymousClass9JU.A00(r3, r8)
            if (r0 == 0) goto L_0x0045
            r5 = r8
            X.9JU r5 = (X.AnonymousClass9JU) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0045
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r5.A01
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x0035
            if (r0 != r3) goto L_0x0053
            X.0eS.A00(r1)
        L_0x0023:
            X.7iT r1 = (X.C338747iT) r1
            java.util.List r0 = r1.A01
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x004d
            X.9hl r0 = X.C384709hl.A00
            X.5sO r4 = new X.5sO
            r4.<init>(r0)
            return r4
        L_0x0035:
            X.0eS.A00(r1)
            com.instagram.ar.core.discovery.minigallery.persistence.MiniGalleryCategoriesRepository r2 = r6.A02
            long r0 = r6.A00
            r5.A00 = r3
            java.lang.Object r1 = r2.A00(r7, r5, r0)
            if (r1 != r4) goto L_0x0023
            return r4
        L_0x0045:
            r0 = 42
            X.9JU r5 = new X.9JU
            r5.<init>(r6, r8, r3, r0)
            goto L_0x0015
        L_0x004d:
            X.3Ih r4 = new X.3Ih
            r4.<init>(r1)
            return r4
        L_0x0053:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.discovery.minigallery.services.MiniGalleryCategoriesService.A00(com.instagram.ar.core.discovery.minigallery.services.MiniGalleryCategoriesService, X.849, X.4D7):java.lang.Object");
    }

    public /* synthetic */ MiniGalleryCategoriesService(Context context, UserSession userSession) {
        MiniGalleryCategoriesRepository miniGalleryCategoriesRepository = new MiniGalleryCategoriesRepository(userSession);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(context, 2);
        this.A03 = userSession;
        this.A01 = context;
        this.A02 = miniGalleryCategoriesRepository;
    }
}

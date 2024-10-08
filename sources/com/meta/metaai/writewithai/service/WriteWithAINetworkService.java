package com.meta.metaai.writewithai.service;

import X.0Df;
import X.0qQ;
import X.1vm;
import X.1vn;
import X.1vo;
import X.2IV;
import X.AnonymousClass7TE;
import X.C41845B3m;
import X.C56131HtJ;
import X.C56316HwT;
import X.C57594IdL;
import X.C57595IdM;
import X.JMY;
import android.app.Application;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.meta.foa.session.FoaUserSession;

public final class WriteWithAINetworkService {
    public final Application A00;
    public final 1vo A01;
    public final FoaUserSession A02;

    public static final 2IV A00(C56131HtJ htJ) {
        JMY jmy = htJ.A00;
        if (jmy instanceof C57594IdL) {
            2IV r3 = new 2IV();
            2IV r2 = new 2IV();
            r2.A05("media_urls", ((C57594IdL) jmy).A00);
            r3.A06(r2, "fb_video_context");
            return r3;
        } else if (jmy instanceof C57595IdM) {
            2IV r32 = new 2IV();
            C57595IdM idM = (C57595IdM) jmy;
            0Df A03 = C41845B3m.A03(GraphQlCallInput.A02, idM.A00, "image_url");
            0Df.A00(A03, idM.A01, "text");
            r32.A02().A0E(A03, "ig_stories_context");
            return r32;
        } else {
            throw AnonymousClass7TE.A1K();
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.Il7, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C56568I1x r10, java.lang.String r11, java.lang.String r12, X.AnonymousClass4D7 r13) {
        /*
            r9 = this;
            r3 = 12
            boolean r0 = X.C58075Il7.A02(r3, r13)
            if (r0 == 0) goto L_0x0095
            r4 = r13
            X.Il7 r4 = (X.C58075Il7) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0095
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A01
            X.1Hj r6 = X.1Hj.A02
            int r0 = r4.A00
            r5 = 1
            if (r0 == 0) goto L_0x0035
            if (r0 != r5) goto L_0x00b2
            X.0eS.A00(r1)
        L_0x0024:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00a0
            java.lang.Object r0 = X.C51975G9x.A0f(r1)
            if (r0 == 0) goto L_0x009e
            X.3Ih r6 = X.C41845B3m.A0d(r0)
            return r6
        L_0x0035:
            X.0eS.A00(r1)
            X.1vo r3 = r9.A01
            java.lang.Class<X.HuF> r0 = X.C56186HuF.class
            java.lang.Object r7 = X.C41847B3o.A16(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00b7 }
            X.IIC r7 = (X.IIC) r7     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00b7 }
            X.HtJ r8 = r10.A02
            X.2IV r1 = A00(r8)
            X.2IS r2 = r7.A00
            java.lang.String r0 = "context"
            r2.A00(r1, r0)
            r7.A01 = r5
            java.lang.Integer r0 = r10.A05
            java.lang.String r1 = X.I3J.A01(r0)
            java.lang.String r0 = "target_surface"
            r2.A04(r0, r1)
            r7.A02 = r5
            java.lang.String r1 = r10.A07
            java.lang.String r0 = "surface_session_id"
            r2.A04(r0, r1)
            java.lang.String r1 = r8.A02
            java.lang.String r0 = "initial_content"
            r2.A04(r0, r1)
            java.lang.String r0 = "prompt"
            r2.A04(r0, r12)
            int r0 = r10.A00
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            java.lang.String r0 = "output_quantity"
            r2.A03(r0, r1)
            java.lang.String r0 = "prompt_request_id"
            r2.A04(r0, r11)
            com.facebook.pando.PandoGraphQLRequest r2 = r7.build()
            r0 = 0
            X.1Ef r0 = r2.setMaxToleratedCacheAgeMs(r0)
            r4.A00 = r5
            java.lang.Object r1 = X.C55228HeJ.A00(r3, r0, r4)
            if (r1 != r6) goto L_0x0024
            return r6
        L_0x0095:
            r0 = 42
            X.Il7 r4 = new X.Il7
            r4.<init>((java.lang.Object) r9, (X.AnonymousClass4D7) r13, (int) r3, (int) r0)
            goto L_0x0016
        L_0x009e:
            r0 = 0
            goto L_0x00a8
        L_0x00a0:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00ad
            X.5sO r1 = (X.C297815sO) r1
            java.lang.Object r0 = r1.A00
        L_0x00a8:
            X.5sO r6 = X.C41845B3m.A0c(r0)
            return r6
        L_0x00ad:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00b2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00b7:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.writewithai.service.WriteWithAINetworkService.A01(X.I1x, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.Il7, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.C56568I1x r9, X.AnonymousClass4D7 r10) {
        /*
            r8 = this;
            r3 = 11
            boolean r0 = X.C58075Il7.A02(r3, r10)
            if (r0 == 0) goto L_0x0071
            r4 = r10
            X.Il7 r4 = (X.C58075Il7) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0071
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A01
            X.1Hj r6 = X.1Hj.A02
            int r0 = r4.A00
            r5 = 1
            if (r0 == 0) goto L_0x0035
            if (r0 != r5) goto L_0x008d
            X.0eS.A00(r1)
        L_0x0024:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x007b
            java.lang.Object r0 = X.C51975G9x.A0f(r1)
            if (r0 == 0) goto L_0x0079
            X.3Ih r6 = X.C41845B3m.A0d(r0)
            return r6
        L_0x0035:
            X.0eS.A00(r1)
            X.1vo r3 = r8.A01
            java.lang.Class<X.HuI> r0 = X.C56189HuI.class
            java.lang.Object r7 = X.C41847B3o.A16(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0092 }
            X.II6 r7 = (X.II6) r7     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0092 }
            java.lang.Integer r0 = r9.A05
            java.lang.String r1 = X.I3J.A01(r0)
            X.2IS r2 = r7.A00
            java.lang.String r0 = "target_surface"
            r2.A04(r0, r1)
            r7.A03 = r5
            X.HtJ r0 = r9.A02
            X.2IV r1 = A00(r0)
            java.lang.String r0 = "context"
            r2.A00(r1, r0)
            r7.A02 = r5
            X.1Ef r2 = r7.build()
            r0 = 0
            X.1Ef r0 = r2.setMaxToleratedCacheAgeMs(r0)
            r4.A00 = r5
            java.lang.Object r1 = X.C55228HeJ.A00(r3, r0, r4)
            if (r1 != r6) goto L_0x0024
            return r6
        L_0x0071:
            r0 = 42
            X.Il7 r4 = new X.Il7
            r4.<init>((java.lang.Object) r8, (X.AnonymousClass4D7) r10, (int) r3, (int) r0)
            goto L_0x0016
        L_0x0079:
            r0 = 0
            goto L_0x0083
        L_0x007b:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0088
            X.5sO r1 = (X.C297815sO) r1
            java.lang.Object r0 = r1.A00
        L_0x0083:
            X.5sO r6 = X.C41845B3m.A0c(r0)
            return r6
        L_0x0088:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x008d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0092:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.writewithai.service.WriteWithAINetworkService.A02(X.I1x, X.4D7):java.lang.Object");
    }

    public /* synthetic */ WriteWithAINetworkService(Application application, FoaUserSession foaUserSession) {
        1vn A012 = 1vm.A01(C56316HwT.A00(foaUserSession));
        0qQ.A0B(A012, 3);
        this.A00 = application;
        this.A02 = foaUserSession;
        this.A01 = A012;
    }
}

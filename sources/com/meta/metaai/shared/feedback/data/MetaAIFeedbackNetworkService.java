package com.meta.metaai.shared.feedback.data;

import X.1vm;
import X.1vn;
import X.1vo;
import X.AnonymousClass7TG;
import X.C56316HwT;
import android.app.Application;
import com.meta.foa.session.FoaUserSession;

public final class MetaAIFeedbackNetworkService {
    public final Application A00;
    public final 1vo A01;
    public final FoaUserSession A02;

    /* JADX WARNING: type inference failed for: r2v1, types: [X.Il7, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, X.AnonymousClass4D7 r13) {
        /*
            r7 = this;
            r4 = 5
            boolean r0 = X.C58075Il7.A02(r4, r13)
            if (r0 == 0) goto L_0x007b
            r2 = r13
            X.Il7 r2 = (X.C58075Il7) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x007b
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x0015:
            java.lang.Object r1 = r2.A01
            X.1Hj r4 = X.1Hj.A02
            int r0 = r2.A00
            r3 = 1
            if (r0 == 0) goto L_0x0034
            if (r0 != r3) goto L_0x0097
            X.0eS.A00(r1)
        L_0x0023:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0085
            java.lang.Object r0 = X.C51975G9x.A0f(r1)
            if (r0 == 0) goto L_0x0083
            X.3Ih r4 = X.C41845B3m.A0d(r0)
            return r4
        L_0x0034:
            X.0eS.A00(r1)
            X.1vo r1 = r7.A01
            java.lang.Class<X.HuC> r0 = X.C56183HuC.class
            java.lang.Object r5 = X.C41847B3o.A16(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x009c }
            X.IIE r5 = (X.IIE) r5     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x009c }
            X.2IS r6 = r5.A00
            java.lang.String r0 = "metagen_request_id"
            boolean r0 = X.C41848B3p.A1Z(r6, r0, r8)
            r5.A03 = r0
            java.lang.String r0 = "metagen_response_id"
            boolean r0 = X.C41848B3p.A1Z(r6, r0, r9)
            r5.A04 = r0
            java.lang.String r0 = "feedback_kind"
            boolean r0 = X.C41848B3p.A1Z(r6, r0, r10)
            r5.A01 = r0
            java.lang.String r0 = "intent_task"
            boolean r0 = X.C41848B3p.A1Z(r6, r0, r11)
            r5.A02 = r0
            java.lang.String r0 = "surface"
            boolean r0 = X.C41848B3p.A1Z(r6, r0, r12)
            r5.A05 = r0
            com.facebook.pando.PandoGraphQLRequest r0 = r5.build()
            X.0qQ.A07(r0)
            r2.A00 = r3
            java.lang.Object r1 = X.C55228HeJ.A00(r1, r0, r2)
            if (r1 != r4) goto L_0x0023
            return r4
        L_0x007b:
            r0 = 42
            X.Il7 r2 = new X.Il7
            r2.<init>((java.lang.Object) r7, (X.AnonymousClass4D7) r13, (int) r4, (int) r0)
            goto L_0x0015
        L_0x0083:
            r0 = 0
            goto L_0x008d
        L_0x0085:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0092
            X.5sO r1 = (X.C297815sO) r1
            java.lang.Object r0 = r1.A00
        L_0x008d:
            X.5sO r4 = X.C41845B3m.A0c(r0)
            return r4
        L_0x0092:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0097:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x009c:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.shared.feedback.data.MetaAIFeedbackNetworkService.A00(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    public /* synthetic */ MetaAIFeedbackNetworkService(Application application, FoaUserSession foaUserSession) {
        1vn A012 = 1vm.A01(C56316HwT.A00(foaUserSession));
        AnonymousClass7TG.A1P(application, A012);
        this.A00 = application;
        this.A02 = foaUserSession;
        this.A01 = A012;
    }
}

package com.meta.metaai.shared.feedback.data;

import android.app.Application;
import com.meta.foa.session.FoaUserSession;

public final class FeedbackRepository {
    public final Application A00;
    public final FoaUserSession A01;
    public final MetaAIFeedbackNetworkService A02;

    /* JADX WARNING: type inference failed for: r12v1, types: [X.Il7, X.4D7] */
    /* JADX WARNING: type inference failed for: r12v4 */
    /* JADX WARNING: type inference failed for: r12v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r14, java.lang.String r15, java.lang.String r16, X.AnonymousClass4D7 r17) {
        /*
            r13 = this;
            r3 = 4
            r4 = r17
            boolean r0 = X.C58075Il7.A02(r3, r4)
            if (r0 == 0) goto L_0x007d
            r12 = r4
            X.Il7 r12 = (X.C58075Il7) r12
            int r2 = r12.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x007d
            int r2 = r2 - r1
            r12.A00 = r2
        L_0x0017:
            java.lang.Object r2 = r12.A01
            X.1Hj r1 = X.1Hj.A02
            int r0 = r12.A00
            r5 = 1
            if (r0 == 0) goto L_0x0067
            if (r0 != r5) goto L_0x0093
            X.0eS.A00(r2)
        L_0x0025:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x005e
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r4 = r2.A00
            X.3lr r4 = (X.C250663lr) r4
            java.lang.Class<X.QTv> r3 = X.C7706QTv.class
            r2 = 0
            r0 = 107(0x6b, float:1.5E-43)
            java.lang.String r1 = X.Pxd.A00(r0)
            r0 = 1882557464(0x70358c18, float:2.247446E29)
            X.3lr r1 = r4.getOptionalTreeField(r2, r1, r3, r0)
            if (r1 == 0) goto L_0x005c
            java.lang.String r0 = "submitted"
            boolean r0 = r1.getCoercedBooleanField(r2, r0)
            if (r0 != r5) goto L_0x005c
        L_0x004b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            X.3Ih r2 = X.C41845B3m.A0d(r0)
        L_0x0053:
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0085
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r0 = r2.A00
            return r0
        L_0x005c:
            r5 = 0
            goto L_0x004b
        L_0x005e:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0053
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0067:
            X.0eS.A00(r2)
            com.meta.metaai.shared.feedback.data.MetaAIFeedbackNetworkService r6 = r13.A02
            r12.A00 = r5
            java.lang.String r10 = "WRITE_WITH_AI"
            java.lang.String r11 = "FOA_INTENTS"
            r7 = r14
            r8 = r15
            r9 = r16
            java.lang.Object r2 = r6.A00(r7, r8, r9, r10, r11, r12)
            if (r2 != r1) goto L_0x0025
            return r1
        L_0x007d:
            r0 = 42
            X.Il7 r12 = new X.Il7
            r12.<init>((java.lang.Object) r13, (X.AnonymousClass4D7) r4, (int) r3, (int) r0)
            goto L_0x0017
        L_0x0085:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x008e
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            return r0
        L_0x008e:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0093:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.shared.feedback.data.FeedbackRepository.A00(java.lang.String, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    public /* synthetic */ FeedbackRepository(Application application, FoaUserSession foaUserSession) {
        MetaAIFeedbackNetworkService metaAIFeedbackNetworkService = new MetaAIFeedbackNetworkService(application, foaUserSession);
        this.A00 = application;
        this.A01 = foaUserSession;
        this.A02 = metaAIFeedbackNetworkService;
    }
}

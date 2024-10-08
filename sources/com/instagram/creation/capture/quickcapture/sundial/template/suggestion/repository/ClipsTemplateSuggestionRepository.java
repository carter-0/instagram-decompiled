package com.instagram.creation.capture.quickcapture.sundial.template.suggestion.repository;

import X.JTR;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

public final class ClipsTemplateSuggestionRepository {
    public final long A00 = JTR.A0N(TimeUnit.DAYS);
    public final UserSession A01;

    /* JADX WARNING: type inference failed for: r3v1, types: [X.ME8, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r7, X.AnonymousClass4D7 r8) {
        /*
            r6 = this;
            r4 = 27
            boolean r0 = X.ME8.A03(r4, r8)
            if (r0 == 0) goto L_0x0089
            r3 = r8
            X.ME8 r3 = (X.ME8) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0089
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r3.A01
            X.1Hj r4 = X.1Hj.A02
            int r1 = r3.A00
            r0 = 1
            if (r1 == 0) goto L_0x0038
            if (r1 != r0) goto L_0x0091
            X.0eS.A00(r2)
        L_0x0024:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            r4 = 0
            if (r0 == 0) goto L_0x0037
            java.lang.Object r0 = X.C51972G9s.A0m(r2)
            X.JtJ r0 = (X.C60899JtJ) r0
            X.4sL r0 = r0.A00
            if (r0 == 0) goto L_0x0037
            X.1Xj r4 = r0.A00
        L_0x0037:
            return r4
        L_0x0038:
            X.0eS.A00(r2)
            r3.A00 = r0
            com.instagram.common.session.UserSession r0 = r6.A01
            X.1NY r5 = X.DbU.A0M(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r5.A07(r0)
            long r0 = r6.A00
            r5.A01 = r0
            java.lang.String r0 = "clips/suggested_template"
            java.lang.String r0 = X.002.A0R(r0, r7)
            r5.A0A = r0
            r0 = 0
            java.lang.Long r2 = X.C51971G9r.A0n(r0, r7)
            r5.A04()
            r5.A02()
            java.lang.String r0 = "api/v1/clips/suggested_template/"
            r5.A0A(r0)
            java.lang.Class<X.K0f> r1 = X.C61270K0f.class
            java.lang.Class<X.LH0> r0 = X.LH0.class
            r5.A0Q(r1, r0)
            if (r2 == 0) goto L_0x0076
            long r1 = r2.longValue()
            java.lang.String r0 = "audio_id"
            r5.A0D(r0, r1)
        L_0x0076:
            X.1OC r1 = r5.A0M()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.GetSuggestedTemplateResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.GetSuggestedTemplateResponse>>"
            X.0qQ.A0C(r1, r0)
            r0 = 1166333110(0x4584d4b6, float:4250.589)
            java.lang.Object r2 = r1.A00(r0, r3)
            if (r2 != r4) goto L_0x0024
            return r4
        L_0x0089:
            r0 = 42
            X.ME8 r3 = new X.ME8
            r3.<init>(r6, r8, r4, r0)
            goto L_0x0016
        L_0x0091:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.template.suggestion.repository.ClipsTemplateSuggestionRepository.A00(java.lang.String, X.4D7):java.lang.Object");
    }

    public ClipsTemplateSuggestionRepository(UserSession userSession) {
        this.A01 = userSession;
    }
}

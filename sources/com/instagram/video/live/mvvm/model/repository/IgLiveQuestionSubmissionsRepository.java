package com.instagram.video.live.mvvm.model.repository;

import X.02z;
import X.05G;
import X.10b;
import X.AnonymousClass0Ud;
import X.AnonymousClass1EO;
import X.AnonymousClass9I5;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveQuestionsApi;

public final class IgLiveQuestionSubmissionsRepository {
    public static final String A07 = IgLiveQuestionSubmissionsRepository.class.getName();
    public int A00;
    public AnonymousClass1EO A01;
    public String A02;
    public final UserSession A03;
    public final IgLiveQuestionsApi A04;
    public final 05G A05;
    public final AnonymousClass0Ud A06;

    /* JADX WARNING: type inference failed for: r6v1, types: [X.JUN, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass4D7 r8, boolean r9) {
        /*
            r7 = this;
            r3 = 7
            boolean r0 = X.JUN.A00(r3, r8)
            if (r0 == 0) goto L_0x0071
            r6 = r8
            X.JUN r6 = (X.JUN) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0071
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0015:
            java.lang.Object r5 = r6.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r6.A00
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L_0x005a
            if (r0 != r3) goto L_0x007d
            boolean r9 = r6.A04
            java.lang.Object r1 = r6.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveQuestionSubmissionsRepository r1 = (com.instagram.video.live.mvvm.model.repository.IgLiveQuestionSubmissionsRepository) r1
            X.0eS.A00(r5)
        L_0x002a:
            X.3Ii r5 = (X.C239803Ii) r5
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0051
            X.3Ih r5 = (X.C239793Ih) r5
            java.lang.Object r4 = r5.A00
        L_0x0034:
            r0 = r4
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0050
            X.05G r3 = r1.A05
            java.lang.Object r0 = r3.getValue()
            X.9I5 r0 = (X.AnonymousClass9I5) r0
            int r2 = r0.A00
            r1 = 2
            X.9I5 r0 = new X.9I5
            r0.<init>(r9, r2, r1)
            r3.Epw(r0)
        L_0x0050:
            return r4
        L_0x0051:
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0077
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            goto L_0x0034
        L_0x005a:
            X.0eS.A00(r5)
            java.lang.String r1 = r7.A02
            if (r1 == 0) goto L_0x0085
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveQuestionsApi r0 = r7.A04
            r6.A01 = r7
            r6.A04 = r9
            r6.A00 = r3
            java.lang.Object r5 = r0.A07(r1, r6, r9)
            if (r5 == r4) goto L_0x0089
            r1 = r7
            goto L_0x002a
        L_0x0071:
            X.JUN r6 = new X.JUN
            r6.<init>(r7, r8, r3)
            goto L_0x0015
        L_0x0077:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x007d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0085:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
        L_0x0089:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveQuestionSubmissionsRepository.A00(X.4D7, boolean):java.lang.Object");
    }

    public final void A01() {
        05G r3 = this.A05;
        r3.Epw(new AnonymousClass9I5(((AnonymousClass9I5) r3.getValue()).A01, 0, 2));
    }

    public /* synthetic */ IgLiveQuestionSubmissionsRepository(UserSession userSession) {
        IgLiveQuestionsApi igLiveQuestionsApi = new IgLiveQuestionsApi(userSession);
        this.A03 = userSession;
        this.A04 = igLiveQuestionsApi;
        02z r0 = new 02z(new AnonymousClass9I5(false, 0, 2));
        this.A05 = r0;
        this.A06 = 10b.A03(r0);
    }
}

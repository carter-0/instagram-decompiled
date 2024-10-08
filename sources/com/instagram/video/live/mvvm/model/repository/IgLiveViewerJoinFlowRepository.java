package com.instagram.video.live.mvvm.model.repository;

import X.02z;
import X.05G;
import X.0qQ;
import X.10b;
import X.AnonymousClass0Ud;
import X.AnonymousClass1Nd;
import X.C51967G9n;
import X.C51970G9q;
import X.C62160KbI;
import X.C62163KbL;
import X.LgI;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveJoinRequestsApi;

public final class IgLiveViewerJoinFlowRepository {
    public LgI A00;
    public C62160KbI A01;
    public final UserSession A02;
    public final IgLiveJoinRequestsApi A03;
    public final 05G A04;
    public final 05G A05;
    public final AnonymousClass0Ud A06;
    public final AnonymousClass0Ud A07;

    public final void A04() {
        LgI lgI = this.A00;
        if (lgI != null) {
            AnonymousClass1Nd.A00(this.A02).A02(lgI, C62163KbL.class);
            this.A00 = null;
        }
    }

    public /* synthetic */ IgLiveViewerJoinFlowRepository(UserSession userSession) {
        IgLiveJoinRequestsApi igLiveJoinRequestsApi = new IgLiveJoinRequestsApi(userSession);
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A03 = igLiveJoinRequestsApi;
        02z A10 = C51970G9q.A10(false);
        this.A04 = A10;
        this.A06 = 10b.A03(A10);
        02z A0u = C51967G9n.A0u();
        this.A05 = A0u;
        this.A07 = 10b.A03(A0u);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDr, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository r5, java.lang.String r6, X.AnonymousClass4D7 r7) {
        /*
            r3 = 21
            boolean r0 = X.C66139MDr.A01(r3, r7)
            if (r0 == 0) goto L_0x004a
            r4 = r7
            X.MDr r4 = (X.C66139MDr) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004a
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A02
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x0030
            if (r0 != r1) goto L_0x0050
            java.lang.Object r5 = r4.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository r5 = (com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository) r5
            X.0eS.A00(r3)
        L_0x0028:
            X.05G r0 = r5.A04
            X.JTR.A1V(r0)
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x0030:
            X.0eS.A00(r3)
            X.05G r0 = r5.A04
            boolean r0 = X.DbX.A1b(r0)
            if (r0 == 0) goto L_0x0028
            if (r6 == 0) goto L_0x0028
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveJoinRequestsApi r0 = r5.A03
            r4.A01 = r5
            r4.A00 = r1
            java.lang.Object r0 = r0.A00(r6, r4)
            if (r0 != r2) goto L_0x0028
            return r2
        L_0x004a:
            X.MDr r4 = new X.MDr
            r4.<init>(r5, r7, r3)
            goto L_0x0016
        L_0x0050:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository.A00(com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME0, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.lang.String r6, java.lang.String r7, java.lang.String r8, X.AnonymousClass4D7 r9) {
        /*
            r5 = this;
            r3 = 33
            boolean r0 = X.ME0.A02(r3, r9)
            if (r0 == 0) goto L_0x007c
            r4 = r9
            X.ME0 r4 = (X.ME0) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x007c
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A05
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x0057
            if (r0 != r2) goto L_0x0082
            java.lang.Object r8 = r4.A04
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r4.A03
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r4.A02
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r3 = r4.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository r3 = (com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository) r3
            X.0eS.A00(r1)
        L_0x0034:
            if (r7 == 0) goto L_0x0042
            X.05G r2 = r3.A05
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            X.Kba r0 = new X.Kba
            r0.<init>(r1, r6, r7, r8)
            r2.Epw(r0)
        L_0x0042:
            X.KbO r2 = new X.KbO
            r2.<init>(r3, r6)
            com.instagram.common.session.UserSession r0 = r3.A02
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Class<X.KbU> r0 = X.C62172KbU.class
            r1.A01(r2, r0)
            r3.A01 = r2
        L_0x0054:
            X.0gF r3 = X.C60340gF.A00
        L_0x0056:
            return r3
        L_0x0057:
            X.0eS.A00(r1)
            X.KbI r1 = r5.A01
            r0 = 0
            if (r1 == 0) goto L_0x007a
            java.lang.String r1 = r1.A00
        L_0x0061:
            boolean r1 = X.0qQ.A0K(r1, r6)
            if (r1 != 0) goto L_0x0054
            X.KbI r1 = r5.A01
            if (r1 == 0) goto L_0x006d
            java.lang.String r0 = r1.A00
        L_0x006d:
            X.ME0.A00(r5, r6, r7, r8, r4)
            r4.A00 = r2
            java.lang.Object r0 = r5.A02(r0, r4)
            if (r0 == r3) goto L_0x0056
            r3 = r5
            goto L_0x0034
        L_0x007a:
            r1 = r0
            goto L_0x0061
        L_0x007c:
            X.ME0 r4 = new X.ME0
            r4.<init>(r5, r9, r3)
            goto L_0x0016
        L_0x0082:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository.A01(java.lang.String, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDr, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.lang.String r7, X.AnonymousClass4D7 r8) {
        /*
            r6 = this;
            r3 = 22
            boolean r0 = X.C66139MDr.A01(r3, r8)
            if (r0 == 0) goto L_0x0055
            r5 = r8
            X.MDr r5 = (X.C66139MDr) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0055
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 != r3) goto L_0x005b
            java.lang.Object r0 = r5.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository r0 = (com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository) r0
            X.0eS.A00(r1)
        L_0x0028:
            X.05G r1 = r0.A05
            r0 = 0
            r1.Epw(r0)
            X.0gF r4 = X.C60340gF.A00
        L_0x0030:
            return r4
        L_0x0031:
            X.0eS.A00(r1)
            X.KbI r2 = r6.A01
            if (r2 == 0) goto L_0x0046
            com.instagram.common.session.UserSession r0 = r6.A02
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Class<X.KbU> r0 = X.C62172KbU.class
            r1.A02(r2, r0)
            r0 = 0
            r6.A01 = r0
        L_0x0046:
            r6.A04()
            r5.A01 = r6
            r5.A00 = r3
            java.lang.Object r0 = A00(r6, r7, r5)
            if (r0 == r4) goto L_0x0030
            r0 = r6
            goto L_0x0028
        L_0x0055:
            X.MDr r5 = new X.MDr
            r5.<init>(r6, r8, r3)
            goto L_0x0016
        L_0x005b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository.A02(java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDr, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(java.lang.String r8, X.AnonymousClass4D7 r9) {
        /*
            r7 = this;
            r3 = 23
            boolean r0 = X.C66139MDr.A01(r3, r9)
            if (r0 == 0) goto L_0x00b5
            r5 = r9
            X.MDr r5 = (X.C66139MDr) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b5
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r5.A02
            X.1Hj r6 = X.1Hj.A02
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L_0x0080
            if (r0 != r4) goto L_0x00d3
            java.lang.Object r1 = r5.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository r1 = (com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository) r1
            X.0eS.A00(r3)
        L_0x0028:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            r2 = 0
            if (r0 == 0) goto L_0x0077
            X.05G r1 = r1.A04
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r1.Epw(r0)
            X.0eP r0 = X.AnonymousClass7TE.A1L(r0, r2)
            X.3Ih r3 = X.C41845B3m.A0d(r0)
        L_0x0040:
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x006a
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00ce
            X.4dm r1 = X.JTP.A0N(r3)
            boolean r0 = r1 instanceof X.C268674do
            if (r0 == 0) goto L_0x0075
            X.4do r1 = (X.C268674do) r1
            if (r1 == 0) goto L_0x0075
            java.lang.Object r0 = r1.A00
            X.1XT r0 = (X.AnonymousClass1XT) r0
        L_0x0058:
            java.lang.Boolean r1 = X.AnonymousClass7TE.A0u()
            if (r0 == 0) goto L_0x0073
            java.lang.String r0 = r0.getErrorMessage()
        L_0x0062:
            X.0eP r0 = X.AnonymousClass7TE.A1L(r1, r0)
            X.5sO r3 = X.C41845B3m.A0c(r0)
        L_0x006a:
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00bc
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r0 = r3.A00
            return r0
        L_0x0073:
            r0 = r2
            goto L_0x0062
        L_0x0075:
            r0 = r2
            goto L_0x0058
        L_0x0077:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0040
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0080:
            X.0eS.A00(r3)
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveJoinRequestsApi r0 = r7.A03
            r5.A01 = r7
            r5.A00 = r4
            com.instagram.common.session.UserSession r1 = r0.A00
            r0 = 0
            X.0qQ.A0B(r8, r0)
            r3 = 0
            X.1NY r2 = X.AnonymousClass7TG.A0a(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r8}
            java.lang.String r0 = "live/%s/request_to_join/"
            r2.A0K(r0, r1)
            java.lang.Class<X.CF1> r1 = X.CF1.class
            java.lang.Class<X.D2u> r0 = X.C45721D2u.class
            r2.A0O(r3, r1, r0, r4)
            X.1OC r1 = X.DbT.A0U(r2, r4)
            r0 = 1424430875(0x54e7171b, float:7.9402007E12)
            java.lang.Object r3 = r1.A00(r0, r5)
            if (r3 != r6) goto L_0x00b2
            return r6
        L_0x00b2:
            r1 = r7
            goto L_0x0028
        L_0x00b5:
            X.MDr r5 = new X.MDr
            r5.<init>(r7, r9, r3)
            goto L_0x0016
        L_0x00bc:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00c9
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            X.0eP r0 = X.AnonymousClass7TE.A1L(r0, r2)
            return r0
        L_0x00c9:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00ce:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00d3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository.A03(java.lang.String, X.4D7):java.lang.Object");
    }
}

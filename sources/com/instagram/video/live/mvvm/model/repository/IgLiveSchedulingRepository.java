package com.instagram.video.live.mvvm.model.repository;

import X.0qQ;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveSchedulingApi;

public final class IgLiveSchedulingRepository {
    public final UserSession A00;
    public final IgLiveSchedulingApi A01;

    public /* synthetic */ IgLiveSchedulingRepository(UserSession userSession) {
        IgLiveSchedulingApi igLiveSchedulingApi = new IgLiveSchedulingApi(userSession);
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = igLiveSchedulingApi;
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.ME5, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass3NV r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, X.AnonymousClass4D7 r13) {
        /*
            r8 = this;
            r3 = 19
            boolean r0 = X.ME5.A03(r3, r13)
            if (r0 == 0) goto L_0x0056
            r7 = r13
            X.ME5 r7 = (X.ME5) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0056
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r7.A01
            X.1Hj r0 = X.1Hj.A02
            int r2 = r7.A00
            r1 = 1
            if (r2 == 0) goto L_0x0044
            if (r2 != r1) goto L_0x0066
            X.0eS.A00(r3)
        L_0x0024:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x003b
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r0 = r3.A00
            X.3Ih r3 = X.C41845B3m.A0d(r0)
        L_0x0032:
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x005b
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r0 = r3.A00
            return r0
        L_0x003b:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0032
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0044:
            X.0eS.A00(r3)
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveSchedulingApi r2 = r8.A01
            r7.A00 = r1
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            java.lang.Object r3 = r2.A00(r3, r4, r5, r6, r7)
            if (r3 != r0) goto L_0x0024
            return r0
        L_0x0056:
            X.ME5 r7 = X.ME5.A01(r8, r13, r3)
            goto L_0x0016
        L_0x005b:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0061
            r0 = 0
            return r0
        L_0x0061:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0066:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveSchedulingRepository.A00(X.3NV, java.lang.String, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME5, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.AnonymousClass3NV r6, java.lang.String r7, java.lang.String r8, X.AnonymousClass4D7 r9) {
        /*
            r5 = this;
            r3 = 17
            boolean r0 = X.ME5.A03(r3, r9)
            if (r0 == 0) goto L_0x0052
            r4 = r9
            X.ME5 r4 = (X.ME5) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0052
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A01
            X.1Hj r1 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x0044
            if (r0 != r2) goto L_0x0062
            X.0eS.A00(r3)
        L_0x0024:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x003b
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r0 = r3.A00
            X.3Ih r3 = X.C41845B3m.A0d(r0)
        L_0x0032:
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0057
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r1 = r3.A00
            return r1
        L_0x003b:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0032
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0044:
            X.0eS.A00(r3)
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveSchedulingApi r0 = r5.A01
            r4.A00 = r2
            java.lang.Object r3 = r0.A01(r6, r7, r8, r4)
            if (r3 != r1) goto L_0x0024
            return r1
        L_0x0052:
            X.ME5 r4 = X.ME5.A01(r5, r9, r3)
            goto L_0x0016
        L_0x0057:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x005d
            r1 = 0
            return r1
        L_0x005d:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0062:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveSchedulingRepository.A01(X.3NV, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME5, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.lang.String r6, X.AnonymousClass4D7 r7) {
        /*
            r5 = this;
            r3 = 18
            boolean r0 = X.ME5.A03(r3, r7)
            if (r0 == 0) goto L_0x004e
            r4 = r7
            X.ME5 r4 = (X.ME5) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004e
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x0040
            if (r0 != r1) goto L_0x0061
            X.0eS.A00(r3)
        L_0x0024:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0037
            X.3Ih r3 = X.JTT.A0j(r1)
        L_0x002e:
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0053
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r0 = r3.A00
            return r0
        L_0x0037:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x002e
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0040:
            X.0eS.A00(r3)
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveSchedulingApi r0 = r5.A01
            r4.A00 = r1
            java.lang.Object r3 = r0.A02(r6, r4)
            if (r3 != r2) goto L_0x0024
            return r2
        L_0x004e:
            X.ME5 r4 = X.ME5.A01(r5, r7, r3)
            goto L_0x0016
        L_0x0053:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x005c
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            return r0
        L_0x005c:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0061:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveSchedulingRepository.A02(java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME5, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.AnonymousClass4D7 r6) {
        /*
            r5 = this;
            r3 = 20
            boolean r0 = X.ME5.A03(r3, r6)
            if (r0 == 0) goto L_0x005e
            r4 = r6
            X.ME5 r4 = (X.ME5) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005e
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A01
            X.1Hj r1 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x0050
            if (r0 != r2) goto L_0x006e
            X.0eS.A00(r3)
        L_0x0024:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0047
            java.lang.Object r0 = X.C51972G9s.A0m(r3)
            X.4lB r0 = (X.C272674lB) r0
            java.util.List r0 = r0.A00
            java.lang.Object r0 = X.00k.A0I(r0)
            X.4lA r0 = (X.C272664lA) r0
            com.instagram.api.schemas.CanUseCreatorMonetizationProduct r0 = r0.A02
            X.3Ih r3 = X.C41845B3m.A0d(r0)
        L_0x003e:
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0063
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r1 = r3.A00
            return r1
        L_0x0047:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x003e
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0050:
            X.0eS.A00(r3)
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveSchedulingApi r0 = r5.A01
            r4.A00 = r2
            java.lang.Object r3 = r0.A03(r4)
            if (r3 != r1) goto L_0x0024
            return r1
        L_0x005e:
            X.ME5 r4 = X.ME5.A01(r5, r6, r3)
            goto L_0x0016
        L_0x0063:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0069
            r1 = 0
            return r1
        L_0x0069:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x006e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveSchedulingRepository.A03(X.4D7):java.lang.Object");
    }
}

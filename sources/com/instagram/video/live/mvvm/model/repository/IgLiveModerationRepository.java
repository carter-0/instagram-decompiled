package com.instagram.video.live.mvvm.model.repository;

import X.02z;
import X.05G;
import X.0u9;
import X.10b;
import X.1HR;
import X.AnonymousClass0Ud;
import X.AnonymousClass0r6;
import X.AnonymousClass1EO;
import X.AnonymousClass7TE;
import X.C249513ju;
import X.C51970G9q;
import X.DbS;
import X.G9w;
import X.JTQ;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveModerationApi;

public final class IgLiveModerationRepository {
    public AnonymousClass1EO A00;
    public final UserSession A01;
    public final IgLiveModerationApi A02;
    public final C249513ju A03;
    public final AnonymousClass0r6 A04;
    public final 05G A05;
    public final 05G A06;
    public final 05G A07;
    public final AnonymousClass0Ud A08;
    public final AnonymousClass0Ud A09;
    public final AnonymousClass0Ud A0A;

    public /* synthetic */ IgLiveModerationRepository(UserSession userSession) {
        IgLiveModerationApi igLiveModerationApi = new IgLiveModerationApi(userSession);
        this.A01 = userSession;
        this.A02 = igLiveModerationApi;
        02z A10 = DbS.A10(AnonymousClass7TE.A1C());
        this.A07 = A10;
        this.A0A = 10b.A03(A10);
        02z A102 = C51970G9q.A10(false);
        this.A05 = A102;
        this.A08 = 10b.A03(A102);
        02z A0r = JTQ.A0r(0);
        this.A06 = A0r;
        this.A09 = 10b.A03(A0r);
        1HR A0w = G9w.A0w();
        this.A03 = A0w;
        this.A04 = 0u9.A04(A0w);
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDr, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r7, java.lang.String r8, X.AnonymousClass4D7 r9) {
        /*
            r6 = this;
            r3 = 18
            boolean r0 = X.C66139MDr.A01(r3, r9)
            if (r0 == 0) goto L_0x0061
            r5 = r9
            X.MDr r5 = (X.C66139MDr) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0061
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r4 = r5.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L_0x0044
            if (r0 != r2) goto L_0x007f
            java.lang.Object r1 = r5.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository r1 = (com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository) r1
            X.0eS.A00(r4)
        L_0x0028:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x003b
            X.3Ih r4 = X.JTT.A0j(r2)
        L_0x0032:
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0067
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r0 = r4.A00
            return r0
        L_0x003b:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0032
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0044:
            X.0eS.A00(r4)
            X.05G r1 = r6.A06
            int r0 = X.JTR.A0K(r1)
            int r0 = r0 + 1
            X.JTQ.A1N(r1, r0)
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveModerationApi r0 = r6.A02
            r5.A01 = r6
            r5.A00 = r2
            java.lang.Object r4 = r0.A00(r7, r8, r5)
            if (r4 != r3) goto L_0x005f
            return r3
        L_0x005f:
            r1 = r6
            goto L_0x0028
        L_0x0061:
            X.MDr r5 = new X.MDr
            r5.<init>(r6, r9, r3)
            goto L_0x0016
        L_0x0067:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 == 0) goto L_0x007a
            X.05G r1 = r1.A06
            int r0 = X.JTR.A0K(r1)
            int r0 = r0 - r2
            X.JTQ.A1N(r1, r0)
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            return r0
        L_0x007a:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x007f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository.A00(java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDj, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.lang.String r7, java.lang.String r8, X.AnonymousClass4D7 r9) {
        /*
            r6 = this;
            r3 = 8
            boolean r0 = X.C66131MDj.A01(r3, r9)
            if (r0 == 0) goto L_0x0067
            r5 = r9
            X.MDj r5 = (X.C66131MDj) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0067
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r5.A03
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0034
            if (r0 == r1) goto L_0x002a
            if (r0 != r3) goto L_0x006d
            X.0eS.A00(r2)
        L_0x0027:
            X.0gF r4 = X.C60340gF.A00
        L_0x0029:
            return r4
        L_0x002a:
            java.lang.Object r8 = r5.A02
            java.lang.Object r1 = r5.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository r1 = (com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository) r1
            X.0eS.A00(r2)
            goto L_0x0043
        L_0x0034:
            X.0eS.A00(r2)
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveModerationApi r0 = r6.A02
            X.C51966G9m.A1P(r6, r8, r5, r1)
            java.lang.Object r2 = r0.A01(r7, r8, r5)
            if (r2 == r4) goto L_0x0029
            r1 = r6
        L_0x0043:
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x005e
            X.05G r2 = r1.A07
            java.util.List r1 = X.JTO.A16(r2)
            r1.add(r8)
            r0 = 0
            r5.A01 = r0
            r5.A02 = r0
            r5.A00 = r3
            java.lang.Object r0 = r2.emit(r1, r5)
            if (r0 != r4) goto L_0x0027
            return r4
        L_0x005e:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0027
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0067:
            X.MDj r5 = new X.MDj
            r5.<init>(r6, r9, r3)
            goto L_0x0016
        L_0x006d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository.A01(java.lang.String, java.lang.String, X.4D7):java.lang.Object");
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
    public final java.lang.Object A02(java.lang.String r6, java.lang.String r7, X.AnonymousClass4D7 r8) {
        /*
            r5 = this;
            r3 = 11
            boolean r0 = X.ME5.A03(r3, r8)
            if (r0 == 0) goto L_0x004e
            r4 = r8
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
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveModerationApi r0 = r5.A02
            r4.A00 = r1
            java.lang.Object r3 = r0.A03(r6, r7, r4)
            if (r3 != r2) goto L_0x0024
            return r2
        L_0x004e:
            X.ME5 r4 = X.ME5.A01(r5, r8, r3)
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
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository.A02(java.lang.String, java.lang.String, X.4D7):java.lang.Object");
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
    public final java.lang.Object A03(java.lang.String r6, X.AnonymousClass4D7 r7) {
        /*
            r5 = this;
            r3 = 12
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
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveModerationApi r0 = r5.A02
            r4.A00 = r1
            java.lang.Object r3 = r0.A04(r6, r4)
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
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository.A03(java.lang.String, X.4D7):java.lang.Object");
    }
}

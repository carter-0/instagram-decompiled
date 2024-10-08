package com.instagram.wellbeing.upsells.fragment.tagsettings;

import X.0rr;
import X.AnonymousClass0r6;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C239793Ih;
import X.C56154Hth;
import X.C70296O1a;
import X.DbU;
import X.I10;
import X.MUZ;
import com.instagram.common.session.UserSession;

public final class TagSettingsRepository implements MUZ {
    public final UserSession A00;
    public final C56154Hth A01;
    public final I10 A02;

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDs, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* renamed from: A00 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object EK9(X.C69360Nk0 r8, X.C69360Nk0 r9, X.AnonymousClass4D7 r10, boolean r11) {
        /*
            r7 = this;
            r3 = 12
            boolean r0 = X.C66140MDs.A01(r3, r10)
            if (r0 == 0) goto L_0x00b8
            r4 = r10
            X.MDs r4 = (X.C66140MDs) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b8
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A03
            X.1Hj r5 = X.1Hj.A02
            int r0 = r4.A00
            r6 = 1
            if (r0 == 0) goto L_0x007a
            if (r0 != r6) goto L_0x00c4
            boolean r11 = r4.A05
            java.lang.Object r9 = r4.A02
            X.Nk0 r9 = (X.C69360Nk0) r9
            java.lang.Object r4 = r4.A01
            com.instagram.wellbeing.upsells.fragment.tagsettings.TagSettingsRepository r4 = (com.instagram.wellbeing.upsells.fragment.tagsettings.TagSettingsRepository) r4
            X.0eS.A00(r1)
        L_0x002e:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0071
            com.instagram.common.session.UserSession r3 = r4.A00
            com.instagram.user.model.User r2 = X.AnonymousClass7TF.A0Q(r3)
            java.lang.String r1 = r9.A00
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.4Cl r0 = r2.A03
            r0.EOT(r1)
            r2.A0d(r3)
            if (r11 == 0) goto L_0x006b
            X.I10 r0 = r4.A02
            r0.A02()
        L_0x004d:
            X.3Ih r1 = X.C51967G9n.A0d()
        L_0x0051:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0064
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00bf
            if (r11 == 0) goto L_0x0065
            X.I10 r0 = r4.A02
            r0.A01()
        L_0x0060:
            X.5sO r1 = X.DbU.A0f()
        L_0x0064:
            return r1
        L_0x0065:
            X.Hth r0 = r4.A01
            r0.A00()
            goto L_0x0060
        L_0x006b:
            X.Hth r0 = r4.A01
            r0.A01()
            goto L_0x004d
        L_0x0071:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0051
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x007a:
            X.0eS.A00(r1)
            if (r11 != 0) goto L_0x0088
            X.Hth r2 = r7.A01
            java.lang.String r1 = r8.A01
            java.lang.String r0 = r9.A01
            r2.A03(r1, r0)
        L_0x0088:
            com.instagram.common.session.UserSession r0 = r7.A00
            r3 = 0
            X.1NY r2 = X.AnonymousClass7TG.A0a(r0)
            java.lang.String r0 = "usertags/user_tagee_setting/"
            r2.A0A(r0)
            java.lang.String r1 = r9.A00
            java.lang.String r0 = "user_tagee_setting"
            r2.A9m(r0, r1)
            java.lang.Class<X.NGs> r1 = X.NGs.class
            java.lang.Class<X.OQq> r0 = X.C70898OQq.class
            X.1OC r1 = X.DbT.A0R(r3, r2, r1, r0, r6)
            r4.A01 = r7
            r4.A02 = r9
            r4.A05 = r11
            r4.A00 = r6
            r0 = 2008996894(0x77bedc1e, float:7.7421946E33)
            java.lang.Object r1 = r1.A00(r0, r4)
            if (r1 != r5) goto L_0x00b5
            return r5
        L_0x00b5:
            r4 = r7
            goto L_0x002e
        L_0x00b8:
            X.MDs r4 = new X.MDs
            r4.<init>(r7, r10, r3)
            goto L_0x0016
        L_0x00bf:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00c4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.upsells.fragment.tagsettings.TagSettingsRepository.EK9(X.Nk0, X.Nk0, X.4D7, boolean):java.lang.Object");
    }

    public final AnonymousClass0r6 Bt3() {
        Object A0f;
        String AbA = AnonymousClass7TF.A0Q(this.A00).A03.AbA();
        if (AbA != null) {
            A0f = new C239793Ih(C70296O1a.A00(AbA));
        } else {
            A0f = DbU.A0f();
        }
        return new 0rr(A0f);
    }

    public TagSettingsRepository(UserSession userSession, C56154Hth hth, I10 i10) {
        AnonymousClass7TG.A1U(userSession, hth, i10);
        this.A00 = userSession;
        this.A01 = hth;
        this.A02 = i10;
    }
}

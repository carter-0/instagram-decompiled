package com.instagram.wellbeing.upsells.fragment.remixsettings;

import X.15p;
import X.1NY;
import X.AnonymousClass0iw;
import X.AnonymousClass0r6;
import X.AnonymousClass4D7;
import X.AnonymousClass7TG;
import X.C343637qX;
import X.C349197zk;
import X.C47341Dvb;
import X.C51972G9s;
import X.C54660HMr;
import X.C56058Hs7;
import X.C56154Hth;
import X.C58092ImE;
import X.DbT;
import X.F5F;
import X.I10;
import X.MHB;
import X.MUZ;
import com.instagram.common.session.UserSession;

public final class RemixSettingsRepository implements MUZ {
    public final C54660HMr A00;
    public final C56058Hs7 A01;
    public final String A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final C56154Hth A05;
    public final I10 A06;

    /* JADX WARNING: type inference failed for: r3v1, types: [X.JUN, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* renamed from: A00 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object EK9(X.C16548Uwv r8, X.C16548Uwv r9, X.AnonymousClass4D7 r10, boolean r11) {
        /*
            r7 = this;
            r4 = 10
            boolean r0 = X.JUN.A00(r4, r10)
            if (r0 == 0) goto L_0x00b0
            r3 = r10
            X.JUN r3 = (X.JUN) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b0
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r3.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r3.A00
            r5 = 1
            if (r0 == 0) goto L_0x0062
            if (r0 != r5) goto L_0x00bc
            boolean r11 = r3.A04
            java.lang.Object r1 = r3.A01
            com.instagram.wellbeing.upsells.fragment.remixsettings.RemixSettingsRepository r1 = (com.instagram.wellbeing.upsells.fragment.remixsettings.RemixSettingsRepository) r1
            X.0eS.A00(r2)
        L_0x002a:
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0059
            if (r11 == 0) goto L_0x0053
            X.I10 r0 = r1.A06
            r0.A02()
        L_0x0035:
            X.3Ih r2 = X.C51967G9n.A0d()
        L_0x0039:
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x004c
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00b7
            if (r11 == 0) goto L_0x004d
            X.I10 r0 = r1.A06
            r0.A01()
        L_0x0048:
            X.5sO r2 = X.DbU.A0f()
        L_0x004c:
            return r2
        L_0x004d:
            X.Hth r0 = r1.A05
            r0.A00()
            goto L_0x0048
        L_0x0053:
            X.Hth r0 = r1.A05
            r0.A01()
            goto L_0x0035
        L_0x0059:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0039
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0062:
            X.0eS.A00(r2)
            if (r11 != 0) goto L_0x0074
            X.Hth r2 = r7.A05
            java.lang.String r1 = r8.name()
            java.lang.String r0 = r9.name()
            r2.A03(r1, r0)
        L_0x0074:
            int r6 = r9.A00
            com.instagram.common.session.UserSession r1 = r7.A04
            X.0iw r0 = r7.A03
            java.lang.String r2 = r0.getModuleName()
            r0 = 2
            X.0qQ.A0B(r2, r0)
            X.1NY r1 = X.AnonymousClass7TG.A0a(r1)
            java.lang.String r0 = "clips/user/set_mashups_allowed_type/"
            r1.A0A(r0)
            r0 = 3546(0xdda, float:4.969E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.A0C(r0, r6)
            java.lang.String r0 = "container_module"
            X.DbX.A1M(r1, r0, r2)
            X.1OC r1 = X.DbT.A0U(r1, r5)
            r3.A01 = r7
            r3.A04 = r11
            r3.A00 = r5
            r0 = 1588772734(0x5eb2bf7e, float:6.440076E18)
            java.lang.Object r2 = r1.A00(r0, r3)
            if (r2 != r4) goto L_0x00ad
            return r4
        L_0x00ad:
            r1 = r7
            goto L_0x002a
        L_0x00b0:
            X.JUN r3 = new X.JUN
            r3.<init>(r7, r10, r4)
            goto L_0x0016
        L_0x00b7:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00bc:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.upsells.fragment.remixsettings.RemixSettingsRepository.EK9(X.Uwv, X.Uwv, X.4D7, boolean):java.lang.Object");
    }

    public final AnonymousClass0r6 Bt3() {
        1NY A0b = AnonymousClass7TG.A0b(this.A04);
        A0b.A0A("clips/user/privacy_setting_type/");
        return new C343637qX(new C58092ImE(this, (AnonymousClass4D7) null, 0), C349197zk.A00(new MHB(this, (AnonymousClass4D7) null, 43), DbT.A0R((15p) null, A0b, C47341Dvb.class, F5F.class, false).A04(1213026850, 3)));
    }

    public RemixSettingsRepository(AnonymousClass0iw r1, UserSession userSession, C54660HMr hMr, C56154Hth hth, C56058Hs7 hs7, I10 i10, String str) {
        C51972G9s.A1B(userSession, hs7);
        C51972G9s.A1E(i10, r1);
        this.A04 = userSession;
        this.A02 = str;
        this.A00 = hMr;
        this.A01 = hs7;
        this.A05 = hth;
        this.A06 = i10;
        this.A03 = r1;
    }
}

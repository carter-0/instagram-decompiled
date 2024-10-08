package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.Kcf  reason: case insensitive filesystem */
public final class C62245Kcf extends C62247Kch {
    public M0R A00;
    public C262204Co A01;
    public final View A02;
    public final C62289KdN A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C62245Kcf(android.view.View r11, X.AnonymousClass4DH r12, com.instagram.common.session.UserSession r13, X.C270194gL r14) {
        /*
            r10 = this;
            r7 = r13
            boolean r5 = X.DbW.A1Y(r13)
            r0 = 40
            X.Wxb r4 = new X.Wxb
            r6 = r12
            r4.<init>(r0, r13, r12, r14)
            r0 = 11
            X.MMN r3 = new X.MMN
            r3.<init>(r12, r0)
            X.0eO r2 = X.0eO.A02
            r1 = 12
            X.MMN r0 = new X.MMN
            r0.<init>(r3, r1)
            X.0eM r3 = X.AnonymousClass0eN.A00(r2, r0)
            java.lang.Class<X.KdN> r0 = X.C62289KdN.class
            X.0Yh r2 = X.DbS.A0z(r0)
            r1 = 13
            X.MMN r0 = new X.MMN
            r0.<init>(r3, r1)
            X.2kA r0 = X.C66304MMn.A00(r3, r0, r4, r2, r5)
            java.lang.Object r9 = r0.getValue()
            X.KdN r9 = (X.C62289KdN) r9
            r0 = 4
            X.0qQ.A0B(r9, r0)
            X.6go r8 = X.C313666go.VIEWER
            r4 = r10
            r5 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r10.A02 = r11
            r10.A03 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62245Kcf.<init>(android.view.View, X.4DH, com.instagram.common.session.UserSession, X.4gL):void");
    }

    public final void A06() {
        this.A03.A04();
        this.A01 = JTQ.A0n(this.A01);
        super.A06();
    }

    public final void DGS(M0U m0u) {
        C62289KdN kdN = this.A03;
        AnonymousClass4DH r0 = this.A04;
        Context requireContext = r0.requireContext();
        String moduleName = r0.getModuleName();
        0qQ.A0B(moduleName, 2);
        C61013JvD jvD = (C61013JvD) kdN.A07.A06.getValue();
        if (jvD != null) {
            AnonymousClass7TE.A1Z(new MFl(requireContext, m0u, jvD, kdN, moduleName, (AnonymousClass4D7) null), C318116oQ.A00(kdN));
        }
    }

    public final void DUj(M0U m0u) {
        C62289KdN kdN = this.A03;
        Object value = kdN.A07.A06.getValue();
        if (value != null) {
            AnonymousClass7TE.A1Z(new MHK((Object) m0u, value, (Object) kdN, (AnonymousClass4D7) null, 7), C318116oQ.A00(kdN));
        }
    }

    public final void Dyo(M0U m0u) {
        C62289KdN kdN = this.A03;
        C66184MGv.A02(kdN, C318116oQ.A00(kdN), 25);
    }

    public final void A05() {
        super.A05();
        this.A03.A03();
    }

    public final void A07() {
        super.A07();
        C62289KdN kdN = this.A03;
        kdN.A03();
        if (this.A01 == null) {
            this.A01 = AnonymousClass11O.A03(DbV.A0J(this.A04), C66186MGx.A01(this, kdN.A0B, 46));
        }
    }
}

package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.FIx  reason: case insensitive filesystem */
public final class C50012FIx implements DialogInterface.OnClickListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C50337FYu A01;
    public final /* synthetic */ C313756gx A02;
    public final /* synthetic */ C50338FYv A03;
    public final /* synthetic */ JPL A04;
    public final /* synthetic */ N4P A05;
    public final /* synthetic */ FAS A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ boolean A0A;

    public C50012FIx(UserSession userSession, C50337FYu fYu, C313756gx r3, C50338FYv fYv, JPL jpl, N4P n4p, FAS fas, String str, String str2, String str3, boolean z) {
        this.A05 = n4p;
        this.A0A = z;
        this.A01 = fYu;
        this.A08 = str;
        this.A02 = r3;
        this.A09 = str2;
        this.A03 = fYv;
        this.A06 = fas;
        this.A00 = userSession;
        this.A07 = str3;
        this.A04 = jpl;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        if (r5 != 62) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r8, int r9) {
        /*
            r7 = this;
            X.N4P r4 = r7.A05
            int r5 = r4.A09
            boolean r0 = X.AnonymousClass48O.A04(r5)
            r2 = 0
            if (r0 == 0) goto L_0x00d3
            boolean r0 = r7.A0A
            if (r0 == 0) goto L_0x00c4
            r0 = 28
            if (r5 == r0) goto L_0x00bb
            r0 = 29
            if (r5 == r0) goto L_0x0083
            r0 = 32
            if (r5 == r0) goto L_0x005c
            r0 = 61
            if (r5 == r0) goto L_0x00bb
            r0 = 62
            if (r5 == r0) goto L_0x005c
        L_0x0023:
            boolean r1 = X.AnonymousClass48O.A02(r5)
            com.instagram.common.session.UserSession r5 = r7.A00
            X.3sy r0 = r4.A08()
            com.instagram.model.direct.DirectThreadKey r3 = X.C66647MaG.A03(r0)
            if (r1 == 0) goto L_0x003c
            X.C66671Mae.A0C(r5, r3)
        L_0x0036:
            X.JPL r0 = r7.A04
            r0.Cfo()
            return
        L_0x003c:
            java.lang.String r2 = r7.A07
            r1 = 1
            X.0qQ.A0B(r3, r1)
            java.lang.Class<X.1hh> r0 = X.C65891hh.class
            X.MaY r0 = X.C66669Mac.A08(r5, r0)
            X.0qQ.A0B(r0, r1)
            X.1hh r1 = new X.1hh
            r1.<init>(r0)
            r1.A00 = r3
            r1.A01 = r2
            X.1Ou r0 = X.1Ou.A01(r5)
            r0.A0A(r1)
            goto L_0x0036
        L_0x005c:
            X.FYv r6 = r7.A03
            java.lang.String r3 = r7.A08
            java.lang.String r2 = r7.A09
            X.1Ln r1 = X.C50338FYv.A00(r6)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x0023
            com.instagram.common.session.UserSession r0 = r6.A03
            X.Dbb.A1G(r1, r0)
            java.lang.String r0 = "thread_end_attempt"
            X.DbV.A1M(r1, r0)
            java.lang.String r0 = "end_chat_dialog"
            r1.A0p(r0)
            java.lang.String r0 = "thread_detail"
            r1.A0q(r0)
            java.lang.String r0 = "instagram"
            goto L_0x00a9
        L_0x0083:
            X.6gx r6 = r7.A02
            java.lang.String r3 = r7.A08
            java.lang.String r2 = r7.A09
            X.1Ln r1 = X.DbT.A0J(r6)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x0023
            com.instagram.common.session.UserSession r0 = r6.A04
            X.Dbb.A1G(r1, r0)
            java.lang.String r0 = "thread_end_attempt"
            X.DbV.A1M(r1, r0)
            java.lang.String r0 = "end_chat_dialog"
            r1.A0p(r0)
            java.lang.String r0 = "thread_details"
            r1.A0q(r0)
            java.lang.String r0 = "broadcast"
        L_0x00a9:
            r1.A0o(r0)
            r1.A0s(r3)
            java.lang.Long r0 = X.DbZ.A0d(r2)
            r1.A0i(r0)
            r1.Cgf()
            goto L_0x0023
        L_0x00bb:
            X.FYu r1 = r7.A01
            java.lang.String r0 = r7.A08
            r1.A04(r2, r0)
            goto L_0x0023
        L_0x00c4:
            X.FAS r3 = r7.A06
            if (r3 == 0) goto L_0x0023
            java.lang.String r2 = "thread_end_attempt"
            java.lang.String r1 = "tap"
            java.lang.String r0 = "thread_detail"
            X.FAS.A00(r3, r2, r1, r0)
            goto L_0x0023
        L_0x00d3:
            X.FYu r1 = r7.A01
            java.lang.String r0 = r7.A08
            r1.A04(r2, r0)
            com.instagram.common.session.UserSession r1 = r7.A00
            X.3sy r0 = r4.A08()
            com.instagram.model.direct.DirectThreadKey r0 = X.C66647MaG.A03(r0)
            X.C66671Mae.A0C(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50012FIx.onClick(android.content.DialogInterface, int):void");
    }
}

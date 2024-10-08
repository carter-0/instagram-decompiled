package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.business.BusinessInfo;

public final class EDC extends 1P0 {
    public UserSession A00;
    public BusinessInfo A01;
    public String A02;
    public final /* synthetic */ Context A03;
    public final /* synthetic */ FRU A04;
    public final /* synthetic */ C51926G7u A05;
    public final /* synthetic */ UserSession A06;
    public final /* synthetic */ AnonymousClass4D6 A07;
    public final /* synthetic */ 16V A08;
    public final /* synthetic */ boolean A09;

    public EDC(Context context, FRU fru, C51926G7u g7u, UserSession userSession, AnonymousClass4D6 r5, BusinessInfo businessInfo, 16V r7, String str, boolean z) {
        this.A03 = context;
        this.A06 = userSession;
        this.A05 = g7u;
        this.A08 = r7;
        this.A09 = z;
        this.A07 = r5;
        this.A04 = fru;
        this.A00 = userSession;
        this.A01 = businessInfo;
        this.A02 = str;
    }

    public final void onFail(C268654dm r6) {
        int A0D = AnonymousClass7TG.A0D(r6, -2067471215);
        int A032 = AnonymousClass0fD.A03(2037910374);
        EDC.super.onFail(r6);
        AnonymousClass0fD.A0A(-1052358786, A032);
        String A042 = C319126q5.A04(r6, this.A03.getString(2131961757));
        0qQ.A07(A042);
        String A022 = C319126q5.A02(r6);
        0qQ.A07(A022);
        String A012 = C319126q5.A01(r6);
        if (A012 == null) {
            A012 = "NO_INTERNET";
        }
        this.A05.DeL(A042, A022, A012);
        AnonymousClass0fD.A0A(1246623499, A0D);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(-1437071602);
        int A033 = AnonymousClass0fD.A03(77196212);
        EDC.super.onFinish();
        AnonymousClass0fD.A0A(-1475775508, A033);
        this.A05.DeS();
        AnonymousClass0fD.A0A(1144173992, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(-1291835148);
        int A033 = AnonymousClass0fD.A03(265142311);
        EDC.super.onStart();
        AnonymousClass0fD.A0A(1029787681, A033);
        this.A05.Dei();
        AnonymousClass0fD.A0A(1575251703, A032);
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [X.1qK, java.lang.Object, X.6uh] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00aa, code lost:
        if (X.2Ek.A01(r7) == false) goto L_0x00ac;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r15) {
        /*
            r14 = this;
            r0 = 832456342(0x319e4696, float:4.60643E-9)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.370 r15 = (X.AnonymousClass370) r15
            r0 = -1073411833(0xffffffffc0050907, float:-2.078676)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r3 = 0
            X.0qQ.A0B(r15, r3)
            r0 = -1302768641(0xffffffffb25953ff, float:-1.2650161E-8)
            int r6 = X.AnonymousClass0fD.A03(r0)
            com.instagram.user.model.User r7 = X.C324696zk.A00(r15)
            if (r7 != 0) goto L_0x0089
            X.4do r0 = new X.4do
            r0.<init>(r15)
            r14.onFail(r0)
            r0 = -526865383(0xffffffffe098ac19, float:-8.800956E19)
        L_0x002c:
            X.AnonymousClass0fD.A0A(r0, r6)
            com.instagram.common.session.UserSession r8 = r14.A06
            X.C49905FEd.A01(r8)
            X.16V r7 = r14.A08
            X.16V r0 = X.16V.A05
            if (r7 != r0) goto L_0x005d
            java.lang.Integer r10 = X.AnonymousClass05K.A07
            java.lang.String r11 = "switch_to_biz"
            java.lang.Boolean r9 = X.AnonymousClass7TE.A0v()
            r12 = 0
            r13 = r12
            X.C378219Oy.A00(r8, r9, r10, r11, r12, r13)
            X.1Am r1 = X.1Al.A01(r8)
            X.1An r0 = X.1An.A1J
            X.0xa r0 = r1.A03(r0)
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "cal_migration_show_destination_picker"
            r1.E5T(r0, r3)
            r1.apply()
        L_0x005d:
            boolean r0 = r14.A09
            if (r0 == 0) goto L_0x0083
            X.4D6 r0 = r14.A07
            X.De2 r6 = new X.De2
            r6.<init>(r8, r0)
            X.FRU r2 = r14.A04
            X.G7u r0 = r14.A05
            X.EDb r1 = new X.EDb
            r1.<init>((int) r3, (java.lang.Object) r0, (java.lang.Object) r7, (java.lang.Object) r2)
            java.lang.String r0 = "conversion"
            r6.A02(r1, r0)
        L_0x0076:
            r0 = 102462230(0x61b7316, float:2.9236812E-35)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -372285955(0xffffffffe9cf5dfd, float:-3.1336436E25)
            X.AnonymousClass0fD.A0A(r0, r5)
            return
        L_0x0083:
            X.G7u r0 = r14.A05
            r0.Det(r7)
            goto L_0x0076
        L_0x0089:
            java.lang.String r11 = r7.getId()
            com.instagram.model.business.BusinessInfo r0 = r14.A01
            java.lang.String r0 = r0.A0J
            boolean r10 = X.DbW.A1a(r0)
            java.lang.String r1 = r14.A02
            r0 = 1143(0x477, float:1.602E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r0.equals(r1)
            r9 = r0 ^ 1
            if (r9 == 0) goto L_0x00ac
            boolean r0 = X.2Ek.A01(r7)
            r2 = 1
            if (r0 != 0) goto L_0x00ad
        L_0x00ac:
            r2 = 0
        L_0x00ad:
            com.instagram.common.session.UserSession r8 = r14.A00
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r8)
            X.6uh r0 = new X.6uh
            r0.<init>()
            r0.A00 = r11
            r0.A04 = r10
            r0.A01 = r9
            r0.A03 = r2
            r1.A00(r0)
            X.1Av r0 = X.1Au.A00(r8)
            r0.A1g(r9)
            X.1Av r0 = X.1Au.A00(r8)
            r2 = 1
            X.0xY r1 = X.AnonymousClass7TE.A0p(r0)
            java.lang.String r0 = "show_business_onboarding_check_list_tooltip"
            r1.E5T(r0, r2)
            r1.apply()
            X.DbT.A1S(r8, r7)
            r7.A0d(r8)
            X.4Cl r0 = r7.A03
            java.lang.String r0 = r0.BaE()
            if (r0 == 0) goto L_0x00ee
            X.4Cl r0 = r7.A03
            r0.BaI()
        L_0x00ee:
            r0 = -2049471225(0xffffffff85d78d07, float:-2.0270308E-35)
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EDC.onSuccess(java.lang.Object):void");
    }
}

package com.instagram.fanclub.memberlist.viewmodel;

import X.02z;
import X.05G;
import X.0eE;
import X.0qQ;
import X.0sl;
import X.0u9;
import X.106;
import X.10b;
import X.1HR;
import X.AnonymousClass05K;
import X.AnonymousClass0Ud;
import X.AnonymousClass0r6;
import X.AnonymousClass0t1;
import X.AnonymousClass10A;
import X.AnonymousClass11F;
import X.AnonymousClass4D7;
import X.C249513ju;
import X.C266444Yx;
import X.C272994ll;
import X.C273004lm;
import X.C318116oQ;
import X.C375479Ds;
import X.C46776Dl3;
import X.C47253Dte;
import X.C48796EkJ;
import X.C50337FYu;
import X.C51970G9q;
import X.C51973G9u;
import X.C65314LrC;
import X.C66182MGt;
import X.DbS;
import X.G9w;
import X.JTO;
import X.JTQ;
import X.JTS;
import X.KGH;
import X.MCA;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.fanclub.api.FanClubApi;
import com.instagram.fanclub.memberlist.repository.FanClubMemberListRepository;

public final class FanClubMemberListViewModel extends C46776Dl3 {
    public final UserSession A00;
    public final C50337FYu A01;
    public final C273004lm A02;
    public final FanClubApi A03;
    public final KGH A04;
    public final C47253Dte A05 = new C47253Dte((View.OnClickListener) null, DbS.A0Q(new Object[0], 2131976316), (C266444Yx) null);
    public final FanClubMemberListRepository A06;
    public final AnonymousClass0t1 A07;
    public final String A08;
    public final C249513ju A09;
    public final AnonymousClass0r6 A0A;
    public final 05G A0B;
    public final 05G A0C;
    public final 05G A0D;
    public final 05G A0E;
    public final 05G A0F;
    public final 05G A0G;
    public final AnonymousClass0Ud A0H;
    public final boolean A0I;

    /* JADX WARNING: type inference failed for: r5v1, types: [X.4D7, X.MDp] */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.fanclub.memberlist.viewmodel.FanClubMemberListViewModel r7, X.AnonymousClass4D7 r8) {
        /*
            r3 = 6
            boolean r0 = X.C66137MDp.A02(r3, r8)
            if (r0 == 0) goto L_0x007d
            r5 = r8
            X.MDp r5 = (X.C66137MDp) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x007d
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x0067
            if (r0 != r3) goto L_0x0082
            java.lang.Object r7 = r5.A01
            com.instagram.fanclub.memberlist.viewmodel.FanClubMemberListViewModel r7 = (com.instagram.fanclub.memberlist.viewmodel.FanClubMemberListViewModel) r7
            X.0eS.A00(r1)
        L_0x0027:
            X.Dtm r1 = (X.C47258Dtm) r1
            if (r1 == 0) goto L_0x0051
            boolean r2 = r1.A02
            java.lang.String r1 = r7.A08
            java.lang.String r0 = "PROFILE"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0057
            X.FYu r5 = r7.A01
            X.C50337FYu.A02(r5)
            X.EZo r4 = X.C48146EZo.PROFILE_SUBSCRIPTION
        L_0x003e:
            X.EZp r3 = X.C48147EZp.SUBSCRIBERS_LIST_BUTTON
            if (r2 == 0) goto L_0x0054
            java.lang.String r1 = "True"
        L_0x0044:
            java.lang.String r0 = "is_list_empty"
            java.util.Map r8 = X.AnonymousClass7TF.A0w(r0, r1)
            java.lang.String r6 = "subscribers_list_rendered"
            java.lang.String r7 = "tap"
            X.C50337FYu.A01(r3, r4, r5, r6, r7, r8)
        L_0x0051:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0054:
            java.lang.String r1 = "False"
            goto L_0x0044
        L_0x0057:
            java.lang.String r0 = "SETTINGS"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0051
            X.FYu r5 = r7.A01
            X.C50337FYu.A02(r5)
            X.EZo r4 = X.C48146EZo.PROFESSIONAL_HOME_SUBSCRIPTIONS
            goto L_0x003e
        L_0x0067:
            X.0eS.A00(r1)
            X.0Ud r2 = r7.A0H
            r1 = 5
            X.FxC r0 = new X.FxC
            r0.<init>((X.AnonymousClass0r6) r2, (int) r1)
            r5.A01 = r7
            r5.A00 = r3
            java.lang.Object r1 = X.AnonymousClass10c.A03(r5, r0)
            if (r1 != r4) goto L_0x0027
            return r4
        L_0x007d:
            X.MDp r5 = X.C66137MDp.A00(r7, r8, r3)
            goto L_0x0015
        L_0x0082:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.memberlist.viewmodel.FanClubMemberListViewModel.A00(com.instagram.fanclub.memberlist.viewmodel.FanClubMemberListViewModel, X.4D7):java.lang.Object");
    }

    public /* synthetic */ FanClubMemberListViewModel(UserSession userSession, FanClubMemberListRepository fanClubMemberListRepository, String str) {
        C273004lm A002 = C272994ll.A00(userSession);
        C50337FYu A003 = C48796EkJ.A00(userSession);
        FanClubApi fanClubApi = new FanClubApi(userSession);
        AnonymousClass0t1 A004 = 0eE.A00(userSession);
        0qQ.A0B(fanClubMemberListRepository, 1);
        String str2 = str;
        C51973G9u.A0r(3, str2, A002, A003);
        0qQ.A0B(A004, 7);
        this.A06 = fanClubMemberListRepository;
        this.A00 = userSession;
        this.A08 = str2;
        this.A02 = A002;
        this.A01 = A003;
        this.A03 = fanClubApi;
        this.A07 = A004;
        02z A10 = C51970G9q.A10(true);
        this.A0D = A10;
        02z A1J = JTO.A1J();
        this.A0B = A1J;
        02z A0r = JTQ.A0r(0);
        this.A0E = A0r;
        02z A102 = C51970G9q.A10(false);
        this.A0C = A102;
        02z A012 = 106.A01(0sl.A00);
        this.A0F = A012;
        02z A103 = DbS.A10("");
        this.A0G = A103;
        this.A0I = C375479Ds.A01(userSession);
        Integer num = AnonymousClass05K.A00;
        1HR A0w = G9w.A0w();
        this.A09 = A0w;
        this.A0A = 0u9.A04(A0w);
        AnonymousClass0r6 A005 = AnonymousClass11F.A00(MCA.A00(this, new AnonymousClass0r6[]{A1J, A0r, A102, fanClubMemberListRepository.A02, fanClubMemberListRepository.A00, A10, A012, A103}, 47), 250);
        this.A0H = 10b.A02(C65314LrC.A00, C318116oQ.A00(this), A005, AnonymousClass10A.A01);
        JTO.A1Y(num, new C66182MGt((Object) this, (AnonymousClass4D7) null, 47), C318116oQ.A00(this));
        JTS.A13(this, new C66182MGt((Object) this, (AnonymousClass4D7) null, 48), fanClubMemberListRepository.A01);
        this.A04 = new KGH(num);
    }
}

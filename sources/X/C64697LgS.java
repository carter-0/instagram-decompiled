package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.LgS  reason: case insensitive filesystem */
public final class C64697LgS implements 1wn {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A032;
        Context context;
        LEH leh;
        C63768L6a l6a;
        AnonymousClass4DH r7;
        UserSession userSession;
        int i;
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                A032 = AnonymousClass0fD.A03(-1773965547);
                C61149Jy0 jy0 = (C61149Jy0) obj2;
                int A033 = AnonymousClass0fD.A03(1195005133);
                boolean z = false;
                0qQ.A0B(jy0, 0);
                Integer num = jy0.A00;
                if (num == null || num.intValue() != 0) {
                    CallerContext callerContext = C59719JVd.A01;
                    context = (Context) this.A01;
                    leh = (LEH) this.A04;
                    l6a = (C63768L6a) this.A05;
                    r7 = (AnonymousClass4DH) this.A03;
                    userSession = (UserSession) this.A06;
                } else {
                    userSession = (UserSession) this.A06;
                    l6a = (C63768L6a) this.A05;
                    C65632Lx9 lx9 = new C65632Lx9(l6a, 2);
                    0qQ.A0B(userSession, 0);
                    z = true;
                    new C363008it(userSession, lx9).A05(true, "ig_story_viewers_dashboard");
                    CallerContext callerContext2 = C59719JVd.A01;
                    context = (Context) this.A01;
                    leh = (LEH) this.A04;
                    r7 = (AnonymousClass4DH) this.A03;
                }
                C363388je.A00(userSession).A01(C59719JVd.A01, new C65244Lpo(context, r7, userSession, l6a, leh, (ReelDashboardFragment) this.A02, z), "after_new_fbc");
                AnonymousClass0fD.A0A(-1813837108, A033);
                i = -1464270026;
                break;
            case 1:
                A032 = AnonymousClass0fD.A03(-2068160600);
                C61149Jy0 jy02 = (C61149Jy0) obj2;
                int A034 = AnonymousClass0fD.A03(-679394098);
                0qQ.A0B(jy02, 0);
                UserSession userSession2 = (UserSession) this.A06;
                if (182.A06(0Tu.A05, userSession2, 36329723902837029L)) {
                    C363378jd A002 = C363388je.A00(userSession2);
                    CallerContext callerContext3 = C64374Laq.A01;
                    Object obj3 = this.A04;
                    A002.A01(callerContext3, new C65245Lpp(0, this.A01, this.A03, userSession2, jy02, this.A05, obj3, this.A02), "after_new_fbc");
                } else {
                    L75 l75 = (L75) this.A05;
                    C64374Laq.A02((Context) this.A01, (AnonymousClass4DH) this.A03, userSession2, jy02, l75, (LB7) this.A04, (C47522E6i) this.A02);
                }
                AnonymousClass0fD.A0A(2143130550, A034);
                i = 1943191798;
                break;
            default:
                A032 = AnonymousClass0fD.A03(1603151164);
                C61149Jy0 jy03 = (C61149Jy0) obj2;
                int A0D = AnonymousClass7TG.A0D(jy03, -1660981184);
                UserSession userSession3 = (UserSession) this.A06;
                if (182.A06(0Tu.A05, userSession3, 36329723902837029L)) {
                    C363378jd A003 = C363388je.A00(userSession3);
                    CallerContext callerContext4 = LTD.A01;
                    Object obj4 = this.A04;
                    A003.A01(callerContext4, new C65245Lpp(1, this.A01, this.A03, userSession3, jy03, this.A05, obj4, this.A02), "after_new_fbc");
                } else {
                    L2V l2v = (L2V) this.A05;
                    AnonymousClass4DH r8 = (AnonymousClass4DH) this.A03;
                    LTD.A00((Context) this.A01, r8, userSession3, jy03, l2v, (C63882LAl) this.A04, (C47522E6i) this.A02);
                }
                AnonymousClass0fD.A0A(-1782368499, A0D);
                i = -832418212;
                break;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    public C64697LgS(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.A00 = i;
        this.A06 = obj3;
        this.A01 = obj;
        this.A04 = obj5;
        this.A05 = obj4;
        this.A03 = obj2;
        this.A02 = obj6;
    }
}

package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.GrowthFrictionInterventionDetailImpl;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class EUF extends EC7 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ 1P0 A01;
    public final /* synthetic */ 1Xj A02;
    public final /* synthetic */ AnonymousClass3W1 A03;
    public final /* synthetic */ SearchContext A04;
    public final /* synthetic */ C267094ax A05;
    public final /* synthetic */ C294705mt A06;
    public final /* synthetic */ EWA A07;
    public final /* synthetic */ User A08;
    public final /* synthetic */ Boolean A09;
    public final /* synthetic */ Integer A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ JSONObject A0F;
    public final /* synthetic */ boolean A0G;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EUF(android.content.Context r9, X.1P0 r10, com.instagram.common.session.UserSession r11, X.1Xj r12, X.AnonymousClass3W1 r13, com.instagram.search.common.analytics.SearchContext r14, X.C267094ax r15, X.C294705mt r16, X.EWA r17, com.instagram.user.model.User r18, java.lang.Boolean r19, java.lang.Integer r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, org.json.JSONObject r27, boolean r28) {
        /*
            r8 = this;
            r2 = r8
            r8.A00 = r9
            r5 = r18
            r8.A08 = r5
            r4 = r15
            r8.A05 = r15
            r0 = r16
            r8.A06 = r0
            r8.A01 = r10
            r0 = r17
            r8.A07 = r0
            r0 = r27
            r8.A0F = r0
            r0 = r28
            r8.A0G = r0
            r8.A02 = r12
            r8.A03 = r13
            r0 = r20
            r8.A0A = r0
            r8.A04 = r14
            r0 = r21
            r8.A0C = r0
            r0 = r22
            r8.A0B = r0
            r0 = r19
            r8.A09 = r0
            r0 = r23
            r8.A0E = r0
            r0 = r24
            r8.A0D = r0
            r0 = 1
            r6 = r25
            X.AnonymousClass7TF.A1D(r9, r0, r6)
            r0 = 6
            r1 = r26
            X.0qQ.A0B(r1, r0)
            r7 = 0
            r3 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EUF.<init>(android.content.Context, X.1P0, com.instagram.common.session.UserSession, X.1Xj, X.3W1, com.instagram.search.common.analytics.SearchContext, X.4ax, X.5mt, X.EWA, com.instagram.user.model.User, java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.json.JSONObject, boolean):void");
    }

    public final void onFail(C268654dm r33) {
        EWT ewt;
        String str;
        String str2;
        String str3;
        String message;
        int A032 = AnonymousClass0fD.A03(-132469219);
        C268654dm r6 = r33;
        0qQ.A0B(r6, 0);
        C294705mt r10 = this.A06;
        UserSession userSession = r10.A02;
        C49728F3s A002 = C49061Eof.A00(userSession);
        C321576uP r2 = (C321576uP) userSession.A01(C321576uP.class, new C51763G0f(userSession, 13));
        EUF.super.onFail(r6);
        EWA ewa = this.A07;
        boolean z = true;
        if (!C294695ms.A02(ewa) || !182.A06(0Tu.A05, userSession, 36327958671014736L)) {
            r10.A0E(this.A08);
            C267094ax r1 = this.A05;
            if (r1 != null) {
                AnonymousClass2f1.A00(userSession).A0O(r1);
            }
        } else {
            C267094ax r12 = this.A05;
            if (r12 != null) {
                r10.A0E(this.A08);
                if (r6 instanceof C268674do) {
                    AnonymousClass2f1.A00(userSession).A0O(r12);
                }
                r12.A05 = true;
            }
        }
        Throwable A012 = r6.A01();
        if (A012 == null || (message = A012.getMessage()) == null || message.length() <= 0) {
            z = false;
        }
        if (z) {
            r2.A03 = "Network";
            EWT ewt2 = EWT.FOLLOW_USER_FLOW;
            if (A012 != null) {
                str3 = A012.getMessage();
            } else {
                str3 = null;
            }
            A002.A05(ewt2, TraceFieldType.FailureReason, str3);
        }
        DwR dwR = (DwR) r6.A00();
        if (dwR != null) {
            Context context = this.A00;
            User user = this.A08;
            1P0 r13 = this.A01;
            JSONObject jSONObject = this.A0F;
            boolean z2 = this.A0G;
            1Xj r30 = this.A02;
            AnonymousClass3W1 r29 = this.A03;
            Integer num = this.A0A;
            SearchContext searchContext = this.A04;
            String str4 = this.A0C;
            String str5 = this.A0B;
            Boolean bool = this.A09;
            String str6 = this.A0E;
            String str7 = this.A0D;
            if (dwR.mStatusCode == 400) {
                if (dwR.A06) {
                    if (context instanceof Activity) {
                        Activity activity = (Activity) context;
                        if (!activity.isFinishing() && 182.A06(0Tu.A06, userSession, 36323530560908533L)) {
                            C358248ab A0X = DbS.A0X(activity);
                            DbT.A19(context, A0X, 2131965886);
                            DbY.A0w(context, A0X, user.getUsername(), 2131965885);
                            A0X.A0c((DialogInterface.OnClickListener) null, AnonymousClass7TE.A16(context, 2131965884));
                            DbT.A1V(A0X);
                        }
                    }
                    str2 = "MaxFollowedFriendshipException";
                } else {
                    if (dwR.A05) {
                        C294705mt.A02(context, r13, dwR, r10);
                        r2.A03 = "PrivatePublicSwitchRestriction";
                        ewt = EWT.FOLLOW_USER_FLOW;
                        str = dwR.A03;
                    } else {
                        GrowthFrictionInterventionDetailImpl growthFrictionInterventionDetailImpl = dwR.A00;
                        if (growthFrictionInterventionDetailImpl != null) {
                            C51306Frz frz = new C51306Frz(new C51768G0n(context, r13, r30, r29, searchContext, r10, ewa, user, bool, num, str4, str5, str6, str7, jSONObject, z2));
                            0qQ.A0B(context, 0);
                            Context context2 = context;
                            GrowthFrictionInterventionDetailImpl growthFrictionInterventionDetailImpl2 = growthFrictionInterventionDetailImpl;
                            UserSession userSession2 = userSession;
                            F8S.A00(context2, growthFrictionInterventionDetailImpl2, userSession2, C358278ae.RED_BOLD, user, AnonymousClass05K.A00, frz, true);
                            str2 = "GrowthFrictionException";
                        } else if (dwR.mSpam) {
                            String str8 = dwR.A02;
                            String A003 = AnonymousClass000.A00(1358);
                            if (str8 != null && str8.equals(A003)) {
                                r2.A03 = "SentryBlockAccess";
                                ewt = EWT.FOLLOW_USER_FLOW;
                                str = dwR.mFeedbackMessage;
                            }
                        }
                    }
                    A002.A05(ewt, TraceFieldType.FailureReason, str);
                }
                r2.A03 = str2;
                A002.A05(EWT.FOLLOW_USER_FLOW, TraceFieldType.FailureReason, str2);
            }
        }
        if (r2.A03 == null) {
            String A004 = AnonymousClass000.A00(2518);
            r2.A03 = A004;
            A002.A05(EWT.FOLLOW_USER_FLOW, TraceFieldType.FailureReason, A004);
        }
        A002.A04(EWT.FOLLOW_USER_FLOW, r6.toString());
        A002.A04(EWT.LIST_FOLLOW_USER_FLOW, r6.toString());
        1P0 r0 = this.A01;
        if (r0 != null) {
            r0.onFail(r6);
        }
        AnonymousClass0fD.A0A(1324660419, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Boolean CYt;
        Boolean CYt2;
        int A032 = AnonymousClass0fD.A03(637441075);
        int A0D2 = AnonymousClass7TG.A0D(obj, -1166767832);
        UserSession userSession = this.A06.A02;
        C49728F3s A002 = C49061Eof.A00(userSession);
        EUF.super.onSuccess(obj);
        A002.A01(EWT.FOLLOW_USER_FLOW, (Integer) null);
        A002.A01(EWT.LIST_FOLLOW_USER_FLOW, (Integer) null);
        1P0 r0 = this.A01;
        if (r0 != null) {
            r0.onSuccess(obj);
        }
        Context context = this.A00;
        EWA ewa = this.A07;
        User user = this.A08;
        Activity activity = (Activity) 0mE.A00(context, Activity.class);
        if (!(ewa != EWA.UserActionIgnore || 1Wj.A00 == null || activity == null)) {
            DcL.A00().A00(activity, userSession, "2022623244751835", C70342O2u.A00(user.getId()));
        }
        0Tu r9 = 0Tu.A06;
        if (182.A06(r9, userSession, 36318436728576124L) && ewa == EWA.UserActionFollow && (CYt2 = user.A03.CYt()) != null && CYt2.booleanValue()) {
            List A042 = 1Av.A04(1Au.A00(userSession), "parenting_accounts_followed");
            if (A042.isEmpty()) {
                A042 = AnonymousClass7TE.A1C();
            }
            ArrayList A1D = AnonymousClass7TE.A1D(A042);
            if (!A1D.contains(user.getId())) {
                DbU.A1V(user, A1D);
                1Av.A06(1Au.A00(userSession), "parenting_accounts_followed", A1D);
                DbZ.A0I(AnonymousClass0kN.A02(userSession), "ig_parent_follows_parenting_account").Cgf();
            }
        }
        if (182.A06(r9, userSession, 36318436728576124L) && ((ewa == EWA.UserActionUnfollow || ewa == EWA.UserActionCancelRequest) && (CYt = user.A03.CYt()) != null && CYt.booleanValue())) {
            List A043 = 1Av.A04(1Au.A00(userSession), "parenting_accounts_followed");
            if (A043.isEmpty()) {
                A043 = AnonymousClass7TE.A1C();
            }
            ArrayList A1D2 = AnonymousClass7TE.A1D(A043);
            if (A1D2.contains(user.getId())) {
                A1D2.remove(user.getId());
                1Av.A06(1Au.A00(userSession), "parenting_accounts_followed", A1D2);
            }
            ArrayList A0U = 00k.A0U(1Au.A00(userSession).A0G());
            if (A0U.contains(user.getId())) {
                A0U.remove(user.getId());
                1Av.A06(1Au.A00(userSession), AnonymousClass000.A00(1669), A0U);
            }
        }
        AnonymousClass0fD.A0A(867300848, A0D2);
        AnonymousClass0fD.A0A(714899983, A032);
    }
}

package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import org.json.JSONObject;

public final class M13 implements C74477PvX {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ LSm A02;
    public final /* synthetic */ C61204Jyx A03;
    public final /* synthetic */ AnonymousClass4DU A04;
    public final /* synthetic */ C331157Pu A05;
    public final /* synthetic */ C71093OcF A06;

    public final void DfO() {
    }

    public final void Dv6() {
    }

    public M13(Activity activity, UserSession userSession, LSm lSm, C61204Jyx jyx, AnonymousClass4DU r5, C331157Pu r6, C71093OcF ocF) {
        this.A02 = lSm;
        this.A03 = jyx;
        this.A06 = ocF;
        this.A05 = r6;
        this.A01 = userSession;
        this.A00 = activity;
        this.A04 = r5;
    }

    public final void CyO() {
        C242243Te r1;
        String str;
        LSm lSm = this.A02;
        C61204Jyx jyx = this.A03;
        boolean A1V = AnonymousClass7TF.A1V(jyx.A06);
        User user = jyx.A00;
        String id = user.getId();
        AnonymousClass2Ep A002 = LSm.A00(lSm);
        if (!(A002 == null || (r1 = ((AnonymousClass3U9) A002).A01.A0s) == null)) {
            C313756gx A0R = DbZ.A0R(lSm.A04);
            int AdN = A002.AdN();
            String C6C = A002.C6C();
            String C6k = A002.C6k();
            String A003 = lSm.A01.A00();
            String A012 = LSm.A01(lSm, r1, A002);
            1Ln A0J = DbT.A0J(A0R);
            if (DbT.A1Y(A0J)) {
                0eP A1L = AnonymousClass7TE.A1L("message_client_context_id", A003);
                0eP A1L2 = AnonymousClass7TE.A1L("user_type", A012);
                if (A1V) {
                    str = "True";
                } else {
                    str = "False";
                }
                LinkedHashMap A07 = 0Yt.A07(AnonymousClass7TH.A0h("blocked_user_id", id, A1L, A1L2, AnonymousClass7TE.A1L("is_reply", str)));
                DbW.A17(A0J, A0R);
                DbV.A1M(A0J, "block_user");
                A0J.A0p("block_user_button");
                JTQ.A1C(A0J, DbZ.A0b(A0J, "report_comment_sheet", C6C, C6k, AdN), A07);
            }
        }
        if (user.B6o() == FollowStatus.A08) {
            C294695ms.A00(this.A01).A0G(user, false);
        }
        Activity activity = this.A00;
        UserSession userSession = this.A01;
        AnonymousClass4DU r10 = this.A04;
        C331157Pu r12 = this.A05;
        String str2 = jyx.A04;
        JSONObject jSONObject = jyx.A08;
        0qQ.A0B(jSONObject, 0);
        F8Z.A01(activity, r10, userSession, r12, user, (String) null, str2, jSONObject);
    }

    public final void De9() {
        C242243Te r1;
        String str;
        LSm lSm = this.A02;
        boolean A1V = AnonymousClass7TF.A1V(this.A03.A06);
        AnonymousClass2Ep A002 = LSm.A00(lSm);
        if (!(A002 == null || (r1 = ((AnonymousClass3U9) A002).A01.A0s) == null)) {
            C313756gx A0R = DbZ.A0R(lSm.A04);
            int AdN = A002.AdN();
            String C6C = A002.C6C();
            String C6k = A002.C6k();
            String A003 = lSm.A01.A00();
            String A012 = LSm.A01(lSm, r1, A002);
            1Ln A0J = DbT.A0J(A0R);
            if (DbT.A1Y(A0J)) {
                0eP A1L = AnonymousClass7TE.A1L("message_client_context_id", A003);
                0eP A1L2 = AnonymousClass7TE.A1L("user_type", A012);
                if (A1V) {
                    str = "True";
                } else {
                    str = "False";
                }
                LinkedHashMap A0p = JTS.A0p("is_reply", str, A1L, A1L2);
                DbW.A17(A0J, A0R);
                DbV.A1M(A0J, "report_comment");
                A0J.A0p("report_comment_button");
                JTQ.A1C(A0J, DbZ.A0b(A0J, "report_comment_sheet", C6C, C6k, AdN), A0p);
            }
        }
        C71093OcF.A00(this.A05, this.A06);
    }
}

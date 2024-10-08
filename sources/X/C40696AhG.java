package X;

import android.app.Activity;
import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import org.json.JSONObject;

/* renamed from: X.AhG  reason: case insensitive filesystem */
public final class C40696AhG implements C74477PvX {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C52971GgO A01;
    public final /* synthetic */ C334747bo A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ AnonymousClass4DU A04;
    public final /* synthetic */ C331157Pu A05;
    public final /* synthetic */ C71093OcF A06;

    public C40696AhG(Activity activity, C52971GgO ggO, C334747bo r3, UserSession userSession, AnonymousClass4DU r5, C331157Pu r6, C71093OcF ocF) {
        this.A02 = r3;
        this.A03 = userSession;
        this.A00 = activity;
        this.A04 = r5;
        this.A05 = r6;
        this.A01 = ggO;
        this.A06 = ocF;
    }

    public final void CyO() {
        C334747bo r3 = this.A02;
        String str = r3.A05;
        User user = r3.A00;
        if (user.B6o() == FollowStatus.A08) {
            C294695ms.A00(this.A03).A0G(user, false);
        }
        Activity activity = this.A00;
        UserSession userSession = this.A03;
        AnonymousClass4DU r5 = this.A04;
        C331157Pu r7 = this.A05;
        JSONObject jSONObject = r3.A09;
        0qQ.A0B(jSONObject, 0);
        F8Z.A01(activity, r5, userSession, r7, user, (String) null, str, jSONObject);
    }

    public final void De9() {
        02m r2 = 02m.A0p;
        0qQ.A07(r2);
        r2.markerPoint(309476254, "report_comment_click");
        C71093OcF.A00(this.A05, this.A06);
    }

    public final void DfO() {
        C52971GgO ggO = this.A01;
        C334747bo r1 = this.A02;
        User user = r1.A00;
        String str = r1.A05;
        String str2 = r1.A07;
        AnonymousClass7TG.A1N(user, str);
        ggO.A0B.A00(new C74192PqY(ggO, user, str, str2, 19));
        HX8.A00(this.A00, ggO, this.A03, this.A04, user, r1.A04, str, str2, r1.A09);
    }

    public final void Dv6() {
        C52971GgO ggO = this.A01;
        C334747bo r0 = this.A02;
        String str = r0.A05;
        String str2 = r0.A07;
        User user = r0.A00;
        AnonymousClass7TF.A1B(str, 0, user);
        ggO.A0B.A00(new C74192PqY(ggO, user, str, str2, 20));
        C333937aO r02 = ggO.A0I;
        if (r02 != null) {
            r02.A01(user);
        }
        MediaCommentListRepository mediaCommentListRepository = ggO.A0A;
        J6I j6i = new J6I(ggO, 22);
        C20611Wvs wvs = new C20611Wvs(ggO, 8);
        AnonymousClass7TE.A1Z(new JVS(j6i, wvs, mediaCommentListRepository, str, str2, (AnonymousClass4D7) null, 0), mediaCommentListRepository.A01);
    }
}

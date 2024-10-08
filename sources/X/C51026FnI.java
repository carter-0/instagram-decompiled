package X;

import android.app.Activity;
import android.content.Context;
import androidx.core.app.ComponentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.user.model.User;
import org.json.JSONObject;

/* renamed from: X.FnI  reason: case insensitive filesystem */
public final class C51026FnI implements C330317Mh {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;

    public C51026FnI(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A06 = obj6;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A07 = str;
        this.A04 = obj4;
        this.A05 = obj5;
    }

    public final void onFail(C268654dm r3) {
        Object obj;
        C307896Rx r1;
        Object obj2;
        switch (this.A00) {
            case 0:
                obj = this.A03;
                break;
            case 1:
                obj = this.A04;
                break;
            default:
                r1 = (C307896Rx) this.A03;
                obj2 = this.A04;
                break;
        }
        r1 = (C307896Rx) obj;
        obj2 = this.A05;
        DbZ.A1V(r1, obj2);
    }

    public final void onSuccess(User user) {
        User user2 = user;
        switch (this.A00) {
            case 0:
                0qQ.A0B(user2, 0);
                ComponentActivity componentActivity = (ComponentActivity) this.A01;
                UserSession userSession = (UserSession) this.A06;
                G83 g83 = (G83) this.A04;
                String str = this.A07;
                1YZ r1 = 1YZ.A02;
                if (r1 != null) {
                    0qQ.A0C(componentActivity, "null cannot be cast to non-null type android.app.Activity");
                    r1.A03(componentActivity, AnonymousClass07i.A00(componentActivity), userSession, g83, user2.getId(), str, (String) null, (String) null);
                    return;
                }
                return;
            case 1:
                0qQ.A0B(user2, 0);
                Context context = (Context) this.A01;
                UserSession userSession2 = (UserSession) this.A06;
                String str2 = this.A07;
                String A002 = C49192Eqx.A00(str2);
                user2.getUsername();
                AnonymousClass7TF.A1H(context, userSession2);
                C49193Eqy.A00(context, userSession2, user2, (G8B) this.A02, str2, A002, (JSONObject) null, 0, false);
                return;
            case 2:
                Activity activity = (Activity) this.A01;
                UserSession userSession3 = (UserSession) this.A06;
                AnonymousClass7TG.A1O(activity, userSession3);
                0qQ.A0B(user2, 4);
                C307896Rx r7 = (C307896Rx) this.A03;
                C331157Pu A072 = FH9.A07(r7);
                C331127Pr A0W = DbS.A0W(userSession3);
                DbS.A1S(A0W, true);
                A0W.A19 = true;
                F8Z.A00(activity, (AnonymousClass0iw) this.A02, r7, (C277014uI) this.A04, (C277014uI) this.A05, userSession3, A072, A0W, user2, (String) null, this.A07, (JSONObject) null);
                return;
            default:
                0qQ.A0B(user2, 0);
                Context context2 = (Context) this.A01;
                UserSession userSession4 = (UserSession) this.A06;
                C243853aD r12 = (C243853aD) this.A02;
                String str3 = this.A07;
                Object obj = this.A05;
                Object obj2 = this.A04;
                Object obj3 = this.A03;
                0qQ.A0B(context2, 0);
                AnonymousClass7TG.A1P(userSession4, r12);
                FH6.A08(context2, (0xF) null, new C47692EDb(23, obj2, obj, obj3), userSession4, (1Xj) null, (AnonymousClass3W1) null, (UserDetailEntryInfo) null, r12, user2, str3, (String) null, str3, (String) null, (JSONObject) null);
                return;
        }
    }
}

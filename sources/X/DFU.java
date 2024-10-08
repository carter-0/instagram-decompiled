package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class DFU implements AnonymousClass2Kv {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public DFU(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void invoke(AnonymousClass3JD r8) {
        Object Bny;
        boolean z;
        C250663lr A0U;
        C250663lr requiredTreeField;
        C250663lr requiredTreeField2;
        C250663lr A0U2;
        C250663lr requiredTreeField3;
        C250663lr A0U3;
        C250663lr optionalTreeField;
        switch (this.A00) {
            case 0:
                C8294Qna qna = (C8294Qna) this.A01;
                AnonymousClass2hV r1 = (AnonymousClass2hV) this.A02;
                2Kw r4 = (2Kw) this.A03;
                if (r8 == null || (Bny = r8.Bny()) == null) {
                    r4.invoke(new RuntimeException("GraphQLResult is null."));
                    return;
                }
                try {
                    Object apply = r1.apply(Bny);
                    apply.getClass();
                    qna.A00 = new S21(r8.B87(), apply, (Throwable) null);
                    qna.A02(qna.A00);
                    return;
                } catch (Exception e) {
                    r4.invoke(e);
                    return;
                }
            case 1:
                C49966FGz fGz = C49966FGz.A00;
                UserSession userSession = (UserSession) this.A03;
                fGz.A07(userSession, true);
                C49966FGz.A03((Context) this.A02, (AnonymousClass0iw) this.A01, userSession, (String) null);
                return;
            case 2:
                0eE r0 = AnonymousClass0t1.A01;
                UserSession userSession2 = (UserSession) this.A03;
                User A012 = r0.A01(userSession2);
                if (r8 == null || (A0U = C41845B3m.A0U(r8)) == null || (requiredTreeField = A0U.getRequiredTreeField(0, "xdt_users__info(user_id:$user_id)", BnS.class, 1319354275)) == null || (requiredTreeField2 = requiredTreeField.getRequiredTreeField(0, PublicKeyCredentialControllerUtility.JSON_KEY_USER, BnR.class, -1990057650)) == null) {
                    z = false;
                } else {
                    z = requiredTreeField2.getCoercedBooleanField(0, AnonymousClass000.A00(1532));
                }
                A012.A03.EnY(Boolean.valueOf(z));
                FB6.A00.A00((FragmentActivity) this.A02, userSession2, (Integer) this.A01);
                return;
            case 3:
                ((F3H) this.A02).A00();
                if (r8 == null || (A0U2 = C41845B3m.A0U(r8)) == null || (requiredTreeField3 = A0U2.getRequiredTreeField(0, "xdt_ig_delete_friends_story(input:$input)", C43662C4k.class, 352707015)) == null || !requiredTreeField3.getRequiredBooleanField(0, "did_delete")) {
                    C59689JTv.A07((Context) this.A01, 2131969788);
                    return;
                } else {
                    ((C62320sa) this.A03).invoke();
                    return;
                }
            default:
                if (r8 != null && (A0U3 = C41845B3m.A0U(r8)) != null && (optionalTreeField = A0U3.getOptionalTreeField(0, C273654mx.A00(150), BnP.class, -200563672)) != null && optionalTreeField.hasFieldValue("should_show_node_in_accounts_center(interface:\"IG_ANDROID\",selected_node_id:\"AD_PROFILE_CENTER\")")) {
                    if (optionalTreeField.getCoercedBooleanField(0, "should_show_node_in_accounts_center(interface:\"IG_ANDROID\",selected_node_id:\"AD_PROFILE_CENTER\")")) {
                        ((0rm) this.A03).A00 = "ad_profile_center";
                    }
                    I3C.A02((FragmentActivity) this.A01, (UserSession) this.A02, (String) ((0rm) this.A03).A00);
                    return;
                }
                return;
        }
    }
}

package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import org.json.JSONObject;

/* renamed from: X.F7u  reason: case insensitive filesystem */
public abstract class C49807F7u {
    public static final void A00(Context context, UserSession userSession, Dc9 dc9, User user) {
        AnonymousClass7TF.A1C(userSession, 0, dc9);
        JSONObject A11 = DbS.A11();
        A11.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, "ok");
        int i = dc9.A00;
        A11.put("notification_setting_type", i);
        user.A03.EQ4(new AnonymousClass48J(DbT.A10(A11)));
        user.A0d(userSession);
        long parseLong = Long.parseLong(userSession.A06);
        long parseLong2 = Long.parseLong(user.getId());
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A02();
        A0a.A0A("api/v1/direct_v2/update_notification_setting/");
        A0a.A0D("user_igid", parseLong);
        A0a.A0D("creator_igid", parseLong2);
        A0a.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, i);
        1OC A0S = DbU.A0S(A0a, C47312Duf.class, F4Y.class);
        EDV.A00(A0S, context, user, 44);
        1ES.A01().schedule(A0S);
    }

    public static final void A01(Context context, User user) {
        String A0h;
        String str;
        FollowStatus B6o = user.B6o();
        FollowStatus followStatus = FollowStatus.A06;
        if (B6o == followStatus) {
            A0h = context.getString(2131968671);
        } else {
            A0h = DbW.A0h(context, context.getString(R.string.f0nameremoved), 2131976913);
        }
        0qQ.A0A(A0h);
        if (user.B6o() == followStatus) {
            str = "notification_turn_on_error_for_unfollowed_account";
        } else {
            str = "favoriteForBroadcastChat failure";
        }
        C59689JTv.A03(context, A0h, str, 0);
    }
}

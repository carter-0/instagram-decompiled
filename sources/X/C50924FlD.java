package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.user.model.User;
import org.json.JSONObject;

/* renamed from: X.FlD  reason: case insensitive filesystem */
public final class C50924FlD implements 0Js {
    public final /* bridge */ /* synthetic */ void ATN(UserSession userSession, 0Jv r31, Object obj) {
        C49651F0i f0i = (C49651F0i) obj;
        17k.A07(f0i, "Payload for FollowFromOtherAccountOperation cannot be null!");
        Context context = f0i.A00;
        User user = f0i.A04;
        ProgressButton progressButton = f0i.A03;
        EWA ewa = EWA.UserActionFollow;
        1Xj r8 = f0i.A01;
        String str = f0i.A05;
        String str2 = f0i.A07;
        String str3 = f0i.A06;
        UserDetailEntryInfo userDetailEntryInfo = f0i.A02;
        String id = user.getId();
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        UserSession userSession3 = userSession2;
        1OC A00 = C320126ro.A00(context, userSession3, r8, (AnonymousClass3W1) null, (SearchContext) null, (Boolean) null, (Boolean) null, id, "create", "follow_from_other_accounts_fragment", (String) null, (String) null, (String) null, (String) null, (JSONObject) null);
        A00.A00 = new EUG(userSession3, userSession2, this, r31, progressButton, user, user);
        1ES.A03(A00);
        String str4 = str;
        C294695ms.A01((0xF) null, userSession2, r8, userDetailEntryInfo, (SearchContext) null, (C243943aO) null, ewa, user, (Double) null, AnonymousClass05K.A01, (Long) null, str4, str2, str3, (String) null, (String) null, (String) null);
    }
}

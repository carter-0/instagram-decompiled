package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import com.instagram.user.recommended.FollowListData;
import java.util.List;

/* renamed from: X.2wv  reason: invalid class name and case insensitive filesystem */
public final class C234062wv {
    public static final void A00(FragmentActivity fragmentActivity, AnonymousClass0iw r15, UserSession userSession, 1Xj r17, C231292rN r18, String str) {
        C309516Yo r0;
        int ordinal;
        String str2;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        if (fragmentActivity == null) {
            str2 = "trying to navigate to user list fragment on null activity";
        } else if (fragmentActivity.isFinishing()) {
            str2 = "trying to navigate to user list fragment after activity finished";
        } else {
            1Xj r5 = r17;
            List BxO = r5.A0C.BxO();
            UserSession userSession2 = userSession;
            if (BxO != null && (!BxO.isEmpty())) {
                SocialContextType BxW = ((C258223yf) BxO.get(0)).BxW();
                if ((!r5.CcK() || (!(BxW == SocialContextType.FOLLOWED_BY || BxW == SocialContextType.FOLLOWER_COUNT) || !(!C243483Yy.A00.A06(userSession2, r5).isEmpty()))) && ((ordinal = BxW.ordinal()) == 7 || ordinal == 8)) {
                    ((C258223yf) BxO.get(0)).getSocialContextUsersCount();
                    boolean z = false;
                    if (BxW == SocialContextType.FOLLOWED_BY) {
                        z = true;
                    }
                    User CCd = r5.A0C.CCd();
                    if (CCd != null) {
                        FollowListData A00 = C46451DfE.A00(C46443Df5.FOLLOWERS, CCd.getId(), (String) null, false);
                        if (182.A06(0Tu.A05, userSession2, 36319304312822902L)) {
                            F8F.A01(fragmentActivity2, r15, userSession2, (C273414mX) null, CCd, r5.getId(), true, 182.A06(0Tu.A06, userSession2, 2342163894074942390L));
                            return;
                        }
                        r0 = F8I.A00(fragmentActivity, userSession2, A00, z);
                        r0.A0B = str;
                        r0.A04();
                        return;
                    }
                    return;
                }
            }
            if (182.A06(0Tu.A05, userSession2, 36329865636692331L)) {
                Integer num = null;
                C231292rN r02 = r18;
                if (r18 != null) {
                    num = Integer.valueOf(r02.BQr(r5).A03);
                }
                String string = fragmentActivity.getApplicationContext().getString(C49911FEj.A00.A01(userSession2, r5, true));
                0qQ.A07(string);
                String BpP = r5.BpP();
                Bundle bundle = new Bundle();
                bundle.putString(AnonymousClass000.A00(228), BpP);
                bundle.putInt(AnonymousClass000.A00(975), 2131968487);
                bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession2.A05);
                bundle.putBoolean(AnonymousClass000.A00(112), true);
                bundle.putBoolean(AnonymousClass000.A00(236), false);
                if (num != null) {
                    bundle.putInt(AnonymousClass000.A00(113), num.intValue());
                }
                Fragment CrB = C46339Dch.A00().A00.CrB(bundle, userSession2);
                C331127Pr r1 = new C331127Pr(userSession2);
                r1.A0d = string;
                r1.A0D = R.style.IgdsTabView;
                r1.A0a = true;
                r1.A03 = 0.68f;
                r1.A1O = true;
                r1.A00().A02(fragmentActivity, CrB);
                return;
            }
            r0 = F8I.A01(fragmentActivity, userSession2, r5.BpP());
            r0.A0B = str;
            r0.A04();
            return;
        }
        0wb.A03("MediaLinkBroadcastHandler", str2);
    }
}

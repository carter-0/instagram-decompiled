package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.AdsAPIInstagramPosition;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.business.promote.activity.PromoteActivity;
import com.instagram.business.promote.model.PromoteLaunchOrigin;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.mediatype.ProductType;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6Jo  reason: invalid class name and case insensitive filesystem */
public abstract class C305796Jo {
    public static final void A02(Context context, UserSession userSession, String str, String str2, String str3, String str4, List list) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(str, 2);
        0qQ.A0B(str2, 3);
        List<AdsAPIInstagramPosition> list2 = list;
        0qQ.A0B(list2, 6);
        C18138VmE.A00();
        Intent intent = new Intent(context, PromoteActivity.class);
        0eP r4 = new 0eP(AnonymousClass000.A00(751), PromoteLaunchOrigin.AD_PREVIEW);
        0eP r5 = new 0eP("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05);
        0eP r6 = new 0eP("media_id", C18138VmE.A01(str2));
        0eP r7 = new 0eP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        0eP r8 = new 0eP(AnonymousClass000.A00(4701), str3);
        0eP r9 = new 0eP(AnonymousClass000.A00(5121), str4);
        ArrayList arrayList = new ArrayList(0Yv.A1E(list2, 10));
        for (AdsAPIInstagramPosition name : list2) {
            arrayList.add(name.name());
        }
        ArrayList arrayList2 = new ArrayList();
        00k.A0r(arrayList, arrayList2);
        intent.putExtras(Q21.A00(r4, r5, r6, r7, r8, r9, new 0eP("instagram_positions", arrayList2)));
        0kR.A0B(context, intent);
    }

    public static final void A03(Fragment fragment, FragmentActivity fragmentActivity, AnonymousClass0iw r6, UserSession userSession, 1Xj r8) {
        0qQ.A0B(fragmentActivity, 1);
        0qQ.A0B(fragment, 3);
        0qQ.A0B(r8, 4);
        if (C319126q5.A07(userSession) && r8.A5G() && !r8.A5M() && r8.A1t() != AnonymousClass3QO.CLOSE_FRIENDS && r8.A1t() != AnonymousClass3QO.OPAL && r8.A1t() != AnonymousClass3QO.FOLLOWERS_ONLY) {
            String boostUnavailableReason = r8.A0C.getBoostUnavailableReason();
            if (boostUnavailableReason == null || boostUnavailableReason.length() == 0) {
                String boostUnavailableIdentifier = r8.A0C.getBoostUnavailableIdentifier();
                if ((boostUnavailableIdentifier == null || boostUnavailableIdentifier.length() == 0) && A05(userSession, r8) && 182.A06(0Tu.A05, userSession, 36319166873017342L)) {
                    C310336ap r1 = new C310336ap();
                    r1.A04();
                    r1.A01 = 5000;
                    r1.A0D = fragmentActivity.getString(2131976969);
                    r1.A0J = true;
                    if (r8.A1Q() != null) {
                        r1.A03();
                        ImageUrl A1Q = r8.A1Q();
                        if (A1Q != null) {
                            r1.A09 = A1Q;
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    String string = fragmentActivity.getString(2131971454);
                    0qQ.A07(string);
                    r1.A0G = string;
                    r1.A0A(new WYI(fragment, r6, userSession, r8));
                    r1.A0L = true;
                    1xC.A01.A01(new AnonymousClass3GP(r1.A00()));
                }
            }
        }
    }

    public static final void A04(FragmentActivity fragmentActivity, XIGIGBoostCallToAction xIGIGBoostCallToAction, UserSession userSession, AudioOverlayTrack audioOverlayTrack, String str, String str2) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(fragmentActivity, 1);
        0qQ.A0B(str, 2);
        C270634h3 r1 = new C270634h3(ClipsViewerSource.PROMOTE_FLOW_ADS_PREVIEW, userSession);
        String string = fragmentActivity.getString(C18677Vwa.A00(xIGIGBoostCallToAction));
        r1.A1C = str;
        r1.A0b = string;
        r1.A0c = str2;
        r1.A0L = audioOverlayTrack;
        r1.A1B = userSession.A06;
        r1.A1c = false;
        C250563lf.A0X(fragmentActivity, r1.A00(), userSession);
    }

    public static final boolean A05(UserSession userSession, 1Xj r6) {
        int ordinal;
        User A01 = AnonymousClass0t1.A01.A01(userSession);
        if (A01 != r6.A2A(userSession) || !A01.A1M() || (ordinal = r6.A1Z().ordinal()) == 1 || ordinal == 4 || ordinal == 2 || ordinal == 6 || ordinal == 11) {
            return false;
        }
        return true;
    }

    public static final int A00(ProductType productType, boolean z) {
        if (productType != null) {
            int ordinal = productType.ordinal();
            if (ordinal == 9) {
                return 2131957175;
            }
            if (ordinal == 13) {
                return 2131957174;
            }
        }
        if (z) {
            return 2131957173;
        }
        return 2131957172;
    }

    public static final String A01(Resources resources, 1Xj r3) {
        int i;
        if (r3 != null) {
            switch (r3.A1Z().ordinal()) {
                case 1:
                case 2:
                case 4:
                    i = 2131970693;
                    break;
                case 3:
                case 5:
                    i = 2131953965;
                    break;
                case 7:
                    i = 2131962478;
                    break;
                case 10:
                    i = 2131952249;
                    break;
            }
        }
        i = A00(ProductType.CLIPS, false);
        String string = resources.getString(i);
        0qQ.A0A(string);
        return string;
    }
}

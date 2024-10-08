package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.AdsAPIInstagramPosition;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6Kd  reason: invalid class name and case insensitive filesystem */
public abstract class C305936Kd {
    public static final ArrayList A00(XIGIGBoostDestination xIGIGBoostDestination, UserSession userSession, List list) {
        0Tu r2;
        long j;
        0qQ.A0B(userSession, 1);
        0qQ.A0B(xIGIGBoostDestination, 2);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AdsAPIInstagramPosition adsAPIInstagramPosition = (AdsAPIInstagramPosition) it.next();
            if (adsAPIInstagramPosition.ordinal() == 3) {
                int ordinal = xIGIGBoostDestination.ordinal();
                if (ordinal == 8 || ordinal == 1) {
                    r2 = 0Tu.A05;
                    j = 36318574167595313L;
                } else if (ordinal == 10) {
                    r2 = 0Tu.A05;
                    j = 36318574167464240L;
                }
                if (!182.A06(r2, userSession, j)) {
                }
            }
            arrayList.add(adsAPIInstagramPosition);
        }
        return arrayList;
    }

    public static final void A01(FragmentActivity fragmentActivity, AdsAPIInstagramPosition adsAPIInstagramPosition, XIGIGBoostCallToAction xIGIGBoostCallToAction, UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(fragmentActivity, 1);
        0qQ.A0B(str, 2);
        1OC A04 = C3724090s.A04(userSession, str);
        A04.A00 = new C306136Kx(fragmentActivity, adsAPIInstagramPosition, xIGIGBoostCallToAction, userSession);
        1ES.A05(A04, 256520218, 3, false, false);
    }

    public static final void A02(FragmentActivity fragmentActivity, XIGIGBoostDestination xIGIGBoostDestination, C66425MRf mRf, UserSession userSession, String str, String str2, boolean z) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(fragmentActivity, 1);
        C309516Yo r5 = new C309516Yo(fragmentActivity, userSession);
        C322576w3.A00().A02();
        C306146Ky r6 = new C306146Ky();
        r6.setArguments(Q21.A00(new 0eP("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05), new 0eP("media_id", str), new 0eP(AnonymousClass000.A00(2666), str2), new 0eP("destination", String.valueOf(xIGIGBoostDestination)), new 0eP("is_business_account_tier_2_or_higher", Boolean.valueOf(z))));
        r6.A0P = mRf;
        r5.A0D(r6);
        r5.A04();
    }

    public static final boolean A03(AdsAPIInstagramPosition adsAPIInstagramPosition, XIGIGBoostDestination xIGIGBoostDestination, UserSession userSession) {
        int ordinal;
        int ordinal2;
        int ordinal3;
        0qQ.A0B(adsAPIInstagramPosition, 0);
        switch (adsAPIInstagramPosition.ordinal()) {
            case 2:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 13:
                if (xIGIGBoostDestination == null) {
                    return true;
                }
                switch (xIGIGBoostDestination.ordinal()) {
                    case -1:
                    case 1:
                    case 4:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                        return true;
                }
            case 3:
                if (xIGIGBoostDestination == null || (ordinal = xIGIGBoostDestination.ordinal()) == -1 || ordinal == 8 || ordinal == 1 || ordinal == 10) {
                    return true;
                }
                break;
            case 7:
                if (xIGIGBoostDestination != null && (((ordinal3 = xIGIGBoostDestination.ordinal()) == 8 || ordinal3 == 1 || ordinal3 == 10 || ordinal3 == 12 || ordinal3 == 5) && userSession != null)) {
                    return 182.A06(0Tu.A05, userSession, 36321112493204600L);
                }
            case 9:
                if (xIGIGBoostDestination == null || (ordinal2 = xIGIGBoostDestination.ordinal()) == -1 || ordinal2 == 8 || ordinal2 == 1 || ordinal2 == 10 || ordinal2 == 12 || ordinal2 == 5) {
                    return true;
                }
                break;
        }
        return false;
    }

    public static final boolean A04(XIGIGBoostDestination xIGIGBoostDestination, UserSession userSession, List list) {
        Object obj;
        0qQ.A0B(userSession, 1);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (obj == AdsAPIInstagramPosition.PROFILE_FEED) {
                break;
            }
        }
        AdsAPIInstagramPosition adsAPIInstagramPosition = (AdsAPIInstagramPosition) obj;
        if (adsAPIInstagramPosition != null) {
            return A03(adsAPIInstagramPosition, xIGIGBoostDestination, userSession);
        }
        return false;
    }

    public static final boolean A05(UserSession userSession, 1Xj r5, boolean z) {
        if (r5 == null || !r5.CcK()) {
            return false;
        }
        List A3c = r5.A3c();
        return ((A3c != null && A3c.contains(userSession.A06)) || z) && 182.A06(0Tu.A05, userSession, 36321937126926180L);
    }
}

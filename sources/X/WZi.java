package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class WZi implements G6H {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final Context A02;
    public final Fragment A03;

    public final void CI0(Uri uri, Bundle bundle) {
        String str;
        String str2;
        String str3;
        int i;
        0qQ.A0B(uri, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C15376UbU ubU = new C15376UbU();
        Bundle bundle2 = new Bundle();
        UserSession userSession = this.A01;
        C227642jf.A04(bundle2, userSession);
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames != null) {
            Iterator<String> it = queryParameterNames.iterator();
            while (it.hasNext()) {
                String A18 = AnonymousClass7TE.A18(it);
                String queryParameter = uri.getQueryParameter(A18);
                if (queryParameter != null) {
                    linkedHashMap.put(A18, queryParameter);
                    bundle2.putString(A18, queryParameter);
                }
            }
        }
        String A002 = Pxd.A00(82);
        boolean containsKey = linkedHashMap.containsKey(A002);
        String A003 = C273654mx.A00(134);
        if (containsKey || linkedHashMap.containsKey(A003)) {
            if (0qQ.A0K(linkedHashMap.get(A003), "toast")) {
                Iterator A0s = AnonymousClass7TF.A0s(linkedHashMap);
                while (A0s.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                    if (0qQ.A0K(A1J.getKey(), A002)) {
                        Integer[] A004 = AnonymousClass05K.A00(11);
                        int length = A004.length;
                        int i2 = 0;
                        while (i2 < length) {
                            switch (A004[i2].intValue()) {
                                case 1:
                                    i = 4643;
                                    break;
                                case 2:
                                    i = 4644;
                                    break;
                                case 3:
                                    i = 3280;
                                    break;
                                case 4:
                                    i = 301;
                                    break;
                                case 5:
                                    i = 4443;
                                    break;
                                case 6:
                                    i = 243;
                                    break;
                                case 7:
                                    i = 244;
                                    break;
                                case 8:
                                    i = 242;
                                    break;
                                case 9:
                                    i = 293;
                                    break;
                                case 10:
                                    i = 294;
                                    break;
                                default:
                                    i = 4642;
                                    break;
                            }
                            if (!AnonymousClass000.A00(i).equals(A1J.getValue())) {
                                i2++;
                            }
                        }
                    }
                }
            } else if (0qQ.A0K(linkedHashMap.get(A003), "bottomsheet")) {
                Iterator A0s2 = AnonymousClass7TF.A0s(linkedHashMap);
                while (A0s2.hasNext()) {
                    Map.Entry A1J2 = AnonymousClass7TE.A1J(A0s2);
                    String A13 = DbT.A13(A1J2);
                    int hashCode = A13.hashCode();
                    if (hashCode != -608081141) {
                        if (hashCode != -362962279) {
                            if (hashCode == 659055295 && A13.equals(A002)) {
                                Integer[] A005 = AnonymousClass05K.A00(7);
                                int length2 = A005.length;
                                int i3 = 0;
                                while (i3 < length2) {
                                    switch (A005[i3].intValue()) {
                                        case 1:
                                            str3 = "3pd_trial_inline_opt_in";
                                            break;
                                        case 2:
                                            str3 = "3pd_trial_go_to_settings";
                                            break;
                                        case 3:
                                            str3 = "3pd_trial_decide";
                                            break;
                                        case 4:
                                            str3 = "fewer_ads_test_group_content";
                                            break;
                                        case 5:
                                            str3 = "fewer_ads_control_group_content";
                                            break;
                                        case 6:
                                            str3 = "activity_feed_notification_3PD_content";
                                            break;
                                        default:
                                            str3 = "3pd_trial_control";
                                            break;
                                    }
                                    if (!str3.equals(A1J2.getValue())) {
                                        i3++;
                                    }
                                }
                            }
                        } else if (A13.equals(Pxd.A00(845))) {
                            Integer[] A006 = AnonymousClass05K.A00(6);
                            int length3 = A006.length;
                            int i4 = 0;
                            while (i4 < length3) {
                                switch (A006[i4].intValue()) {
                                    case 1:
                                        str2 = "3pd_trial_inline_opt_in";
                                        break;
                                    case 2:
                                        str2 = "3pd_trial_inline_opt_out";
                                        break;
                                    case 3:
                                        str2 = "fewer_ads_test_group_cta";
                                        break;
                                    case 4:
                                        str2 = "fewer_ads_control_group_cta";
                                        break;
                                    case 5:
                                        str2 = "activity_feed_notification_3PD_inline_opt_in";
                                        break;
                                    default:
                                        str2 = "3pd_trial_open_setting_screen";
                                        break;
                                }
                                if (!str2.equals(A1J2.getValue())) {
                                    i4++;
                                }
                            }
                        } else {
                            continue;
                        }
                    } else if (A13.equals(Pxd.A00(870))) {
                        Integer[] A007 = AnonymousClass05K.A00(3);
                        int length4 = A007.length;
                        int i5 = 0;
                        while (i5 < length4) {
                            switch (A007[i5].intValue()) {
                                case 1:
                                    str = "3pd_trial_cancel";
                                    break;
                                case 2:
                                    str = "activity_feed_notification_not_now";
                                    break;
                                default:
                                    str = "3pd_trial_not_now";
                                    break;
                            }
                            if (!str.equals(A1J2.getValue())) {
                                i5++;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
            ubU.setArguments(bundle2);
            if (0qQ.A0K(linkedHashMap.get(A003), "bottomsheet")) {
                C331127Pr r1 = new C331127Pr(userSession);
                r1.A1O = true;
                r1.A0k = true;
                r1.A0T = ubU;
                r1.A0U = ubU;
                r1.A00().A02(this.A03.requireActivity(), ubU);
                return;
            }
            return;
        }
        new C2356630s(this.A00, userSession).A00("unknown_params_received", linkedHashMap);
    }

    public WZi(Context context, Fragment fragment, AnonymousClass0iw r3, UserSession userSession) {
        this.A03 = fragment;
        this.A01 = userSession;
        this.A00 = r3;
        this.A02 = context;
    }
}

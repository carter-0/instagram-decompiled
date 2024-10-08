package X;

import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.AdsAPIInstagramPosition;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class U89 extends AnonymousClass9YH {
    public final Bundle A00;
    public final AudioOverlayTrack A01;

    public final 2YL A02(C319836rJ r28, Class cls, String str) {
        C319836rJ r2 = r28;
        AnonymousClass7TG.A1T(str, cls, r2);
        UserSession A06 = 09i.A0A.A06(this.A00);
        Object A002 = r2.A00("destination");
        if (A002 != null) {
            XIGIGBoostDestination valueOf = XIGIGBoostDestination.valueOf((String) A002);
            Object A003 = r2.A00("media_id");
            if (A003 != null) {
                String str2 = (String) A003;
                Object A004 = r2.A00("call_to_action");
                if (A004 != null) {
                    XIGIGBoostCallToAction valueOf2 = XIGIGBoostCallToAction.valueOf((String) A004);
                    List list = (List) r2.A00("instagram_positions");
                    if (list != null) {
                        ArrayList A0p = AnonymousClass7TF.A0p(list);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            A0p.add(AdsAPIInstagramPosition.valueOf(AnonymousClass7TE.A18(it)));
                        }
                        ArrayList A005 = C305936Kd.A00(valueOf, A06, A0p);
                        ArrayList<Object> arrayList = new ArrayList<>();
                        Iterator it2 = A005.iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            AdsAPIInstagramPosition adsAPIInstagramPosition = (AdsAPIInstagramPosition) next;
                            if (adsAPIInstagramPosition != AdsAPIInstagramPosition.PROFILE_FEED || C305936Kd.A03(adsAPIInstagramPosition, valueOf, A06)) {
                                arrayList.add(next);
                            }
                        }
                        boolean A1Z = C51972G9s.A1Z((Boolean) r2.A00("is_fb_placement_eligible"));
                        boolean A1Z2 = C51972G9s.A1Z((Boolean) r2.A00("is_fb_placement_selected"));
                        boolean A1Z3 = C51972G9s.A1Z((Boolean) r2.A00("is_ad_format_preferences_eligible"));
                        boolean A1Z4 = C51972G9s.A1Z((Boolean) r2.A00("should_show_creative_optimization_toggle"));
                        boolean A1X = C13991Tnr.A1X(r2, "should_show_multi_advertiser_ads_toggle");
                        Object A006 = r2.A00("special_requirement_categories");
                        if (A006 != null) {
                            List list2 = (List) A006;
                            String str3 = (String) r2.A00("political_ad_byline_text");
                            boolean A1X2 = C13991Tnr.A1X(r2, "is_view_pager_child");
                            String obj = valueOf2.toString();
                            ArrayList A0p2 = AnonymousClass7TF.A0p(arrayList);
                            for (Object A1X3 : arrayList) {
                                DbU.A1X(A1X3, A0p2);
                            }
                            return new C60222Jhf(valueOf2, valueOf, new C63834L8p(ImmutableList.copyOf((Collection) A0p2), A06, str2, obj, list2), A06, this.A01, str2, str3, arrayList, A1Z, A1Z2, A1Z3, A1Z4, A1X, A1X2);
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public U89(Bundle bundle, AnonymousClass0g9 r2, AudioOverlayTrack audioOverlayTrack) {
        super(bundle, r2);
        this.A00 = bundle;
        this.A01 = audioOverlayTrack;
    }
}

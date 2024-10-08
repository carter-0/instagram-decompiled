package X;

import com.instagram.api.schemas.InstagramProfileCallToActionDestinations;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.PromoteData;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.VAf  reason: case insensitive filesystem */
public abstract class C16902VAf {
    public static final List A00(PromoteData promoteData) {
        if (promoteData.A1q.isEmpty() || promoteData.A0i != XIGIGBoostDestination.PROFILE_VISITS) {
            return null;
        }
        Set set = promoteData.A24;
        0qQ.A06(set);
        ArrayList<InstagramProfileCallToActionDestinations> arrayList = new ArrayList<>();
        for (Object next : set) {
            InstagramProfileCallToActionDestinations instagramProfileCallToActionDestinations = (InstagramProfileCallToActionDestinations) next;
            0qQ.A0A(instagramProfileCallToActionDestinations);
            if (W3E.A00(instagramProfileCallToActionDestinations, promoteData) || instagramProfileCallToActionDestinations == InstagramProfileCallToActionDestinations.WHATSAPP_MESSAGE) {
                arrayList.add(next);
            }
        }
        ArrayList A0r = AnonymousClass7TG.A0r(arrayList);
        for (InstagramProfileCallToActionDestinations instagramProfileCallToActionDestinations2 : arrayList) {
            A0r.add(instagramProfileCallToActionDestinations2.A00);
        }
        return A0r;
    }
}

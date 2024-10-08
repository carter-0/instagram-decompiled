package X;

import com.instagram.business.promote.model.AudienceGeoLocation;
import com.instagram.business.promote.model.PendingLocation;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.WOc  reason: case insensitive filesystem */
public final class C19170WOc implements X3P {
    public final /* synthetic */ C15284UZo A00;

    public C19170WOc(C15284UZo uZo) {
        this.A00 = uZo;
    }

    public final void DLt(AudienceGeoLocation audienceGeoLocation) {
        C15284UZo uZo = this.A00;
        C14799U9t u9t = uZo.A05;
        if (u9t == null) {
            0qQ.A0F("selectedLocationAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
        PendingLocation pendingLocation = u9t.A01.A0o;
        List list = pendingLocation.A05;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = ((AudienceGeoLocation) it.next()).A06;
            if (str != null) {
                String str2 = audienceGeoLocation.A06;
                if (str2 != null) {
                    if (str.equals(str2)) {
                        it.remove();
                        pendingLocation.A05 = list;
                        PromoteState.A01(u9t.A02, AnonymousClass05K.A1I);
                        u9t.notifyDataSetChanged();
                        break;
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        W2W w2w = C17149VKb.A00;
        List list2 = ((PromoteData) AnonymousClass7TE.A14(uZo.A0E)).A0o.A05;
        ArrayList arrayList = new ArrayList();
        int size = list2.size();
        while (true) {
            size--;
            if (size > 0) {
                AudienceGeoLocation audienceGeoLocation2 = (AudienceGeoLocation) list2.get(size);
                if (W2W.A03(audienceGeoLocation2, list2.subList(0, size))) {
                    arrayList.add(audienceGeoLocation2);
                }
            } else {
                uZo.A06 = arrayList;
                C15284UZo.A00(uZo);
                return;
            }
        }
    }
}

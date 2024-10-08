package X;

import android.content.Context;
import android.location.Location;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.intf.MediaMapQuery;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.VwC  reason: case insensitive filesystem */
public final class C18657VwC {
    public boolean A00;
    public boolean A01;
    public final C17896Vhn A02;
    public final C18062Vko A03;
    public final W3Q A04;
    public final Set A05 = new HashSet();
    public final Set A06 = new CopyOnWriteArraySet();
    public final Context A07;
    public final AnonymousClass07i A08;
    public final UserSession A09;
    public final Map A0A = new HashMap();

    public static void A00(C18657VwC vwC, MediaMapQuery mediaMapQuery) {
        vwC.A05.remove(mediaMapQuery);
        for (C20975X7o DFn : vwC.A06) {
            DFn.DFn(vwC, mediaMapQuery);
        }
    }

    public final int A01(MediaMapQuery mediaMapQuery, MediaMapPin mediaMapPin) {
        if (mediaMapPin == null) {
            return -1;
        }
        return new ArrayList(A02(mediaMapQuery).A02).indexOf(C18231Vnv.A01(mediaMapPin));
    }

    public final C17855Vh8 A02(MediaMapQuery mediaMapQuery) {
        Map map = this.A0A;
        C17855Vh8 vh8 = (C17855Vh8) map.get(mediaMapQuery);
        if (vh8 != null) {
            return vh8;
        }
        C17855Vh8 vh82 = new C17855Vh8();
        map.put(mediaMapQuery, vh82);
        return vh82;
    }

    public final void A03(Location location, MediaMapQuery mediaMapQuery, C17523VZc vZc) {
        1P0 ufr;
        1NY A0N;
        if (!this.A05.contains(mediaMapQuery)) {
            mediaMapQuery.A05 = false;
            mediaMapQuery.A04 = false;
            C16614UyA uyA = mediaMapQuery.A06;
            if (uyA == C16614UyA.SAVED) {
                UserSession userSession = this.A09;
                ufr = new C15619Ufl(9, this, MediaMapQuery.A09);
                A0N = DbU.A0O(userSession);
                A0N.A0A("map/all_saved_locations/");
                A0N.A0R(NHS.class, C70890OQi.class);
            } else if (vZc != null) {
                UserSession userSession2 = this.A09;
                ufr = new C15625Ufr(12, this, vZc, mediaMapQuery);
                A0N = DbU.A0N(userSession2);
                A0N.A0A("map/map_region/");
                A0N.A0R(NHS.class, C70890OQi.class);
                C18682Vwg.A02(A0N, vZc);
                if (uyA != C16614UyA.POPULAR) {
                    A0N.A9m("query_type", uyA.toString());
                    A0N.A9m(AnonymousClass000.A00(1733), mediaMapQuery.A07);
                }
                if (location != null) {
                    A0N.A9m("user_lat", String.valueOf(location.getLatitude()));
                    A0N.A9m("user_lng", String.valueOf(location.getLongitude()));
                }
            } else {
                return;
            }
            1OC A0K = DbW.A0K(A0N);
            A0K.A00 = ufr;
            1ES.A00(this.A07, this.A08, A0K);
        }
    }

    public final void A04(MediaMapQuery mediaMapQuery) {
        for (C20975X7o Dvc : this.A06) {
            Dvc.Dvc(this, A02(mediaMapQuery), mediaMapQuery);
        }
    }

    public final void A05(MediaMapQuery mediaMapQuery, C17523VZc vZc, Integer num, List list, List list2) {
        int intValue;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MediaMapPin mediaMapPin = (MediaMapPin) it.next();
                this.A03.A02(this.A02, mediaMapPin);
                arrayList.add(C18231Vnv.A01(mediaMapPin));
            }
        }
        C17855Vh8 A022 = A02(mediaMapQuery);
        A022.A00 = vZc;
        List list3 = A022.A02;
        list3.clear();
        list3.addAll(arrayList);
        List list4 = A022.A03;
        list4.clear();
        if (list2 != null) {
            list4.addAll(list2);
        }
        if (num != null && (intValue = num.intValue()) >= 0 && intValue <= Pxe.A0A(arrayList)) {
            A022.A01 = (String) arrayList.get(intValue);
        }
    }

    public C18657VwC(Context context, AnonymousClass07i r3, UserSession userSession, C17896Vhn vhn, C18062Vko vko, W3Q w3q) {
        this.A07 = context;
        this.A09 = userSession;
        this.A08 = r3;
        this.A03 = vko;
        this.A02 = vhn;
        this.A04 = w3q;
    }
}

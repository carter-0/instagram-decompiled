package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.discovery.mediamap.model.LocationPageInformation;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.model.venue.Venue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: X.Vko  reason: case insensitive filesystem */
public final class C18062Vko {
    public final HashMap A00 = new HashMap();
    public final Map A01 = new HashMap();
    public final Map A02 = new HashMap();
    public final Set A03 = new HashSet();
    public final Set A04 = new HashSet();
    public final UserSession A05;

    public final MediaMapPin A00(String str) {
        Map map = this.A02;
        MediaMapPin mediaMapPin = (MediaMapPin) map.get(str);
        if (mediaMapPin != null) {
            return mediaMapPin;
        }
        Venue venue = new Venue();
        venue.A06(str);
        MediaMapPin mediaMapPin2 = new MediaMapPin((ImageUrl) null, (LocationPageInformation) null, C16557Ux9.UNKNOWN, venue, (Double) null, (Double) null, (String) null, 0);
        map.put(str, mediaMapPin2);
        return mediaMapPin2;
    }

    public final void A01(UserSession userSession, AnonymousClass4D6 r12, C17896Vhn vhn, VN6 vn6, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            MediaMapPin mediaMapPin = (MediaMapPin) this.A02.get(next);
            if (mediaMapPin == null || mediaMapPin.A06 == null) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            VN6 vn62 = vn6;
            EDW edw = new EDW(4, vn62, this, vhn, userSession);
            String A002 = VBY.A00(arrayList);
            if (A002 != null) {
                1NY A0N = DbU.A0N(userSession);
                A0N.A0A("map/hydrate_locations/");
                A0N.A9m("location_ids", A002);
                1OC A0N2 = DbY.A0N(A0N, NH1.class, C70891OQj.class);
                A0N2.A00 = edw;
                r12.schedule(A0N2);
            }
        }
    }

    public final void A02(C17896Vhn vhn, MediaMapPin mediaMapPin) {
        C267324bN r0;
        LocationPageInformation locationPageInformation;
        Map map = this.A02;
        MediaMapPin mediaMapPin2 = (MediaMapPin) map.get(C18231Vnv.A01(mediaMapPin));
        if (mediaMapPin2 != null) {
            LocationPageInformation locationPageInformation2 = mediaMapPin2.A06;
            if (locationPageInformation2 != null && ((locationPageInformation = mediaMapPin.A06) == null || locationPageInformation.A00() == null)) {
                mediaMapPin.A06 = locationPageInformation2;
            }
            AnonymousClass3HX r1 = mediaMapPin2.A08;
            if (r1 != null && mediaMapPin.A08 == null) {
                mediaMapPin.A08 = r1;
            }
            if (mediaMapPin2.A00() != null && mediaMapPin.A00() == null) {
                mediaMapPin.A04 = mediaMapPin2.A00();
            }
            C276014sL r02 = mediaMapPin2.A03;
            if (r02 != null) {
                C295325ny.A02(r02);
                C276014sL r03 = mediaMapPin.A03;
                if (r03 != null) {
                    C295325ny.A02(r03);
                } else {
                    C276014sL r04 = mediaMapPin2.A03;
                    if (r04 != null) {
                        r0 = C295325ny.A02(r04);
                    } else {
                        r0 = null;
                    }
                    mediaMapPin.A03 = C295325ny.A00(r0);
                }
            }
            String str = mediaMapPin2.A0D;
            if (str != null && mediaMapPin.A0D == null) {
                mediaMapPin.A0D = str;
            }
        }
        map.put(C18231Vnv.A01(mediaMapPin), mediaMapPin);
        mediaMapPin.A04 = (ImageUrl) this.A00.get(C18231Vnv.A01(mediaMapPin));
        AnonymousClass3HX r12 = mediaMapPin.A08;
        if (r12 != null) {
            vhn.A00(r12, C18231Vnv.A01(mediaMapPin));
        }
        if (mediaMapPin2 != null) {
            Collection collection = (Collection) this.A01.get(C18231Vnv.A01(mediaMapPin));
            if (collection != null) {
                Iterator A16 = Pxg.A16(collection);
                while (A16.hasNext()) {
                    ((C20903X3u) A16.next()).DXG(mediaMapPin);
                }
            }
            for (C20903X3u DXG : this.A03) {
                DXG.DXG(mediaMapPin);
            }
        }
    }

    public final void A03(C20903X3u x3u, String str) {
        Map map = this.A01;
        Set set = (Set) map.get(str);
        if (set == null) {
            set = Collections.newSetFromMap(new WeakHashMap());
            map.put(str, set);
        }
        set.add(x3u);
    }

    public C18062Vko(UserSession userSession) {
        this.A05 = userSession;
    }
}

package X;

import android.graphics.drawable.Drawable;
import com.facebook.android.maps.model.LatLng;
import com.facebook.android.maps.model.LatLngBounds;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.Vwg  reason: case insensitive filesystem */
public abstract class C18682Vwg {
    public static void A01(WFU wfu, Collection collection, int i, int i2) {
        if (!collection.isEmpty()) {
            C18606Vuz vuz = new C18606Vuz();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                MediaMapPin mediaMapPin = (MediaMapPin) it.next();
                vuz.A02(new LatLng(mediaMapPin.A0A.doubleValue(), mediaMapPin.A0B.doubleValue()));
            }
            LatLngBounds A01 = vuz.A01();
            LatLng latLng = A01.A01;
            double d = latLng.A00;
            LatLng latLng2 = A01.A00;
            double d2 = latLng2.A00;
            double d3 = latLng.A01;
            double d4 = latLng2.A01;
            MediaMapPin mediaMapPin2 = (MediaMapPin) collection.iterator().next();
            String str = mediaMapPin2.A0D;
            WFU wfu2 = wfu;
            WFU wfu3 = wfu2;
            String str2 = str;
            C16076Uo3 uo3 = new C16076Uo3((Drawable) null, (C19879Wh8) null, wfu3, mediaMapPin2.A00(), (C20958X6l) null, str2, C18231Vnv.A01(mediaMapPin2), (String) null, mediaMapPin2.A0A.doubleValue(), mediaMapPin2.A0B.doubleValue(), C13988Tno.A09(wfu2.A0G, 64), AnonymousClass7TF.A1V(mediaMapPin2.A08), AnonymousClass7TF.A1V(mediaMapPin2.A03), false);
            int intrinsicHeight = uo3.A05.getIntrinsicHeight();
            double d5 = ((((double) intrinsicHeight) * (d2 - d)) / ((double) i)) + d2;
            double intrinsicWidth = (((double) (uo3.A05.getIntrinsicWidth() / 2)) * (d4 - d3)) / ((double) i2);
            vuz.A02(new LatLng(d5, d4 + intrinsicWidth));
            vuz.A02(new LatLng(d5, d3 - intrinsicWidth));
            LatLngBounds A012 = vuz.A01();
            C18580VuW vuW = new C18580VuW();
            vuW.A09 = A012;
            vuW.A07 = 0;
            wfu2.A09(vuW, (X29) null, 0);
        }
    }

    public static HashSet A00(C17523VZc vZc, Collection collection) {
        HashSet hashSet = new HashSet();
        LatLngBounds latLngBounds = new LatLngBounds(vZc.A04, vZc.A01);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            MediaMapPin mediaMapPin = (MediaMapPin) it.next();
            if (latLngBounds.A01(mediaMapPin.Bdm())) {
                hashSet.add(mediaMapPin);
            }
        }
        return hashSet;
    }

    public static void A02(1NY r3, C17523VZc vZc) {
        LatLng latLng = vZc.A02;
        r3.A9m("left_lng", Double.toString(latLng.A01));
        r3.A9m("top_lat", Double.toString(latLng.A00));
        LatLng latLng2 = vZc.A03;
        r3.A9m("right_lng", Double.toString(latLng2.A01));
        r3.A9m("bottom_lat", Double.toString(latLng2.A00));
        LatLng latLng3 = vZc.A00;
        r3.A9m("center_lng", Double.toString(latLng3.A01));
        r3.A9m("center_lat", Double.toString(latLng3.A00));
    }
}

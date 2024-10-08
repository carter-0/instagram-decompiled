package X;

import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.model.venue.Venue;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class WFB implements X8E {
    public final C17993VjV A00;
    public final int A01;
    public final WFU A02;
    public final UserSession A03;
    public final C20958X6l A04;
    public final Map A05 = new HashMap();

    public final void ADW(C19879Wh8 wh8, VL7 vl7) {
        ((C16076Uo3) vl7.A00).invalidateDrawable((Drawable) null);
    }

    public final VL7 ALc(C19879Wh8 wh8, int i) {
        String name;
        C19879Wh8 wh82 = wh8;
        LinkedList A042 = wh82.A04();
        Collections.sort(A042, new C20373WqD(9));
        Object peek = A042.peek();
        peek.getClass();
        MediaMapPin mediaMapPin = (MediaMapPin) peek;
        Venue A002 = C18231Vnv.A00(mediaMapPin.A09);
        if (A002.A00.getShortName() != null) {
            name = A002.A00.getShortName();
        } else {
            name = A002.A00.getName();
        }
        WFU wfu = this.A02;
        String str = mediaMapPin.A0D;
        ImageUrl A003 = mediaMapPin.A00();
        String A012 = C18231Vnv.A01(mediaMapPin);
        double d = wh82.A03().A00;
        double d2 = wh82.A03().A01;
        0nA.A04(wfu.A0G, 64);
        double d3 = d2;
        C16076Uo3 uo3 = new C16076Uo3((Drawable) null, wh82, wfu, A003, this.A04, str, A012, name, d, d3, this.A01, AnonymousClass7TF.A1V(mediaMapPin.A08), AnonymousClass7TF.A1V(mediaMapPin.A03), false);
        Iterator it = A042.iterator();
        while (it.hasNext()) {
            this.A05.put(it.next(), new WeakReference(uo3));
        }
        return new VL7(uo3);
    }

    public final void AoS(W2R w2r, AnonymousClass2R4 r4, Collection collection, float f) {
        this.A00.A00(w2r, r4, collection, new HashMap());
    }

    public WFB(WFU wfu, UserSession userSession, C20958X6l x6l, Collection collection, int i, int i2) {
        this.A02 = wfu;
        this.A04 = x6l;
        this.A01 = i;
        this.A00 = new C17993VjV((WFX) null, collection, i2);
        this.A03 = userSession;
    }

    public final void EDS(C19879Wh8 wh8) {
        Iterator it = wh8.A04().iterator();
        while (it.hasNext()) {
            this.A05.remove(it.next());
        }
    }
}

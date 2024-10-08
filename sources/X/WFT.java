package X;

import android.graphics.drawable.Drawable;
import com.facebook.android.maps.model.LatLng;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.model.venue.LocationDict;
import com.instagram.save.model.SavedCollection;

public final class WFT implements X2E {
    public final /* synthetic */ double A00;
    public final /* synthetic */ double A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ MediaMapPin A06;
    public final /* synthetic */ C54177H1x A07;
    public final /* synthetic */ SavedCollection A08;

    public WFT(UserSession userSession, MediaMapPin mediaMapPin, C54177H1x h1x, SavedCollection savedCollection, double d, double d2, int i, int i2, int i3) {
        this.A00 = d;
        this.A01 = d2;
        this.A03 = i;
        this.A06 = mediaMapPin;
        this.A05 = userSession;
        this.A07 = h1x;
        this.A08 = savedCollection;
        this.A04 = i2;
        this.A02 = i3;
    }

    public final void DPZ(WFU wfu) {
        WFU wfu2 = wfu;
        0qQ.A0B(wfu2, 0);
        wfu2.A03();
        double d = this.A00;
        double d2 = this.A01;
        C18580VuW.A00(wfu2, new LatLng(d, d2), 14.0f);
        int i = this.A03;
        C18580VuW vuW = new C18580VuW();
        vuW.A01 = 0.0f;
        vuW.A02 = ((float) i) / -2.0f;
        wfu2.A09(vuW, (X29) null, 0);
        MediaMapPin mediaMapPin = this.A06;
        ImageUrl A002 = mediaMapPin.A00();
        String A012 = C18231Vnv.A01(mediaMapPin);
        0nA.A04(wfu2.A0G, 64);
        LocationDict locationDict = mediaMapPin.A09;
        0qQ.A0B(locationDict, 0);
        wfu2.A0A(new C16076Uo3((Drawable) null, (C19879Wh8) null, wfu2, A002, (C20958X6l) null, "NO-MEDIA-ID", A012, locationDict.getName(), d, d2, i, false, false, false));
        wfu2.A06 = new WFJ(this.A07, this.A08, this.A04, this.A02);
    }
}

package X;

import com.instagram.discovery.mediamap.fragment.MediaMapFragment;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.WVr  reason: case insensitive filesystem */
public final class C19350WVr implements C20903X3u {
    public final /* synthetic */ MediaMapFragment A00;
    public final /* synthetic */ String A01;

    public C19350WVr(MediaMapFragment mediaMapFragment, String str) {
        this.A00 = mediaMapFragment;
        this.A01 = str;
    }

    public final void DXG(MediaMapPin mediaMapPin) {
        Double d;
        MediaMapFragment mediaMapFragment = this.A00;
        C18062Vko vko = mediaMapFragment.A09;
        Set set = (Set) vko.A01.get(this.A01);
        if (set != null) {
            set.remove(this);
        }
        mediaMapFragment.A08 = null;
        C18663VwL vwL = mediaMapFragment.mMapViewController;
        HashSet A012 = C281945Ae.A01(1);
        Collections.addAll(A012, new MediaMapPin[]{mediaMapPin});
        vwL.A0G(A012);
        mediaMapFragment.mMapViewController.A09();
        Double d2 = mediaMapPin.A0A;
        if (!(d2 == null || (d = mediaMapPin.A0B) == null)) {
            mediaMapFragment.mMapViewController.A0B(d2.doubleValue(), d.doubleValue(), 16.0f);
            C18663VwL.A00(mediaMapFragment.A0A, mediaMapFragment.mMapViewController);
        }
        mediaMapFragment.A0H = mediaMapPin;
        mediaMapFragment.A0L = false;
        MediaMapFragment.A06(mediaMapFragment);
    }
}

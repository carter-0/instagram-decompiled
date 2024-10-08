package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.android.maps.model.LatLng;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.venue.Venue;

public final class WFS implements X2E {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ ImageUrl A01;
    public final /* synthetic */ UEG A02;
    public final /* synthetic */ C15260UXv A03;
    public final /* synthetic */ VOO A04;
    public final /* synthetic */ Venue A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public WFS(Context context, ImageUrl imageUrl, UEG ueg, C15260UXv uXv, VOO voo, Venue venue, String str, boolean z) {
        this.A00 = context;
        this.A05 = venue;
        this.A02 = ueg;
        this.A07 = z;
        this.A01 = imageUrl;
        this.A06 = str;
        this.A04 = voo;
        this.A03 = uXv;
    }

    public final void DPZ(WFU wfu) {
        WFU wfu2 = wfu;
        wfu2.A03();
        int A012 = AnonymousClass1GB.A01(0nA.A04(this.A00, 64));
        Venue venue = this.A05;
        Double A002 = venue.A00();
        0qQ.A0A(A002);
        double doubleValue = A002.doubleValue();
        Double A013 = venue.A01();
        0qQ.A0A(A013);
        double doubleValue2 = A013.doubleValue();
        C18580VuW.A00(wfu2, new LatLng(doubleValue, doubleValue2), 14.0f);
        UEG ueg = this.A02;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        C18580VuW vuW = new C18580VuW();
        vuW.A01 = 0.0f;
        vuW.A02 = (float) ((-AnonymousClass1GB.A01((float) (ueg.A01 / 2))) + ueg.A00);
        wfu2.A09(vuW, (X29) null, 0);
        if (!this.A07) {
            VOO voo = this.A04;
            ImageUrl imageUrl = this.A01;
            WZ5 wz5 = new WZ5(imageUrl, this.A03, voo, venue);
            String A052 = venue.A05();
            0nA.A04(wfu2.A0G, 64);
            String str = this.A06;
            wfu2.A0A(new C16076Uo3((Drawable) null, (C19879Wh8) null, wfu2, imageUrl, wz5, "NO-MEDIA-ID", A052, str, doubleValue, doubleValue2, A012, false, false, false));
        }
        wfu2.A06 = new WFI(this.A01, this.A03, this.A04, venue);
    }
}

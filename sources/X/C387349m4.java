package X;

import com.instagram.model.venue.LocationDict;
import com.instagram.model.venue.Venue;

/* renamed from: X.9m4  reason: invalid class name and case insensitive filesystem */
public final class C387349m4 extends AnonymousClass6MU {
    public LocationDict A00;
    public Integer A01;

    public final Integer CAk() {
        return AnonymousClass05K.A09;
    }

    public C387349m4(Venue venue, Integer num) {
        this.A00 = venue.A00.FG5();
        this.A01 = num;
    }

    public final C273914nO BkW() {
        C273914nO A0C = AnonymousClass7TH.A0C();
        A0C.A06 = 0sr.A1P(new String[]{"location_sticker_vibrant", "location_sticker_subtle", "location_sticker_rainbow"});
        A0C.A01(this.A00);
        return A0C;
    }

    public C387349m4() {
    }
}

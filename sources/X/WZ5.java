package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.venue.Venue;

public final class WZ5 implements C20958X6l {
    public final /* synthetic */ ImageUrl A00;
    public final /* synthetic */ C15260UXv A01;
    public final /* synthetic */ VOO A02;
    public final /* synthetic */ Venue A03;

    public final boolean DXJ(C19879Wh8 wh8, C16076Uo3 uo3, String str) {
        return false;
    }

    public WZ5(ImageUrl imageUrl, C15260UXv uXv, VOO voo, Venue venue) {
        this.A02 = voo;
        this.A03 = venue;
        this.A00 = imageUrl;
        this.A01 = uXv;
    }

    public final boolean DXK(C16076Uo3 uo3, String str, String str2) {
        VOO voo = this.A02;
        if (voo != null) {
            C15357Ub9.A00(this.A00, voo.A00, this.A03, false);
        }
        return true;
    }
}

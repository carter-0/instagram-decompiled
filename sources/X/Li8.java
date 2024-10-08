package X;

import com.instagram.model.venue.Venue;
import java.util.List;

public final class Li8 implements C232262tL {
    public final Venue A00;
    public final List A01;
    public final boolean A02;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return "video_metadata_location";
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        Li8 li8 = (Li8) obj;
        0qQ.A0B(li8, 0);
        if (!0qQ.A0K(this.A00, li8.A00) || !0qQ.A0K(this.A01, li8.A01)) {
            return false;
        }
        return true;
    }

    public Li8(Venue venue, List list, boolean z) {
        this.A00 = venue;
        this.A01 = list;
        this.A02 = z;
    }
}

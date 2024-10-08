package X;

import com.instagram.model.venue.LocationDict;
import com.instagram.model.venue.Venue;
import java.io.IOException;

/* renamed from: X.JUg  reason: case insensitive filesystem */
public abstract class C59699JUg {
    /* JADX WARNING: type inference failed for: r0v3, types: [com.instagram.model.venue.Venue, java.lang.Object] */
    public static final Venue A00(String str) {
        if (str != null) {
            try {
                16F A03 = AnonymousClass15o.A00.A03(str);
                A03.A12();
                LocationDict parseFromJson = AnonymousClass41Q.parseFromJson(A03);
                0qQ.A07(parseFromJson);
                ? obj = new Object();
                obj.A00 = parseFromJson;
                return obj;
            } catch (IOException e) {
                0kD.A06("VenueConverter", "Failed to deserialize Venue from ClipsDraft", e);
            }
        }
        return null;
    }
}

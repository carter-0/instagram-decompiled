package X;

import com.facebook.location.platform.api.Location;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cgu  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44560Cgu {
    public static Map A00(C46311DUo dUo) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dUo.AZZ() != null) {
            A1H.put(AnonymousClass000.A00(1079), dUo.AZZ());
        }
        if (dUo.AZg() != null) {
            A1H.put("address_street", dUo.AZg());
        }
        if (dUo.AnP() != null) {
            A1H.put("city_id", dUo.AnP());
        }
        if (dUo.AnQ() != null) {
            A1H.put("city_name", dUo.AnQ());
        }
        if (dUo.BHm() != null) {
            A1H.put("instagram_location_id", dUo.BHm());
        }
        if (dUo.BLe() != null) {
            A1H.put(Location.LATITUDE, AnonymousClass7TH.A0D(dUo.BLe()));
        }
        if (dUo.BOb() != null) {
            A1H.put("longitude", AnonymousClass7TH.A0D(dUo.BOb()));
        }
        if (dUo.CHd() != null) {
            A1H.put("zip_code", dUo.CHd());
        }
        return 0Yt.A0B(A1H);
    }
}

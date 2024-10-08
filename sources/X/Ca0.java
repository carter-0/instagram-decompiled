package X;

import com.instagram.api.schemas.LocationNoteResponseInfo;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class Ca0 {
    public static Map A00(LocationNoteResponseInfo locationNoteResponseInfo) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (locationNoteResponseInfo.BNk() != null) {
            A1H.put("location_id", locationNoteResponseInfo.BNk());
        }
        if (locationNoteResponseInfo.BNl() != null) {
            A1H.put("location_name", locationNoteResponseInfo.BNl());
        }
        return 0Yt.A0B(A1H);
    }
}

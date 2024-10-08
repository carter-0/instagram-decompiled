package X;

import com.instagram.api.schemas.IGMusicArtistPinningErrorType;
import com.instagram.realtimeclient.RealtimeConstants;
import java.io.IOException;

public final class F4P {
    public static C47316Duj parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            1XQ r3 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("error_type".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    IGMusicArtistPinningErrorType iGMusicArtistPinningErrorType = (IGMusicArtistPinningErrorType) IGMusicArtistPinningErrorType.A01.get(str);
                    if (iGMusicArtistPinningErrorType == null) {
                        iGMusicArtistPinningErrorType = IGMusicArtistPinningErrorType.UNRECOGNIZED;
                    }
                    r3.A00 = iGMusicArtistPinningErrorType;
                } else if (RealtimeConstants.SEND_SUCCESS.equals(A17)) {
                    r3.A02 = AnonymousClass7TF.A0S(r4);
                } else {
                    1XY.A01(r4, r3, A17);
                }
                r4.A0z();
            }
            r3.A01 = new C47141DrI(r3.A00, C41845B3m.A14(r3.A02));
            return r3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

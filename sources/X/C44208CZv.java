package X;

import com.instagram.api.schemas.ListeningNowResponseInfo;
import com.instagram.api.schemas.ListeningNowState;
import com.instagram.api.schemas.MusicInfoImpl;
import java.io.IOException;

/* renamed from: X.CZv  reason: case insensitive filesystem */
public abstract class C44208CZv {
    public static ListeningNowResponseInfo parseFromJson(16F r9) {
        String str;
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            ListeningNowState listeningNowState = null;
            Boolean bool = null;
            MusicInfoImpl musicInfoImpl = null;
            Integer num = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("is_spotify_save_eligible".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r9);
                } else if ("listening_now_state".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                    listeningNowState = (ListeningNowState) ListeningNowState.A01.get(str);
                    if (listeningNowState == null) {
                        listeningNowState = ListeningNowState.UNRECOGNIZED;
                    }
                } else if ("music_info".equals(A17)) {
                    musicInfoImpl = 1dj.parseFromJson(r9);
                } else {
                    num = C41847B3o.A13(r9, num, A17, "num_spotify_saves");
                }
                r9.A0z();
            }
            if (listeningNowState != null || !(r9 instanceof 0c9)) {
                return new ListeningNowResponseInfo(listeningNowState, musicInfoImpl, bool, num);
            }
            AnonymousClass7TF.A1L("listening_now_state", r9, "ListeningNowResponseInfo");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

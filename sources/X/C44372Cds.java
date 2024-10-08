package X;

import com.instagram.api.schemas.MusicStatusStyleResponseInfoImpl;
import com.instagram.api.schemas.StatusStyleResponseInfoImpl;
import java.io.IOException;

/* renamed from: X.Cds  reason: case insensitive filesystem */
public abstract class C44372Cds {
    public static StatusStyleResponseInfoImpl parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            MusicStatusStyleResponseInfoImpl musicStatusStyleResponseInfoImpl = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("music_response_info".equals(AnonymousClass7TE.A17(r3))) {
                    musicStatusStyleResponseInfoImpl = C44229Caq.parseFromJson(r3);
                }
                r3.A0z();
            }
            return new StatusStyleResponseInfoImpl(musicStatusStyleResponseInfoImpl);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

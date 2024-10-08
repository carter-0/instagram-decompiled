package X;

import com.instagram.api.schemas.MusicInfoImpl;
import java.io.IOException;

public final class B5W {
    public static C43805CDx parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            1XQ r3 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("caption".equals(A0q)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    r3.A02 = str;
                } else if ("music_info".equals(A0q)) {
                    r3.A00 = 1dj.parseFromJson(r4);
                } else {
                    1XY.A01(r4, r3, A0q);
                }
                r4.A0z();
            }
            String str2 = r3.A02;
            MusicInfoImpl musicInfoImpl = r3.A00;
            0qQ.A0A(musicInfoImpl);
            r3.A01 = new B5X(musicInfoImpl, str2);
            return r3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

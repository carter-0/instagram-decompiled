package X;

import com.instagram.api.schemas.MusicStatusStyleResponseInfoImpl;
import java.io.IOException;

/* renamed from: X.Caq  reason: case insensitive filesystem */
public abstract class C44229Caq {
    public static MusicStatusStyleResponseInfoImpl parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if ("audio_cluster_id".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if ("display_artist".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                } else if ("music_title".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r10.A1P();
                    }
                }
                r10.A0z();
            }
            if (str == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("audio_cluster_id", r10, "MusicStatusStyleResponseInfoImpl");
            } else if (str2 == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("display_artist", r10, "MusicStatusStyleResponseInfoImpl");
            } else if (str3 != null || !(r10 instanceof 0c9)) {
                return new MusicStatusStyleResponseInfoImpl(str, str2, str3);
            } else {
                AnonymousClass7TF.A1L("music_title", r10, "MusicStatusStyleResponseInfoImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

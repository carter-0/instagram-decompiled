package X;

import android.net.Uri;
import com.instagram.music.common.model.MusicDataSource;
import java.io.IOException;

/* renamed from: X.A0a  reason: case insensitive filesystem */
public abstract class C39558A0a {
    public static MusicDataSource parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            MusicDataSource musicDataSource = new MusicDataSource();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("progressive_download_url".equals(A17)) {
                    musicDataSource.A05 = AnonymousClass7TG.A0l(r3);
                } else if ("dash_manifest".equals(A17)) {
                    musicDataSource.A04 = AnonymousClass7TG.A0l(r3);
                } else if ("downloaded_track_uri".equals(A17)) {
                    musicDataSource.A00 = Uri.parse(r3.A1Q());
                } else if ("asset_id".equals(A17)) {
                    musicDataSource.A03 = AnonymousClass7TG.A0l(r3);
                } else if ("artist_id".equals(A17)) {
                    musicDataSource.A02 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return musicDataSource;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

package X;

import com.instagram.music.common.model.MusicAssetBeatInfo;
import java.io.IOException;

public abstract class A0Z {
    public static MusicAssetBeatInfo parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            MusicAssetBeatInfo musicAssetBeatInfo = new MusicAssetBeatInfo();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("time_in_ms".equals(A17)) {
                    musicAssetBeatInfo.A00 = r3.A1D();
                } else if ("is_strong".equals(A17)) {
                    musicAssetBeatInfo.A03 = r3.A0d();
                } else if ("is_downbeat".equals(A17)) {
                    musicAssetBeatInfo.A01 = r3.A0d();
                } else if ("is_phrase".equals(A17)) {
                    musicAssetBeatInfo.A02 = r3.A0d();
                } else if ("is_twobar".equals(A17)) {
                    musicAssetBeatInfo.A04 = r3.A0d();
                }
                r3.A0z();
            }
            return musicAssetBeatInfo;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

package X;

import com.instagram.music.common.model.MusicAssetModel;
import java.io.IOException;

/* renamed from: X.KvR  reason: case insensitive filesystem */
public abstract class C63344KvR {
    public static C63662L1y parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            MusicAssetModel musicAssetModel = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                if (C41846B3n.A1b(r5, "track")) {
                    musicAssetModel = C59708JUq.parseFromJson(r5);
                }
                r5.A0z();
            }
            if (musicAssetModel != null || !(r5 instanceof 0c9)) {
                return new C63662L1y(musicAssetModel);
            }
            AnonymousClass7TF.A1L("track", r5, "AudioAssetsResponse.AudioAssetHolder");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

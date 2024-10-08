package X;

import com.instagram.api.schemas.MusicInfo;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class B4P {
    public static Map A00(MusicInfo musicInfo) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (musicInfo.BUk() != null) {
            A1H.put("music_asset_info", musicInfo.BUk().FHC());
        }
        if (musicInfo.BUo() != null) {
            A1H.put("music_canonical_id", musicInfo.BUo());
        }
        if (musicInfo.BUp() != null) {
            A1H.put("music_consumption_info", musicInfo.BUp().FHC());
        }
        return 0Yt.A0B(A1H);
    }
}

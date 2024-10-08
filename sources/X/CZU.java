package X;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CZU {
    public static Map A00(C46281DTk dTk) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        dTk.getHasCoverPhoto();
        A1H.put("has_cover_photo", Boolean.valueOf(dTk.getHasCoverPhoto()));
        if (dTk.getId() != null) {
            C41845B3m.A0x(dTk.getId(), A1H);
        }
        dTk.getNumEpisodes();
        A1H.put("num_episodes", Integer.valueOf(dTk.getNumEpisodes()));
        if (dTk.getTitle() != null) {
            C41845B3m.A12(dTk.getTitle(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}

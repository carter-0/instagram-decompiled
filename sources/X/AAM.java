package X;

import com.instagram.api.schemas.AudioFilterInfo;
import com.instagram.api.schemas.AudioFilterType;
import java.io.IOException;

public abstract class AAM {
    public static AudioFilterInfo parseFromJson(16F r6) {
        String str;
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            AudioFilterType audioFilterType = null;
            while (r6.A1J() != 16L.A09) {
                if ("filter_type".equals(AnonymousClass7TE.A17(r6))) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                    audioFilterType = (AudioFilterType) AudioFilterType.A01.get(str);
                    if (audioFilterType == null) {
                        audioFilterType = AudioFilterType.UNRECOGNIZED;
                    }
                }
                r6.A0z();
            }
            if (audioFilterType != null || !(r6 instanceof 0c9)) {
                return new AudioFilterInfo(audioFilterType);
            }
            AnonymousClass7TF.A1L("filter_type", r6, "AudioFilterInfo");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, AudioFilterInfo audioFilterInfo) {
        r2.A0c();
        AudioFilterType audioFilterType = audioFilterInfo.A00;
        if (audioFilterType != null) {
            r2.A0R("filter_type", audioFilterType.A00);
        }
        r2.A0Z();
    }
}

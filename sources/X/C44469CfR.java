package X;

import com.instagram.api.schemas.ImageURIDictImpl;
import com.instagram.api.schemas.StoryUnlockableStickerDataImpl;
import com.instagram.api.schemas.UnlockableStickerStatus;
import java.io.IOException;

/* renamed from: X.CfR  reason: case insensitive filesystem */
public abstract class C44469CfR {
    public static StoryUnlockableStickerDataImpl parseFromJson(16F r7) {
        String str;
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            String str2 = null;
            String str3 = null;
            ImageURIDictImpl imageURIDictImpl = null;
            UnlockableStickerStatus unlockableStickerStatus = null;
            while (r7.A1J() != 16L.A09) {
                String A0q = r7.A0q();
                if (C41846B3n.A1Y(r7, A0q)) {
                    if (r7.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r7.A1P();
                    }
                } else if (C41845B3m.A19(A0q)) {
                    if (r7.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r7.A1P();
                    }
                } else if ("thumbnail_image".equals(A0q)) {
                    imageURIDictImpl = CZZ.parseFromJson(r7);
                } else if ("unlock_status".equals(A0q)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                    unlockableStickerStatus = (UnlockableStickerStatus) UnlockableStickerStatus.A01.get(str);
                    if (unlockableStickerStatus == null) {
                        unlockableStickerStatus = UnlockableStickerStatus.UNRECOGNIZED;
                    }
                }
                r7.A0z();
            }
            return new StoryUnlockableStickerDataImpl(imageURIDictImpl, unlockableStickerStatus, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

package X;

import com.instagram.api.schemas.MediaGiftCountVisibilityState;
import com.instagram.api.schemas.MediaGiftingState;
import java.io.IOException;

/* renamed from: X.8wF  reason: invalid class name and case insensitive filesystem */
public abstract class C370348wF {
    public static C370358wI parseFromJson(16F r8) {
        String A00;
        String str;
        String str2;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            MediaGiftCountVisibilityState mediaGiftCountVisibilityState = null;
            MediaGiftingState mediaGiftingState = null;
            while (true) {
                16L A1J = r8.A1J();
                16L r6 = 16L.A09;
                A00 = AnonymousClass000.A00(3195);
                if (A1J == r6) {
                    break;
                }
                String A0q = r8.A0q();
                r8.A1J();
                if (A00.equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                    mediaGiftCountVisibilityState = (MediaGiftCountVisibilityState) MediaGiftCountVisibilityState.A01.get(str2);
                    if (mediaGiftCountVisibilityState == null) {
                        mediaGiftCountVisibilityState = MediaGiftCountVisibilityState.UNRECOGNIZED;
                    }
                } else if ("media_gifting_state".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    mediaGiftingState = (MediaGiftingState) MediaGiftingState.A01.get(str);
                    if (mediaGiftingState == null) {
                        mediaGiftingState = MediaGiftingState.UNRECOGNIZED;
                    }
                }
                r8.A0z();
            }
            if (mediaGiftCountVisibilityState == null && (r8 instanceof 0c9)) {
                ((0c9) r8).A03.A00(A00, "MediaAppreciationSettings");
            } else if (mediaGiftingState != null || !(r8 instanceof 0c9)) {
                return new C370358wI(mediaGiftCountVisibilityState, mediaGiftingState);
            } else {
                ((0c9) r8).A03.A00("media_gifting_state", "MediaAppreciationSettings");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

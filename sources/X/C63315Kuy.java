package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.mediakit.model.MediaKitInsightType;
import java.io.IOException;

/* renamed from: X.Kuy  reason: case insensitive filesystem */
public abstract class C63315Kuy {
    public static C61217JzA parseFromJson(16F r8) {
        String str;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            MediaKitInsightType mediaKitInsightType = null;
            String str2 = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if (DialogModule.KEY_TITLE.equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    mediaKitInsightType = (MediaKitInsightType) MediaKitInsightType.A01.get(str);
                    if (mediaKitInsightType == null) {
                        mediaKitInsightType = MediaKitInsightType.UNRECOGNIZED;
                    }
                } else if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                }
                r8.A0z();
            }
            if (mediaKitInsightType == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L(DialogModule.KEY_TITLE, r8, "MediaKitInsight");
            } else if (str2 != null || !(r8 instanceof 0c9)) {
                return new C61217JzA(mediaKitInsightType, str2);
            } else {
                AnonymousClass7TF.A1L(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, r8, "MediaKitInsight");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

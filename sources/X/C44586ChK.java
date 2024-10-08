package X;

import com.instagram.api.schemas.XDTMetaAIMediaSuggestedPromptInfoImpl;
import java.io.IOException;

/* renamed from: X.ChK  reason: case insensitive filesystem */
public abstract class C44586ChK {
    public static XDTMetaAIMediaSuggestedPromptInfoImpl parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            String str = null;
            while (r4.A1J() != 16L.A09) {
                if ("prompt_text".equals(AnonymousClass7TE.A17(r4))) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                }
                r4.A0z();
            }
            return new XDTMetaAIMediaSuggestedPromptInfoImpl(str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

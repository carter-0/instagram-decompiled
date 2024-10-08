package X;

import com.instagram.api.schemas.PromptFirstMediaType;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.HwX  reason: case insensitive filesystem */
public final class C56320HwX {
    /* JADX WARNING: type inference failed for: r2v0, types: [X.H2o, X.5u5] */
    public static C54194H2o parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? r2 = new C298815u5();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("original_prompt_author".equals(A17)) {
                    SimpleImageUrl simpleImageUrl = User.A08;
                    r2.A03 = 1aC.A00(r4, false);
                } else if ("formatted_media_count".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    r2.A04 = A0l;
                } else if ("prompt_sticker_text".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    r2.A05 = A0l2;
                } else if (AnonymousClass000.A00(1124).equals(A17)) {
                    r2.A00 = XVo.A00(AnonymousClass7TG.A0l(r4));
                } else if (AnonymousClass000.A00(1623).equals(A17)) {
                    r2.A01 = XVo.A00(AnonymousClass7TG.A0l(r4));
                } else if ("first_media_pill_state".equals(A17)) {
                    PromptFirstMediaType promptFirstMediaType = (PromptFirstMediaType) PromptFirstMediaType.A01.get(AnonymousClass7TG.A0l(r4));
                    if (promptFirstMediaType == null) {
                        promptFirstMediaType = PromptFirstMediaType.UNRECOGNIZED;
                    }
                    r2.A02 = promptFirstMediaType;
                } else {
                    AnonymousClass93W.A00(r4, r2, A17);
                }
                r4.A0z();
            }
            r2.A01();
            return r2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

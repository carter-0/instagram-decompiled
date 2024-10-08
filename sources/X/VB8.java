package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

public abstract class VB8 {
    public static C15904UkT parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            C15904UkT ukT = new C15904UkT();
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("media_id".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r6);
                    0qQ.A0B(A0l, 0);
                    ukT.A0E = A0l;
                } else if ("carousel_child_media_id".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r6);
                    0qQ.A0B(A0l2, 0);
                    ukT.A07 = A0l2;
                } else if ("media_owner_id".equals(A17)) {
                    String A0l3 = AnonymousClass7TG.A0l(r6);
                    0qQ.A0B(A0l3, 0);
                    ukT.A0F = A0l3;
                } else if (AnonymousClass9NM.A00(10, 8, 28).equals(A17)) {
                    String A0l4 = AnonymousClass7TG.A0l(r6);
                    0qQ.A0B(A0l4, 0);
                    ukT.A0I = A0l4;
                } else if ("user_attribution".equals(A17)) {
                    ukT.A0H = AnonymousClass7TG.A0l(r6);
                } else if ("profile_pic_url".equals(A17)) {
                    SimpleImageUrl A00 = 16h.A00(r6);
                    0qQ.A0B(A00, 0);
                    ukT.A05 = A00;
                } else if ("has_product_tags".equals(A17)) {
                    ukT.A0L = r6.A0d();
                } else if ("carousel_child_has_product_tags".equals(A17)) {
                    ukT.A0J = r6.A0d();
                } else if ("has_collaborators".equals(A17)) {
                    ukT.A0K = r6.A0d();
                } else if ("is_media_author_seller".equals(A17)) {
                    ukT.A0O = r6.A0d();
                } else if (C41845B3m.A1E(A17)) {
                    ukT.A0G = AnonymousClass7TG.A0l(r6);
                } else if (TraceFieldType.Duration.equals(A17)) {
                    ukT.A08 = AnonymousClass7TG.A0l(r6);
                } else if ("duration_ms".equals(A17)) {
                    ukT.A06 = AnonymousClass7TF.A0Z(r6);
                } else if ("event_id".equals(A17)) {
                    ukT.A0A = AnonymousClass7TG.A0l(r6);
                } else if ("event_title".equals(A17)) {
                    ukT.A0C = AnonymousClass7TG.A0l(r6);
                } else if ("event_time".equals(A17)) {
                    ukT.A0B = AnonymousClass7TG.A0l(r6);
                } else if ("event_action_button_text".equals(A17)) {
                    ukT.A09 = AnonymousClass7TG.A0l(r6);
                } else if ("is_autoplay".equals(A17)) {
                    ukT.A0M = r6.A0d();
                } else if ("is_carousel".equals(A17)) {
                    ukT.A0N = r6.A0d();
                } else if ("fundraiser_id".equals(A17)) {
                    ukT.A0D = AnonymousClass7TG.A0l(r6);
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A17)) {
                    ukT.A04 = r6.A1D();
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A17)) {
                    ukT.A00 = r6.A1D();
                } else if ("padding_x".equals(A17)) {
                    ukT.A01 = r6.A1D();
                } else if ("padding_y".equals(A17)) {
                    ukT.A02 = r6.A1D();
                } else if ("repost_pill_width".equals(A17)) {
                    ukT.A03 = r6.A1D();
                } else {
                    AAV.A01(r6, ukT, A17);
                }
                r6.A0z();
            }
            return ukT;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

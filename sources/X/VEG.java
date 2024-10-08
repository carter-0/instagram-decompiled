package X;

import com.instagram.infocenter.model.InfoCenterFactShareInfo;
import java.io.IOException;

public abstract class VEG {
    public static InfoCenterFactShareInfo parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            InfoCenterFactShareInfo infoCenterFactShareInfo = new InfoCenterFactShareInfo();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("info_center_type".equals(A17)) {
                    infoCenterFactShareInfo.A00 = VEC.A00(r3.A1Q());
                } else if ("fact_name".equals(A17)) {
                    infoCenterFactShareInfo.A0A = AnonymousClass7TG.A0l(r3);
                } else if ("bloks_bundle_id".equals(A17)) {
                    infoCenterFactShareInfo.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("header_title".equals(A17)) {
                    infoCenterFactShareInfo.A0G = AnonymousClass7TG.A0l(r3);
                } else if (AnonymousClass000.A00(1408).equals(A17)) {
                    infoCenterFactShareInfo.A0F = AnonymousClass7TG.A0l(r3);
                } else if ("header_icon_url".equals(A17)) {
                    infoCenterFactShareInfo.A0D = AnonymousClass7TG.A0l(r3);
                } else if ("header_icon_width".equals(A17)) {
                    infoCenterFactShareInfo.A0E = AnonymousClass7TG.A0l(r3);
                } else if ("header_icon_height".equals(A17)) {
                    infoCenterFactShareInfo.A0C = AnonymousClass7TG.A0l(r3);
                } else if ("card_background_image_url".equals(A17)) {
                    infoCenterFactShareInfo.A04 = AnonymousClass7TG.A0l(r3);
                } else if ("card_background_image_width".equals(A17)) {
                    infoCenterFactShareInfo.A05 = AnonymousClass7TG.A0l(r3);
                } else if ("card_background_image_height".equals(A17)) {
                    infoCenterFactShareInfo.A03 = AnonymousClass7TG.A0l(r3);
                } else if ("story_background_image_url".equals(A17)) {
                    infoCenterFactShareInfo.A0I = AnonymousClass7TG.A0l(r3);
                } else if ("story_background_image_width".equals(A17)) {
                    infoCenterFactShareInfo.A0J = AnonymousClass7TG.A0l(r3);
                } else if ("story_background_image_height".equals(A17)) {
                    infoCenterFactShareInfo.A0H = AnonymousClass7TG.A0l(r3);
                } else if ("fact_title".equals(A17)) {
                    infoCenterFactShareInfo.A0B = AnonymousClass7TG.A0l(r3);
                } else if ("content_source".equals(A17)) {
                    infoCenterFactShareInfo.A07 = AnonymousClass7TG.A0l(r3);
                } else if ("content_body".equals(A17)) {
                    infoCenterFactShareInfo.A06 = AnonymousClass7TG.A0l(r3);
                } else if ("deep_link_url".equals(A17)) {
                    infoCenterFactShareInfo.A09 = AnonymousClass7TG.A0l(r3);
                } else if ("all_facts_deep_link_url".equals(A17)) {
                    infoCenterFactShareInfo.A01 = AnonymousClass7TG.A0l(r3);
                } else if (AnonymousClass000.A00(1251).equals(A17)) {
                    infoCenterFactShareInfo.A08 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return infoCenterFactShareInfo;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

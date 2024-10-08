package X;

import com.instagram.api.schemas.OpenDraftGalleryCommandImpl;
import com.instagram.api.schemas.OpenInspirationHubCommandImpl;
import java.io.IOException;

/* renamed from: X.HTo  reason: case insensitive filesystem */
public abstract class C54807HTo {
    public static C53451Goj parseFromJson(16F r15) {
        0qQ.A0B(r15, 0);
        try {
            if (r15.A11() != 16L.A0D) {
                r15.A0z();
                return null;
            }
            Boolean bool = null;
            C53455Gon gon = null;
            C52657GaV gaV = null;
            C53456Goo goo = null;
            C53457Gop gop = null;
            OpenDraftGalleryCommandImpl openDraftGalleryCommandImpl = null;
            C53458Goq goq = null;
            OpenInspirationHubCommandImpl openInspirationHubCommandImpl = null;
            C53459Gor gor = null;
            String str = null;
            String str2 = null;
            Boolean bool2 = null;
            while (r15.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r15);
                if ("no_op".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r15);
                } else if ("open_audio_page".equals(A17)) {
                    gon = C54812HTt.parseFromJson(r15);
                } else if ("open_clips_camera".equals(A17)) {
                    gaV = C54813HTu.parseFromJson(r15);
                } else if ("open_creation_tool".equals(A17)) {
                    goo = C54814HTv.parseFromJson(r15);
                } else if ("open_draft".equals(A17)) {
                    gop = C54815HTw.parseFromJson(r15);
                } else if ("open_draft_gallery".equals(A17)) {
                    openDraftGalleryCommandImpl = C54816HTx.parseFromJson(r15);
                } else if ("open_insights_page".equals(A17)) {
                    goq = C54817HTy.parseFromJson(r15);
                } else if ("open_inspiration_hub".equals(A17)) {
                    openInspirationHubCommandImpl = Cb8.parseFromJson(r15);
                } else if ("open_reels_chain".equals(A17)) {
                    gor = C54818HTz.parseFromJson(r15);
                } else if (AnonymousClass000.A00(1654).equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r15.A1P();
                    }
                } else if (!"open_url_in_iab".equals(A17)) {
                    bool2 = C41847B3o.A0z(r15, bool2, A17, "save_audio");
                } else if (r15.A11() == 16L.A0G) {
                    str2 = null;
                } else {
                    str2 = r15.A1P();
                }
                r15.A0z();
            }
            return new C53451Goj(gon, gaV, goo, gop, openDraftGalleryCommandImpl, goq, openInspirationHubCommandImpl, gor, bool, bool2, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

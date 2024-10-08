package X;

import com.instagram.api.schemas.UrpIndexAction;
import com.instagram.api.schemas.UrpRendererType;
import com.instagram.model.showreel.IgShowreelCompositionAssetInfo;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.webrtc.MediaStreamTrack;

public abstract class D0H {
    public static C257993yI parseFromJson(16F r8) {
        String str;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            UrpIndexAction urpIndexAction = null;
            C257843y3 r3 = null;
            String str2 = null;
            Integer num = null;
            BI5 bi5 = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("action".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    urpIndexAction = (UrpIndexAction) UrpIndexAction.A01.get(str);
                    if (urpIndexAction == null) {
                        urpIndexAction = UrpIndexAction.UNRECOGNIZED;
                    }
                } else if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(A17)) {
                    r3 = C45627Czd.parseFromJson(r8);
                } else if ("client_name".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                } else if ("index".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r8);
                } else if ("media_composition".equals(A17)) {
                    bi5 = C44559Cgt.parseFromJson(r8);
                }
                r8.A0z();
            }
            return new C257993yI(r3, urpIndexAction, bi5, num, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r3, C257993yI r4) {
        r3.A0c();
        UrpIndexAction urpIndexAction = r4.A01;
        if (urpIndexAction != null) {
            r3.A0R("action", urpIndexAction.A00);
        }
        C257843y3 r1 = r4.A00;
        if (r1 != null) {
            r3.A0q(MediaStreamTrack.AUDIO_TRACK_KIND);
            C45627Czd.A00(r3, r1);
        }
        String str = r4.A04;
        if (str != null) {
            r3.A0R("client_name", str);
        }
        Integer num = r4.A03;
        if (num != null) {
            r3.A0P("index", num.intValue());
        }
        BI5 bi5 = r4.A02;
        if (bi5 != null) {
            r3.A0q("media_composition");
            r3.A0c();
            List list = bi5.A04;
            if (list != null) {
                Iterator A0s = C41845B3m.A0s(r3, "asset_infos", list);
                while (A0s.hasNext()) {
                    IgShowreelCompositionAssetInfo igShowreelCompositionAssetInfo = (IgShowreelCompositionAssetInfo) A0s.next();
                    if (igShowreelCompositionAssetInfo != null) {
                        C2805452g.A00(r3, igShowreelCompositionAssetInfo);
                    }
                }
                r3.A0Y();
            }
            String str2 = bi5.A01;
            if (str2 != null) {
                r3.A0R("logging_info", str2);
            }
            UrpRendererType urpRendererType = bi5.A00;
            if (urpRendererType != null) {
                r3.A0R("renderer_type", urpRendererType.A00);
            }
            String str3 = bi5.A02;
            if (str3 != null) {
                r3.A0R("rendering_spec", str3);
            }
            String str4 = bi5.A03;
            if (str4 != null) {
                r3.A0R("template_id", str4);
            }
            r3.A0Z();
        }
        r3.A0Z();
    }
}

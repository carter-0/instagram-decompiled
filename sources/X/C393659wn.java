package X;

import java.io.IOException;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.9wn  reason: invalid class name and case insensitive filesystem */
public abstract class C393659wn {
    public static C281915Ab parseFromJson(16F r11) {
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            while (r11.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r11);
                if ("all_others".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                } else if ("mqtt".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r11.A1P();
                    }
                } else if ("native_apps".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r11.A1P();
                    }
                } else if ("photo".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r11.A1P();
                    }
                } else if ("static".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r11.A1P();
                    }
                } else if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r11.A1P();
                    }
                } else if ("video_upload".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r11.A1P();
                    }
                } else if ("web".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r11.A1P();
                    }
                }
                r11.A0z();
            }
            return new C281915Ab(str, str2, str3, str4, str5, str6, str7, str8);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

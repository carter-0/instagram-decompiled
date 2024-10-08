package X;

import com.instagram.api.schemas.MediaNoticeIcon;
import java.io.IOException;

public abstract class CaG {
    public static BFS parseFromJson(16F r9) {
        String str;
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            String str2 = null;
            MediaNoticeIcon mediaNoticeIcon = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if (C41845B3m.A1J(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r9.A1P();
                    }
                } else if ("notice_icon".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                    mediaNoticeIcon = (MediaNoticeIcon) MediaNoticeIcon.A01.get(str);
                    if (mediaNoticeIcon == null) {
                        mediaNoticeIcon = MediaNoticeIcon.UNRECOGNIZED;
                    }
                } else if ("notice_sub_text".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r9.A1P();
                    }
                } else if ("notice_text".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r9.A1P();
                    }
                } else if ("notice_url".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r9.A1P();
                    }
                } else if ("ridge_match_id".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r9.A1P();
                    }
                }
                r9.A0z();
            }
            return new BFS(mediaNoticeIcon, str2, str3, str4, str5, str6);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

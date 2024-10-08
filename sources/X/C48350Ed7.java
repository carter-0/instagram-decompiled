package X;

import com.instagram.api.schemas.MessagingOffPlatformShareType;
import java.io.IOException;

/* renamed from: X.Ed7  reason: case insensitive filesystem */
public abstract class C48350Ed7 {
    public static JV7 parseFromJson(16F r6) {
        String str;
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            MessagingOffPlatformShareType messagingOffPlatformShareType = null;
            String str2 = null;
            String str3 = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("messaging_off_platform_share_type".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                    messagingOffPlatformShareType = (MessagingOffPlatformShareType) MessagingOffPlatformShareType.A01.get(str);
                    if (messagingOffPlatformShareType == null) {
                        messagingOffPlatformShareType = MessagingOffPlatformShareType.UNRECOGNIZED;
                    }
                } else if ("parent_content_id".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r6.A1P();
                    }
                } else if ("shared_content_id".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r6.A1P();
                    }
                }
                r6.A0z();
            }
            return new JV7((Object) messagingOffPlatformShareType, str2, str3, 7);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

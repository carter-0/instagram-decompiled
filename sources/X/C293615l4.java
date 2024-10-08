package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.thread.CreatorSubscriberThreadInfo;
import java.io.IOException;

/* renamed from: X.5l4  reason: invalid class name and case insensitive filesystem */
public abstract class C293615l4 {
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, com.instagram.direct.model.thread.CreatorSubscriberThreadInfo] */
    public static CreatorSubscriberThreadInfo parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            Long l = null;
            String str = null;
            ImageUrl imageUrl = null;
            while (r6.A1J() != 16L.A09) {
                String A0q = r6.A0q();
                r6.A1J();
                if ("pause_unix_timestamp".equals(A0q)) {
                    l = Long.valueOf(r6.A0y());
                } else if ("ig_creator_igid".equals(A0q)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                } else if ("ig_creator_profile_picture_url".equals(A0q)) {
                    imageUrl = 16h.A00(r6);
                }
                r6.A0z();
            }
            ? obj = new Object();
            if (l != null) {
                obj.A01 = l;
            }
            if (str != null) {
                obj.A02 = str;
            }
            if (imageUrl != null) {
                obj.A00 = imageUrl;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r3, CreatorSubscriberThreadInfo creatorSubscriberThreadInfo) {
        r3.A0c();
        Long l = creatorSubscriberThreadInfo.A01;
        if (l != null) {
            r3.A0Q("pause_unix_timestamp", l.longValue());
        }
        String str = creatorSubscriberThreadInfo.A02;
        if (str != null) {
            r3.A0R("ig_creator_igid", str);
        }
        if (creatorSubscriberThreadInfo.A00 != null) {
            r3.A0q("ig_creator_profile_picture_url");
            16h.A01(r3, creatorSubscriberThreadInfo.A00);
        }
        r3.A0Z();
    }
}

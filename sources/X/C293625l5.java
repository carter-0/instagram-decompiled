package X;

import com.instagram.direct.model.thread.DiscoverableThreadInfo;
import java.io.IOException;

/* renamed from: X.5l5  reason: invalid class name and case insensitive filesystem */
public abstract class C293625l5 {
    /* JADX WARNING: type inference failed for: r1v2, types: [com.instagram.direct.model.thread.DiscoverableThreadInfo, java.lang.Object] */
    public static DiscoverableThreadInfo parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            String str2 = null;
            String str3 = null;
            while (r7.A1J() != 16L.A09) {
                String A0q = r7.A0q();
                r7.A1J();
                if ("join_link".equals(A0q)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                } else if ("is_thread_recipient".equals(A0q)) {
                    bool = Boolean.valueOf(r7.A0d());
                } else if ("ig_creator_igid".equals(A0q)) {
                    if (r7.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r7.A1P();
                    }
                } else if ("channel_invite_id".equals(A0q)) {
                    if (r7.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r7.A1P();
                    }
                }
                r7.A0z();
            }
            ? obj = new Object();
            if (str != null) {
                obj.A02 = str;
            }
            if (bool != null) {
                obj.A03 = bool.booleanValue();
            }
            if (str2 != null) {
                obj.A01 = str2;
            }
            if (str3 != null) {
                obj.A00 = str3;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, DiscoverableThreadInfo discoverableThreadInfo) {
        r2.A0c();
        String str = discoverableThreadInfo.A02;
        if (str != null) {
            r2.A0R("join_link", str);
        }
        r2.A0S("is_thread_recipient", discoverableThreadInfo.A03);
        String str2 = discoverableThreadInfo.A01;
        if (str2 != null) {
            r2.A0R("ig_creator_igid", str2);
        }
        String str3 = discoverableThreadInfo.A00;
        if (str3 != null) {
            r2.A0R("channel_invite_id", str3);
        }
        r2.A0Z();
    }
}

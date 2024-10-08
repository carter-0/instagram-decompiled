package X;

import com.instagram.direct.model.thread.ChannelsContextLine;
import java.io.IOException;

/* renamed from: X.5ga  reason: invalid class name and case insensitive filesystem */
public abstract class C291125ga {
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, com.instagram.direct.model.thread.ChannelsContextLine] */
    public static ChannelsContextLine parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            while (r6.A1J() != 16L.A09) {
                String A0q = r6.A0q();
                r6.A1J();
                if ("primary_channel_context_line_channels_tab".equals(A0q)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                } else if ("primary_channel_context_line_search".equals(A0q)) {
                    if (r6.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r6.A1P();
                    }
                } else if ("secondary_channel_context_line_search".equals(A0q)) {
                    if (r6.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r6.A1P();
                    }
                }
                r6.A0z();
            }
            ? obj = new Object();
            obj.A01 = str;
            obj.A00 = str2;
            obj.A02 = str3;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

package X;

import com.facebook.location.platform.api.Location;
import java.io.IOException;

/* renamed from: X.Vn5  reason: case insensitive filesystem */
public abstract class C18191Vn5 {
    public static C15092UOk parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C15092UOk uOk = new C15092UOk();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("written".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l, 0);
                    uOk.A06 = A0l;
                } else if ("confidence".equals(A17)) {
                    uOk.A00 = (float) r5.A0U();
                } else if ("startTimeMs".equals(A17)) {
                    uOk.A04 = r5.A1D();
                } else if ("endTimeMs".equals(A17)) {
                    uOk.A02 = r5.A1D();
                } else if ("profanity".equals(A17)) {
                    uOk.A07 = r5.A0d();
                } else if ("offset".equals(A17)) {
                    uOk.A03 = r5.A1D();
                } else if (Location.SPEED.equals(A17)) {
                    uOk.A01 = (float) r5.A0U();
                } else if (C41845B3m.A17(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l2, 0);
                    uOk.A05 = A0l2;
                }
                r5.A0z();
            }
            return uOk;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, C15092UOk uOk) {
        r2.A0c();
        String str = uOk.A06;
        if (str != null) {
            r2.A0R("written", str);
        }
        r2.A0O("confidence", uOk.A00);
        r2.A0P("startTimeMs", uOk.A04);
        r2.A0P("endTimeMs", uOk.A02);
        r2.A0S("profanity", uOk.A07);
        r2.A0P("offset", uOk.A03);
        r2.A0O(Location.SPEED, uOk.A01);
        C41846B3n.A0y(r2, uOk.A05);
        r2.A0Z();
    }
}

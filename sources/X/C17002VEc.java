package X;

import java.io.IOException;

/* renamed from: X.VEc  reason: case insensitive filesystem */
public abstract class C17002VEc {
    public static C18011Vjn parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C18011Vjn vjn = new C18011Vjn();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("media_id".equals(A17)) {
                    vjn.A04 = AnonymousClass7TG.A0l(r4);
                } else if ("operation_type".equals(A17)) {
                    vjn.A05 = AnonymousClass7TG.A0l(r4);
                } else if ("timestamp_ms".equals(A17)) {
                    vjn.A00 = r4.A0y();
                } else if ("item_type".equals(A17)) {
                    vjn.A03 = AnonymousClass7TG.A0l(r4);
                } else if ("operation_metadata".equals(A17)) {
                    vjn.A02 = C17001VEb.parseFromJson(r4);
                } else if ("item_metadata".equals(A17)) {
                    vjn.A01 = C17000VEa.parseFromJson(r4);
                } else if (C273654mx.A00(174).equals(A17)) {
                    vjn.A06 = AnonymousClass7TG.A0l(r4);
                }
                r4.A0z();
            }
            return vjn;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

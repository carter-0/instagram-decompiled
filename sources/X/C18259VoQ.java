package X;

import java.io.IOException;

/* renamed from: X.VoQ  reason: case insensitive filesystem */
public final class C18259VoQ {
    public static C15251UXl parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("pending_request_content".equals(A17)) {
                    C17840Vgt parseFromJson = C17062VGk.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    r0.A02 = parseFromJson;
                } else if ("declined_request_content".equals(A17)) {
                    C17840Vgt parseFromJson2 = C17062VGk.parseFromJson(r4);
                    0qQ.A0B(parseFromJson2, 0);
                    r0.A01 = parseFromJson2;
                } else if ("recently_edited_content".equals(A17)) {
                    C17840Vgt parseFromJson3 = C17062VGk.parseFromJson(r4);
                    0qQ.A0B(parseFromJson3, 0);
                    r0.A03 = parseFromJson3;
                } else if ("approved_media_content".equals(A17)) {
                    C17375VTc parseFromJson4 = C17061VGj.parseFromJson(r4);
                    0qQ.A0B(parseFromJson4, 0);
                    r0.A00 = parseFromJson4;
                } else {
                    1XY.A01(r4, r0, A17);
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

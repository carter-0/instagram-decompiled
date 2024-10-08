package X;

import java.io.IOException;

/* renamed from: X.Ch6  reason: case insensitive filesystem */
public abstract class C44572Ch6 {
    public static BIA parseFromJson(16F r8) {
        String A00;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            while (true) {
                16L A1J = r8.A1J();
                16L r4 = 16L.A09;
                A00 = AnonymousClass000.A00(1499);
                if (A1J == r4) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r8);
                if (A00.equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r8);
                } else if ("video_chat_attribution_text".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                }
                r8.A0z();
            }
            if (bool == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r8, "VideoChatCaptureInfoImpl");
            } else if (str != null || !(r8 instanceof 0c9)) {
                return new BIA(bool.booleanValue(), str);
            } else {
                AnonymousClass7TF.A1L("video_chat_attribution_text", r8, "VideoChatCaptureInfoImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

package X;

import java.io.IOException;

/* renamed from: X.4nD  reason: invalid class name and case insensitive filesystem */
public abstract class C273804nD {
    public static C273814nE parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            String str2 = null;
            while (r8.A1J() != 16L.A09) {
                String A0q = r8.A0q();
                r8.A1J();
                if ("direct_expiring_media_recipient_view_mode".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                } else if ("direct_expiring_media_reply_type".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                } else if ("is_optimistic_upload".equals(A0q)) {
                    bool = Boolean.valueOf(r8.A0d());
                }
                r8.A0z();
            }
            if (bool != null || !(r8 instanceof 0c9)) {
                return new C273814nE(str, str2, bool.booleanValue());
            }
            ((0c9) r8).A03.A00("is_optimistic_upload", "DirectPendingVisualMessageUploadParams");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

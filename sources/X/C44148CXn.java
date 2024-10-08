package X;

import com.instagram.api.schemas.FileCandidateImpl;
import java.io.IOException;

/* renamed from: X.CXn  reason: case insensitive filesystem */
public abstract class C44148CXn {
    public static FileCandidateImpl parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Long l = null;
            String str5 = null;
            String str6 = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if ("favicon_url".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if ("file_extension".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                } else if ("file_size".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r10.A1P();
                    }
                } else if (AnonymousClass000.A00(347).equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r10.A1P();
                    }
                } else if ("playable_url_expiration_timestamp_ms".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r10);
                } else if ("playable_url_fallback".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r10.A1P();
                    }
                } else if ("title_text".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r10.A1P();
                    }
                }
                r10.A0z();
            }
            return new FileCandidateImpl(l, str, str2, str3, str4, str5, str6);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

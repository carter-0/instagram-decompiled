package X;

import com.instagram.api.schemas.AvatarNoteResponseInfoImpl;
import com.instagram.api.schemas.MediaType;
import java.io.IOException;

/* renamed from: X.CUm  reason: case insensitive filesystem */
public abstract class C44069CUm {
    public static AvatarNoteResponseInfoImpl parseFromJson(16F r9) {
        String str;
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            MediaType mediaType = null;
            String str2 = null;
            String str3 = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("avatar_sticker_media_type".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                    mediaType = (MediaType) MediaType.A01.get(str);
                    if (mediaType == null) {
                        mediaType = MediaType.UNRECOGNIZED;
                    }
                } else if ("avatar_sticker_template_id".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r9.A1P();
                    }
                } else if ("cdn_url".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r9.A1P();
                    }
                }
                r9.A0z();
            }
            if (mediaType == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("avatar_sticker_media_type", r9, "AvatarNoteResponseInfoImpl");
            } else if (str2 != null || !(r9 instanceof 0c9)) {
                return new AvatarNoteResponseInfoImpl(mediaType, str2, str3);
            } else {
                AnonymousClass7TF.A1L("avatar_sticker_template_id", r9, "AvatarNoteResponseInfoImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

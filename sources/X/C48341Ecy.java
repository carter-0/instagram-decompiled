package X;

import com.instagram.api.schemas.GalleryMediaFolderEnum;
import com.instagram.api.schemas.MediaDestinationEnum;
import java.io.IOException;

/* renamed from: X.Ecy  reason: case insensitive filesystem */
public abstract class C48341Ecy {
    public static C47207Dsu parseFromJson(16F r9) {
        String A00;
        String str;
        String str2;
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            MediaDestinationEnum mediaDestinationEnum = null;
            GalleryMediaFolderEnum galleryMediaFolderEnum = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                16L A1J = r9.A1J();
                16L r7 = 16L.A09;
                A00 = AnonymousClass000.A00(3567);
                if (A1J == r7) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r9);
                if ("gallery_media_folder".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r9.A1P();
                    }
                    galleryMediaFolderEnum = (GalleryMediaFolderEnum) GalleryMediaFolderEnum.A01.get(str2);
                    if (galleryMediaFolderEnum == null) {
                        galleryMediaFolderEnum = GalleryMediaFolderEnum.UNRECOGNIZED;
                    }
                } else if (A00.equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                    mediaDestinationEnum = (MediaDestinationEnum) MediaDestinationEnum.A01.get(str);
                    if (mediaDestinationEnum == null) {
                        mediaDestinationEnum = MediaDestinationEnum.UNRECOGNIZED;
                    }
                } else if ("subtitle".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r9.A1P();
                    }
                } else if (C41845B3m.A1E(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r9.A1P();
                    }
                }
                r9.A0z();
            }
            if (mediaDestinationEnum != null || !(r9 instanceof 0c9)) {
                return new C47207Dsu(galleryMediaFolderEnum, mediaDestinationEnum, str3, str4);
            }
            AnonymousClass7TF.A1L(A00, r9, "MediaSelectionDestinationTargetImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

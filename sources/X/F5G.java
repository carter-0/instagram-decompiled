package X;

import com.instagram.clips.model.metadata.ClipsFanClubMetadata;
import java.io.IOException;

public abstract class F5G {
    public static ClipsFanClubMetadata parseFromJson(16F r8) {
        Throwable createAndThrow;
        String str;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str2 = null;
            C46401DeO deO = null;
            while (true) {
                if (r8.A1J() != 16L.A09) {
                    String A17 = AnonymousClass7TE.A17(r8);
                    if ("fan_club_id".equals(A17)) {
                        if (r8.A11() == 16L.A0G) {
                            str2 = null;
                        } else {
                            str2 = r8.A1P();
                        }
                    } else if (!"video_type".equals(A17)) {
                        continue;
                    } else {
                        if (r8.A11() == 16L.A0G) {
                            str = null;
                        } else {
                            str = r8.A1P();
                        }
                        deO = (C46401DeO) C46401DeO.A01.get(str);
                        if (deO == null) {
                            createAndThrow = AnonymousClass7TF.A0W(AnonymousClass000.A00(128), str);
                            break;
                        }
                    }
                    r8.A0z();
                } else {
                    if (str2 == null && (r8 instanceof 0c9)) {
                        AnonymousClass7TF.A1L("fan_club_id", r8, "ClipsFanClubMetadata");
                    } else if (deO != null || !(r8 instanceof 0c9)) {
                        return new ClipsFanClubMetadata(deO, str2);
                    } else {
                        AnonymousClass7TF.A1L("video_type", r8, "ClipsFanClubMetadata");
                    }
                    createAndThrow = AnonymousClass00P.createAndThrow();
                }
            }
            throw createAndThrow;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, ClipsFanClubMetadata clipsFanClubMetadata) {
        r2.A0c();
        String str = clipsFanClubMetadata.A01;
        if (str != null) {
            r2.A0R("fan_club_id", str);
        }
        C46401DeO deO = clipsFanClubMetadata.A00;
        if (deO != null) {
            r2.A0R("video_type", deO.A00);
        }
        r2.A0Z();
    }
}

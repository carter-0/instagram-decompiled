package X;

import com.instagram.api.schemas.ClipsRSAMidCardSubType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Ccl  reason: case insensitive filesystem */
public abstract class C44303Ccl {
    public static C53461Got parseFromJson(16F r13) {
        String str;
        0qQ.A0B(r13, 0);
        try {
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            Boolean bool = null;
            String str2 = null;
            ArrayList arrayList = null;
            ClipsRSAMidCardSubType clipsRSAMidCardSubType = null;
            String str3 = null;
            while (r13.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r13);
                if ("body_text".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r13.A1P();
                    }
                } else if ("clips_items".equals(A17)) {
                    if (r13.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r13.A1J() != 16L.A08) {
                            C41846B3n.A1F(r13, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("is_clips_media_template".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r13);
                } else if ("rsa_mid_card_sub_type".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                    clipsRSAMidCardSubType = (ClipsRSAMidCardSubType) ClipsRSAMidCardSubType.A01.get(str);
                    if (clipsRSAMidCardSubType == null) {
                        clipsRSAMidCardSubType = ClipsRSAMidCardSubType.UNRECOGNIZED;
                    }
                } else if ("title_text".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r13.A1P();
                    }
                }
                r13.A0z();
            }
            if (str2 == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("body_text", r13, "RecentlySavedAudioMidCardMetadata");
            } else if (arrayList == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("clips_items", r13, "RecentlySavedAudioMidCardMetadata");
            } else if (bool == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("is_clips_media_template", r13, "RecentlySavedAudioMidCardMetadata");
            } else if (str3 != null || !(r13 instanceof 0c9)) {
                return new C53461Got(clipsRSAMidCardSubType, str2, str3, arrayList, bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L("title_text", r13, "RecentlySavedAudioMidCardMetadata");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

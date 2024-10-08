package X;

import com.instagram.api.schemas.ClipsACRMidCardSubType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CeU  reason: case insensitive filesystem */
public abstract class C44410CeU {
    public static BH0 parseFromJson(16F r11) {
        String str;
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            String str2 = null;
            ClipsACRMidCardSubType clipsACRMidCardSubType = null;
            ArrayList arrayList = null;
            AnonymousClass3HX r6 = null;
            String str3 = null;
            String str4 = null;
            while (r11.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r11);
                if ("acr_metadata_id".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r11.A1P();
                    }
                } else if (AnonymousClass000.A00(237).equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                    clipsACRMidCardSubType = (ClipsACRMidCardSubType) ClipsACRMidCardSubType.A01.get(str);
                    if (clipsACRMidCardSubType == null) {
                        clipsACRMidCardSubType = ClipsACRMidCardSubType.UNRECOGNIZED;
                    }
                } else if ("sound_sync_infos".equals(A17)) {
                    if (r11.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r11.A1J() != 16L.A08) {
                            C53465Gox parseFromJson = C44363Cdj.parseFromJson(r11);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("stories_dict".equals(A17)) {
                    r6 = AnonymousClass3HR.parseFromJson(r11);
                } else if (C41845B3m.A1L(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r11.A1P();
                    }
                } else if (C41845B3m.A1E(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r11.A1P();
                    }
                }
                r11.A0z();
            }
            if (arrayList != null || !(r11 instanceof 0c9)) {
                return new BH0(clipsACRMidCardSubType, r6, str2, str3, str4, arrayList);
            }
            AnonymousClass7TF.A1L("sound_sync_infos", r11, "StoryMidCardMetadata");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

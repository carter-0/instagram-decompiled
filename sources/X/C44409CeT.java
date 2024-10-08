package X;

import com.instagram.api.schemas.ClipsACRMidCardSubType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CeT  reason: case insensitive filesystem */
public abstract class C44409CeT {
    public static BH1 parseFromJson(16F r9) {
        String str;
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            ArrayList arrayList = null;
            ClipsACRMidCardSubType clipsACRMidCardSubType = null;
            String str2 = null;
            String str3 = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if (AnonymousClass000.A00(237).equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                    clipsACRMidCardSubType = (ClipsACRMidCardSubType) ClipsACRMidCardSubType.A01.get(str);
                    if (clipsACRMidCardSubType == null) {
                        clipsACRMidCardSubType = ClipsACRMidCardSubType.UNRECOGNIZED;
                    }
                } else if ("auto_created_clips_metadata_list".equals(A17)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r9.A1J() != 16L.A08) {
                            C61092Jx3 parseFromJson = CUO.parseFromJson(r9);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (C41845B3m.A1L(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r9.A1P();
                    }
                } else if (C41845B3m.A1E(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r9.A1P();
                    }
                }
                r9.A0z();
            }
            if (arrayList != null || !(r9 instanceof 0c9)) {
                return new BH1(clipsACRMidCardSubType, str2, str3, arrayList);
            }
            AnonymousClass7TF.A1L("auto_created_clips_metadata_list", r9, "StoryMidCardMetadataV2");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

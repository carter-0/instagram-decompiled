package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CcT  reason: case insensitive filesystem */
public abstract class C44285CcT {
    public static BG4 parseFromJson(16F r15) {
        0qQ.A0B(r15, 0);
        try {
            Integer num = null;
            if (r15.A11() != 16L.A0D) {
                r15.A0z();
                return null;
            }
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (r15.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r15);
                if ("clips_items".equals(A17)) {
                    if (r15.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r15.A1J() != 16L.A08) {
                            C41846B3n.A1F(r15, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("facepile_top_participants".equals(A17)) {
                    if (r15.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r15.A1J() != 16L.A08) {
                            C41846B3n.A1E(r15, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("participating_media_count".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r15);
                } else if ("participating_media_count_text".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r15.A1P();
                    }
                } else if ("prompt_id".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r15.A1P();
                    }
                } else if ("prompt_text".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r15.A1P();
                    }
                }
                r15.A0z();
            }
            if (arrayList == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("clips_items", r15, "PromptMidCardMetadata");
            } else if (arrayList2 == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("facepile_top_participants", r15, "PromptMidCardMetadata");
            } else if (num == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("participating_media_count", r15, "PromptMidCardMetadata");
            } else if (str == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("participating_media_count_text", r15, "PromptMidCardMetadata");
            } else if (str2 == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("prompt_id", r15, "PromptMidCardMetadata");
            } else if (str3 != null || !(r15 instanceof 0c9)) {
                return new BG4(str, str2, str3, arrayList, arrayList2, num.intValue());
            } else {
                AnonymousClass7TF.A1L("prompt_text", r15, "PromptMidCardMetadata");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

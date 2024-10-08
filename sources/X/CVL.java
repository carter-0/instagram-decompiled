package X;

import java.io.IOException;
import java.util.ArrayList;

public abstract class CVL {
    public static C53436GoT parseFromJson(16F r13) {
        String A00;
        0qQ.A0B(r13, 0);
        try {
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            String str4 = null;
            while (true) {
                16L A1J = r13.A1J();
                16L r1 = 16L.A09;
                A00 = AnonymousClass000.A00(538);
                if (A1J == r1) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r13);
                if ("body_text".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                } else if (A00.equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r13.A1P();
                    }
                } else if ("cta_text".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r13.A1P();
                    }
                } else if ("default_medias".equals(A17)) {
                    if (r13.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r13.A1J() != 16L.A08) {
                            C41846B3n.A1F(r13, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("rbs_folder_midcard_clips_items".equals(A17)) {
                    if (r13.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r13.A1J() != 16L.A08) {
                            C41846B3n.A1F(r13, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("title_text".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r13.A1P();
                    }
                }
                r13.A0z();
            }
            if (str == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("body_text", r13, "CameraRollMidCardMetadata");
            } else if (str2 == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r13, "CameraRollMidCardMetadata");
            } else if (str4 != null || !(r13 instanceof 0c9)) {
                return new C53436GoT(str, str2, str3, str4, arrayList, arrayList2);
            } else {
                AnonymousClass7TF.A1L("title_text", r13, "CameraRollMidCardMetadata");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

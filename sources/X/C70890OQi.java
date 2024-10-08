package X;

import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.discovery.refinement.model.Refinement;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.OQi  reason: case insensitive filesystem */
public final class C70890OQi {
    public static NHS parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("refinements".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            Refinement parseFromJson = C16934VBm.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r0.A05 = arrayList;
                } else if ("display_text".equals(A17)) {
                    r0.A01 = AnonymousClass7TG.A0l(r4);
                } else if ("pins".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            MediaMapPin parseFromJson2 = C16928VBf.parseFromJson(r4);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    r0.A04 = arrayList;
                } else if ("guides".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C45298Cu1 parseFromJson3 = C44807ClJ.parseFromJson(r4);
                            if (parseFromJson3 != null) {
                                arrayList.add(parseFromJson3);
                            }
                        }
                    }
                    r0.A03 = arrayList;
                } else if ("focus_pin_index".equals(A17)) {
                    r0.A00 = AnonymousClass7TF.A0X(r4);
                } else if ("list_type".equals(A17)) {
                    C41846B3n.A1A(r4);
                } else if ("query_token".equals(A17)) {
                    r0.A02 = AnonymousClass7TG.A0l(r4);
                } else if ("guides_index".equals(A17)) {
                    r4.A1D();
                } else if ("needs_story_fetch".equals(A17)) {
                    r0.A07 = r4.A0d();
                } else if ("needs_profile_fetch".equals(A17)) {
                    r0.A06 = r4.A0d();
                } else if ("needs_guides_fetch".equals(A17)) {
                    r4.A0d();
                } else {
                    1XY.A01(r4, r0, A17);
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

package X;

import com.instagram.api.schemas.MapListType;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.NrZ  reason: case insensitive filesystem */
public abstract class C69750NrZ {
    public static C70645OEr parseFromJson(16F r25) {
        String str;
        16F r12 = r25;
        0qQ.A0B(r12, 0);
        try {
            Integer num = null;
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            String str2 = null;
            ArrayList arrayList = null;
            Boolean bool3 = null;
            MapListType mapListType = null;
            ArrayList arrayList2 = null;
            String str3 = null;
            ArrayList arrayList3 = null;
            while (r12.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r12);
                if ("display_text".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r12.A1P();
                    }
                } else if ("focus_pin_index".equals(A17)) {
                    r12.A1D();
                } else if ("guides".equals(A17)) {
                    if (r12.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r12.A1J() != 16L.A08) {
                            C61079JwH parseFromJson = CYK.parseFromJson(r12);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("guides_index".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r12);
                } else if ("list_type".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r12.A1P();
                    }
                    mapListType = (MapListType) MapListType.A01.get(str);
                    if (mapListType == null) {
                        mapListType = MapListType.UNRECOGNIZED;
                    }
                } else if ("needs_guides_fetch".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r12);
                } else if ("needs_profile_fetch".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r12);
                } else if ("needs_story_fetch".equals(A17)) {
                    bool3 = AnonymousClass7TF.A0S(r12);
                } else if ("pins".equals(A17)) {
                    if (r12.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r12.A1J() != 16L.A08) {
                            MediaMapPin parseFromJson2 = C16928VBf.parseFromJson(r12);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("query_token".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r12.A1P();
                    }
                } else if ("refinements".equals(A17)) {
                    if (r12.A11() == 16L.A0C) {
                        arrayList3 = AnonymousClass7TE.A1C();
                        while (r12.A1J() != 16L.A08) {
                            C61081JwJ parseFromJson3 = Ca8.parseFromJson(r12);
                            if (parseFromJson3 != null) {
                                arrayList3.add(parseFromJson3);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                }
                r12.A0z();
            }
            if (num == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("guides_index", r12, "BoundingBoxPinResponse");
            } else if (mapListType == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("list_type", r12, "BoundingBoxPinResponse");
            } else if (bool == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("needs_guides_fetch", r12, "BoundingBoxPinResponse");
            } else if (bool2 == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("needs_profile_fetch", r12, "BoundingBoxPinResponse");
            } else if (bool3 == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("needs_story_fetch", r12, "BoundingBoxPinResponse");
            } else if (arrayList2 == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("pins", r12, "BoundingBoxPinResponse");
            } else if (str3 == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("query_token", r12, "BoundingBoxPinResponse");
            } else if (arrayList3 != null || !(r12 instanceof 0c9)) {
                return new C70645OEr(mapListType, str2, str3, arrayList, arrayList2, arrayList3);
            } else {
                AnonymousClass7TF.A1L("refinements", r12, "BoundingBoxPinResponse");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

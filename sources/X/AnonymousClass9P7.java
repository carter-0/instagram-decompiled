package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.9P7  reason: invalid class name */
public abstract class AnonymousClass9P7 {
    public static AnonymousClass9P8 parseFromJson(16F r21) {
        Throwable createAndThrow;
        String str;
        String str2;
        16F r6 = r21;
        0qQ.A0B(r6, 0);
        try {
            Long l = null;
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            String str3 = null;
            String str4 = null;
            C379289Tg r11 = null;
            String str5 = null;
            Boolean bool = null;
            ArrayList arrayList = null;
            AnonymousClass8JI r13 = null;
            AnonymousClass804 r12 = null;
            C369458un r14 = null;
            while (true) {
                if (r6.A1J() != 16L.A09) {
                    String A0q = r6.A0q();
                    r6.A1J();
                    if ("original_source_media_id".equals(A0q)) {
                        if (r6.A11() == 16L.A0G) {
                            str3 = null;
                        } else {
                            str3 = r6.A1P();
                        }
                    } else if ("original_source_length_ms".equals(A0q)) {
                        l = Long.valueOf(r6.A0y());
                    } else if ("original_source_progressive_url".equals(A0q)) {
                        if (r6.A11() == 16L.A0G) {
                            str4 = null;
                        } else {
                            str4 = r6.A1P();
                        }
                    } else if ("original_source_media_type".equals(A0q)) {
                        if (r6.A11() == 16L.A0G) {
                            str2 = null;
                        } else {
                            str2 = r6.A1P();
                        }
                        r11 = (C379289Tg) C379289Tg.A01.get(str2);
                        if (r11 == null) {
                            createAndThrow = AnonymousClass7TF.A0W("Unrecognized value ", str2);
                            break;
                        }
                    } else if ("original_source_author_name".equals(A0q)) {
                        if (r6.A11() == 16L.A0G) {
                            str5 = null;
                        } else {
                            str5 = r6.A1P();
                        }
                    } else if ("are_remixes_crosspostable".equals(A0q)) {
                        bool = Boolean.valueOf(r6.A0d());
                    } else if ("remix_image_regions".equals(A0q)) {
                        if (r6.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r6.A1J() != 16L.A08) {
                                C282745Eo parseFromJson = C282735En.parseFromJson(r6);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                    } else if ("source_media_creation_state".equals(A0q)) {
                        if (r6.A11() == 16L.A0G) {
                            str = null;
                        } else {
                            str = r6.A1P();
                        }
                        r13 = (AnonymousClass8JI) AnonymousClass8JI.A02.get(str);
                        if (r13 == null) {
                            createAndThrow = AnonymousClass7TF.A0W("Unrecognized value ", str);
                            break;
                        }
                    } else if ("visualReplyDisplayMode".equals(A0q)) {
                        r12 = (AnonymousClass804) AnonymousClass1uk.A00.A01(r6);
                    } else if ("interactive_drawable_transform".equals(A0q)) {
                        r14 = AnonymousClass9UX.parseFromJson(r6);
                    }
                    r6.A0z();
                } else {
                    if (str3 == null && (r6 instanceof 0c9)) {
                        AnonymousClass7TF.A1L("original_source_media_id", r6, "ClipsRemixDraftModel");
                    } else if (l == null && (r6 instanceof 0c9)) {
                        AnonymousClass7TF.A1L("original_source_length_ms", r6, "ClipsRemixDraftModel");
                    } else if (str4 == null && (r6 instanceof 0c9)) {
                        AnonymousClass7TF.A1L("original_source_progressive_url", r6, "ClipsRemixDraftModel");
                    } else if (r11 == null && (r6 instanceof 0c9)) {
                        AnonymousClass7TF.A1L("original_source_media_type", r6, "ClipsRemixDraftModel");
                    } else if (str5 != null || !(r6 instanceof 0c9)) {
                        return new AnonymousClass9P8(r11, r12, r13, r14, bool, str3, str4, str5, arrayList, l.longValue());
                    } else {
                        AnonymousClass7TF.A1L("original_source_author_name", r6, "ClipsRemixDraftModel");
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

    public static void A00(17Z r3, AnonymousClass9P8 r4) {
        r3.A0c();
        String str = r4.A09;
        if (str != null) {
            r3.A0R("original_source_media_id", str);
        }
        r3.A0Q("original_source_length_ms", r4.A02);
        String str2 = r4.A0A;
        if (str2 != null) {
            r3.A0R("original_source_progressive_url", str2);
        }
        C379289Tg r0 = r4.A03;
        if (r0 != null) {
            r3.A0R("original_source_media_type", r0.A00);
        }
        String str3 = r4.A08;
        if (str3 != null) {
            r3.A0R("original_source_author_name", str3);
        }
        Boolean bool = r4.A00;
        if (bool != null) {
            r3.A0S("are_remixes_crosspostable", bool.booleanValue());
        }
        if (r4.A01 != null) {
            16P.A03(r3, "remix_image_regions");
            for (C282745Eo r02 : r4.A01) {
                if (r02 != null) {
                    C282735En.A00(r3, r02);
                }
            }
            r3.A0Y();
        }
        AnonymousClass8JI r03 = r4.A06;
        if (r03 != null) {
            r3.A0R("source_media_creation_state", r03.A00);
        }
        AnonymousClass804 r1 = r4.A05;
        if (r1 != null) {
            r3.A0q("visualReplyDisplayMode");
            AnonymousClass1uk.A00.A02(r3, r1);
        }
        C369458un r12 = r4.A07;
        if (r12 != null) {
            r3.A0q("interactive_drawable_transform");
            AnonymousClass9UX.A00(r3, r12);
        }
        r3.A0Z();
    }
}

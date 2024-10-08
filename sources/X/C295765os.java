package X;

import com.instagram.discovery.related.model.RelatedItem;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.5os  reason: invalid class name and case insensitive filesystem */
public abstract class C295765os {
    public static C295775ot parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C295775ot r0 = new C295775ot();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("full_item".equals(A0q)) {
                    r0.A03 = C295785ou.parseFromJson(r4);
                } else {
                    ArrayList arrayList = null;
                    if ("fill_items".equals(A0q)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                C295795ov parseFromJson = C295785ou.parseFromJson(r4);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        r0.A0D = arrayList;
                    } else if ("medias".equals(A0q)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                C295795ov parseFromJson2 = C295785ou.parseFromJson(r4);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        r0.A0E = arrayList;
                    } else if ("one_by_two_item".equals(A0q)) {
                        r0.A04 = C295785ou.parseFromJson(r4);
                    } else if ("one_by_two_items".equals(A0q)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                C295795ov parseFromJson3 = C295785ou.parseFromJson(r4);
                                if (parseFromJson3 != null) {
                                    arrayList.add(parseFromJson3);
                                }
                            }
                        }
                        r0.A0G = arrayList;
                    } else if ("two_by_two_ad_item".equals(A0q)) {
                        r0.A08 = C295785ou.parseFromJson(r4);
                    } else if ("fallback_section".equals(A0q)) {
                        r0.A0A = C295735op.parseFromJson(r4);
                    } else if ("two_by_two_item".equals(A0q)) {
                        r0.A09 = C295785ou.parseFromJson(r4);
                    } else if ("three_by_four_item".equals(A0q)) {
                        r0.A05 = C295785ou.parseFromJson(r4);
                    } else if ("tray_item".equals(A0q)) {
                        r0.A06 = C295785ou.parseFromJson(r4);
                    } else if ("tabs_info".equals(A0q)) {
                        r0.A01 = VBQ.parseFromJson(r4);
                    } else if ("contextual_item".equals(A0q)) {
                        r0.A02 = C295785ou.parseFromJson(r4);
                    } else if ("nested_sections".equals(A0q)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                C295745oq parseFromJson4 = C295735op.parseFromJson(r4);
                                if (parseFromJson4 != null) {
                                    arrayList.add(parseFromJson4);
                                }
                            }
                        }
                        r0.A0F = arrayList;
                    } else if ("related".equals(A0q)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                RelatedItem parseFromJson5 = C16937VBp.parseFromJson(r4);
                                if (parseFromJson5 != null) {
                                    arrayList.add(parseFromJson5);
                                }
                            }
                        }
                        r0.A0H = arrayList;
                    } else if ("related_style".equals(A0q)) {
                        r0.A0B = (C298705tt) C298705tt.A01.get(r4.A1Q());
                    } else if ("two_by_three_item".equals(A0q)) {
                        r0.A07 = C295785ou.parseFromJson(r4);
                    } else if ("ad_item".equals(A0q)) {
                        r0.A00 = AnonymousClass5w2.parseFromJson(r4);
                    } else if ("ad_position".equals(A0q)) {
                        r0.A0C = Integer.valueOf(r4.A1D());
                    }
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

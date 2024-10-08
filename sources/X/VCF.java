package X;

import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;
import java.util.ArrayList;

public abstract class VCF {
    public static C17732Vd1 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C17732Vd1 vd1 = new C17732Vd1();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("__typename".equals(A17)) {
                    C41846B3n.A1A(r4);
                } else if ("grid_width_percent".equals(A17)) {
                    vd1.A00 = r4.A1D();
                } else if ("color".equals(A17)) {
                    vd1.A09 = AnonymousClass7TG.A0l(r4);
                } else if ("logging_token".equals(A17)) {
                    vd1.A0A = AnonymousClass7TG.A0l(r4);
                } else if ("autoplay_style".equals(A17)) {
                    vd1.A06 = (HN7) EnumHelper.A00(r4.A1Q(), HN7.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                } else if ("document_element_type".equals(A17)) {
                    vd1.A08 = (C16668Uz4) EnumHelper.A00(r4.A1Q(), C16668Uz4.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                } else if ("looping_style".equals(A17)) {
                    vd1.A07 = (C69379NkJ) EnumHelper.A00(r4.A1Q(), C69379NkJ.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                } else if ("image_versions2".equals(A17)) {
                    vd1.A01 = VCM.parseFromJson(r4);
                } else if ("element_video".equals(A17)) {
                    vd1.A02 = VCN.parseFromJson(r4);
                } else if ("product_info".equals(A17)) {
                    vd1.A03 = VCQ.parseFromJson(r4);
                } else if ("element_descriptor".equals(A17)) {
                    vd1.A04 = VCR.parseFromJson(r4);
                } else if ("element_text".equals(A17)) {
                    vd1.A05 = VCU.parseFromJson(r4);
                } else if ("style_list".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            C13990Tnq.A1A(r4, arrayList);
                        }
                    }
                    vd1.A0G = arrayList;
                } else if ("android_links".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            VY3 parseFromJson = VCD.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    vd1.A0B = arrayList;
                } else if ("footer_elements".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            C17581VaZ parseFromJson2 = VCE.parseFromJson(r4);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    vd1.A0D = arrayList;
                } else if ("child_elements".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            C17582Vaa parseFromJson3 = VCJ.parseFromJson(r4);
                            if (parseFromJson3 != null) {
                                arrayList.add(parseFromJson3);
                            }
                        }
                    }
                    vd1.A0C = arrayList;
                } else if ("header_elements".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            C17582Vaa parseFromJson4 = VCJ.parseFromJson(r4);
                            if (parseFromJson4 != null) {
                                arrayList.add(parseFromJson4);
                            }
                        }
                    }
                    vd1.A0E = arrayList;
                } else if ("product_child_elements".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            C17629VbL parseFromJson5 = VCK.parseFromJson(r4);
                            if (parseFromJson5 != null) {
                                arrayList.add(parseFromJson5);
                            }
                        }
                    }
                    vd1.A0F = arrayList;
                }
                r4.A0z();
            }
            return vd1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

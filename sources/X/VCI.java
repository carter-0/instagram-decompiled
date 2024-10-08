package X;

import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;
import java.util.ArrayList;

public abstract class VCI {
    public static VZX parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            VZX vzx = new VZX();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("show_see_more_chrome".equals(A17)) {
                    r4.A0d();
                } else {
                    ArrayList arrayList = null;
                    if ("background_color".equals(A17)) {
                        vzx.A02 = AnonymousClass7TG.A0l(r4);
                    } else {
                        if (C41845B3m.A1E(A17)) {
                            if (r4.A11() == 16L.A0G) {
                            }
                        } else if ("tracking_token".equals(A17)) {
                            if (r4.A11() == 16L.A0G) {
                            }
                        } else if ("analytics".equals(A17)) {
                            vzx.A00 = VCC.parseFromJson(r4);
                        } else if ("document_body_elements".equals(A17)) {
                            vzx.A01 = VCH.parseFromJson(r4);
                        } else if ("third_party_logging_urls".equals(A17)) {
                            if (r4.A11() == 16L.A0C) {
                                arrayList = new ArrayList();
                                while (r4.A1J() != 16L.A08) {
                                    AnonymousClass7TG.A1F(r4, arrayList);
                                }
                            }
                            vzx.A04 = arrayList;
                        } else if ("style_list".equals(A17)) {
                            if (r4.A11() == 16L.A0C) {
                                arrayList = new ArrayList();
                                while (r4.A1J() != 16L.A08) {
                                    XRL xrl = (XRL) EnumHelper.A00(r4.A1Q(), XRL.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                                    if (xrl != null) {
                                        arrayList.add(xrl);
                                    }
                                }
                            }
                            vzx.A03 = arrayList;
                        }
                        r4.A1P();
                    }
                }
                r4.A0z();
            }
            return vzx;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

package X;

import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.leadgen.core.api.LeadForm;
import com.instagram.leadgen.core.api.LeadGenInfoFieldData;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Clw  reason: case insensitive filesystem */
public abstract class C44846Clw {
    public static LeadForm parseFromJson(16F r13) {
        0qQ.A0B(r13, 0);
        try {
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            SimpleImageUrl simpleImageUrl = null;
            String str = null;
            String str2 = null;
            ArrayList arrayList = null;
            Boolean bool = null;
            String str3 = null;
            while (r13.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r13);
                if ("cover_photo_uri".equals(A17)) {
                    simpleImageUrl = 16h.A00(r13);
                } else if ("display_name".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                } else if ("form_id".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r13.A1P();
                    }
                } else if ("info_fields_data".equals(A17)) {
                    if (r13.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r13.A1J() != 16L.A08) {
                            LeadGenInfoFieldData parseFromJson = C44848Cly.parseFromJson(r13);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("is_configured_organic_form".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r13);
                } else if ("welcome_message".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r13.A1P();
                    }
                }
                r13.A0z();
            }
            if (str == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("display_name", r13, "LeadForm");
            } else if (str2 == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("form_id", r13, "LeadForm");
            } else if (arrayList != null || !(r13 instanceof 0c9)) {
                return new LeadForm(simpleImageUrl, bool, str, str2, str3, arrayList);
            } else {
                AnonymousClass7TF.A1L("info_fields_data", r13, "LeadForm");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

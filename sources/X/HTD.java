package X;

import com.instagram.api.schemas.AFI_TYPE;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class HTD {
    public static C53278GlQ parseFromJson(16F r15) {
        String str;
        0qQ.A0B(r15, 0);
        try {
            16L A11 = r15.A11();
            16L r2 = 16L.A0D;
            if (A11 != r2) {
                r15.A0z();
                return null;
            }
            String str2 = null;
            AFI_TYPE afi_type = null;
            HashMap hashMap = null;
            ArrayList arrayList = null;
            C275514qT r11 = null;
            while (true) {
                16L A1J = r15.A1J();
                16L r7 = 16L.A09;
                if (A1J == r7) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r15);
                if ("afi_id".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r15.A1P();
                    }
                } else if ("afi_type".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r15.A1P();
                    }
                    afi_type = (AFI_TYPE) AFI_TYPE.A01.get(str);
                    if (afi_type == null) {
                        afi_type = AFI_TYPE.UNRECOGNIZED;
                    }
                } else if ("extra_data".equals(A17)) {
                    if (r15.A11() == r2) {
                        hashMap = AnonymousClass7TE.A1E();
                        while (r15.A1J() != r7) {
                            C41847B3o.A1M(r15, hashMap);
                        }
                    } else {
                        hashMap = null;
                    }
                } else if ("questions".equals(A17)) {
                    if (r15.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r15.A1J() != 16L.A08) {
                            C275534qV parseFromJson = C275494qR.parseFromJson(r15);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("undo_button".equals(A17)) {
                    r11 = C275504qS.parseFromJson(r15);
                }
                r15.A0z();
            }
            if (str2 == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("afi_id", r15, "AdsFeedbackInterfaceContent");
            } else if (afi_type == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("afi_type", r15, "AdsFeedbackInterfaceContent");
            } else if (hashMap == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("extra_data", r15, "AdsFeedbackInterfaceContent");
            } else if (arrayList == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("questions", r15, "AdsFeedbackInterfaceContent");
            } else if (r11 != null || !(r15 instanceof 0c9)) {
                return new C53278GlQ(afi_type, r11, str2, hashMap, arrayList);
            } else {
                AnonymousClass7TF.A1L("undo_button", r15, "AdsFeedbackInterfaceContent");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

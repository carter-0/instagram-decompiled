package X;

import com.instagram.shopping.model.taggingfeed.SourceType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Kx6  reason: case insensitive filesystem */
public abstract class C63441Kx6 {
    public static C61062Jw0 parseFromJson(16F r13) {
        String A00;
        String str;
        0qQ.A0B(r13, 0);
        try {
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            ArrayList arrayList = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            SourceType sourceType = null;
            while (true) {
                16L A1J = r13.A1J();
                16L r1 = 16L.A09;
                A00 = AnonymousClass000.A00(1291);
                if (A1J == r1) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r13);
                if (A00.equals(A17)) {
                    if (r13.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r13.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r13, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("merchant_id".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r13.A1P();
                    }
                } else if ("source_id".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r13.A1P();
                    }
                } else if ("source_name".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r13.A1P();
                    }
                } else if ("source_type".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                    sourceType = (SourceType) SourceType.A01.get(str);
                    if (sourceType == null) {
                        sourceType = SourceType.UNRECOGNIZED;
                    }
                }
                r13.A0z();
            }
            if (arrayList == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r13, "LoggingMetadata");
            } else if (str3 == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("source_id", r13, "LoggingMetadata");
            } else if (str4 == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("source_name", r13, "LoggingMetadata");
            } else if (sourceType != null || !(r13 instanceof 0c9)) {
                return new C61062Jw0(sourceType, str2, str3, str4, (List) arrayList);
            } else {
                AnonymousClass7TF.A1L("source_type", r13, "LoggingMetadata");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

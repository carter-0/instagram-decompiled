package X;

import com.instagram.api.schemas.ErrorIdentifier;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CcS  reason: case insensitive filesystem */
public abstract class C44284CcS {
    public static UKM parseFromJson(16F r13) {
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
            UKW ukw = null;
            ErrorIdentifier errorIdentifier = null;
            String str3 = null;
            while (true) {
                16L A1J = r13.A1J();
                16L r1 = 16L.A09;
                A00 = C66579MXk.A00(13);
                if (A1J == r1) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r13);
                if ("available_actions".equals(A17)) {
                    if (r13.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r13.A1J() != 16L.A08) {
                            UMu parseFromJson = CWV.parseFromJson(r13);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("display_message".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r13.A1P();
                    }
                } else if ("error_handling_response".equals(A17)) {
                    ukw = CXO.parseFromJson(r13);
                } else if (A00.equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                    errorIdentifier = (ErrorIdentifier) ErrorIdentifier.A01.get(str);
                    if (errorIdentifier == null) {
                        errorIdentifier = ErrorIdentifier.UNRECOGNIZED;
                    }
                } else if ("internal_message".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r13.A1P();
                    }
                }
                r13.A0z();
            }
            if (str2 == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("display_message", r13, "PromoteError");
            } else if (ukw == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("error_handling_response", r13, "PromoteError");
            } else if (errorIdentifier == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r13, "PromoteError");
            } else if (str3 != null || !(r13 instanceof 0c9)) {
                return new UKM(ukw, errorIdentifier, str2, str3, arrayList);
            } else {
                AnonymousClass7TF.A1L("internal_message", r13, "PromoteError");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

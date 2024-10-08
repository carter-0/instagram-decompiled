package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.ErrorHandlingResponseType;
import com.instagram.api.schemas.ErrorLevel;
import java.io.IOException;
import java.util.ArrayList;

public abstract class CXO {
    public static UKW parseFromJson(16F r12) {
        String str;
        String str2;
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            String str3 = null;
            ArrayList arrayList = null;
            String str4 = null;
            ErrorLevel errorLevel = null;
            String str5 = null;
            String str6 = null;
            ErrorHandlingResponseType errorHandlingResponseType = null;
            while (r12.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r12);
                if (AnonymousClass000.A00(1074).equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r12.A1P();
                    }
                } else if ("admined_pages".equals(A17)) {
                    if (r12.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r12.A1J() != 16L.A08) {
                            BBT parseFromJson = CUP.parseFromJson(r12);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("display_title".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r12.A1P();
                    }
                } else if ("error_level".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r12.A1P();
                    }
                    errorLevel = (ErrorLevel) ErrorLevel.A01.get(str2);
                    if (errorLevel == null) {
                        errorLevel = ErrorLevel.UNRECOGNIZED;
                    }
                } else if ("page_id".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r12.A1P();
                    }
                } else if ("payment_method_id".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r12.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r12.A1P();
                    }
                    errorHandlingResponseType = (ErrorHandlingResponseType) ErrorHandlingResponseType.A01.get(str);
                    if (errorHandlingResponseType == null) {
                        errorHandlingResponseType = ErrorHandlingResponseType.UNRECOGNIZED;
                    }
                }
                r12.A0z();
            }
            if (errorHandlingResponseType != null || !(r12 instanceof 0c9)) {
                return new UKW(errorHandlingResponseType, errorLevel, str3, str4, str5, str6, arrayList);
            }
            AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r12, "ErrorHandlingResponse");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

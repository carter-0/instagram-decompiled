package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.HashMap;

public abstract class CWJ {
    public static C60954JuC parseFromJson(16F r23) {
        String A00;
        C53387GnJ gnJ;
        C53387GnJ gnJ2;
        16F r10 = r23;
        0qQ.A0B(r10, 0);
        try {
            16L A11 = r10.A11();
            16L r9 = 16L.A0D;
            Integer num = null;
            if (A11 != r9) {
                r10.A0z();
                return null;
            }
            Long l = null;
            String str = null;
            String str2 = null;
            HashMap hashMap = null;
            HashMap hashMap2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                16L A1J = r10.A1J();
                16L r8 = 16L.A09;
                A00 = AnonymousClass000.A00(3196);
                if (A1J == r8) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r10);
                if ("accessibility_description".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if ("gif_url".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                } else if ("gift_animation".equals(A17)) {
                    if (r10.A11() == r9) {
                        hashMap = AnonymousClass7TE.A1E();
                        while (r10.A1J() != r8) {
                            String A1P = r10.A1P();
                            if (C41845B3m.A0W(r10) == 16L.A0G) {
                                gnJ2 = null;
                            } else {
                                gnJ2 = CWH.parseFromJson(r10);
                                if (gnJ2 == null) {
                                }
                            }
                            hashMap.put(A1P, gnJ2);
                        }
                    } else {
                        hashMap = null;
                    }
                } else if ("gift_image".equals(A17)) {
                    if (r10.A11() == r9) {
                        hashMap2 = AnonymousClass7TE.A1E();
                        while (r10.A1J() != r8) {
                            String A1P2 = r10.A1P();
                            if (C41845B3m.A0W(r10) == 16L.A0G) {
                                gnJ = null;
                            } else {
                                gnJ = CWH.parseFromJson(r10);
                                if (gnJ == null) {
                                }
                            }
                            hashMap2.put(A1P2, gnJ);
                        }
                    } else {
                        hashMap2 = null;
                    }
                } else if (A00.equals(A17)) {
                    num = AnonymousClass7TF.A0X(r10);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r10);
                } else if ("image_url".equals(A17)) {
                    str3 = AnonymousClass7TG.A0l(r10);
                } else if (DialogModule.KEY_TITLE.equals(A17)) {
                    str4 = AnonymousClass7TG.A0l(r10);
                }
                r10.A0z();
            }
            if (str == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("accessibility_description", r10, "ContentAppreciationGift");
            } else if (str2 == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("gif_url", r10, "ContentAppreciationGift");
            } else if (num == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r10, "ContentAppreciationGift");
            } else if (l == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r10, "ContentAppreciationGift");
            } else if (str3 == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("image_url", r10, "ContentAppreciationGift");
            } else if (str4 != null || !(r10 instanceof 0c9)) {
                return new C60954JuC(str, str2, str3, str4, hashMap, hashMap2, num.intValue(), l.longValue());
            } else {
                AnonymousClass7TF.A1L(DialogModule.KEY_TITLE, r10, "ContentAppreciationGift");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

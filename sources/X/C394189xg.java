package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.9xg  reason: invalid class name and case insensitive filesystem */
public abstract class C394189xg {
    public static C63806L7m parseFromJson(16F r11) {
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            String str = null;
            ArrayList arrayList = null;
            C39747A7n a7n = null;
            C318046oG r2 = null;
            while (r11.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r11);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                } else if ("stickers".equals(A17)) {
                    if (r11.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r11.A1J() != 16L.A08) {
                            C317966o8 parseFromJson = C369258u7.parseFromJson(r11);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("images".equals(A17)) {
                    a7n = A0F.parseFromJson(r11);
                } else if ("sticker_type".equals(A17)) {
                    String A1Q = r11.A1Q();
                    0qQ.A0B(A1Q, 0);
                    C318046oG[] values = C318046oG.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            r2 = null;
                            break;
                        }
                        r2 = values[i];
                        if (0qQ.A0K(r2.A00, A1Q)) {
                            break;
                        }
                        i++;
                    }
                }
                r11.A0z();
            }
            if (str != null || !(r11 instanceof 0c9)) {
                return new C63806L7m(r2, a7n, str, arrayList);
            }
            AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r11, "TemplateStickerItem");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.NoteCustomThemeImpl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.CiT  reason: case insensitive filesystem */
public abstract class C44649CiT {
    public static AnonymousClass4AT parseFromJson(16F r39) {
        String A00;
        String A002;
        String A003;
        String A004;
        SimpleImageUrl simpleImageUrl;
        16F r6 = r39;
        0qQ.A0B(r6, 0);
        try {
            16L A11 = r6.A11();
            16L r12 = 16L.A0D;
            if (A11 != r12) {
                r6.A0z();
                return null;
            }
            Boolean bool = null;
            Integer num = null;
            String str = null;
            User user = null;
            HashMap hashMap = null;
            Boolean bool2 = null;
            ArrayList arrayList = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            Boolean bool3 = null;
            NoteCustomThemeImpl noteCustomThemeImpl = null;
            while (true) {
                16L A1J = r6.A1J();
                16L r11 = 16L.A09;
                A00 = C273654mx.A00(3064);
                A002 = C273654mx.A00(2969);
                A003 = C273654mx.A00(2896);
                A004 = C273654mx.A00(2944);
                if (A1J == r11) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r6);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A17)) {
                    user = C41845B3m.A0a(r6, false);
                } else if (A004.equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r6);
                } else if ("thumbnail_urls".equals(A17)) {
                    if (r6.A11() == r12) {
                        hashMap = AnonymousClass7TE.A1E();
                        while (r6.A1J() != r11) {
                            String A1P = r6.A1P();
                            if (C41845B3m.A0W(r6) == 16L.A0G) {
                                simpleImageUrl = null;
                            } else {
                                simpleImageUrl = 16h.A00(r6);
                                if (simpleImageUrl == null) {
                                }
                            }
                            hashMap.put(A1P, simpleImageUrl);
                        }
                    } else {
                        hashMap = null;
                    }
                } else if (A003.equals(A17)) {
                    num = AnonymousClass7TF.A0X(r6);
                } else if ("has_unseen_media".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r6);
                } else if ("users".equals(A17)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r6.A1J() != 16L.A08) {
                            C41846B3n.A1E(r6, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("index".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r6);
                } else if (A002.equals(A17)) {
                    num3 = AnonymousClass7TF.A0X(r6);
                } else if (A00.equals(A17)) {
                    num4 = AnonymousClass7TF.A0X(r6);
                } else if ("stack_style".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r6.A1P();
                    }
                } else if ("pog_style".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r6.A1P();
                    }
                } else if (C273654mx.A00(2204).equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r6.A1P();
                    }
                } else if (C273654mx.A00(2205).equals(A17)) {
                    str5 = AnonymousClass7TG.A0l(r6);
                } else if ("viewer_has_liked".equals(A17)) {
                    bool3 = AnonymousClass7TF.A0S(r6);
                } else if ("custom_theme".equals(A17)) {
                    noteCustomThemeImpl = C2809154s.parseFromJson(r6);
                }
                r6.A0z();
            }
            if (str == null && (r6 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r6, "MediaNoteStack");
            } else if (user == null && (r6 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_USER, r6, "MediaNoteStack");
            } else if (bool == null && (r6 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A004, r6, "MediaNoteStack");
            } else if (hashMap == null && (r6 instanceof 0c9)) {
                AnonymousClass7TF.A1L("thumbnail_urls", r6, "MediaNoteStack");
            } else if (num == null && (r6 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A003, r6, "MediaNoteStack");
            } else if (bool2 == null && (r6 instanceof 0c9)) {
                AnonymousClass7TF.A1L("has_unseen_media", r6, "MediaNoteStack");
            } else if (num2 == null && (r6 instanceof 0c9)) {
                AnonymousClass7TF.A1L("index", r6, "MediaNoteStack");
            } else if (num3 == null && (r6 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A002, r6, "MediaNoteStack");
            } else if (num4 != null || !(r6 instanceof 0c9)) {
                return new AnonymousClass4AT(noteCustomThemeImpl, user, bool3, str, str2, str3, str4, str5, arrayList, hashMap, num.intValue(), num2.intValue(), num3.intValue(), num4.intValue(), bool.booleanValue(), bool2.booleanValue());
            } else {
                AnonymousClass7TF.A1L(A00, r6, "MediaNoteStack");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

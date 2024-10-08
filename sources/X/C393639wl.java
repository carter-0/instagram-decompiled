package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.ThreadThemeType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.9wl  reason: invalid class name and case insensitive filesystem */
public abstract class C393639wl {
    public static N3D parseFromJson(16F r28) {
        String A00;
        String str;
        16F r8 = r28;
        0qQ.A0B(r8, 0);
        try {
            Boolean bool = null;
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            Long l = null;
            ArrayList arrayList = null;
            AnonymousClass9JL r17 = null;
            String str2 = null;
            ArrayList arrayList2 = null;
            C370658wq r18 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            ThreadThemeType threadThemeType = null;
            while (true) {
                16L A1J = r8.A1J();
                16L r13 = 16L.A09;
                A00 = AnonymousClass000.A00(1038);
                if (A1J == r13) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r8);
                if ("alternative_themes".equals(A17)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r8.A1J() != 16L.A08) {
                            N3D parseFromJson = parseFromJson(r8);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("background_asset".equals(A17)) {
                    r17 = C370678ws.parseFromJson(r8);
                } else if ("background_preview_url".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                } else if ("gradient_colors".equals(A17)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r8.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r8, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("icon_asset".equals(A17)) {
                    r18 = C370648wp.parseFromJson(r8);
                } else if ("icon_url".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r8.A1P();
                    }
                } else if ("is_deprecated".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r8);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r8.A1P();
                    }
                } else if ("subtitle".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r8.A1P();
                    }
                } else if ("theme_id".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r8);
                } else if ("theme_type".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    threadThemeType = (ThreadThemeType) ThreadThemeType.A01.get(str);
                    if (threadThemeType == null) {
                        threadThemeType = ThreadThemeType.UNRECOGNIZED;
                    }
                }
                r8.A0z();
            }
            if (arrayList == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("alternative_themes", r8, A00);
            } else if (str2 == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("background_preview_url", r8, A00);
            } else if (arrayList2 == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("gradient_colors", r8, A00);
            } else if (str3 == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("icon_url", r8, A00);
            } else if (bool == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("is_deprecated", r8, A00);
            } else if (str4 == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r8, A00);
            } else if (l == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("theme_id", r8, A00);
            } else if (threadThemeType != null || !(r8 instanceof 0c9)) {
                return new N3D(r17, r18, threadThemeType, str2, str3, str4, str5, arrayList, arrayList2, l.longValue(), bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L("theme_type", r8, A00);
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

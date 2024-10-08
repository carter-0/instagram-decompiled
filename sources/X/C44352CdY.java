package X;

import com.instagram.api.schemas.ShowreelNativeClientName;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CdY  reason: case insensitive filesystem */
public abstract class C44352CdY {
    public static BGP parseFromJson(16F r18) {
        String str;
        16F r7 = r18;
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            String str2 = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            ShowreelNativeClientName showreelNativeClientName = null;
            String str3 = null;
            Integer num = null;
            String str4 = null;
            String str5 = null;
            Integer num2 = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("animation_payload".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r7.A1P();
                    }
                } else if ("assets".equals(A17)) {
                    if (r7.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r7.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r7, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("assets_info".equals(A17)) {
                    if (r7.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r7.A1J() != 16L.A08) {
                            BGQ parseFromJson = C44354Cda.parseFromJson(r7);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("client_name".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                    showreelNativeClientName = (ShowreelNativeClientName) ShowreelNativeClientName.A01.get(str);
                    if (showreelNativeClientName == null) {
                        showreelNativeClientName = ShowreelNativeClientName.UNRECOGNIZED;
                    }
                } else if ("content".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r7.A1P();
                    }
                } else if (C41845B3m.A1G(A17)) {
                    num = AnonymousClass7TF.A0X(r7);
                } else if ("logging_info".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r7.A1P();
                    }
                } else if (!"template_name".equals(A17)) {
                    num2 = C41847B3o.A13(r7, num2, A17, IgReactMediaPickerNativeModule.WIDTH);
                } else if (r7.A11() == 16L.A0G) {
                    str5 = null;
                } else {
                    str5 = r7.A1P();
                }
                r7.A0z();
            }
            if (str2 == null && (r7 instanceof 0c9)) {
                AnonymousClass7TF.A1L("animation_payload", r7, "ShowreelNativeAnimationImpl");
            } else if (showreelNativeClientName == null && (r7 instanceof 0c9)) {
                AnonymousClass7TF.A1L("client_name", r7, "ShowreelNativeAnimationImpl");
            } else if (str3 == null && (r7 instanceof 0c9)) {
                AnonymousClass7TF.A1L("content", r7, "ShowreelNativeAnimationImpl");
            } else if (str5 != null || !(r7 instanceof 0c9)) {
                return new BGP(showreelNativeClientName, num, num2, str2, str3, str4, str5, arrayList, arrayList2);
            } else {
                AnonymousClass7TF.A1L("template_name", r7, "ShowreelNativeAnimationImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

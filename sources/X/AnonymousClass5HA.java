package X;

import com.instagram.model.showreelnative.IgShowreelNativeAnimation;
import com.instagram.model.showreelnative.IgShowreelNativeAsset;
import com.instagram.model.showreelnative.IgShowreelNativeAssetImpl;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5HA  reason: invalid class name */
public abstract class AnonymousClass5HA {
    public static IgShowreelNativeAnimation parseFromJson(16F r11) {
        String A1P;
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            String str = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            String str2 = null;
            String str3 = null;
            Integer num = null;
            String str4 = null;
            Integer num2 = null;
            while (r11.A1J() != 16L.A09) {
                String A0q = r11.A0q();
                r11.A1J();
                if ("animation_payload".equals(A0q)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                } else if ("assets".equals(A0q)) {
                    if (r11.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r11.A1J() != 16L.A08) {
                            if (!(r11.A11() == 16L.A0G || (A1P = r11.A1P()) == null)) {
                                arrayList.add(A1P);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("assets_info".equals(A0q)) {
                    if (r11.A11() == 16L.A0C) {
                        arrayList2 = new ArrayList();
                        while (r11.A1J() != 16L.A08) {
                            IgShowreelNativeAssetImpl parseFromJson = AnonymousClass5HB.parseFromJson(r11);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("client_name".equals(A0q)) {
                    if (r11.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r11.A1P();
                    }
                } else if ("content".equals(A0q)) {
                    if (r11.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r11.A1P();
                    }
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                    num = Integer.valueOf(r11.A1D());
                } else if ("template_name".equals(A0q)) {
                    if (r11.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r11.A1P();
                    }
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0q)) {
                    num2 = Integer.valueOf(r11.A1D());
                }
                r11.A0z();
            }
            return new IgShowreelNativeAnimation(num, num2, str, str2, str3, str4, arrayList, arrayList2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r4, IgShowreelNativeAnimation igShowreelNativeAnimation) {
        r4.A0c();
        String str = igShowreelNativeAnimation.A02;
        if (str != null) {
            r4.A0R("animation_payload", str);
        }
        List<String> list = igShowreelNativeAnimation.A06;
        if (list != null) {
            16P.A03(r4, "assets");
            for (String str2 : list) {
                if (str2 != null) {
                    r4.A0t(str2);
                }
            }
            r4.A0Y();
        }
        List<IgShowreelNativeAsset> list2 = igShowreelNativeAnimation.A07;
        if (list2 != null) {
            16P.A03(r4, "assets_info");
            for (IgShowreelNativeAsset igShowreelNativeAsset : list2) {
                if (igShowreelNativeAsset != null) {
                    IgShowreelNativeAssetImpl FFz = igShowreelNativeAsset.FFz();
                    r4.A0c();
                    Integer num = FFz.A00;
                    if (num != null) {
                        r4.A0P(IgReactMediaPickerNativeModule.HEIGHT, num.intValue());
                    }
                    String str3 = FFz.A02;
                    if (str3 != null) {
                        r4.A0R("url", str3);
                    }
                    Integer num2 = FFz.A01;
                    if (num2 != null) {
                        r4.A0P(IgReactMediaPickerNativeModule.WIDTH, num2.intValue());
                    }
                    r4.A0Z();
                }
            }
            r4.A0Y();
        }
        String str4 = igShowreelNativeAnimation.A03;
        if (str4 != null) {
            r4.A0R("client_name", str4);
        }
        String str5 = igShowreelNativeAnimation.A04;
        if (str5 != null) {
            r4.A0R("content", str5);
        }
        Integer num3 = igShowreelNativeAnimation.A00;
        if (num3 != null) {
            r4.A0P(IgReactMediaPickerNativeModule.HEIGHT, num3.intValue());
        }
        String str6 = igShowreelNativeAnimation.A05;
        if (str6 != null) {
            r4.A0R("template_name", str6);
        }
        Integer num4 = igShowreelNativeAnimation.A01;
        if (num4 != null) {
            r4.A0P(IgReactMediaPickerNativeModule.WIDTH, num4.intValue());
        }
        r4.A0Z();
    }
}

package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

public abstract class ABB {
    public static ADJ parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ADJ adj = new ADJ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("x".equals(A17)) {
                    adj.A09 = AnonymousClass7TF.A0U(r4);
                } else if ("y".equals(A17)) {
                    adj.A0A = AnonymousClass7TF.A0U(r4);
                } else if ("z".equals(A17)) {
                    adj.A0F = AnonymousClass7TF.A0X(r4);
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A17)) {
                    adj.A08 = AnonymousClass7TF.A0U(r4);
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A17)) {
                    adj.A06 = AnonymousClass7TF.A0U(r4);
                } else if ("rotation".equals(A17)) {
                    adj.A07 = AnonymousClass7TF.A0U(r4);
                } else if ("metadata".equals(A17)) {
                    adj.A01 = C39579A0v.parseFromJson(r4);
                } else if ("product_type".equals(A17)) {
                    adj.A0J = AnonymousClass7TG.A0l(r4);
                } else if ("is_pinned".equals(A17)) {
                    adj.A04 = AnonymousClass7TF.A0S(r4);
                } else if (TraceFieldType.Duration.equals(A17)) {
                    adj.A05 = AnonymousClass7TF.A0U(r4);
                } else if ("media_owner_id".equals(A17)) {
                    adj.A0I = AnonymousClass7TG.A0l(r4);
                } else if ("is_immersive".equals(A17)) {
                    adj.A03 = AnonymousClass7TF.A0S(r4);
                } else if ("tap_state".equals(A17)) {
                    adj.A0D = AnonymousClass7TF.A0X(r4);
                } else if ("media_id".equals(A17)) {
                    adj.A0H = AnonymousClass7TG.A0l(r4);
                } else if ("end_time_ms".equals(A17)) {
                    adj.A0B = AnonymousClass7TF.A0X(r4);
                } else if (C273654mx.A00(193).equals(A17)) {
                    adj.A0M = AnonymousClass7TG.A0l(r4);
                } else if ("start_time_ms".equals(A17)) {
                    adj.A0C = AnonymousClass7TF.A0X(r4);
                } else if (AnonymousClass000.A00(70).equals(A17)) {
                    adj.A0G = AnonymousClass7TG.A0l(r4);
                } else if ("trimmed_from_start".equals(A17)) {
                    adj.A0E = AnonymousClass7TF.A0X(r4);
                } else if ("is_archive".equals(A17)) {
                    adj.A02 = AnonymousClass7TF.A0S(r4);
                } else if ("sticker_id".equals(A17)) {
                    adj.A0K = AnonymousClass7TG.A0l(r4);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A17)) {
                    adj.A0L = AnonymousClass7TG.A0l(r4);
                } else if ("media_type".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    C391079sJ r0 = (C391079sJ) C391079sJ.A01.get(A0l);
                    if (r0 == null) {
                        r0 = C391079sJ.UNDEFINED;
                    }
                    adj.A00 = r0;
                }
                r4.A0z();
            }
            return adj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r3, ADJ adj) {
        r3.A0c();
        Float f = adj.A09;
        if (f != null) {
            r3.A0O("x", f.floatValue());
        }
        Float f2 = adj.A0A;
        if (f2 != null) {
            r3.A0O("y", f2.floatValue());
        }
        Integer num = adj.A0F;
        if (num != null) {
            r3.A0P("z", num.intValue());
        }
        Float f3 = adj.A08;
        if (f3 != null) {
            r3.A0O(IgReactMediaPickerNativeModule.WIDTH, f3.floatValue());
        }
        Float f4 = adj.A06;
        if (f4 != null) {
            r3.A0O(IgReactMediaPickerNativeModule.HEIGHT, f4.floatValue());
        }
        Float f5 = adj.A07;
        if (f5 != null) {
            r3.A0O("rotation", f5.floatValue());
        }
        if (adj.A01 != null) {
            r3.A0q("metadata");
            AD7 ad7 = adj.A01;
            r3.A0c();
            Float f6 = ad7.A01;
            if (f6 != null) {
                r3.A0O("input_width", f6.floatValue());
            }
            Float f7 = ad7.A00;
            if (f7 != null) {
                r3.A0O("input_height", f7.floatValue());
            }
            String str = ad7.A03;
            if (str != null) {
                r3.A0R("giphy_uri", str);
            }
            Integer num2 = ad7.A02;
            if (num2 != null) {
                r3.A0P("screen_width", num2.intValue());
            }
            String str2 = ad7.A04;
            if (str2 != null) {
                r3.A0R("ui_version", str2);
            }
            r3.A0Z();
        }
        String str3 = adj.A0J;
        if (str3 != null) {
            r3.A0R("product_type", str3);
        }
        Boolean bool = adj.A04;
        if (bool != null) {
            r3.A0S("is_pinned", bool.booleanValue());
        }
        Float f8 = adj.A05;
        if (f8 != null) {
            r3.A0O(TraceFieldType.Duration, f8.floatValue());
        }
        String str4 = adj.A0I;
        if (str4 != null) {
            r3.A0R("media_owner_id", str4);
        }
        Boolean bool2 = adj.A03;
        if (bool2 != null) {
            r3.A0S("is_immersive", bool2.booleanValue());
        }
        Integer num3 = adj.A0D;
        if (num3 != null) {
            r3.A0P("tap_state", num3.intValue());
        }
        String str5 = adj.A0H;
        if (str5 != null) {
            r3.A0R("media_id", str5);
        }
        Integer num4 = adj.A0B;
        if (num4 != null) {
            r3.A0P("end_time_ms", num4.intValue());
        }
        String str6 = adj.A0M;
        if (str6 != null) {
            r3.A0R(C273654mx.A00(193), str6);
        }
        Integer num5 = adj.A0C;
        if (num5 != null) {
            r3.A0P("start_time_ms", num5.intValue());
        }
        String str7 = adj.A0G;
        if (str7 != null) {
            r3.A0R(AnonymousClass000.A00(70), str7);
        }
        Integer num6 = adj.A0E;
        if (num6 != null) {
            r3.A0P("trimmed_from_start", num6.intValue());
        }
        Boolean bool3 = adj.A02;
        if (bool3 != null) {
            r3.A0S("is_archive", bool3.booleanValue());
        }
        String str8 = adj.A0K;
        if (str8 != null) {
            r3.A0R("sticker_id", str8);
        }
        String str9 = adj.A0L;
        if (str9 != null) {
            r3.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str9);
        }
        r3.A0R("media_type", adj.A00.A00);
        r3.A0Z();
    }
}

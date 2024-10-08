package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.CameraTool;
import com.instagram.api.schemas.GenAIToolInfoDict;
import java.io.IOException;

/* renamed from: X.LGz  reason: case insensitive filesystem */
public abstract class C63981LGz {
    public static GenAIToolInfoDict parseFromJson(16F r14) {
        String str;
        0qQ.A0B(r14, 0);
        try {
            if (r14.A11() != 16L.A0D) {
                r14.A0z();
                return null;
            }
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            CameraTool cameraTool = null;
            String str9 = null;
            while (r14.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r14);
                if ("background_color".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r14.A1P();
                    }
                } else if ("content_id".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r14.A1P();
                    }
                } else if ("prompt".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r14.A1P();
                    }
                } else if ("recipe_caption".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r14.A1P();
                    }
                } else if (TraceFieldType.RequestID.equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r14.A1P();
                    }
                } else if ("response_id".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r14.A1P();
                    }
                } else if ("sticker_style_str".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r14.A1P();
                    }
                } else if ("tool_type".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r14.A1P();
                    }
                    cameraTool = C2807253k.A00(str);
                } else if ("topic".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r14.A1P();
                    }
                }
                r14.A0z();
            }
            if (cameraTool != null || !(r14 instanceof 0c9)) {
                return new GenAIToolInfoDict(cameraTool, str2, str3, str4, str5, str6, str7, str8, str9);
            }
            AnonymousClass7TF.A1L("tool_type", r14, "GenAIToolInfoDict");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, GenAIToolInfoDict genAIToolInfoDict) {
        r2.A0c();
        String str = genAIToolInfoDict.A01;
        if (str != null) {
            r2.A0R("background_color", str);
        }
        String str2 = genAIToolInfoDict.A02;
        if (str2 != null) {
            r2.A0R("content_id", str2);
        }
        String str3 = genAIToolInfoDict.A03;
        if (str3 != null) {
            r2.A0R("prompt", str3);
        }
        String str4 = genAIToolInfoDict.A04;
        if (str4 != null) {
            r2.A0R("recipe_caption", str4);
        }
        String str5 = genAIToolInfoDict.A05;
        if (str5 != null) {
            r2.A0R(TraceFieldType.RequestID, str5);
        }
        String str6 = genAIToolInfoDict.A06;
        if (str6 != null) {
            r2.A0R("response_id", str6);
        }
        String str7 = genAIToolInfoDict.A07;
        if (str7 != null) {
            r2.A0R("sticker_style_str", str7);
        }
        CameraTool cameraTool = genAIToolInfoDict.A00;
        if (cameraTool != null) {
            r2.A0R("tool_type", cameraTool.A00);
        }
        String str8 = genAIToolInfoDict.A08;
        if (str8 != null) {
            r2.A0R("topic", str8);
        }
        r2.A0Z();
    }
}

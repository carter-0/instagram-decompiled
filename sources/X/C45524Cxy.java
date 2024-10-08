package X;

import com.instagram.api.schemas.ClipsTextAlignment;
import com.instagram.api.schemas.ClipsTextEmphasisMode;
import com.instagram.api.schemas.ClipsTextFormatType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Cxy  reason: case insensitive filesystem */
public abstract class C45524Cxy {
    public static BEE parseFromJson(16F r24) {
        String str;
        String str2;
        String str3;
        16F r5 = r24;
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            ClipsTextAlignment clipsTextAlignment = null;
            ArrayList arrayList = null;
            Float f = null;
            Float f2 = null;
            Float f3 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Float f4 = null;
            Float f5 = null;
            Float f6 = null;
            Float f7 = null;
            Float f8 = null;
            String str4 = null;
            ClipsTextEmphasisMode clipsTextEmphasisMode = null;
            ClipsTextFormatType clipsTextFormatType = null;
            Float f9 = null;
            Integer num = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("alignment".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r5.A1P();
                    }
                    clipsTextAlignment = (ClipsTextAlignment) ClipsTextAlignment.A01.get(str3);
                    if (clipsTextAlignment == null) {
                        clipsTextAlignment = ClipsTextAlignment.UNRECOGNIZED;
                    }
                } else if ("colors".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C248623iI parseFromJson = C248603iG.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (C41845B3m.A1R(A17)) {
                    f = AnonymousClass7TF.A0U(r5);
                } else if ("font_size".equals(A17)) {
                    f2 = AnonymousClass7TF.A0U(r5);
                } else if (C41845B3m.A1G(A17)) {
                    f3 = AnonymousClass7TF.A0U(r5);
                } else if ("is_animated".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r5);
                } else if ("is_feels_like_ig".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r5);
                } else if ("offset_x".equals(A17)) {
                    f4 = AnonymousClass7TF.A0U(r5);
                } else if ("offset_y".equals(A17)) {
                    f5 = AnonymousClass7TF.A0U(r5);
                } else if ("rotation_degree".equals(A17)) {
                    f6 = AnonymousClass7TF.A0U(r5);
                } else if ("scale".equals(A17)) {
                    f7 = AnonymousClass7TF.A0U(r5);
                } else if (C41845B3m.A1U(A17)) {
                    f8 = C41846B3n.A0f(r5);
                } else if (C41845B3m.A1A(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r5.A1P();
                    }
                } else if ("text_emphasis_mode".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r5.A1P();
                    }
                    clipsTextEmphasisMode = (ClipsTextEmphasisMode) ClipsTextEmphasisMode.A01.get(str2);
                    if (clipsTextEmphasisMode == null) {
                        clipsTextEmphasisMode = ClipsTextEmphasisMode.UNRECOGNIZED;
                    }
                } else if ("text_format_type".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                    clipsTextFormatType = C248693iQ.A00(str);
                } else if (C41845B3m.A1F(A17)) {
                    f9 = C41846B3n.A0f(r5);
                } else {
                    num = C41847B3o.A13(r5, num, A17, "z_index");
                }
                r5.A0z();
            }
            if (arrayList != null || !(r5 instanceof 0c9)) {
                return new BEE(clipsTextAlignment, clipsTextEmphasisMode, clipsTextFormatType, bool, bool2, f, f2, f3, f4, f5, f6, f7, f8, f9, num, str4, arrayList);
            }
            AnonymousClass7TF.A1L("colors", r5, "ClipsSpinSwappableTextImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r4, BEE bee) {
        r4.A0c();
        ClipsTextAlignment clipsTextAlignment = bee.A00;
        if (clipsTextAlignment != null) {
            r4.A0R("alignment", clipsTextAlignment.A00);
        }
        List list = bee.A0G;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r4, "colors", list);
            while (A0s.hasNext()) {
                C248623iI r2 = (C248623iI) A0s.next();
                if (r2 != null) {
                    r4.A0c();
                    r4.A0P("count", r2.A00);
                    String str = r2.A01;
                    if (str != null) {
                        r4.A0R("hex_rgba_color", str);
                    }
                    r4.A0Z();
                }
            }
            r4.A0Y();
        }
        C41846B3n.A0w(r4, bee.A05);
        Float f = bee.A06;
        if (f != null) {
            r4.A0O("font_size", f.floatValue());
        }
        C41846B3n.A0u(r4, bee.A07);
        Boolean bool = bee.A03;
        if (bool != null) {
            r4.A0S("is_animated", bool.booleanValue());
        }
        Boolean bool2 = bee.A04;
        if (bool2 != null) {
            r4.A0S("is_feels_like_ig", bool2.booleanValue());
        }
        Float f2 = bee.A08;
        if (f2 != null) {
            r4.A0O("offset_x", f2.floatValue());
        }
        Float f3 = bee.A09;
        if (f3 != null) {
            r4.A0O("offset_y", f3.floatValue());
        }
        Float f4 = bee.A0A;
        if (f4 != null) {
            r4.A0O("rotation_degree", f4.floatValue());
        }
        Float f5 = bee.A0B;
        if (f5 != null) {
            r4.A0O("scale", f5.floatValue());
        }
        C41846B3n.A0x(r4, bee.A0C);
        C41846B3n.A0z(r4, bee.A0F);
        ClipsTextEmphasisMode clipsTextEmphasisMode = bee.A01;
        if (clipsTextEmphasisMode != null) {
            r4.A0R("text_emphasis_mode", clipsTextEmphasisMode.A00);
        }
        ClipsTextFormatType clipsTextFormatType = bee.A02;
        if (clipsTextFormatType != null) {
            r4.A0R("text_format_type", clipsTextFormatType.A00);
        }
        C41846B3n.A0t(r4, bee.A0D);
        Integer num = bee.A0E;
        if (num != null) {
            r4.A0P("z_index", num.intValue());
        }
        r4.A0Z();
    }
}

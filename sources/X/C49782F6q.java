package X;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;

/* renamed from: X.F6q  reason: case insensitive filesystem */
public abstract class C49782F6q {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.Ezs, java.lang.Object] */
    public static C49635Ezs parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("attempts".equals(A17)) {
                    obj.A00 = r4.A1D();
                } else if ("remaining_steps".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            Ez9 parseFromJson = C49046EoQ.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A04 = arrayList;
                } else if ("is_exposed".equals(A17)) {
                    obj.A02 = AnonymousClass7TF.A0S(r4);
                } else if ("flow_type".equals(A17)) {
                    obj.A01 = C49204Er9.A00(r4.A1Q());
                } else if ("position".equals(A17)) {
                    obj.A03 = AnonymousClass7TF.A0X(r4);
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static String A00(C49635Ezs ezs) {
        StringWriter stringWriter = new StringWriter();
        17W A0K = AnonymousClass7TF.A0K(stringWriter);
        A0K.A0P("attempts", ezs.A00);
        if (ezs.A04 != null) {
            16P.A03(A0K, "remaining_steps");
            for (Ez9 ez9 : ezs.A04) {
                if (ez9 != null) {
                    A0K.A0c();
                    String str = ez9.A03;
                    if (str != null) {
                        A0K.A0R("title_text", str);
                    }
                    String str2 = ez9.A01;
                    if (str2 != null) {
                        A0K.A0R("content_text", str2);
                    }
                    C48155EZx eZx = ez9.A00;
                    if (eZx != null) {
                        A0K.A0R("step", eZx.name());
                    }
                    String str3 = ez9.A02;
                    if (str3 != null) {
                        A0K.A0R("qualifying_value", str3);
                    }
                    A0K.A0Z();
                }
            }
            A0K.A0Y();
        }
        Boolean bool = ezs.A02;
        if (bool != null) {
            A0K.A0S("is_exposed", bool.booleanValue());
        }
        EXD exd = ezs.A01;
        if (exd != null) {
            A0K.A0R("flow_type", exd.A00);
        }
        Integer num = ezs.A03;
        if (num != null) {
            A0K.A0P("position", num.intValue());
        }
        return AnonymousClass7TG.A0k(A0K, stringWriter);
    }
}

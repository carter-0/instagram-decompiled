package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.EmX  reason: case insensitive filesystem */
public abstract class C48933EmX {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.F3L, java.lang.Object] */
    public static F3L parseFromJson(16F r6) {
        String str;
        0qQ.A0B(r6, 0);
        try {
            ? obj = new Object();
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                ArrayList arrayList = null;
                if ("consent_key".equals(A17)) {
                    obj.A00 = AnonymousClass7TG.A0l(r6);
                } else if (TraceFieldType.ContentType.equals(A17)) {
                    String A1Q = r6.A1Q();
                    for (Integer intValue : AnonymousClass05K.A00(2)) {
                        if (1 - intValue.intValue() != 0) {
                            str = "consent";
                        } else {
                            str = "text";
                        }
                        if (str.equals(A1Q)) {
                            break;
                        }
                    }
                } else if ("age".equals(A17)) {
                    r6.A1D();
                } else if ("today".equals(A17)) {
                    C41846B3n.A1A(r6);
                } else if ("headline".equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r6);
                } else if ("paragraphs".equals(A17)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r6.A1J() != 16L.A08) {
                            C49480EwL parseFromJson = C48932EmW.parseFromJson(r6);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A03 = arrayList;
                } else if ("optional_paragraphs".equals(A17)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r6.A1J() != 16L.A08) {
                            C49480EwL parseFromJson2 = C48932EmW.parseFromJson(r6);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    obj.A02 = arrayList;
                }
                r6.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

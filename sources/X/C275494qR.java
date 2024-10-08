package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4qR  reason: invalid class name and case insensitive filesystem */
public abstract class C275494qR {
    public static C275534qV parseFromJson(16F r11) {
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            ArrayList arrayList = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (r11.A1J() != 16L.A09) {
                String A0q = r11.A0q();
                r11.A1J();
                if ("answers".equals(A0q)) {
                    if (r11.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r11.A1J() != 16L.A08) {
                            C275514qT parseFromJson = C275504qS.parseFromJson(r11);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("question_id".equals(A0q)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                } else if ("sub_text".equals(A0q)) {
                    if (r11.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r11.A1P();
                    }
                } else if ("text".equals(A0q)) {
                    if (r11.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r11.A1P();
                    }
                }
                r11.A0z();
            }
            if (arrayList == null && (r11 instanceof 0c9)) {
                ((0c9) r11).A03.A00("answers", "AdsFeedbackInterfaceQuestionImpl");
            } else if (str == null && (r11 instanceof 0c9)) {
                ((0c9) r11).A03.A00("question_id", "AdsFeedbackInterfaceQuestionImpl");
            } else if (str2 != null || !(r11 instanceof 0c9)) {
                return new C275534qV(str, str3, str2, arrayList);
            } else {
                ((0c9) r11).A03.A00("text", "AdsFeedbackInterfaceQuestionImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, C275534qV r3) {
        r2.A0c();
        List<C275524qU> list = r3.A03;
        if (list != null) {
            16P.A03(r2, "answers");
            for (C275524qU r0 : list) {
                if (r0 != null) {
                    C275504qS.A00(r2, r0.F0G());
                }
            }
            r2.A0Y();
        }
        String str = r3.A00;
        if (str != null) {
            r2.A0R("question_id", str);
        }
        String str2 = r3.A01;
        if (str2 != null) {
            r2.A0R("sub_text", str2);
        }
        String str3 = r3.A02;
        if (str3 != null) {
            r2.A0R("text", str3);
        }
        r2.A0Z();
    }
}

package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.INLINE_SURVEY_QUESTION_TYPES;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Vlv  reason: case insensitive filesystem */
public abstract class C18127Vlv {
    public static C15059UNc parseFromJson(16F r12) {
        String str;
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            ArrayList arrayList = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            Boolean bool = null;
            String str6 = null;
            String str7 = null;
            INLINE_SURVEY_QUESTION_TYPES inline_survey_question_types = null;
            while (r12.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r12);
                if ("answers".equals(A17)) {
                    if (r12.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r12.A1J() != 16L.A08) {
                            C15058UNb parseFromJson = V8L.parseFromJson(r12);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("disclaimer_text".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r12.A1P();
                    }
                } else if (C41845B3m.A17(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r12.A1P();
                    }
                } else if ("next_question_id_on_skip".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r12.A1P();
                    }
                } else if ("placeholder".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r12.A1P();
                    }
                } else if ("submit_optional".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r12);
                } else if ("submit_text".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r12.A1P();
                    }
                } else if (C41845B3m.A1E(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r12.A1P();
                    }
                } else if (C41845B3m.A1C(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r12.A1P();
                    }
                    inline_survey_question_types = (INLINE_SURVEY_QUESTION_TYPES) INLINE_SURVEY_QUESTION_TYPES.A01.get(str);
                    if (inline_survey_question_types == null) {
                        inline_survey_question_types = INLINE_SURVEY_QUESTION_TYPES.UNRECOGNIZED;
                    }
                }
                r12.A0z();
            }
            return new C15059UNc(inline_survey_question_types, bool, str2, str3, str4, str5, str6, str7, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r4, C15059UNc uNc) {
        r4.A0c();
        List list = uNc.A08;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r4, "answers", list);
            while (A0s.hasNext()) {
                C21033XAm xAm = (C21033XAm) A0s.next();
                if (xAm != null) {
                    C15058UNb FCC = xAm.FCC();
                    r4.A0c();
                    C41846B3n.A0y(r4, FCC.A02);
                    Boolean bool = FCC.A00;
                    if (bool != null) {
                        r4.A0S("is_exclusive", bool.booleanValue());
                    }
                    String str = FCC.A03;
                    if (str != null) {
                        r4.A0R("next_id", str);
                    }
                    Boolean bool2 = FCC.A01;
                    if (bool2 != null) {
                        r4.A0S("single_choice_answer", bool2.booleanValue());
                    }
                    C41846B3n.A0z(r4, FCC.A04);
                    r4.A0Z();
                }
            }
            r4.A0Y();
        }
        String str2 = uNc.A02;
        if (str2 != null) {
            r4.A0R("disclaimer_text", str2);
        }
        C41846B3n.A0y(r4, uNc.A03);
        String str3 = uNc.A04;
        if (str3 != null) {
            r4.A0R("next_question_id_on_skip", str3);
        }
        String str4 = uNc.A05;
        if (str4 != null) {
            r4.A0R("placeholder", str4);
        }
        Boolean bool3 = uNc.A01;
        if (bool3 != null) {
            r4.A0S("submit_optional", bool3.booleanValue());
        }
        String str5 = uNc.A06;
        if (str5 != null) {
            r4.A0R("submit_text", str5);
        }
        C41846B3n.A10(r4, uNc.A07);
        INLINE_SURVEY_QUESTION_TYPES inline_survey_question_types = uNc.A00;
        if (inline_survey_question_types != null) {
            r4.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, inline_survey_question_types.A00);
        }
        r4.A0Z();
    }
}

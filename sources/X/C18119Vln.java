package X;

import com.instagram.reels.question.constants.QuestionStickerType;
import com.instagram.reels.question.model.responsetype.QuestionResponseType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Vln  reason: case insensitive filesystem */
public abstract class C18119Vln {
    public static UNR parseFromJson(16F r14) {
        String str;
        String str2;
        0qQ.A0B(r14, 0);
        try {
            if (r14.A11() != 16L.A0D) {
                r14.A0z();
                return null;
            }
            String str3 = null;
            Boolean bool = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            Long l = null;
            QuestionStickerType questionStickerType = null;
            ArrayList arrayList = null;
            String str8 = null;
            Boolean bool2 = null;
            while (r14.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r14);
                if ("background_color".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r14.A1P();
                    }
                } else if ("is_clips_v2_media".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r14);
                } else if ("media_id".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r14.A1P();
                    }
                } else if ("profile_pic_url".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r14.A1P();
                    }
                } else if ("question".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r14.A1P();
                    }
                } else if ("question_id".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r14.A1P();
                    }
                } else if ("question_response_count".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r14);
                } else if ("question_type".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r14.A1P();
                    }
                    questionStickerType = (QuestionStickerType) QuestionStickerType.A01.get(str2);
                    if (questionStickerType == null) {
                        questionStickerType = QuestionStickerType.UNRECOGNIZED;
                    }
                } else if ("response_types".equals(A17)) {
                    if (r14.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r14.A1J() != 16L.A08) {
                            if (r14.A11() == 16L.A0G) {
                                str = null;
                            } else {
                                str = r14.A1P();
                            }
                            arrayList.add(C369268u8.A00(str));
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("text_color".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r14.A1P();
                    }
                } else if ("viewer_can_interact".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r14);
                }
                r14.A0z();
            }
            return new UNR(questionStickerType, bool, bool2, l, str3, str4, str5, str6, str7, str8, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r3, UNR unr, boolean z) {
        if (z) {
            r3.A0c();
        }
        String str = unr.A04;
        if (str != null) {
            r3.A0R("background_color", str);
        }
        Boolean bool = unr.A01;
        if (bool != null) {
            r3.A0S("is_clips_v2_media", bool.booleanValue());
        }
        C41846B3n.A11(r3, unr.A05);
        String str2 = unr.A06;
        if (str2 != null) {
            r3.A0R("profile_pic_url", str2);
        }
        String str3 = unr.A07;
        if (str3 != null) {
            r3.A0R("question", str3);
        }
        String str4 = unr.A08;
        if (str4 != null) {
            r3.A0R("question_id", str4);
        }
        Long l = unr.A03;
        if (l != null) {
            r3.A0Q("question_response_count", l.longValue());
        }
        QuestionStickerType questionStickerType = unr.A00;
        if (questionStickerType != null) {
            r3.A0R("question_type", questionStickerType.A00);
        }
        List list = unr.A0A;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r3, "response_types", list);
            while (A0s.hasNext()) {
                QuestionResponseType questionResponseType = (QuestionResponseType) A0s.next();
                if (questionResponseType != null) {
                    r3.A0t(questionResponseType.A00);
                }
            }
            r3.A0Y();
        }
        C13988Tno.A1G(r3, unr.A09);
        Boolean bool2 = unr.A02;
        if (bool2 != null) {
            r3.A0S("viewer_can_interact", bool2.booleanValue());
        }
        if (z) {
            r3.A0Z();
        }
    }
}

package X;

import com.instagram.reels.question.constants.QuestionStickerType;
import com.instagram.reels.question.model.QuestionResponseModel;
import com.instagram.reels.question.model.QuestionResponsesModel;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CoW  reason: case insensitive filesystem */
public abstract class C44993CoW {
    public static QuestionResponsesModel parseFromJson(16F r30) {
        String str;
        16F r7 = r30;
        0qQ.A0B(r7, 0);
        try {
            Boolean bool = null;
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            Integer num = null;
            Integer num2 = null;
            String str2 = null;
            Long l = null;
            String str3 = null;
            String str4 = null;
            User user = null;
            String str5 = null;
            QuestionStickerType questionStickerType = null;
            ArrayList arrayList = null;
            String str6 = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("background_color".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r7.A1P();
                    }
                } else if ("latest_question_response_time".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r7);
                } else if (C41845B3m.A1H(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r7.A1P();
                    }
                } else if ("more_available".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r7);
                } else if ("question".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r7.A1P();
                    }
                } else if ("question_author".equals(A17)) {
                    user = C41845B3m.A0a(r7, false);
                } else if ("question_id".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r7.A1P();
                    }
                } else if ("question_response_count".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r7);
                } else if ("question_type".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                    questionStickerType = (QuestionStickerType) QuestionStickerType.A01.get(str);
                    if (questionStickerType == null) {
                        questionStickerType = QuestionStickerType.UNRECOGNIZED;
                    }
                } else if ("responders".equals(A17)) {
                    if (r7.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r7.A1J() != 16L.A08) {
                            QuestionResponseModel parseFromJson = C44991CoU.parseFromJson(r7);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (!"text_color".equals(A17)) {
                    num2 = C41847B3o.A13(r7, num2, A17, "unanswered_response_count");
                } else if (r7.A11() == 16L.A0G) {
                    str6 = null;
                } else {
                    str6 = r7.A1P();
                }
                r7.A0z();
            }
            if (str2 == null && (r7 instanceof 0c9)) {
                AnonymousClass7TF.A1L("background_color", r7, "QuestionResponsesModel");
            } else if (bool == null && (r7 instanceof 0c9)) {
                AnonymousClass7TF.A1L("more_available", r7, "QuestionResponsesModel");
            } else if (str4 == null && (r7 instanceof 0c9)) {
                AnonymousClass7TF.A1L("question", r7, "QuestionResponsesModel");
            } else if (str5 == null && (r7 instanceof 0c9)) {
                AnonymousClass7TF.A1L("question_id", r7, "QuestionResponsesModel");
            } else if (num == null && (r7 instanceof 0c9)) {
                AnonymousClass7TF.A1L("question_response_count", r7, "QuestionResponsesModel");
            } else if (questionStickerType == null && (r7 instanceof 0c9)) {
                AnonymousClass7TF.A1L("question_type", r7, "QuestionResponsesModel");
            } else if (arrayList == null && (r7 instanceof 0c9)) {
                AnonymousClass7TF.A1L("responders", r7, "QuestionResponsesModel");
            } else if (str6 == null && (r7 instanceof 0c9)) {
                AnonymousClass7TF.A1L("text_color", r7, "QuestionResponsesModel");
            } else if (num2 != null || !(r7 instanceof 0c9)) {
                return new QuestionResponsesModel(questionStickerType, user, l, str2, str3, str4, str5, str6, arrayList, num.intValue(), num2.intValue(), bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L("unanswered_response_count", r7, "QuestionResponsesModel");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

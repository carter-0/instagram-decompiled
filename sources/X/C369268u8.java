package X;

import com.instagram.reels.question.model.responsetype.QuestionResponseType;

/* renamed from: X.8u8  reason: invalid class name and case insensitive filesystem */
public abstract class C369268u8 {
    public static final QuestionResponseType A00(String str) {
        QuestionResponseType questionResponseType = (QuestionResponseType) QuestionResponseType.A01.get(str);
        if (questionResponseType == null) {
            return QuestionResponseType.UNRECOGNIZED;
        }
        return questionResponseType;
    }
}

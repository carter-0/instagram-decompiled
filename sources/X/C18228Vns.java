package X;

import com.instagram.reels.question.model.responsetype.QuestionResponseType;

/* renamed from: X.Vns  reason: case insensitive filesystem */
public abstract class C18228Vns {
    public static final QuestionResponseType A00(C16570UxN uxN) {
        int A02 = DbU.A02(uxN, 0);
        if (A02 == 1) {
            return QuestionResponseType.TEXT;
        }
        if (A02 == 2) {
            return QuestionResponseType.MUSIC;
        }
        if (A02 == 3) {
            return QuestionResponseType.MEDIA;
        }
        if (A02 != 4) {
            return QuestionResponseType.UNRECOGNIZED;
        }
        return QuestionResponseType.LOCATION;
    }

    public static final C16570UxN A01(QuestionResponseType questionResponseType) {
        int A02 = DbU.A02(questionResponseType, 0);
        if (A02 == 4) {
            return C16570UxN.TEXT;
        }
        if (A02 == 3) {
            return C16570UxN.MUSIC;
        }
        if (A02 == 2) {
            return C16570UxN.MEDIA;
        }
        if (A02 != 1) {
            return C16570UxN.UNKNOWN;
        }
        return C16570UxN.LOCATION;
    }
}

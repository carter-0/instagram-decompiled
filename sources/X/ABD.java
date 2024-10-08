package X;

import com.instagram.reels.question.model.responsetype.QuestionResponseType;
import java.io.IOException;

public abstract class ABD {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.A7J, java.lang.Object] */
    public static A7J parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("original_question_id".equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r3);
                } else if (C273654mx.A00(181).equals(A17)) {
                    obj.A04 = AnonymousClass7TG.A0l(r3);
                } else if ("question_responder_id".equals(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r3);
                } else if (C273654mx.A00(314).equals(A17)) {
                    obj.A01 = AnonymousClass7TF.A0S(r3);
                } else if ("question_response_type".equals(A17)) {
                    obj.A00 = C369268u8.A00(AnonymousClass7TG.A0l(r3));
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, A7J a7j) {
        r2.A0c();
        String str = a7j.A02;
        if (str != null) {
            r2.A0R("original_question_id", str);
        }
        String str2 = a7j.A04;
        if (str2 != null) {
            r2.A0R(C273654mx.A00(181), str2);
        }
        String str3 = a7j.A03;
        if (str3 != null) {
            r2.A0R("question_responder_id", str3);
        }
        Boolean bool = a7j.A01;
        if (bool != null) {
            r2.A0S(C273654mx.A00(314), bool.booleanValue());
        }
        QuestionResponseType questionResponseType = a7j.A00;
        if (questionResponseType != null) {
            r2.A0R("question_response_type", questionResponseType.A00);
        }
        r2.A0Z();
    }
}

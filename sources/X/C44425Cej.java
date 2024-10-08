package X;

import com.instagram.reels.question.model.QuestionResponsesModel;
import java.io.IOException;

/* renamed from: X.Cej  reason: case insensitive filesystem */
public abstract class C44425Cej {
    public static CDU parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1XQ r2 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("responder_info".equals(A17)) {
                    r2.A01 = C44993CoW.parseFromJson(r3);
                } else {
                    1XY.A01(r3, r2, A17);
                }
                r3.A0z();
            }
            QuestionResponsesModel questionResponsesModel = r2.A01;
            0qQ.A0A(questionResponsesModel);
            r2.A00 = new C42016BAq(questionResponsesModel);
            return r2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

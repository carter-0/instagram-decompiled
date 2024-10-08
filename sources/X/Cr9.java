package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;

public abstract class Cr9 {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.Cw4, java.lang.Object] */
    public static C45424Cw4 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("client_subscription_id".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                    }
                    r4.A1P();
                } else if (TraceFieldType.BroadcastId.equals(A17)) {
                    obj.A05 = AnonymousClass7TG.A0l(r4);
                } else if ("video_timestamp".equals(A17)) {
                    obj.A03 = AnonymousClass7TF.A0Z(r4);
                } else if ("is_active".equals(A17)) {
                    obj.A02 = AnonymousClass7TF.A0S(r4);
                } else if ("question_id".equals(A17)) {
                    obj.A04 = AnonymousClass7TF.A0Z(r4);
                } else if ("story_question_id".equals(A17)) {
                    obj.A00 = r4.A0y();
                } else if ("question_prompt".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                    }
                    r4.A1P();
                } else if ("question_body".equals(A17)) {
                    obj.A06 = AnonymousClass7TG.A0l(r4);
                } else if ("source".equals(A17)) {
                    obj.A07 = AnonymousClass7TG.A0l(r4);
                } else if (C41845B3m.A1B(A17)) {
                    obj.A01 = C41845B3m.A0a(r4, false);
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
}

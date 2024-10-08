package X;

import com.facebook.react.modules.appstate.AppStateModule;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.io.IOException;

/* renamed from: X.V8f  reason: case insensitive filesystem */
public abstract class C16850V8f {
    public static C15069UNm parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            UNF unf = null;
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            UNG ung = null;
            UNN unn = null;
            UNO uno = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if (AppStateModule.APP_STATE_BACKGROUND.equals(A17)) {
                    unf = C16829V7k.parseFromJson(r6);
                } else if (GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT.equals(A17)) {
                    ung = C18115Vlj.parseFromJson(r6);
                } else if ("page_name".equals(A17)) {
                    unn = C18117Vll.parseFromJson(r6);
                } else if ("thumbnail".equals(A17)) {
                    uno = C18118Vlm.parseFromJson(r6);
                }
                r6.A0z();
            }
            return new C15069UNm(unf, ung, unn, uno);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Fcp  reason: case insensitive filesystem */
public final class C50503Fcp implements C66491MTu {
    public final /* synthetic */ AnonymousClass5HJ A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    public final void onDismiss() {
    }

    public C50503Fcp(AnonymousClass5HJ r1, UserSession userSession, String str) {
        this.A01 = userSession;
        this.A00 = r1;
        this.A02 = str;
    }

    public final void D1x(Context context) {
        UserSession userSession = this.A01;
        FragmentActivity A06 = 2MD.A01().A06();
        if (A06 != null) {
            String str = this.A00.A0j;
            if (str.equals(userSession.A06)) {
                1pE A012 = 1pE.A01(A06, DbS.A0O("push_notification"), userSession, "watch_receipt_inapp_notification");
                A012.A0A(this.A02);
                A012.A06();
                return;
            }
            0BQ A002 = AnonymousClass0BO.A00(userSession);
            User BNw = A002.BNw(str);
            if (BNw != null && A002.AG1(A06, userSession, BNw)) {
                A002.E2S(A06, F5W.A01(A06, str, this.A02, (String) null, "DirectUrlHandler", (String) null, (List) null), userSession, BNw, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_WATCH_RECEIPTS);
            }
        }
    }
}

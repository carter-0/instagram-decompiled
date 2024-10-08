package X;

import com.instagram.api.schemas.BizUserInboxState;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: X.44H  reason: invalid class name */
public final class AnonymousClass44H implements C2598643j {
    public final UserSession A00;
    public final 1bO A01;

    /* JADX WARNING: type inference failed for: r0v10, types: [X.OsU, X.1qK, java.lang.Object] */
    public final AnonymousClass6BN E4Y(AnonymousClass651 r9, AnonymousClass653 r10, List list, Map map, 0sL r13, 0sL r14, boolean z) {
        BizUserInboxState bizUserInboxState;
        0qQ.A0B(r10, 2);
        try {
            BizUserInboxState bizUserInboxState2 = C70056NwY.parseFromJson(16P.A00(r10.A02)).A00;
            if (bizUserInboxState2 != null && (bizUserInboxState2 != (bizUserInboxState = BizUserInboxState.NORMAL) || AnonymousClass78K.A00(this.A00))) {
                UserSession userSession = this.A00;
                AnonymousClass4kA A002 = AnonymousClass4k9.A00(userSession);
                int parseInt = Integer.parseInt(bizUserInboxState2.A00);
                A002.A0R.Epx(A002, Integer.valueOf(parseInt), AnonymousClass4kA.A0c[9]);
                1Ng A003 = AnonymousClass1Nd.A00(userSession);
                ? obj = new Object();
                obj.A00 = bizUserInboxState2;
                A003.A00(obj);
                if (bizUserInboxState2 == bizUserInboxState) {
                    this.A01.A09();
                }
            }
            return AnonymousClass6BL.A00;
        } catch (IOException e) {
            0wb.A01.Ew2("invalid_biz_user_inbox_state", "General folder state is missing", e);
            return new AnonymousClass6BQ(e, "invalid_biz_user_inbox_state", "General folder state is missing");
        }
    }

    public AnonymousClass44H(UserSession userSession) {
        this.A00 = userSession;
        1bO A002 = 1bO.A00(userSession);
        0qQ.A07(A002);
        this.A01 = A002;
    }
}

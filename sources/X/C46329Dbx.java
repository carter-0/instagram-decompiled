package X;

import com.instagram.common.session.UserSession;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.Dbx  reason: case insensitive filesystem */
public class C46329Dbx extends MYU {
    public final C2366634p A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46329Dbx(UserSession userSession, String str, int i) {
        super(userSession);
        0qQ.A0B(userSession, 1);
        this.A01 = i;
        this.A00 = A02(str);
    }

    public static void A00(C46329Dbx dbx) {
        dbx.A00.A05();
    }

    @Deprecated(message = "Use the qplEventId field directly", replaceWith = @ReplaceWith(expression = "qplEventId", imports = {}))
    public final int A0L() {
        return this.A01;
    }
}

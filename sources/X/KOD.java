package X;

import com.instagram.common.session.UserSession;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class KOD extends LSR {
    public final UserSession A00;
    public final LRK A01;
    public final 05G A02;
    public final AnonymousClass0Ud A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KOD(UserSession userSession, LRK lrk) {
        super(lrk);
        AnonymousClass7TF.A1B(lrk, 1, userSession);
        this.A01 = lrk;
        this.A00 = userSession;
        02z A10 = DbS.A10(new C61080JwI((Map) null, (DefaultConstructorMarker) null, 1, 41));
        this.A02 = A10;
        this.A03 = A10;
    }
}

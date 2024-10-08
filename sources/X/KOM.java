package X;

import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.common.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class KOM extends LSR {
    public AnonymousClass3Q2 A00;
    public final UserSession A01;
    public final LRK A02;
    public final String A03;
    public final AnonymousClass0r6 A04;
    public final 05G A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KOM(UserSession userSession, LRK lrk, String str) {
        super(lrk);
        AnonymousClass7TG.A1Q(userSession, str);
        this.A02 = lrk;
        this.A01 = userSession;
        this.A03 = str;
        02z A10 = DbS.A10(new C61080JwI((MediaGenAIDetectionMethod) null, (DefaultConstructorMarker) null, 1, 44));
        this.A05 = A10;
        this.A04 = A10;
    }
}

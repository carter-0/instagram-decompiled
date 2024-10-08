package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;

public final class P8S implements AnonymousClass7DU {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final AnonymousClass7XR A02;

    public final /* bridge */ /* synthetic */ boolean DA8(Object obj, Object obj2) {
        AnonymousClass7FV r11 = (AnonymousClass7FV) obj;
        AnonymousClass7TG.A1N(r11, obj2);
        HashMap A1E = AnonymousClass7TE.A1E();
        String valueOf = String.valueOf(r11.CU2());
        A1E.put("viewer_is_sender", valueOf);
        C67000MgY.A00(this.A00, this.A01, (Long) null, "selfie_thumbnail_xma", "double_tap", "direct_thread", (String) null, DbY.A0m("viewer_is_sender", valueOf));
        return new AnonymousClass7DT(this.A02).A01(r11, obj2);
    }

    public P8S(AnonymousClass0iw r1, UserSession userSession, AnonymousClass7XR r3) {
        this.A02 = r3;
        this.A01 = userSession;
        this.A00 = r1;
    }
}

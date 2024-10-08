package X;

import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class KOC extends LSR {
    public final KO3 A00;
    public final 05G A01;
    public final AnonymousClass0Ud A02;
    public final UserSession A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KOC(UserSession userSession, KO3 ko3) {
        super(ko3);
        AnonymousClass7TF.A1B(userSession, 1, ko3);
        this.A03 = userSession;
        this.A00 = ko3;
        02z A10 = DbS.A10(new C61080JwI((AudioOverlayTrack) null, (DefaultConstructorMarker) null, 1, 40));
        this.A01 = A10;
        this.A02 = A10;
    }
}

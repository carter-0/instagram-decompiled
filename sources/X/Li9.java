package X;

import com.instagram.common.session.UserSession;

public final class Li9 implements C232262tL {
    public final UserSession A00;
    public final boolean A01;
    public final boolean A02;

    public Li9(UserSession userSession, boolean z, boolean z2) {
        0qQ.A0B(userSession, 3);
        this.A02 = z;
        this.A01 = z2;
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return "video_metadata_promote";
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        Li9 li9 = (Li9) obj;
        0qQ.A0B(li9, 0);
        return AnonymousClass7TF.A1S(this.A01 ? 1 : 0, li9.A01 ? 1 : 0);
    }
}

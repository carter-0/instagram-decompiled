package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LiI  reason: case insensitive filesystem */
public final class C64798LiI implements C232262tL {
    public final UserSession A00;
    public final MSW A01;
    public final String A02;
    public final String A03;

    public C64798LiI(UserSession userSession, MSW msw, String str, String str2) {
        0qQ.A0B(userSession, 5);
        this.A03 = str;
        this.A01 = msw;
        this.A02 = str2;
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return 002.A0R("video_metadata_tagging_", this.A03);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C64798LiI liI = (C64798LiI) obj;
        0qQ.A0B(liI, 0);
        if (!0qQ.A0K(this.A03, liI.A03) || !0qQ.A0K(this.A02, liI.A02)) {
            return false;
        }
        return true;
    }
}

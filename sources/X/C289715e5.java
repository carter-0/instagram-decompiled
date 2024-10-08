package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.5e5  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C289715e5 implements C61910qF, AnonymousClass3Y1 {
    public final /* synthetic */ AnonymousClass335 A00;

    public C289715e5(AnonymousClass335 r1) {
        this.A00 = r1;
    }

    public final C246663ey AXQ(UserSession userSession, AnonymousClass3W1 r3, String str, boolean z) {
        0qQ.A0B(str, 0);
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r3, 3);
        return this.A00.A00(userSession, r3, str, z);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass3Y1) || !(obj instanceof C61910qF)) {
            return false;
        }
        return 0qQ.A0K(getFunctionDelegate(), ((C61910qF) obj).getFunctionDelegate());
    }

    public final AnonymousClass0eL getFunctionDelegate() {
        return new 03J(4, this.A00, AnonymousClass335.class, "getOrCreateHolderForMedia", "getOrCreateHolderForMedia(Ljava/lang/String;ZLcom/instagram/common/session/UserSession;Lcom/instagram/feed/ui/state/MediaState;)Lcom/instagram/feed/ui/rows/mediaview/ui/litho/LithoMediaViewHolder;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}

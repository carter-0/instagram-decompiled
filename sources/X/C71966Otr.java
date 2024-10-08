package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Otr  reason: case insensitive filesystem */
public final class C71966Otr implements C232262tL {
    public final UserSession A00;
    public final C69375NkF A01;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return "sort_option";
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return AnonymousClass7TF.A1W(this.A01, ((C71966Otr) obj).A01);
    }

    public C71966Otr(UserSession userSession, C69375NkF nkF) {
        this.A01 = nkF;
        this.A00 = userSession;
    }
}

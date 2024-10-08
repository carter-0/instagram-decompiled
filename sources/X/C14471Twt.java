package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Twt  reason: case insensitive filesystem */
public final class C14471Twt {
    public static final C14470Tws A05 = new Object();
    public final 2Fk A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;

    public final boolean A00() {
        if (!G9t.A1b(this.A04)) {
            return ((0xa) this.A01.getValue()).getBoolean("display_source_as_search_subtitle", false);
        }
        return AnonymousClass7TE.A1a(C67351tA.A00(19B.A00, new C51647Fy6((Object) this, (AnonymousClass4D7) null, 41)));
    }

    public C14471Twt(UserSession userSession) {
        0eO r2 = 0eO.A02;
        this.A04 = AnonymousClass0eN.A00(r2, new C51763G0f(userSession, 8));
        this.A03 = AnonymousClass0eN.A00(r2, new C51763G0f(userSession, 7));
        this.A01 = AnonymousClass0eN.A00(r2, new C51763G0f(userSession, 5));
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r2, new C51763G0f(this, 6));
        this.A02 = A002;
        this.A00 = DbT.A0G((AnonymousClass0r6) A002.getValue());
    }
}

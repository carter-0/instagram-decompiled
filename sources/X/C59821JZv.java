package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.JZv  reason: case insensitive filesystem */
public final class C59821JZv extends C252733pa implements AnonymousClass0lh {
    public long A00 = -1;
    public AnonymousClass0Ud A01;
    public final AnonymousClass4HW A02 = C335967dq.A00(C59822JZw.A00);
    public final UserSession A03;
    public final 05G A04;
    public final C61410nE A05 = C61410nE.A00;

    public C59821JZv(UserSession userSession) {
        super("meta_ai_suggestion_repository", AnonymousClass43D.A00(1957986924));
        this.A03 = userSession;
        02z A012 = 106.A01((Object) null);
        this.A04 = A012;
        this.A01 = A012;
    }

    public final void onSessionWillEnd() {
        05G r2 = this.A04;
        do {
        } while (!r2.AIY(r2.getValue(), (Object) null));
    }
}

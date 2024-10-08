package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Flu  reason: case insensitive filesystem */
public final class C50967Flu implements AnonymousClass4MH {
    public final long A00;
    public final 0wc A01;

    public final void Cl9(String str, boolean z) {
        Integer num;
        0qQ.A0B(str, 0);
        0wc r2 = this.A01;
        if (z) {
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A00;
        }
        C49153EqK.A00(r2, str, num.intValue(), false, true);
    }

    public final void ClA(String str, boolean z) {
        Integer num;
        0qQ.A0B(str, 0);
        0wc r2 = this.A01;
        if (z) {
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A00;
        }
        C49153EqK.A00(r2, str, num.intValue(), true, false);
    }

    public final long Awp() {
        return this.A00;
    }

    public final boolean CSf() {
        return true;
    }

    public C50967Flu(UserSession userSession, long j) {
        this.A00 = j;
        AnonymousClass0kM r1 = new AnonymousClass0kM(userSession);
        r1.A01 = "ig_blank_screen_module";
        this.A01 = r1.A00();
    }
}

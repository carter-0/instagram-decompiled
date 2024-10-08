package X;

import java.util.HashSet;

/* renamed from: X.441  reason: invalid class name */
public final class AnonymousClass441 {
    public static final AnonymousClass441 A02 = new AnonymousClass441((AnonymousClass4D6) null);
    public final AnonymousClass4D6 A00;
    public final HashSet A01;

    public static 1OC A00(0lg r3, String str) {
        1NY r2 = new 1NY(r3);
        r2.A05();
        r2.A0K(AnonymousClass000.A00(4179), new Object[]{str});
        r2.A0R(DvP.class, C49809F7w.class);
        return r2.A0M();
    }

    public final void A01(1P0 r4, 0lg r5, String str) {
        1NY r2 = new 1NY(r5);
        r2.A05();
        r2.A0A("video_call/user/");
        r2.A9m("user_fbid", str);
        r2.A0R(DvP.class, C49809F7w.class);
        1OC A0M = r2.A0M();
        A0M.A00 = r4;
        AnonymousClass4D6 r0 = this.A00;
        if (r0 != null) {
            r0.schedule(A0M);
        } else {
            1ES.A03(A0M);
        }
    }

    public final void A02(0lg r3, C330317Mh r4, String str) {
        if (this.A01.add(str)) {
            1OC A002 = A00(r3, str);
            A002.A00 = new ECY(r3, r4, this, str);
            AnonymousClass4D6 r0 = this.A00;
            if (r0 != null) {
                r0.schedule(A002);
            } else {
                1ES.A03(A002);
            }
        }
    }

    public AnonymousClass441(AnonymousClass4D6 r2) {
        this.A01 = new HashSet();
        this.A00 = r2;
    }

    public AnonymousClass441() {
        this((AnonymousClass4D6) null);
    }
}

package X;

import com.instagram.model.reels.Reel;

/* renamed from: X.3BE  reason: invalid class name */
public final class AnonymousClass3BE implements Runnable {
    public final /* synthetic */ C2365134a A00;

    public AnonymousClass3BE(C2365134a r1) {
        this.A00 = r1;
    }

    public final void run() {
        boolean z;
        String str;
        Reel reel;
        C2365134a r2 = this.A00;
        C2365934i r1 = r2.A0Q;
        Object Bkf = r1.Bkf((((C2365834h) r1).A04() ? 1 : 0) + true);
        if (!(Bkf instanceof Reel) || (reel = (Reel) Bkf) == null) {
            z = false;
        } else {
            z = reel.A16(r2.A0F);
        }
        AnonymousClass2l3 r4 = r2.A0L;
        if (z) {
            str = "old";
        } else {
            str = "new";
        }
        r4.A0I.A0N(r4.A00, r4, "STORIES_TRAY_POPULATED", str);
    }
}

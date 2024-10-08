package X;

import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.Ams  reason: case insensitive filesystem */
public final /* synthetic */ class C41008Ams implements Runnable {
    public final /* synthetic */ AnonymousClass8BA A00;
    public final /* synthetic */ C3498682d A01;

    public /* synthetic */ C41008Ams(AnonymousClass8BA r1, C3498682d r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        AnonymousClass8BA r0 = this.A00;
        C3498682d r14 = this.A01;
        UserSession userSession = r0.A0v;
        AnonymousClass88O r6 = r0.A1B;
        InteractiveDrawableContainer interactiveDrawableContainer = r0.A1s;
        C314676if r1 = r0.A1g;
        AnonymousClass8ME r7 = (AnonymousClass8ME) r1.get();
        String moduleName = r0.A0u.getModuleName();
        r1.get();
        boolean A1Z = AnonymousClass7TG.A1Z(userSession, r6);
        AnonymousClass7TG.A1Q(interactiveDrawableContainer, r7);
        0qQ.A0B(moduleName, 5);
        float f = 0.67f;
        float f2 = 0.5625f;
        if (r14.A08) {
            f = 1.0f;
            f2 = 1.7778f;
        }
        C310416b1 r4 = new C310416b1(C394869yp.A00(f2, AnonymousClass7TE.A02(interactiveDrawableContainer), AnonymousClass7TE.A03(interactiveDrawableContainer), f, A1Z));
        Drawable A002 = C39900AIi.A00(AnonymousClass7TE.A0S(interactiveDrawableContainer), userSession, (C279284yO) null, (C321086tY) null, r14, (Integer) null, (Integer) null, moduleName, A1Z);
        r7.A0z(A002, r4, 002.A0R("story-igtv-metadata-sticker-", r14.A06), AnonymousClass7TE.A1I("igtv_countdown_sticker_id"));
        r6.A01(new C40328AaN(A002, interactiveDrawableContainer, 0));
    }
}

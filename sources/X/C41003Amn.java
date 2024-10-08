package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.Amn  reason: case insensitive filesystem */
public final /* synthetic */ class C41003Amn implements Runnable {
    public final /* synthetic */ AnonymousClass8BA A00;
    public final /* synthetic */ C3498482b A01;

    public /* synthetic */ C41003Amn(AnonymousClass8BA r1, C3498482b r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.07Z, X.4DH] */
    public final void run() {
        Activity activity;
        int i;
        String text;
        AnonymousClass8BA r2 = this.A00;
        C3498482b r13 = this.A01;
        AnonymousClass88O r12 = r2.A1B;
        InteractiveDrawableContainer interactiveDrawableContainer = r2.A1s;
        TargetViewSizeProvider targetViewSizeProvider = r2.A0z;
        UserSession userSession = r2.A0v;
        String moduleName = r2.A0u.getModuleName();
        0qQ.A0B(r12, 0);
        AnonymousClass7TG.A0w(1, interactiveDrawableContainer, targetViewSizeProvider, userSession);
        0qQ.A0B(moduleName, 5);
        AnonymousClass91L.A04(userSession, targetViewSizeProvider, r12, r13, interactiveDrawableContainer, moduleName);
        C46262DSr C11 = r13.A07.A0C.C11();
        if (!(C11 == null || (text = C11.getText()) == null)) {
            AnonymousClass9WT r15 = new AnonymousClass9WT(AnonymousClass7TE.A0S(interactiveDrawableContainer), userSession, targetViewSizeProvider, text);
            float f = r13.A04;
            AnonymousClass81W r1 = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider).A0K;
            interactiveDrawableContainer.A0K(r15, new C310416b1(C394869yp.A00(f, (float) r1.getWidth(), (float) r1.getHeight(), 0.5f, false)), false, false, false);
            r12.A01(new C40327AaM(r15, interactiveDrawableContainer));
        }
        0Tu r5 = 0Tu.A05;
        if (182.A06(r5, userSession, 36322989393849045L)) {
            r12.A01(new C40326AaL(r2));
            r13.A05.A06(r2.A0s, new C64315LZp(1, r2, r13));
            1Av A002 = 1Au.A00(userSession);
            if (182.A06(r5, userSession, 36323225617509388L)) {
                if (A002.A01.getBoolean("immersive_mentions_reshare_stickiness", 182.A06(0Tu.A06, userSession, 36323135422737275L))) {
                    r13.A00();
                } else {
                    r13.A01();
                }
            }
            C369848vQ r9 = (C369848vQ) interactiveDrawableContainer.A0V(C369848vQ.class).get(0);
            String str = "immersive_mention_reshare_tooltip_count";
            0xa r8 = A002.A01;
            if (r8.getInt(str, 0) >= 1 || 182.A06(r5, userSession, 36323225617574925L)) {
                str = "immersive_mention_reshare_tooltip_fullscreen_count";
                if (r8.getInt(str, 0) < 1 && 182.A06(r5, userSession, 36323225617574925L)) {
                    activity = r2.A0n;
                    i = 2131972270;
                } else {
                    return;
                }
            } else {
                activity = r2.A0n;
                i = 2131972271;
            }
            AnonymousClass91L.A02(activity, userSession, r9, interactiveDrawableContainer, i);
            A002.A0z(str, r8.getInt(str, 0) + 1);
        }
    }
}

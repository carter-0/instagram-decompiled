package X;

import android.app.Activity;
import android.content.Context;
import android.util.TypedValue;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.Aov  reason: case insensitive filesystem */
public final /* synthetic */ class C41135Aov implements Runnable {
    public final /* synthetic */ AnonymousClass8BA A00;
    public final /* synthetic */ ClipsCelebrationReshareViewModel A01;
    public final /* synthetic */ AnonymousClass82f A02;

    public /* synthetic */ C41135Aov(AnonymousClass8BA r1, ClipsCelebrationReshareViewModel clipsCelebrationReshareViewModel, AnonymousClass82f r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = clipsCelebrationReshareViewModel;
    }

    public final void run() {
        AnonymousClass8BA r0 = this.A00;
        AnonymousClass82f r12 = this.A02;
        ClipsCelebrationReshareViewModel clipsCelebrationReshareViewModel = this.A01;
        UserSession userSession = r0.A0v;
        AnonymousClass88O r3 = r0.A1B;
        InteractiveDrawableContainer interactiveDrawableContainer = r0.A1s;
        Activity activity = r0.A0n;
        AnonymousClass7TF.A1B(r3, 1, interactiveDrawableContainer);
        0qQ.A0B(activity, 4);
        float f = r12.A05;
        C310416b1 r6 = new C310416b1(C394869yp.A00(f, AnonymousClass7TE.A02(interactiveDrawableContainer), AnonymousClass7TE.A03(interactiveDrawableContainer), 0.67f, true));
        float A022 = AnonymousClass7TE.A02(interactiveDrawableContainer);
        float A03 = AnonymousClass7TE.A03(interactiveDrawableContainer);
        float f2 = A022 / A03;
        if (f < 1.0f && f2 < f) {
            A022 = A03 * f;
        }
        r12.A02 = (int) A022;
        float A023 = AnonymousClass7TE.A02(interactiveDrawableContainer);
        float A032 = AnonymousClass7TE.A03(interactiveDrawableContainer);
        float f3 = A023 / A032;
        if (f >= 1.0f || f3 > f) {
            A032 = A023 / f;
        }
        r12.A01 = (int) A032;
        if (userSession != null) {
            Context A0S = AnonymousClass7TE.A0S(interactiveDrawableContainer);
            C369818vN r9 = new C369818vN(A0S, userSession, r12);
            C310416b1 r17 = r6;
            interactiveDrawableContainer.A0K(r9, r17, false, false, false);
            r3.A01(new C40328AaN(3, (Object) interactiveDrawableContainer, (Object) r9));
            AnonymousClass9X9 r1 = new AnonymousClass9X9(A0S, r12);
            interactiveDrawableContainer.A0K(r1, r17, false, false, false);
            r3.A01(new C40328AaN(4, (Object) r1, (Object) interactiveDrawableContainer));
            26t A002 = 26G.A00(userSession);
            if (!182.A06(0Tu.A05, userSession, 36319858362752697L) && 25x.A00(userSession).A01.A00 == C299715vi.A00) {
                0xa r11 = A002.A00;
                if (r11.getInt("reshare_tooltip_view_count", 0) < 3) {
                    AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(activity, AnonymousClass7TE.A16(activity, 2131953493));
                    A0f.A05(new AnonymousClass9UE(interactiveDrawableContainer, 0, (r9.getIntrinsicHeight() / 2) - ((int) TypedValue.applyDimension(1, 100.0f, AnonymousClass7TF.A0E(activity))), true));
                    A0f.A01();
                    interactiveDrawableContainer.postDelayed(new C41058Ang(userSession, A0f.A00()), 500);
                    A002.A02();
                } else if (r11.getInt("reshare_tap_affordance_view_count", 0) < 3) {
                    r9.A04.A01();
                    AnonymousClass7TG.A1L(r11.AR4(), r11, "reshare_tap_affordance_view_count", 0);
                }
            }
            if (clipsCelebrationReshareViewModel != null) {
                AEG.A02(userSession, interactiveDrawableContainer, clipsCelebrationReshareViewModel.A00);
                if (clipsCelebrationReshareViewModel.A01) {
                    AEG.A01(userSession, r3, interactiveDrawableContainer);
                    return;
                }
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}

package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.List;

/* renamed from: X.AtG  reason: case insensitive filesystem */
public final class C41394AtG implements AnonymousClass0eK {
    public final /* synthetic */ AnonymousClass07i A00;
    public final /* synthetic */ AnonymousClass8BQ A01;
    public final /* synthetic */ AnonymousClass8AL A02;
    public final /* synthetic */ C40377AbA A03;

    public C41394AtG(AnonymousClass07i r1, AnonymousClass8BQ r2, AnonymousClass8AL r3, C40377AbA abA) {
        this.A03 = abA;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        C40377AbA abA = this.A03;
        Context context = abA.A06;
        C3499582p r17 = abA.A0H;
        AnonymousClass80U r15 = abA.A0M;
        AnonymousClass4DH r14 = abA.A0A;
        UserSession userSession = abA.A0C;
        View view = abA.A08;
        AnonymousClass3E6 r11 = abA.A0D;
        InteractiveDrawableContainer interactiveDrawableContainer = abA.A0R;
        AnonymousClass8AL r9 = this.A02;
        TargetViewSizeProvider targetViewSizeProvider = abA.A0G;
        C354538Mk r4 = abA.A0F;
        AnonymousClass8BQ r3 = this.A01;
        28D r19 = 28D.A2y;
        C314446iH r2 = abA.A0K;
        C3499582p r25 = r17;
        return new C358368an(context, view, r19, r14, userSession, r11, r4, targetViewSizeProvider, r25, r3, r9, r2, r15, abA, (C358358am) userSession.A01(C358358am.class, new C66297MMg(userSession, 43)), (C337257fy) null, interactiveDrawableContainer, 0, "IgLiveStickerOverlayController", (List) null, false, 182.A06(0Tu.A06, userSession, 36324028775935676L), false);
    }
}

package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8Jk  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C353848Jk implements AnonymousClass0eK {
    public final /* synthetic */ AnonymousClass80R A00;

    public /* synthetic */ C353848Jk(AnonymousClass80R r1) {
        this.A00 = r1;
    }

    public final Object get() {
        AnonymousClass80R r0 = this.A00;
        AnonymousClass4DH r3 = r0.A0J;
        UserSession userSession = r0.A0R;
        InteractiveDrawableContainer interactiveDrawableContainer = r0.A2B;
        TargetViewSizeProvider targetViewSizeProvider = r0.A0i;
        0qQ.A0B(r3, 0);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(interactiveDrawableContainer, 2);
        0qQ.A0B(targetViewSizeProvider, 3);
        Context requireContext = r3.requireContext();
        AnonymousClass8BB r6 = C39860ACg.A00;
        List singletonList = Collections.singletonList(new C387569mQ(r3, userSession, interactiveDrawableContainer));
        0qQ.A07(singletonList);
        return new C353838Jj(requireContext, userSession, r6, ((NineSixteenLayoutConfigImpl) targetViewSizeProvider).A0K, singletonList);
    }
}

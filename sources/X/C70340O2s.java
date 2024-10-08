package X;

import android.view.View;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.O2s  reason: case insensitive filesystem */
public abstract class C70340O2s {
    public static final void A00(View view, UserSession userSession, Reel reel, C255773uh r10, C311716d8 r11) {
        C51972G9s.A1C(r10, view);
        if (Systrace.A0E(1)) {
            0fS.A01("StoriesViewerPlaceholderCoordinator.renderPlaceHolderItem", -1665935612);
        }
        try {
            if (182.A06(0Tu.A05, userSession, 36324166214889307L)) {
                C73652PhR phR = C73652PhR.A00;
                C73649PhO phO = C73649PhO.A00;
                0qQ.A0B(phR, 0);
                0qQ.A0B(phO, 1);
                phO.invoke(phR.invoke(userSession, reel, r10, r11), view);
            }
            if (C317336n6.A01(userSession)) {
                C20605Wvm wvm = C20605Wvm.A00;
                C73650PhP phP = C73650PhP.A00;
                0qQ.A0B(wvm, 0);
                0qQ.A0B(phP, 1);
                phP.invoke(wvm.invoke(userSession, reel, r10, r11), view);
            }
            if (C317336n6.A00(userSession)) {
                C66210MIr mIr = C66210MIr.A00;
                C66207MIo mIo = C66207MIo.A00;
                0qQ.A0B(mIr, 0);
                0qQ.A0B(mIo, 1);
                mIo.invoke(mIr.invoke(userSession, reel, r10, r11), view);
            }
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-636993262);
            }
        }
    }
}

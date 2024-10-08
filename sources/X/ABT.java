package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class ABT {
    public static final C347017w8 A00(Context context, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, C3499082j r8, List list) {
        Object r0;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            if (0qQ.A0K(next, "standalone_fundraiser_sticker_id")) {
                if (!TextUtils.isEmpty(r8.A04)) {
                    r0 = new C380159Ww(context, userSession, targetViewSizeProvider, r8);
                }
            } else if (0qQ.A0K(next, "multiple_avatar_standalone_sticker_id")) {
                r0 = new AnonymousClass9X1(context, userSession, r8);
            }
            A1C.add(r0);
        }
        C347017w8 r02 = new C347017w8(context, userSession, (String) null, A1C);
        r02.A03 = r8;
        return r02;
    }

    public static final boolean A01(InteractiveDrawableContainer interactiveDrawableContainer) {
        Iterator it = interactiveDrawableContainer.A0V(Drawable.class).iterator();
        while (it.hasNext()) {
            Drawable A0Z = AnonymousClass7TE.A0Z(it);
            if (A0Z instanceof C347017w8) {
                Iterator it2 = ((C347017w8) A0Z).A05().iterator();
                while (it2.hasNext()) {
                    Drawable A0Z2 = AnonymousClass7TE.A0Z(it2);
                    0qQ.A0A(A0Z2);
                    if (!(A0Z2 instanceof C369758vH) && (!(A0Z2 instanceof C369778vJ) || !((C369778vJ) A0Z2).A07())) {
                        if ((A0Z2 instanceof C369818vN) && ((C369818vN) A0Z2).A00()) {
                            return true;
                        }
                    }
                }
                continue;
            } else if (!(A0Z instanceof C369758vH)) {
                if ((A0Z instanceof C369778vJ) && ((C369778vJ) A0Z).A07()) {
                    return true;
                }
                if ((A0Z instanceof C369818vN) && ((C369818vN) A0Z).A00()) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }
}

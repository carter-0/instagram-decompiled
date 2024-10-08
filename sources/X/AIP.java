package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeMentionSticker;
import com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeNotifyToUsers;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public final class AIP {
    public static final List A01(Context context, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, List list) {
        UserSession userSession2 = userSession;
        TargetViewSizeProvider targetViewSizeProvider2 = targetViewSizeProvider;
        AnonymousClass7TG.A1Q(userSession2, targetViewSizeProvider2);
        Integer num = AnonymousClass05K.A00;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C16336Ut6 ut6 = new C16336Ut6(new Rect(((NineSixteenLayoutConfigImpl) targetViewSizeProvider2).A06, 0, 0, 0));
            C347017w8 A03 = AnonymousClass91M.A03(context, userSession2, new C387369m6((QP8) null, ((SuperlativeNotifyToUsers) it.next()).A00, "", 0.0f, 0));
            A03.A08();
            Iterator it2 = A03.A05().iterator();
            while (it2.hasNext()) {
                Drawable A0Z = AnonymousClass7TE.A0Z(it2);
                if ((A0Z instanceof C369508us) && 0qQ.A0K(((C369508us) A0Z).A01, AnonymousClass000.A00(791))) {
                    A0Z.setAlpha(0);
                    AnonymousClass7TF.A1I(A0Z, new C310416b1((AnonymousClass8BH) ut6, (AnonymousClass8DA) null, (C3510487j) null, num, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 0, true, false, false, true, false, false, false, false, false, false, false, true, false, false), A0r);
                }
            }
            throw new NoSuchElementException(AnonymousClass000.A00(3));
        }
        return A0r;
    }

    public static final List A02(Context context, UserSession userSession, List list, float f) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 2);
        Integer num = AnonymousClass05K.A00;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SuperlativeMentionSticker superlativeMentionSticker = (SuperlativeMentionSticker) it.next();
            float f2 = superlativeMentionSticker.A01 * f;
            Rect rect = superlativeMentionSticker.A03;
            C16336Ut6 ut6 = new C16336Ut6(new Rect((int) (((float) rect.left) * f), (int) (((float) rect.top) * f), (int) (((float) rect.right) * f), (int) (((float) rect.bottom) * f)));
            float f3 = superlativeMentionSticker.A00;
            User user = superlativeMentionSticker.A04;
            int i = superlativeMentionSticker.A02;
            String A0D = 002.A0D(AnonymousClass7TF.A0k(user.getUsername()), '@');
            if (A0D.length() > i) {
                A0D = 002.A0R(00R.A03(A0D, i - 2), "...");
            }
            Context context2 = context;
            User user2 = user;
            C347017w8 A03 = AnonymousClass91M.A03(context2, userSession2, new C387369m6((QP8) null, user2, A0D, (float) context2.getResources().getDimensionPixelSize(R.dimen.asset_search_icon_width), 0nA.A09(context2)));
            A03.A08();
            Iterator it2 = A03.A05().iterator();
            while (it2.hasNext()) {
                Drawable A0Z = AnonymousClass7TE.A0Z(it2);
                if ((A0Z instanceof C369508us) && 0qQ.A0K(((C369508us) A0Z).A01, AnonymousClass000.A00(791))) {
                    A0Z.setAlpha(0);
                    AnonymousClass7TF.A1I(A0Z, new C310416b1((AnonymousClass8BH) ut6, (AnonymousClass8DA) null, (C3510487j) null, num, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, f2, -1.0f, f3, 0, true, false, false, true, false, false, false, false, false, false, false, true, false, false), A0r);
                }
            }
            throw new NoSuchElementException(AnonymousClass000.A00(3));
        }
        return A0r;
    }

    public static final C347017w8 A00(Context context, Rect rect, UserSession userSession, 1Xj r14) {
        Context context2 = context;
        UserSession userSession2 = userSession;
        1Xj r4 = r14;
        1Xj r5 = r14;
        C347017w8 A00 = AHL.A00(context2, (Drawable) null, userSession2, (C3498682d) null, r4, r5, (Integer) null, AnonymousClass000.A00(1866), rect.right - rect.left, rect.bottom - rect.top, 0, 0, true, false);
        A00.setAlpha(0);
        return A00;
    }

    public final List A03(Context context, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, C16522UwR uwR) {
        1Xj r6;
        TargetViewSizeProvider targetViewSizeProvider2 = targetViewSizeProvider;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        0qQ.A0B(targetViewSizeProvider2, 2);
        int ordinal = uwR.ordinal();
        Context context2 = context;
        if (ordinal == 5) {
            1Xj r7 = C16713V2w.A00;
            if (r7 != null) {
                NineSixteenLayoutConfigImpl nineSixteenLayoutConfigImpl = (NineSixteenLayoutConfigImpl) targetViewSizeProvider2;
                float f = (float) nineSixteenLayoutConfigImpl.A06;
                float f2 = (float) nineSixteenLayoutConfigImpl.A04;
                Rect rect = new Rect((int) (f * 0.146f), (int) (f2 * 0.2297f), (int) (f * 0.846f), (int) (f2 * 0.766f));
                return AnonymousClass7TE.A1I(AnonymousClass7TE.A1L(A00(context2, rect, userSession2, r7), new C310416b1((AnonymousClass8BH) new C16336Ut6(rect), (AnonymousClass8DA) null, (C3510487j) null, AnonymousClass05K.A00, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 0, true, false, false, true, false, false, false, false, false, false, false, true, false, false)));
            }
        } else if (ordinal == 4 && (r6 = C16713V2w.A01) != null) {
            NineSixteenLayoutConfigImpl nineSixteenLayoutConfigImpl2 = (NineSixteenLayoutConfigImpl) targetViewSizeProvider2;
            float f3 = (float) nineSixteenLayoutConfigImpl2.A06;
            float f4 = (float) nineSixteenLayoutConfigImpl2.A04;
            Rect rect2 = new Rect((int) (f3 * 0.093f), (int) (f4 * 0.43f), (int) (f3 * 0.95f), (int) (f4 * 1.0f));
            return AnonymousClass7TE.A1I(AnonymousClass7TE.A1L(A00(context2, rect2, userSession2, r6), new C310416b1((AnonymousClass8BH) new C16336Ut6(rect2), (AnonymousClass8DA) null, (C3510487j) null, AnonymousClass05K.A00, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 0, true, false, false, true, false, false, false, false, false, false, false, true, false, false)));
        }
        return 0sn.A00;
    }
}

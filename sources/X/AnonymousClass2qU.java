package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;

/* renamed from: X.2qU  reason: invalid class name */
public final class AnonymousClass2qU {
    public final void A00(Activity activity, UserSession userSession, AnonymousClass4UE r12, QuickPromotionSlot quickPromotionSlot, C62320sa r14) {
        AnonymousClass4UC r122;
        String str;
        0qQ.A0B(r12, 0);
        0qQ.A0B(quickPromotionSlot, 1);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 3);
        Activity activity2 = activity;
        0qQ.A0B(activity, 4);
        if ((r12 instanceof AnonymousClass4UC) && (r122 = (AnonymousClass4UC) r12) != null) {
            try {
                StringWriter stringWriter = new StringWriter();
                17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
                AnonymousClass4V6.A00(A0A, r122);
                A0A.close();
                str = stringWriter.toString();
            } catch (IOException e) {
                String format = String.format("Error parsing QuickPromotion for bottomsheet: %s", Arrays.copyOf(new Object[]{r122.A0D}, 1));
                0qQ.A07(format);
                0KC.A0F("QPBottomsheetController", format, e);
                str = null;
            }
            E5X e5x = new E5X();
            Bundle bundle = new Bundle();
            bundle.putString(AnonymousClass000.A00(3812), quickPromotionSlot.name());
            bundle.putString("quick_promotion", str);
            e5x.setArguments(bundle);
            C50975Fm2 fm2 = new C50975Fm2(r14);
            if (activity instanceof FragmentActivity) {
                0hq supportFragmentManager = ((FragmentActivity) activity2).getSupportFragmentManager();
                0qQ.A07(supportFragmentManager);
                if (supportFragmentManager.A0R("BottomSheetConstants.FRAGMENT_TAG") != null) {
                    AnonymousClass37E r1 = AnonymousClass37D.A00;
                    AnonymousClass37D A01 = r1.A01(activity);
                    if (A01 != null) {
                        ((AnonymousClass37F) A01).A0H = new C50976FmP(activity2, userSession2, fm2, this, e5x);
                    }
                    AnonymousClass37D A012 = r1.A01(activity);
                    if (A012 != null) {
                        A012.A0B();
                        return;
                    }
                    return;
                }
            }
            C331127Pr r0 = new C331127Pr(userSession);
            r0.A0U = fm2;
            r0.A00().A02(activity, e5x);
        }
    }
}

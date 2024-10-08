package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import com.instagram.search.common.analytics.SearchContext;

/* renamed from: X.HwK  reason: case insensitive filesystem */
public abstract class C56307HwK {
    public static final void A00(Context context, UserSession userSession, 1Xj r16, AnonymousClass4DU r17, C249763kK r18, int i, int i2, int i3) {
        String str;
        Context context2 = context;
        UserSession userSession2 = userSession;
        1Xj r8 = r16;
        AnonymousClass7TG.A1T(context, userSession, r8);
        AnonymousClass4DU r6 = r17;
        int i4 = i;
        C233822wX.A0Q(userSession2, r8, r6, (C249763kK) null, Integer.valueOf(i2), Integer.valueOf(i3), C66579MXk.A00(72), i4);
        if (r18 != null) {
            str = r18.getSessionId();
        } else {
            str = null;
        }
        C56293Hw6.A00(r6, userSession2, r8, (AnonymousClass3W1) null, (C309426Yf) null, (SearchContext) null, (Double) null, (Integer) null, (Integer) null, str, (String) null, 0);
        2FW A00 = C55018Hap.A00(r8);
        if (r8.getId() != null) {
            C49731F3w A07 = 1as.A04.A02.A07(r6, userSession2, A00);
            String id = r8.getId();
            if (id != null) {
                A07.A06(id);
                A07.A04(r6);
                A07.A07.putInt(C273654mx.A00(20), i4);
                DirectShareSheetFragment A002 = A07.A00();
                AnonymousClass37D A01 = AnonymousClass37D.A00.A01((Activity) 0mE.A00(context2, Activity.class));
                if (A01 != null) {
                    A01.A0J(A002);
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }

    public static final void A01(Fragment fragment, UserSession userSession, 1Xj r9, AnonymousClass4DU r10, C59555JOb jOb) {
        AnonymousClass7TG.A1N(userSession, fragment);
        AnonymousClass4DU r2 = r10;
        C71093OcF A01 = ORV.A01(fragment.requireActivity(), r2, userSession, C14068TpH.FEED, C16677UzD.MEDIA, r9.getId());
        A01.A01 = r9.A2A(userSession);
        A01.A07(new C62429Kfe(3, jOb, fragment));
        C71093OcF.A00((C331157Pu) null, A01);
    }
}

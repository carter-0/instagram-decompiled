package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.react.views.textinput.ReactTextInputManager;
import com.instagram.common.session.UserSession;
import fxcache.model.FxCalAccountLinkageInfoForSwitcher;
import fxcache.model.FxCalAccountWithSwitcherInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class FRX implements CallerContextable {
    public static final CallerContext A00 = CallerContext.A00(FRX.class);
    public static final String __redex_internal_original_name = "BKBloksFxActionUpdateClientLinkageCacheImpl";

    /* JADX WARNING: type inference failed for: r0v5, types: [X.1xE, java.lang.Object] */
    public static final Object A00(C307896Rx r22, AnonymousClass6Tm r23) {
        int i;
        int i2;
        List list = r23.A00;
        Object obj = list.get(0);
        0qQ.A0C(obj, C273654mx.A00(3088));
        ArrayList A1C = AnonymousClass7TE.A1C();
        C277014uI A0R = DbV.A0R(list, 1);
        for (Object next : (List) obj) {
            0qQ.A0C(next, C66579MXk.A00(37));
            A1C.add(next);
        }
        C307896Rx r8 = r22;
        UserSession A0Z = DbT.A0Z(r8);
        1wM A002 = 1wB.A00(A0Z);
        CallerContext callerContext = A00;
        Integer num = AnonymousClass05K.A15;
        A002.A0A(callerContext, C296665qR.A00(num, A1C));
        1xC.A01.A00(new Object());
        2aN.A00(A0Z).A04(2aD.A0Z);
        if (AnonymousClass3EM.A02() && 1xW.A02(A0Z)) {
            1wM A003 = 1wB.A00(A0Z);
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            Iterator it = A1C.iterator();
            while (it.hasNext()) {
                Map map = (Map) it.next();
                String A0r = DbU.A0r("account_id", map);
                String A0r2 = DbU.A0r("instagram_id", map);
                String A0r3 = DbU.A0r("account_type", map);
                String A0r4 = DbU.A0r("account_name", map);
                String A0r5 = DbU.A0r(AnonymousClass000.A00(40), map);
                String A0r6 = DbU.A0r(Dbp.A01(), map);
                String A0r7 = DbU.A0r(AnonymousClass000.A00(ReactTextInputManager.IME_ACTION_ID), map);
                String A11 = DbT.A11("badge_count", map);
                int i3 = 0;
                if (A11 != null) {
                    try {
                        i = Integer.parseInt(A11);
                    } catch (NumberFormatException unused) {
                        i = 0;
                    }
                } else {
                    i = 0;
                }
                String A112 = DbT.A11("unfiltered_badge_count", map);
                if (A112 != null) {
                    try {
                        i2 = Integer.parseInt(A112);
                    } catch (NumberFormatException unused2) {
                        i2 = 0;
                    }
                } else {
                    i2 = 0;
                }
                String A113 = DbT.A11("ig_l28", map);
                if (A113 != null) {
                    try {
                        i3 = Integer.parseInt(A113);
                    } catch (NumberFormatException unused3) {
                    }
                }
                String A0r8 = DbU.A0r("unpacked_notifications", map);
                if (!C296675qS.A02(A0r) && !C296675qS.A02(A0r3)) {
                    if (A0r == null) {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    } else if (A0r3 != null) {
                        A1C2.add(new FxCalAccountWithSwitcherInfo(A0r, A0r2, A0r3, A0r4, A0r5, A0r6, A0r7, A0r8, "", i, i2, i3, false));
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                }
            }
            A003.A0B(callerContext, new FxCalAccountLinkageInfoForSwitcher(num, A1C2, System.currentTimeMillis()));
        }
        if (A0R == null) {
            return null;
        }
        DbS.A1Q(r8, A0R);
        return null;
    }
}

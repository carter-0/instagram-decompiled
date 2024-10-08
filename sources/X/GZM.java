package X;

import android.app.Activity;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.List;

public abstract class GZM {
    public static final void A00(Activity activity, ComposeView composeView, AnonymousClass0iw r22, UserSession userSession, C55679Hlc hlc, C53604GrJ grJ) {
        Activity activity2 = activity;
        0qQ.A0B(activity2, 0);
        AnonymousClass0iw r8 = r22;
        UserSession userSession2 = userSession;
        C53604GrJ grJ2 = grJ;
        DbZ.A0t(1, userSession2, r8, grJ2);
        C55679Hlc hlc2 = hlc;
        0qQ.A0B(hlc2, 5);
        C58768IxF ixF = new C58768IxF(47, r8, userSession2, grJ2, activity2);
        AnonymousClass5vZ r11 = new AnonymousClass5vZ(ixF, new C58750Iwx(17, activity2, r8, hlc2), GZN.A00);
        C299675ve r13 = new C299675ve(r11, ixF);
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        int i = 0;
        for (Object next : grJ2.A08) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            A1H.put(((C299575vQ) 00k.A0I((List) ((C61083JwL) next).A00)).Be5().A03, Integer.valueOf(i));
            i = i2;
        }
        ComposeView composeView2 = composeView;
        composeView2.setContent(AnonymousClass5PI.A04(new C52681Gat(userSession2, new GZP(r8, userSession2, grJ2.A03, grJ2.A05, A1H), activity2, r8, hlc2, ixF, r11, grJ2, r13, 1), -1292421227, true));
    }
}

package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.compose.igds.components.bottomsheet.IgComposeBottomSheetNavigator;
import kotlin.Deprecated;

/* renamed from: X.HyX  reason: case insensitive filesystem */
public abstract class C56439HyX {
    public static final long A00 = C285595Rx.A02(AnonymousClass5RX.A0K[(int) (AnonymousClass5RW.A01 & 63)], AnonymousClass5RW.A03(AnonymousClass5RW.A01), AnonymousClass5RW.A02(AnonymousClass5RW.A01), AnonymousClass5RW.A01(AnonymousClass5RW.A01), 0.4f);

    @Deprecated(message = "This component is still a WIP. Please reach out if you are interested in using.")
    public static final C55862Hoj A00(C286575Wy r10, C61070Jw8 jw8, C54624HLh hLh, String str, 0sL r14, 0sL r15, int i) {
        C61070Jw8 jw82 = jw8;
        0sL r5 = r14;
        0qQ.A0B(hLh, 1);
        C286575Wy r4 = r10;
        r10.ExS(1877529830);
        if ((i & 4) != 0) {
            jw82 = null;
        }
        if ((i & 8) != 0) {
            r5 = null;
        }
        if (0fL.A02()) {
            0fL.A01(-1247255032, "com.instagram.compose.igds.components.bottomsheet.rememberIgdsComposeBottomSheet (IgdsComposeBottomSheet.kt:152)");
        }
        Context A0I = C51968G9o.A0I(r10);
        UserSession A0h = C51968G9o.A0h(r10);
        AnonymousClass07Z r102 = (AnonymousClass07Z) r10.AJO(AnonymousClass5YV.A00);
        Object AJO = r4.AJO(AnonymousClass5YA.A0A);
        IgComposeBottomSheetNavigator igComposeBottomSheetNavigator = (IgComposeBottomSheetNavigator) r4.AJO(C55322Hfp.A00);
        C56035Hri hri = igComposeBottomSheetNavigator.A00;
        boolean A1X = G9t.A1X(r4, igComposeBottomSheetNavigator, AJO, -1606445007);
        Object ECw = r4.ECw();
        if (A1X || ECw == AnonymousClass5XT.A00) {
            ECw = new C66188MGz(AJO, (Object) igComposeBottomSheetNavigator, (AnonymousClass4D7) null, 30);
            r4.FLL(ECw);
        }
        C286565Wx A0G = C51965G9l.A0G(r4);
        C286645Xf.A04(r4, hri, (0sL) ECw);
        AnonymousClass5PJ A01 = AnonymousClass5PI.A01(r4, new C59361JGn(7, r5, jw82, r15), 37055671);
        Object A0m = C51967G9n.A0m(r4, -1606388207);
        if (A0m == AnonymousClass5XT.A00) {
            A0m = new C55862Hoj(A0I, r102, A0h, hLh, str, A01, A00);
            r4.FLL(A0m);
        }
        C55862Hoj hoj = (C55862Hoj) A0m;
        if (C51967G9n.A1a(A0G)) {
            0fL.A00(-332484629);
        }
        C286565Wx.A0I(A0G);
        return hoj;
    }
}

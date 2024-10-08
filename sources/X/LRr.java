package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public abstract class LRr {
    public static final void A01(Activity activity, H3S h3s, UserSession userSession, 1Xj r12, C62320sa r13) {
        C51974G9v.A1K(activity, userSession, r12);
        2IS A04 = C41845B3m.A04();
        PandoGraphQLRequest A00 = C71580OnH.A00(A04, C41845B3m.A04(), C41848B3p.A1Z(A04, C66579MXk.A00(59), h3s.A04));
        1vn A01 = 1vm.A01(userSession);
        0qQ.A0A(A00);
        C62320sa r5 = r13;
        A01.ATL(new C64388Lb5(1, activity, userSession, r13), new DFW(1, r5, userSession, h3s, r12), A00);
    }

    public static final void A02(Resources resources, View view, float f) {
        C262364Dk r1;
        0qQ.A0B(view, 0);
        Drawable A00 = AnonymousClass2dd.A00(resources, R.drawable.cutout_sticker_merchandising_assets_checkerboard_grid);
        if ((A00 instanceof C262364Dk) && (r1 = (C262364Dk) A00) != null) {
            r1.A01(new C64865LjR(resources, view, f));
        }
    }

    public static final String A00(AnonymousClass5MH r2) {
        Drawable drawable;
        C321016tR r22;
        C347017w8 r23;
        Drawable drawable2 = r2.A0A;
        if (!(drawable2 instanceof C347017w8) || (r23 = (C347017w8) drawable2) == null) {
            drawable = null;
        } else {
            drawable = JTR.A0S(r23);
        }
        if (!(drawable instanceof AnonymousClass8N6) || (r22 = (C321016tR) drawable) == null) {
            return null;
        }
        return r22.A0k;
    }

    public static final boolean A03(0lg r4) {
        C63040xi r2 = 0tS.A4E;
        Context context = C60960kU.A00;
        0qQ.A07(context);
        int A02 = r2.A01(context).A02();
        if (A02 <= 0) {
            Context context2 = C60960kU.A00;
            0qQ.A07(context2);
            0tS A01 = r2.A01(context2);
            A02 = DbS.A04(0Tu.A05, r4, 36601539501232364L);
            A01.A0B(A02);
        }
        return AnonymousClass7TF.A1T(A02, 40);
    }
}

package X;

import android.app.Activity;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class P8V implements AnonymousClass7DW {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ OIQ A02;
    public final /* synthetic */ AnonymousClass7ST A03;
    public final /* synthetic */ DirectThreadKey A04;

    public P8V(Activity activity, UserSession userSession, OIQ oiq, AnonymousClass7ST r4, DirectThreadKey directThreadKey) {
        this.A04 = directThreadKey;
        this.A02 = oiq;
        this.A00 = activity;
        this.A01 = userSession;
        this.A03 = r4;
    }

    public final /* bridge */ /* synthetic */ void DRg(MotionEvent motionEvent, Object obj, boolean z) {
        List list;
        NVY nvy = (NVY) obj;
        DirectThreadKey directThreadKey = this.A04;
        String str = directThreadKey.A00;
        OIQ oiq = this.A02;
        Activity activity = this.A00;
        UserSession userSession = this.A01;
        C254703su r9 = nvy.A00;
        String str2 = r9.A1u;
        0qQ.A07(str2);
        AnonymousClass7SD r12 = oiq.A0G;
        AnonymousClass9HC r11 = (AnonymousClass9HC) oiq.A0I.getValue();
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (r12 != null) {
            boolean equals = str2.equals(userSession.A06);
            C327687Bu A0e = C66582MXn.A0e(r9);
            AnonymousClass7FK r28 = AnonymousClass7FK.A00;
            int i = r12.A08;
            boolean z2 = r12.A14;
            boolean z3 = r12.A15;
            boolean A032 = AnonymousClass7FK.A03(userSession, r9, A0e, i, r12.A07, z2, z3, r12.A1A, r12.A0y, r12.A1D, r12.A11);
            if (equals && A032) {
                C66583MXo.A1M(AnonymousClass05K.A0Y, AnonymousClass7TE.A16(activity, 2131960643), A1C, R.drawable.instagram_delete_pano_outline_24);
            }
            if (r11 != null) {
                if (r28.A05(userSession, r11, r12.A0H, r9, r12.A0P, i, r12.A1G, z2, z3, false)) {
                    C66583MXo.A1M(AnonymousClass05K.A0O, AnonymousClass7TE.A16(activity, 2131959744), A1C, R.drawable.instagram_delete_pano_outline_24);
                }
            }
        }
        A1C.isEmpty();
        User user = new User(userSession.A06, (String) null);
        if (182.A06(0Tu.A06, userSession, 36320266384842892L)) {
            list = r9.A0r(user);
        } else {
            String A0p = r9.A0p(user);
            if (A0p != null) {
                list = AnonymousClass7TE.A1I(A0p);
            } else {
                list = null;
            }
        }
        String str3 = directThreadKey.A01;
        AnonymousClass7ST r92 = this.A03;
        PointF A08 = C66584MXp.A08(motionEvent);
        C72533P9q p9q = new C72533P9q(oiq);
        C332837Wo r15 = oiq.A0B;
        C72519P9c p9c = oiq.A02;
        PA2 pa2 = oiq.A03;
        C72523P9g p9g = oiq.A08;
        C72496P8f p8f = oiq.A07;
        0qQ.A0B(r92, 8);
        C72511P8u p8u = C72511P8u.A00;
        MessageIdentifier BSG = nvy.BSG();
        long micros = TimeUnit.MILLISECONDS.toMicros(nvy.BSP());
        C72519P9c p9c2 = p9c;
        C72523P9g p9g2 = p9g;
        Activity activity2 = activity;
        UserSession userSession2 = userSession;
        NVY nvy2 = nvy;
        C72496P8f p8f2 = p8f;
        C332837Wo r22 = r15;
        C72533P9q p9q2 = p9q;
        C71107Ocl.A02(activity2, A08, (View) null, userSession2, nvy2, p8f2, r22, C72502P8l.A00, p8u, p9q2, P9T.A00, p9c2, p9g2, C72525P9i.A00, p9q, r92, p9q, pa2, nvy.Aqm(), BSG, directThreadKey, (C273414mX) null, str, str3, (String) null, A1C, list, (List) null, C73783Pji.A00, micros, true, AnonymousClass9HV.A00(userSession).A00(C66647MaG.A08(directThreadKey), 42), true);
    }
}

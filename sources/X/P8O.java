package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import java.util.List;
import java.util.Map;

public final class P8O implements AnonymousClass7DS {
    public final AnonymousClass7Ws A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public final boolean A01(C328667Fr r27, C68065MzW mzW) {
        C328667Fr r2 = r27;
        boolean A1U = AnonymousClass7TF.A1U(0, r2, mzW);
        AnonymousClass9J6 r0 = r2.A08;
        String str = r0.A01;
        String str2 = r0.A00;
        ((C332847Wp) this.A00).Cqp((View) null, (ImageUrl) null, (C68168N3i) null, r2.A0L, (GradientSpinner) null, (Long) null, (Long) null, str, str2, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (Map) null, A1U ? 1 : 0, false);
        A00(r2, this, false);
        return A1U;
    }

    public static final void A00(C328667Fr r3, P8O p8o, boolean z) {
        String str;
        String str2;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(p8o.A01, p8o.A02), "direct_message_generic_xma_tap");
        if (A0e.isSampled()) {
            C254793t3 r0 = r3.A0M;
            if (r0 == null || (str = AnonymousClass4KK.A02(r0)) == null) {
                str = "";
            }
            C66580MXl.A1K(A0e, str);
            A0e.AAJ("xma_content_type", r3.A0Y);
            A0e.A9F("xma_content_id", r3.A0S);
            if (z) {
                str2 = AnonymousClass000.A00(182);
            } else {
                str2 = "body";
            }
            A0e.AAJ(C273654mx.A00(989), str2);
            A0e.Cgf();
        }
    }

    public final /* bridge */ /* synthetic */ boolean DRa(MotionEvent motionEvent, Object obj, Object obj2) {
        return A01((C328667Fr) obj, (C68065MzW) obj2);
    }

    public P8O(AnonymousClass0iw r1, UserSession userSession, AnonymousClass7Ws r3) {
        this.A02 = userSession;
        this.A00 = r3;
        this.A01 = r1;
    }
}

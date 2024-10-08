package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import java.util.List;
import java.util.Map;

public final class P8C implements AnonymousClass7DS {
    public final AnonymousClass7Wt A00;
    public final UserSession A01;

    public P8C(UserSession userSession, AnonymousClass7Wt r3) {
        0qQ.A0B(r3, 1);
        this.A00 = r3;
        this.A01 = userSession;
    }

    public final /* bridge */ /* synthetic */ boolean DRa(MotionEvent motionEvent, Object obj, Object obj2) {
        ImageUrl imageUrl;
        List list;
        C68817NYb nYb = (C68817NYb) obj;
        PBV pbv = (PBV) obj2;
        boolean A1U = AnonymousClass7TF.A1U(0, nYb, pbv);
        C328667Fr r5 = nYb.A03;
        AnonymousClass9J6 r4 = r5.A08;
        if (r4.A01.length() > 0) {
            boolean BCL = r5.BCL();
            DirectMessageIdentifier directMessageIdentifier = r5.A0L;
            AnonymousClass7Wt r6 = this.A00;
            if (!C70020Nvy.A00((C332927Wz) r6, directMessageIdentifier, BCL)) {
                AnonymousClass777 r3 = r5.A0F;
                C332847Wp r62 = (C332847Wp) r6;
                String str = r4.A01;
                String str2 = r4.A00;
                if (r3 == null || !(r3 instanceof AnonymousClass776)) {
                    list = null;
                } else {
                    list = AnonymousClass7TE.A1I(((AnonymousClass776) r3).A00);
                }
                r62.Cqp((View) null, (ImageUrl) null, new C68168N3i(0nA.A0F(pbv.A08), 0.0f), directMessageIdentifier, (GradientSpinner) null, (Long) null, (Long) null, str, str2, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, list, (List) null, (List) null, (List) null, (Map) null, A1U ? 1 : 0, false);
            }
        } else {
            C69610Nos nos = nYb.A05;
            if (nos instanceof C68871Na8) {
                String str3 = nYb.A07;
                boolean BCL2 = r5.BCL();
                DirectMessageIdentifier directMessageIdentifier2 = r5.A0L;
                AnonymousClass7Wt r32 = this.A00;
                if (!C70020Nvy.A00((C332927Wz) r32, directMessageIdentifier2, BCL2)) {
                    ((C333047Xl) r32).Cpp(0nA.A0F(pbv.A08), str3, (String) null);
                    return A1U;
                }
            } else if (nos instanceof Na7) {
                AnonymousClass777 r9 = r5.A0F;
                if (r9 instanceof AnonymousClass776) {
                    imageUrl = ((AnonymousClass776) r9).A00;
                } else {
                    imageUrl = null;
                    DbT.A1Q(0wj.A01, AnonymousClass7TG.A0m(r9, "Invalid media: ", AnonymousClass7TE.A1A()), 817891009);
                }
                String str4 = nYb.A07;
                AnonymousClass3OA r14 = ((Na7) nos).A00;
                boolean BCL3 = r5.BCL();
                DirectMessageIdentifier directMessageIdentifier3 = r5.A0L;
                AnonymousClass7Wt r92 = this.A00;
                if (!C70020Nvy.A00((C332927Wz) r92, directMessageIdentifier3, BCL3)) {
                    r92.CpS(0nA.A0F(pbv.A08), imageUrl, (OMU) null, directMessageIdentifier3, r14, false, (Boolean) null, str4, (String) null, (String) null, (String) null, (String) null, r5.CU2());
                    return A1U;
                }
            } else {
                throw C66582MXn.A0k(nos, "Invalid typeSpecificFields: ", AnonymousClass7TE.A1A());
            }
        }
        return A1U;
    }
}

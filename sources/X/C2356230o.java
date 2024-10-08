package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.Trigger;

/* renamed from: X.30o  reason: invalid class name and case insensitive filesystem */
public final class C2356230o {
    public final UserSession A00;
    public final C231002qi A01;
    public final C230882qT A02;

    public C2356230o(UserSession userSession, C231002qi r3, C230882qT r4) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r3, 2);
        this.A00 = userSession;
        this.A01 = r3;
        this.A02 = r4;
    }

    public final void A00(View view, 2el r10, 1Xj r11, QPTooltipAnchor qPTooltipAnchor, Trigger trigger) {
        String A0T = 002.A0T(qPTooltipAnchor.name(), r11.getId(), '_');
        C60340gF r1 = C60340gF.A00;
        AnonymousClass30Y r0 = AnonymousClass30Y.A07;
        C2354830a r02 = new C2354830a(r11, r1, A0T);
        View view2 = view;
        r02.A00(new C246363eT(view2, this.A00, qPTooltipAnchor, trigger, this.A01, this.A02));
        r10.A05(view, r02.A01());
    }
}

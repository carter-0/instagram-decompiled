package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.Trigger;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.3eT  reason: invalid class name and case insensitive filesystem */
public final class C246363eT implements C250603lj {
    public final View A00;
    public final UserSession A01;
    public final QPTooltipAnchor A02;
    public final Trigger A03;
    public final C231002qi A04;
    public final C230882qT A05;

    public final void ATF(AnonymousClass30Y r6, C252093oY r7) {
        Trigger trigger;
        Trigger trigger2;
        0qQ.A0B(r6, 0);
        0qQ.A0B(r7, 1);
        int intValue = r7.CEk(r6).intValue();
        if (intValue == 0) {
            C230882qT r1 = this.A05;
            C231002qi r4 = this.A04;
            QPTooltipAnchor qPTooltipAnchor = this.A02;
            r1.A00(this.A00, qPTooltipAnchor, r4);
            QPTooltipAnchor qPTooltipAnchor2 = QPTooltipAnchor.MEDIA_OPTIONS_ICON;
            if (qPTooltipAnchor == qPTooltipAnchor2 && (trigger = this.A03) == Trigger.A0S) {
                UserSession userSession = this.A01;
                Object obj = r6.A03;
                0qQ.A06(obj);
                if (!C254413sR.A02(userSession, (1Xj) obj)) {
                    return;
                }
            } else {
                if (qPTooltipAnchor == QPTooltipAnchor.PROMOTE_CTA) {
                    trigger = this.A03;
                    trigger2 = Trigger.A0Y;
                } else if (qPTooltipAnchor == qPTooltipAnchor2) {
                    trigger = this.A03;
                    trigger2 = Trigger.A1A;
                } else {
                    return;
                }
                if (trigger != trigger2) {
                    return;
                }
            }
            Set singleton = Collections.singleton(trigger);
            0qQ.A07(singleton);
            r4.AVg(singleton);
        } else if (intValue == 2) {
            C230882qT r2 = this.A05;
            QPTooltipAnchor qPTooltipAnchor3 = this.A02;
            0qQ.A0B(qPTooltipAnchor3, 0);
            r2.A07.remove(qPTooltipAnchor3);
        }
    }

    public C246363eT(View view, UserSession userSession, QPTooltipAnchor qPTooltipAnchor, Trigger trigger, C231002qi r5, C230882qT r6) {
        this.A00 = view;
        this.A01 = userSession;
        this.A04 = r5;
        this.A05 = r6;
        this.A02 = qPTooltipAnchor;
        this.A03 = trigger;
    }
}

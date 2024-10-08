package X;

import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Enn  reason: case insensitive filesystem */
public abstract class C49011Enn {
    public static final void A00(C49876FBa fBa, F36 f36, F3R f3r, UserSession userSession, C71662eb r12, C71662eb r13, C283155Gi r14, int i) {
        C273014lo r0;
        C71662eb r7 = r12;
        IgdsButton igdsButton = (IgdsButton) r12.A01().findViewById(i);
        if (AnonymousClass3HA.A00(r12.A01().getContext())) {
            r0 = C273014lo.SECONDARY;
        } else {
            r0 = C273014lo.PRIMARY_ON_COLOR;
        }
        igdsButton.setStyle(r0);
        F36 f362 = f36;
        if (f36 != null) {
            igdsButton.setVisibility(0);
            igdsButton.setText(f36.A01);
            AnonymousClass0fU.A00(new FOW(3, f362, fBa, r13, r7, userSession, r14, f3r), igdsButton);
            return;
        }
        igdsButton.setVisibility(8);
    }
}

package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;

public final class F0C {
    public final Context A00;
    public final UserSession A01;
    public final IgTextView A02;
    public final IgdsButton A03;
    public final C62320sa A04;
    public final C62320sa A05;

    public F0C(Context context, UserSession userSession, IgTextView igTextView, IgdsButton igdsButton, C62320sa r7, C62320sa r8) {
        AnonymousClass7TG.A1S(r7, r8);
        this.A03 = igdsButton;
        this.A02 = igTextView;
        this.A01 = userSession;
        this.A00 = context;
        this.A05 = r7;
        this.A04 = r8;
        AnonymousClass7I3 r1 = new AnonymousClass7I3(userSession);
        r1.A07(C69503Nml.A0I);
        if (igdsButton != null) {
            FPE.A01(igdsButton, 41, r1, this);
        }
    }
}

package X;

import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.Amk  reason: case insensitive filesystem */
public final /* synthetic */ class C41000Amk implements Runnable {
    public final /* synthetic */ AnonymousClass8BA A00;
    public final /* synthetic */ 1Xj A01;

    public /* synthetic */ C41000Amk(AnonymousClass8BA r1, 1Xj r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        AnonymousClass8BA r3 = this.A00;
        1Xj r2 = this.A01;
        AnonymousClass88O r6 = r3.A1B;
        InteractiveDrawableContainer interactiveDrawableContainer = r3.A1s;
        UserSession userSession = r3.A0v;
        0qQ.A0B(userSession, 1);
        AnonymousClass91L.A04(userSession, r3.A0z, r6, new C3498482b(userSession, r2, (String) null, false), interactiveDrawableContainer, r3.A0u.getModuleName());
    }
}

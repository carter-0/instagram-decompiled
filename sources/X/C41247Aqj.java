package X;

import android.graphics.Rect;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.Aqj  reason: case insensitive filesystem */
public final class C41247Aqj implements Runnable {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ C21040XAt A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C255783ui A03;
    public final /* synthetic */ C249693kD A04;
    public final /* synthetic */ C316836mI A05;

    public C41247Aqj(ViewGroup viewGroup, C21040XAt xAt, UserSession userSession, C255783ui r4, C249693kD r5, C316836mI r6) {
        this.A05 = r6;
        this.A03 = r4;
        this.A01 = xAt;
        this.A00 = viewGroup;
        this.A04 = r5;
        this.A02 = userSession;
    }

    public final void run() {
        C316836mI r2 = this.A05;
        r2.A04.A03(0);
        ViewGroup viewGroup = r2.A00;
        if (viewGroup == null) {
            0qQ.A0F("buttonWrapperView");
            throw AnonymousClass00P.createAndThrow();
        }
        C255783ui r5 = this.A03;
        C21040XAt xAt = this.A01;
        ViewGroup viewGroup2 = this.A00;
        int width = viewGroup2.getWidth();
        int height = viewGroup2.getHeight();
        float AcY = this.A04.AcY(this.A02);
        0qQ.A0B(xAt, 2);
        Rect A0W = AnonymousClass7TE.A0W();
        C306746Ni.A01(A0W, r5, AcY, width, height);
        C41222AqK aqK = new C41222AqK(A0W, viewGroup, xAt, r5);
        if (viewGroup.getWidth() > 0 && viewGroup.getHeight() > 0) {
            aqK.run();
        } else if (viewGroup.isLaidOut()) {
            0nA.A0q(viewGroup, aqK);
        } else {
            0nA.A0p(viewGroup, aqK);
        }
    }
}

package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;
import org.webrtc.CameraCapturer;

/* renamed from: X.Fvn  reason: case insensitive filesystem */
public final class C51541Fvn implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ AnonymousClass0iw A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ String A05;

    public C51541Fvn(Activity activity, View view, View view2, AnonymousClass0iw r4, UserSession userSession, String str) {
        this.A02 = view;
        this.A00 = activity;
        this.A04 = userSession;
        this.A01 = view2;
        this.A05 = str;
        this.A03 = r4;
    }

    public final void run() {
        Activity activity = this.A00;
        UserSession userSession = this.A04;
        int i = 2131960578;
        if (182.A06(0Tu.A05, userSession, 36316830411920040L)) {
            i = 2131960579;
        }
        AnonymousClass5Gt A0V = DbZ.A0V(activity, i);
        A0V.A01();
        View view = this.A01;
        A0V.A04(view, 0, AnonymousClass7TE.A0F(DbU.A05(view)), true);
        A0V.A07(C283255Gu.A07);
        A0V.A0A = true;
        A0V.A00 = CameraCapturer.OPEN_CAMERA_TIMEOUT;
        A0V.A04 = new C47891ELl(view, this.A03, userSession, this.A05);
        A0V.A00().A07(userSession);
    }
}

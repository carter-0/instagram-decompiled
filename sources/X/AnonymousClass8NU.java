package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.8NU  reason: invalid class name */
public final class AnonymousClass8NU implements AnonymousClass0eK {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ C71662eb A03;
    public final /* synthetic */ AnonymousClass8ME A04;

    public AnonymousClass8NU(View view, View view2, View view3, C71662eb r4, AnonymousClass8ME r5) {
        this.A04 = r5;
        this.A00 = view;
        this.A02 = view2;
        this.A03 = r4;
        this.A01 = view3;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        AnonymousClass8ME r4 = this.A04;
        View view = r4.A0h;
        UserSession userSession = r4.A0r;
        TargetViewSizeProvider targetViewSizeProvider = r4.A10;
        return new C39755A7v(view, r4.A0o, userSession, targetViewSizeProvider, new C58218IoM(17, this.A03, this.A00, r4, this.A02, this.A01));
    }
}

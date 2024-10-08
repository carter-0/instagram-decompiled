package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.7DJ  reason: invalid class name */
public final class AnonymousClass7DJ implements AnonymousClass7D2 {
    public final UserSession A00;
    public final C332867Wr A01;

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.feedback_reactions_stub, viewGroup, false);
        0qQ.A0C(inflate, "null cannot be cast to non-null type android.view.ViewStub");
        return new AnonymousClass7ES(this.A00, 2b1.A01(inflate, false, false), this.A01);
    }

    public final /* bridge */ /* synthetic */ void ADp(C328007Db r2, AnonymousClass7FW r3) {
        AnonymousClass7ES r22 = (AnonymousClass7ES) r2;
        C376679Ix r32 = (C376679Ix) r3;
        0qQ.A0B(r22, 0);
        0qQ.A0B(r32, 1);
        r22.A01(r32);
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r2) {
        AnonymousClass7ES r22 = (AnonymousClass7ES) r2;
        if (r22 != null) {
            11Z.A02(new C331557Rl(r22));
            r22.A02 = null;
        }
    }

    public AnonymousClass7DJ(UserSession userSession, C332867Wr r2) {
        this.A00 = userSession;
        this.A01 = r2;
    }
}

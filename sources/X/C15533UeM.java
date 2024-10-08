package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.UeM  reason: case insensitive filesystem */
public final class C15533UeM extends C231632rz {
    public 2bv A00;
    public AnonymousClass4UC A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;

    public C15533UeM(AnonymousClass0iw r2, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        this.A02 = r2;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        if (r2 != null) {
            r2.A7U(0);
        }
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        AnonymousClass4UC r3;
        int A032 = AnonymousClass0fD.A03(279558515);
        0qQ.A0B(view, 1);
        2bv r4 = this.A00;
        if (!(r4 == null || (r3 = this.A01) == null)) {
            UserSession userSession = this.A03;
            AnonymousClass0iw r0 = this.A02;
            AnonymousClass7TF.A1B(userSession, 1, r0);
            new C231922sd(r0, userSession).ADo(r4, r3, new C254123ry(view));
        }
        AnonymousClass0fD.A0A(-1799337757, A032);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, 1773165053);
        View inflate = DbV.A0D(viewGroup).inflate(R.layout.generic_v3_megaphone, viewGroup, false);
        0qQ.A0C(inflate, AnonymousClass000.A00(0));
        AnonymousClass0fD.A0A(26062450, A04);
        return inflate;
    }
}

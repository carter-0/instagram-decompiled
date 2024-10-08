package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.FNr  reason: case insensitive filesystem */
public final class C50076FNr implements View.OnClickListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C314466iJ A02;
    public final /* synthetic */ 2Er A03;

    public C50076FNr(View view, UserSession userSession, C314466iJ r3, 2Er r4) {
        this.A01 = userSession;
        this.A00 = view;
        this.A03 = r4;
        this.A02 = r3;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1679288384);
        UserSession userSession = this.A01;
        View view2 = this.A00;
        0qQ.A0A(view2);
        F9V.A00(view2, userSession, this.A02, this.A03);
        AnonymousClass0fD.A0C(1166265319, A05);
    }
}

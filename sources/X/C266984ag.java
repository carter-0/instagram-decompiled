package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.4ag  reason: invalid class name and case insensitive filesystem */
public final class C266984ag implements AnonymousClass0m6 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass0m6 A02;

    public C266984ag(Context context, UserSession userSession, AnonymousClass0m6 r3) {
        this.A01 = userSession;
        this.A00 = context;
        this.A02 = r3;
    }

    public final void DKT(ViewGroup viewGroup, View view, int i) {
        0qQ.A0B(view, 0);
        view.setTag(new C243493Yz(this.A00, view, this.A01));
        this.A02.DKT(viewGroup, view, i);
    }
}

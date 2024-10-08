package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.7fM  reason: invalid class name and case insensitive filesystem */
public final class C336897fM extends C253103qD {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C62320sa A01;

    public final void onClick(View view) {
        0qQ.A0B(view, 0);
        C238833Dp.A00(this.A00).A0B(view, new String[0]);
        this.A01.invoke();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C336897fM(UserSession userSession, C62320sa r4, int i) {
        super("sans-serif-medium", i, false);
        this.A00 = userSession;
        this.A01 = r4;
    }
}

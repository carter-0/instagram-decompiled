package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.IjJ  reason: case insensitive filesystem */
public final class C57964IjJ implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C255773uh A03;
    public final /* synthetic */ C255783ui A04;

    public C57964IjJ(View view, ViewGroup viewGroup, UserSession userSession, C255773uh r4, C255783ui r5) {
        this.A00 = view;
        this.A04 = r5;
        this.A01 = viewGroup;
        this.A03 = r4;
        this.A02 = userSession;
    }

    public final void run() {
        View view = this.A00;
        C255783ui r3 = this.A04;
        ViewGroup viewGroup = this.A01;
        C51975G9x.A10(view, this.A03, r3, viewGroup.getWidth(), viewGroup.getHeight());
    }
}

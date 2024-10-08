package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.IjM  reason: case insensitive filesystem */
public final /* synthetic */ class C57967IjM implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C255783ui A03;
    public final /* synthetic */ C265924Wv A04;

    public /* synthetic */ C57967IjM(View view, ViewGroup viewGroup, UserSession userSession, C255783ui r4, C265924Wv r5) {
        this.A04 = r5;
        this.A02 = userSession;
        this.A03 = r4;
        this.A00 = view;
        this.A01 = viewGroup;
    }

    public final void run() {
        C265924Wv r2 = this.A04;
        UserSession userSession = this.A02;
        C255783ui r4 = this.A03;
        View view = this.A00;
        ViewGroup viewGroup = this.A01;
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        C249693kD r0 = r2.A04;
        r0.getClass();
        C306406Ma.A04(view, r4, r0.AcY(userSession), width, height, false);
    }
}

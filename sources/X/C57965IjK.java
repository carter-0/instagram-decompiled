package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.IjK  reason: case insensitive filesystem */
public final class C57965IjK implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C255783ui A03;
    public final /* synthetic */ C265864Wp A04;

    public C57965IjK(View view, ViewGroup viewGroup, UserSession userSession, C255783ui r4, C265864Wp r5) {
        this.A03 = r4;
        this.A00 = view;
        this.A01 = viewGroup;
        this.A04 = r5;
        this.A02 = userSession;
    }

    public final void run() {
        float f;
        C255783ui r3 = this.A03;
        View view = this.A00;
        ViewGroup viewGroup = this.A01;
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        C249693kD r1 = this.A04.A03;
        if (r1 != null) {
            f = r1.AcY(this.A02);
        } else {
            f = 0.0f;
        }
        C306406Ma.A04(view, r3, f, width, height, false);
    }
}

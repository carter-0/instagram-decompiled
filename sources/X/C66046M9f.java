package X;

import android.view.View;
import android.widget.ImageView;
import com.instagram.common.session.UserSession;

/* renamed from: X.M9f  reason: case insensitive filesystem */
public final class C66046M9f implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ImageView A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C252063oV A03;

    public C66046M9f(View view, ImageView imageView, UserSession userSession, C252063oV r4) {
        this.A00 = view;
        this.A01 = imageView;
        this.A02 = userSession;
        this.A03 = r4;
    }

    public final void run() {
        ImageView imageView = this.A01;
        C19674Wdc wdc = new C19674Wdc(imageView, 2);
        View view = this.A00;
        C73901Plc plc = new C73901Plc(this.A02, 26);
        C73901Plc plc2 = new C73901Plc(this.A03, 27);
        view.postDelayed(new MAI(view, imageView, C65733Lyn.A00, wdc, "hide_memory_badge_animator_key", MLR.A00, plc, plc2), 0);
    }
}

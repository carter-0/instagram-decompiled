package X;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.9PH  reason: invalid class name */
public final class AnonymousClass9PH implements Runnable {
    public final /* synthetic */ C322386vk A00;
    public final /* synthetic */ C322356vh A01;

    public AnonymousClass9PH(C322386vk r1, C322356vh r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        C322356vh r7 = this.A01;
        View view = r7.A00;
        if (r7.A01 != null && view != null) {
            try {
                Activity activity = r7.A06;
                C322386vk r5 = this.A00;
                UserSession userSession = r7.A07;
                AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(activity, r5.BRv(activity, userSession));
                A0f.A05 = C226262fy.BELOW_ANCHOR;
                A0f.A04(view, 0, r5.CHV(activity, true), true);
                A0f.A0A = r5.EtY();
                A0f.A04 = new C389339pH(3, r5, r7);
                AnonymousClass5Gv A002 = A0f.A00();
                r7.A02 = A002;
                A002.A07(userSession);
            } catch (Resources.NotFoundException unused) {
                r7.A05 = false;
                0wb.A03("Missing tooltip string resource.", 002.A0R("Tooltip delegate: ", this.A00.getClass().getSimpleName()));
            }
        }
    }
}

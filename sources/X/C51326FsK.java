package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: X.FsK  reason: case insensitive filesystem */
public final class C51326FsK implements Runnable {
    public final /* synthetic */ FrameLayout A00;
    public final /* synthetic */ C49535ExH A01;

    public C51326FsK(FrameLayout frameLayout, C49535ExH exH) {
        this.A01 = exH;
        this.A00 = frameLayout;
    }

    public final void run() {
        C49535ExH exH = this.A01;
        FrameLayout frameLayout = this.A00;
        Context context = exH.A01;
        boolean A002 = AnonymousClass3HA.A00(context);
        FrameLayout frameLayout2 = exH.A00;
        if (frameLayout2 == null) {
            frameLayout2 = new FrameLayout(context);
            exH.A00 = frameLayout2;
        }
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        int i = 17170443;
        if (A002) {
            i = 17170444;
        }
        DbU.A11(context, frameLayout2, i);
        frameLayout2.setClickable(true);
        frameLayout.addView(frameLayout2);
        C361838gt C5w = 1Kq.A00.C5w();
        Integer num = AnonymousClass05K.A0C;
        0qQ.A0B(num, 1);
        C46606Dhm dhm = new C46606Dhm(context, num);
        frameLayout2.addView(new C14560TyP(context, C5w, EX7.STATIC, dhm, C46614Dhu.A00(0.0f), 0.08f, C14560TyP.A00(dhm.CRA(), true)));
        ViewGroup viewGroup = (ViewGroup) frameLayout2.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(frameLayout2);
        }
        frameLayout.addView(frameLayout2);
    }
}

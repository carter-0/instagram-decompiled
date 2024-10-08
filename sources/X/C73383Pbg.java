package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Pbg  reason: case insensitive filesystem */
public final class C73383Pbg implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ OL6 A01;
    public final /* synthetic */ C226262fy A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ C62320sa A04;

    public C73383Pbg(View view, OL6 ol6, C226262fy r3, String str, C62320sa r5) {
        this.A01 = ol6;
        this.A00 = view;
        this.A03 = str;
        this.A02 = r3;
        this.A04 = r5;
    }

    public final void run() {
        OL6 ol6 = this.A01;
        FragmentActivity activity = ol6.A01.getActivity();
        if (activity != null) {
            View view = this.A00;
            String str = this.A03;
            C226262fy r5 = this.A02;
            C62320sa r4 = this.A04;
            int height = (view.getHeight() / 2) + AnonymousClass7TE.A0H(activity.getResources());
            AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(activity, str);
            A0f.A03(view);
            A0f.A06(r5);
            if (r5 != C226262fy.BELOW_ANCHOR) {
                height = -height;
            }
            A0f.A04(view, 0, height, true);
            A0f.A04 = new C69034NdP(0, ol6, r4);
            A0f.A00().A06();
        }
    }
}

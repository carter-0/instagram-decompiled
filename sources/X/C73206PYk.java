package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.PYk  reason: case insensitive filesystem */
public final class C73206PYk implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C66633Ma2 A01;

    public C73206PYk(View view, C66633Ma2 ma2) {
        this.A01 = ma2;
        this.A00 = view;
    }

    public final void run() {
        FragmentActivity activity;
        C66633Ma2 ma2 = this.A01;
        AnonymousClass4DH r1 = ma2.A1J;
        if (r1.isAdded() && (activity = r1.getActivity()) != null && !activity.isFinishing()) {
            AnonymousClass5Gt A0e = AnonymousClass7TG.A0e(r1.requireActivity(), 2131959453);
            A0e.A03(this.A00);
            A0e.A01();
            A0e.A07(C283255Gu.A07);
            A0e.A0A = true;
            A0e.A04 = new NdO(ma2, 1);
            A0e.A00().A06();
        }
    }
}

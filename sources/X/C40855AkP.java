package X;

import android.view.ViewGroup;
import com.instagram.ui.widget.colourwheel.ColourWheelView;

/* renamed from: X.AkP  reason: case insensitive filesystem */
public final /* synthetic */ class C40855AkP implements Runnable {
    public final /* synthetic */ C353798Jc A00;

    public /* synthetic */ C40855AkP(C353798Jc r1) {
        this.A00 = r1;
    }

    public final void run() {
        C353798Jc r4 = this.A00;
        if (!C353798Jc.A0e) {
            C62880wX r3 = C61170le.A00;
            if (!AnonymousClass0xl.A00(r3).A00.getBoolean("has_used_create_mode_colour_wheel", false) && AnonymousClass0xl.A00(r3).A00.getInt("create_mode_colour_wheel_tooltip_impressions", 0) < 1) {
                C315476jx r32 = new C315476jx(2131954756);
                ColourWheelView colourWheelView = r4.A0G;
                colourWheelView.getClass();
                AnonymousClass5Gt r2 = new AnonymousClass5Gt(colourWheelView.getContext(), (ViewGroup) r4.A0R, r32);
                r2.A03(r4.A0G);
                r2.A02();
                r2.A04 = new C389309pE(r4, 2);
                r2.A00().A07(r4.A0U);
            }
        }
    }
}

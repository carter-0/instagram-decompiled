package X;

import android.widget.ImageView;

/* renamed from: X.Woj  reason: case insensitive filesystem */
public final class C20294Woj implements Runnable {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C15697Uh3 A01;
    public final /* synthetic */ 1Av A02;

    public C20294Woj(ImageView imageView, C15697Uh3 uh3, 1Av r3) {
        this.A01 = uh3;
        this.A02 = r3;
        this.A00 = imageView;
    }

    public final void run() {
        C15697Uh3 uh3 = this.A01;
        if (uh3.A0A) {
            1Av r6 = this.A02;
            int i = r6.A01.getInt("canvas_show_audio_button_tooltip", 0);
            if (i < 3) {
                C15295Ua1 ua1 = uh3.A0I;
                AnonymousClass5Gt r3 = new AnonymousClass5Gt(ua1.requireActivity(), new C315476jx((CharSequence) AnonymousClass7TF.A0d(DbV.A05(ua1), 2131953271)));
                r3.A04(this.A00, 0, DbZ.A02(ua1), true);
                r3.A01();
                r3.A07(C283255Gu.A06);
                r3.A04 = new C15990UmX(r6, i);
                r3.A00().A07(uh3.A0O);
            }
        }
    }
}

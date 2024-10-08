package X;

import android.view.View;
import com.instagram.android.R;

public final class UEM extends C249703kE {
    public final View A00;
    public final C17542VZv A01;
    public final VX3 A02;
    public final C18010Vjm A03;
    public final VX4 A04;
    public final C17646Vbc A05;
    public final C17543VZw A06;
    public final VPW A07;
    public final VPX A08;
    public final boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UEM(View view, boolean z) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = view;
        this.A09 = z;
        this.A01 = new C17542VZv(AnonymousClass7TE.A0b(view, R.id.button_container));
        VX4 vx4 = new VX4(view);
        this.A04 = vx4;
        C17646Vbc vbc = new C17646Vbc(AnonymousClass7TE.A0b(view, R.id.media_container));
        this.A05 = vbc;
        this.A06 = new C17543VZw(view);
        this.A07 = new VPW(view);
        this.A08 = new VPX(view);
        this.A02 = new VX3(view);
        C18010Vjm vjm = new C18010Vjm(AnonymousClass7TE.A0S(view));
        vjm.A00(vx4.A01);
        vjm.A00(vbc.A06);
        vjm.A01(vx4.A02);
        vjm.A01(vbc.A03);
        this.A03 = vjm;
    }
}

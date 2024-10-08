package X;

import com.instagram.android.R;

/* renamed from: X.WeT  reason: case insensitive filesystem */
public final class C19727WeT implements X5B {
    public C14261Tsj A00;
    public C14260Tsi A01;
    public C18039VkN A02;
    public C18039VkN A03;

    public static void A00(C18039VkN vkN) {
        vkN.A02(2, 5120, "aPosition", false, 0);
        vkN.A02(2, 5120, "aTexCoord", false, 2);
    }

    public final void CN6(C17872VhP vhP) {
        C14261Tsj A012 = C18699Vwx.A01(vhP, R.raw.uniform_texture_vert, R.raw.uniform_texture_frag);
        this.A00 = A012;
        this.A01 = VC7.A00(A012);
        C16334Ut4 ut4 = new C16334Ut4(this.A00, C19725WeR.A09);
        this.A03 = ut4;
        A00(ut4);
        C16334Ut4 ut42 = new C16334Ut4(this.A00, C19725WeR.A08);
        this.A02 = ut42;
        A00(ut42);
    }
}
